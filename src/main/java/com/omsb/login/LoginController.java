/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package com.omsb.login;

import org.springframework.stereotype.Controller;

/**
 * @author yamamoto-t <br />
 *         サンプル用コントローラー <br />
 *         ログイン処理を制御するコントローラークラス <br />
 *         更新履歴 2016/11/01 yamamoto-t：新規作成 <br />
 */
@Controller
public class LoginController {

//※ログイン認証はSpring Securityで実現
//  /**
//   * ログイン処理メソッド<br />
//   * ログイン処理を実行する <br />
//   *
//   * @param model パラメータモデル
//   * @param username ユーザー名
//   * @param password パスワード
//   * @return トップメニュー画面へ遷移
//   */
//  @RequestMapping(value = "execute_login", method = RequestMethod.POST)
//  public String onClickedLogin( Model model,
//      @RequestParam("username") String username,
//      @RequestParam("password") String password ) {
//
//    return "top";
//  }
}
