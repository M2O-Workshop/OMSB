/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package com.omsb.app.login;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yamamoto-t <br />
 *         サンプル用コントローラー <br />
 *         ログイン処理を制御するコントローラークラス <br />
 *         更新履歴 2016/11/01 yamamoto-t：新規作成 <br />
 */
@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/login")
public class LoginController {

//※ログイン認証はSpring Securityで実現
  /**
   * ログイン処理メソッド<br />
   * ログイン成功後の処理<br />
   *
   * @return 次画面
   */
  @RequestMapping(value = "/on_login", method = RequestMethod.GET)
  public String onClickedLogin() {

    //ログイン成功時の処理など

    return "/top/top";
  }
}
