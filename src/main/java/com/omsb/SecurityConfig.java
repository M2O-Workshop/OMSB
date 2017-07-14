/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package com.omsb;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * @author （作成者） <br />
 *         （クラス論理名） <br />
 *         （説明） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  private DataSource dataSource;

  @Override
  public void configure( WebSecurity web ) throws Exception {
    web.ignoring().antMatchers( "/css/**", "/js/**" );
  }

  @Override
  protected void configure( HttpSecurity httpSecurity ) throws Exception {
    // 認可の設定
    httpSecurity
        .authorizeRequests()
        // アクセス制限の無いパス
        .antMatchers( "/", "/login/**" ).permitAll()
        // その他のパスは認証が必要
        .anyRequest().authenticated();

    // ログイン設定
    httpSecurity
        .formLogin()
        // ログインページ
        .loginPage( "/" )
        // 認証処理のパス（固定？）
        .loginProcessingUrl( "/login" )
        // 失敗時の遷移先
        .failureUrl( "/?error=true" )
        // ユーザー名のパラメータ
        .usernameParameter( "username" )
        // パスワードのパラメータ
        .passwordParameter( "password" )
        // 認証成功時の遷移先
        .defaultSuccessUrl( "/login/on_login" );

    // ログアウト設定
    httpSecurity
        .logout()
        // ログアウトがパス(GET)の場合設定する（CSRF対応）
        .logoutRequestMatcher( new AntPathRequestMatcher( "/logout" ) )
        // ログアウトがPOSTの場合設定する
        // .logoutUrl("/logout")
        // ログアウト完了後のパス
        .logoutSuccessUrl( "/?logout=true" )
        // セッションを破棄する
        .invalidateHttpSession( true )
        // ログアウト時に削除するクッキー名
        // .deleteCookies( "JSESSIONID", "remember-me" )
        .permitAll();
  }

  @Autowired
  public void configAuthentication( AuthenticationManagerBuilder auth ) throws Exception {
    auth.jdbcAuthentication()
        .dataSource( dataSource )
        .usersByUsernameQuery(
            "select username, password, enabled from t_user where username = ?" )
        .authoritiesByUsernameQuery(
            "select username, authority from t_user where username = ?" );
    // TODO パスワードの暗号化
  }

}
