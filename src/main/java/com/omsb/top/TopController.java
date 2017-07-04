/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package com.omsb.top;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
@RequestMapping(value = "/top")
public class TopController {

  @Autowired
  HttpSession session;

  /**
   * ログイン処理メソッド<br />
   * ログイン処理を実行する <br />
   *
   * @param model パラメータモデル
   * @return DB登録入力画面へ遷移
   */
  @RequestMapping(value = "/top", method = RequestMethod.GET)
  public String onClickedRegistsButton( Model model ) {

    return "top/top";
  }
}
