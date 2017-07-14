/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package com.omsb.app.regist;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.omsb.domain.model.OvertimeEntity;
import com.omsb.domain.repository.OvertimeRepository;

/**
 * @author yamamoto-t <br />
 *         サンプル用コントローラー <br />
 *         DB登録処理を制御するコントローラークラス <br />
 *         更新履歴 2016/11/01 yamamoto-t：新規作成 <br />
 */
@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/regist")
public class RegistApplicationController {

  // リポジトリのインスタンスを生成
  @Autowired
  private OvertimeRepository overtimeRepository;

  /**
   * DB登録処理メソッド <br />
   * エンティティからDBへデータを登録 <br />
   *
   * @param model パラメータモデル
   * @param staff_no スタッフNo
   * @param office_cd 事務所コード
   * @param staff_name スタッフ名
   * @param work_time 勤務時間
   * @param create_date 作成日
   * @return 登録結果画面へ遷移
   */
  @RequestMapping(value = "regist_record", method = RequestMethod.POST)
  public String insertRecord( Model model,
      @RequestParam("overtime_at") String overtime_at,
      @RequestParam("app_overtime_start_at") String app_overtime_start_at,
      @RequestParam("app_overtime_end_at") String app_overtime_end_at,
      @RequestParam("app_reason_cd") String app_reason_cd,
      @RequestParam("remark") String remark ) {

    // DBエンティティの生成
    OvertimeEntity overtimeEntity = new OvertimeEntity( "123456", Date.valueOf( overtime_at ),
        Time.valueOf(
            app_overtime_start_at.substring( 0, 2 ) + ":" + app_overtime_start_at.substring( 2, 4 )
                + ":00" ),
        Time.valueOf(
            app_overtime_end_at.substring( 0, 2 ) + ":" + app_overtime_end_at.substring( 2, 4 )
                + ":00" ),
        app_reason_cd, null, null,
        null, remark, new Timestamp( System.currentTimeMillis() ), null );
    // DBエンティティをリポジトリに引き渡し、保存（登録）
    overtimeRepository.saveAndFlush( overtimeEntity );
    // 結果表示のため、リポジトリに対し全件検索を実行
    Iterable<OvertimeEntity> list = overtimeRepository.findAll( new PageRequest( 0, 100 ) );
    // 検索結果を格納したリストをリクエストにセット
    model.addAttribute( "results", list );

    // 登録結果画面へ遷移
    return "/regist_application/regist_application_result";
  }

  /**
   * 戻るボタンロジック <br />
   * 戻るボタン押下時の処理 <br />
   *
   * @param model パラメータモデル
   * @return 登録入力画面へ遷移
   */
  @RequestMapping(value = "execute_back", method = RequestMethod.POST)
  public String executBack( Model model ) {

    // TODO 戻り遷移処理の実装

    // ひとまず何もせず登録入力へ戻る
    return "/regist_application/regist_application_input";
  }
}
