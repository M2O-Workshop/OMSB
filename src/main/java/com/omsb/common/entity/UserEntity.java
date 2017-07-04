/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package com.omsb.common.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author （作成者） <br />
 *         （クラス論理名） <br />
 *         （説明） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
@Entity
@Table(name = "t_user")
public class UserEntity implements UserDetails {

  private static final long serialVersionUID = 685464161664114611L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "username")
  private String username;

  @Column(name = "password")
  private String password;

  /*
   * (非 Javadoc)
   * @see org.springframework.security.core.userdetails.UserDetails#getAuthorities()
   */
  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    // TODO 自動生成されたメソッド・スタブ
    return null;
  }

  /*
   * (非 Javadoc)
   * @see org.springframework.security.core.userdetails.UserDetails#getPassword()
   */
  @Override
  public String getPassword() {
    // TODO 自動生成されたメソッド・スタブ
    return this.password;
  }

  /*
   * (非 Javadoc)
   * @see org.springframework.security.core.userdetails.UserDetails#getUsername()
   */
  @Override
  public String getUsername() {
    // TODO 自動生成されたメソッド・スタブ
    return this.username;
  }

  /*
   * (非 Javadoc)
   * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonExpired()
   */
  @Override
  public boolean isAccountNonExpired() {
    // TODO 自動生成されたメソッド・スタブ
    return true;
  }

  /*
   * (非 Javadoc)
   * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonLocked()
   */
  @Override
  public boolean isAccountNonLocked() {
    // TODO 自動生成されたメソッド・スタブ
    return true;
  }

  /*
   * (非 Javadoc)
   * @see org.springframework.security.core.userdetails.UserDetails#isCredentialsNonExpired()
   */
  @Override
  public boolean isCredentialsNonExpired() {
    // TODO 自動生成されたメソッド・スタブ
    return true;
  }

  /*
   * (非 Javadoc)
   * @see org.springframework.security.core.userdetails.UserDetails#isEnabled()
   */
  @Override
  public boolean isEnabled() {
    // TODO 自動生成されたメソッド・スタブ
    return true;
  }

}
