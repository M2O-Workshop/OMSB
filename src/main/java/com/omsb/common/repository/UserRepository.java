/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package com.omsb.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omsb.common.entity.UserEntity;

/**
 * @author （作成者） <br />
 *         （クラス論理名） <br />
 *         （説明） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
  public UserEntity findByUsername( String username );
}
