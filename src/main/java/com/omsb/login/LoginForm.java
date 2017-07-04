/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */
package com.omsb.login;

/**
 * @author minakawa-y <br />
 *  ログインユーザ保持用フォーム <br />
 *  セッションに保持するロイン中のユーザ情報 <br />
 *  更新履歴 2017/06/20 minakawa-y：新規作成 <br />
 */
public class LoginForm {
  /**
   * ユーザ名
   */
  private String userName;

  public void setFirstName(String userName) {
      this.userName = userName;
  }

  public String getFirstName() {
      return userName;
  }
}
