/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package com.omsb.app.top;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "/top")
public class TopController {

  @Autowired
  HttpSession session;

  /**
   * 初期化処理<br />
   *
   * @param model パラメータモデル
   * @return DB登録入力画面へ遷移
   */
  @RequestMapping(value = "/top", method = RequestMethod.POST)
  public String init(  ) {

    return "/top/top";
  }

  /**
   * 「残業申請」ボタン押下時処理<br />
   *
   * @return 残業申請画面へ遷移
   */
  @RequestMapping(value = "/on_regist_application_clicked", method = RequestMethod.POST)
  public String onClickedRegistsButton( ) {

    return "/regist_application/regist_application_input";
  }
}
