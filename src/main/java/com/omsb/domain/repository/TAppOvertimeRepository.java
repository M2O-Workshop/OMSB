/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package com.omsb.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.omsb.domain.model.TAppOvertimeEntity;

/**
 * @author yamamoto-t <br />
 *         サンプル用リポジトリ <br />
 *         DB接続検証用に作成 <br />
 *         更新履歴 2016/11/01 yamamoto-t：新規作成 <br />
 */
public interface TAppOvertimeRepository extends JpaRepository<TAppOvertimeEntity, String> {

  // JPAリポジトリにプリセットされている全件検索を呼び出し。
  /*
   * (非 Javadoc)
   * @see org.springframework.data.repository.
   * PagingAndSortingRepository#findAll(org.springframework.data.domain.Pageable)
   */
  /**
   * 全件検索メソッド<br />
   * 全件検索を実行する <br />
   *
   * @param pageable 許諾ページ情報（上限件数）
   * @return Page 検索結果の格納されたページオブジェクト
   */
  Page<TAppOvertimeEntity> findAll( Pageable pageable ); //記法は固定。

}