/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package com.omsb.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.omsb.common.service.UserService;

/**
 * @author （作成者） <br />
 *         （クラス論理名） <br />
 *         （説明） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure( HttpSecurity httpSecurity ) throws Exception {
    // 認可の設定
    httpSecurity
        .authorizeRequests()
        // アクセス制限の無いパス
        .antMatchers( "/", "/login", "/login/**", "/css/**", "/js/**" ).permitAll()
        .anyRequest()
        // その他のパスは認証が必要
        .authenticated();

    // ログイン設定
    httpSecurity
        .formLogin()
        // ログインページ
        .loginPage( "/" )
        // 認証処理用
        .loginProcessingUrl( "/login" )
        // .loginProcessingUrl( "/login/execute_login" )
        // 失敗時の遷移先
        .failureUrl( "/?error" )
        // ユーザー名のパラメータ
        .usernameParameter( "username" )
        // パスワードのパラメータ
        .passwordParameter( "password" )
        // 認証成功時の遷移先
        .defaultSuccessUrl( "/top/top" )
        .and();

    // ログアウト設定
    httpSecurity
        .logout()
        .logoutRequestMatcher( new AntPathRequestMatcher( "/logout**" ) ) // ログアウト処理のパス
        .logoutSuccessUrl( "/login/login_input" ); // ログアウト完了後のパス
  }

  @Configuration
  protected static class AuthenticationConfiguration extends GlobalAuthenticationConfigurerAdapter {
    @Autowired
    UserService userService;

    @Override
    public void init( AuthenticationManagerBuilder auth ) throws Exception {
      // 認証するユーザーを設定する
      auth
          .userDetailsService( userService );
    }
  }

}
