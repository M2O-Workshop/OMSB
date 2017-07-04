/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package com.omsb.common.entity;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author yamamoto-t <br />
 *         サンプル用エンティティ <br />
 *         DB接続検証用に作成 <br />
 *         更新履歴 2016/11/01 yamamoto-t：新規作成 <br />
 */
@Entity
@Table(name = "t_overtime") // memo:デフォルトはクラス名=テーブル名（省略可）
public class OvertimeEntity {


  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  @Column(name = "employee_number")
  private String employee_number;
  @Column(name = "overtime_at")
  private Date overtime_at;
  @Column(name = "app_overtime_start_at")
  private Time app_overtime_start_at;
  @Column(name = "app_overtime_end_at")
  private Time app_overtime_end_at;
  @Column(name = "app_reason_cd")
  private String app_reason_cd;
  @Column(name = "act_overtime_start_at")
  private Time act_overtime_start_at;
  @Column(name = "act_overtime_end_at")
  private Time act_overtime_end_at;
  @Column(name = "act_reason_cd")
  private String act_reason_cd;
  @Column(name = "remark")
  private String remark;
  @Column(name = "created_at")
  private Timestamp created_at;
  @Column(name = "updated_at")
  private Timestamp updated_at;

  /**
   * デフォルトコンストラクタ <br />
   * 自動生成されたコンストラクタ <br />
   */
  public OvertimeEntity() {
    super();
  }

  /**
   * （コンストラクター論理名） <br />
   * （説明） <br />
   * @param id
   * @param employee_number
   * @param overtime_at
   * @param app_overtime_start_at
   * @param app_overtime_end_at
   * @param app_reason_cd
   * @param act_overtime_start_at
   * @param act_overtime_end_at
   * @param act_reason_cd
   * @param remark
   * @param created_at
   * @param updated_at
   */
  public OvertimeEntity( String employee_number, Date overtime_at,
      Time app_overtime_start_at, Time app_overtime_end_at, String app_reason_cd,
      Time act_overtime_start_at, Time act_overtime_end_at, String act_reason_cd, String remark,
      Timestamp created_at, Timestamp updated_at ) {
    super();
    this.employee_number = employee_number;
    this.overtime_at = overtime_at;
    this.app_overtime_start_at = app_overtime_start_at;
    this.app_overtime_end_at = app_overtime_end_at;
    this.app_reason_cd = app_reason_cd;
    this.act_overtime_start_at = act_overtime_start_at;
    this.act_overtime_end_at = act_overtime_end_at;
    this.act_reason_cd = act_reason_cd;
    this.remark = remark;
    this.created_at = created_at;
    this.updated_at = updated_at;
  }

  /**
   * @return id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id セットする id
   */
  public void setId( int id ) {
    this.id = id;
  }

  /**
   * @return employee_number
   */
  public String getEmployee_number() {
    return employee_number;
  }

  /**
   * @param employee_number セットする employee_number
   */
  public void setEmployee_number( String employee_number ) {
    this.employee_number = employee_number;
  }

  /**
   * @return overtime_at
   */
  public Date getOvertime_at() {
    return overtime_at;
  }

  /**
   * @param overtime_at セットする overtime_at
   */
  public void setOvertime_at( Date overtime_at ) {
    this.overtime_at = overtime_at;
  }

  /**
   * @return app_overtime_start_at
   */
  public Time getApp_overtime_start_at() {
    return app_overtime_start_at;
  }

  /**
   * @param app_overtime_start_at セットする app_overtime_start_at
   */
  public void setApp_overtime_start_at( Time app_overtime_start_at ) {
    this.app_overtime_start_at = app_overtime_start_at;
  }

  /**
   * @return app_overtime_end_at
   */
  public Time getApp_overtime_end_at() {
    return app_overtime_end_at;
  }

  /**
   * @param app_overtime_end_at セットする app_overtime_end_at
   */
  public void setApp_overtime_end_at( Time app_overtime_end_at ) {
    this.app_overtime_end_at = app_overtime_end_at;
  }

  /**
   * @return app_reason_cd
   */
  public String getApp_reason_cd() {
    return app_reason_cd;
  }

  /**
   * @param app_reason_cd セットする app_reason_cd
   */
  public void setApp_reason_cd( String app_reason_cd ) {
    this.app_reason_cd = app_reason_cd;
  }

  /**
   * @return act_overtime_start_at
   */
  public Time getAct_overtime_start_at() {
    return act_overtime_start_at;
  }

  /**
   * @param act_overtime_start_at セットする act_overtime_start_at
   */
  public void setAct_overtime_start_at( Time act_overtime_start_at ) {
    this.act_overtime_start_at = act_overtime_start_at;
  }

  /**
   * @return act_overtime_end_at
   */
  public Time getAct_overtime_end_at() {
    return act_overtime_end_at;
  }

  /**
   * @param act_overtime_end_at セットする act_overtime_end_at
   */
  public void setAct_overtime_end_at( Time act_overtime_end_at ) {
    this.act_overtime_end_at = act_overtime_end_at;
  }

  /**
   * @return act_reason_cd
   */
  public String getAct_reason_cd() {
    return act_reason_cd;
  }

  /**
   * @param act_reason_cd セットする act_reason_cd
   */
  public void setAct_reason_cd( String act_reason_cd ) {
    this.act_reason_cd = act_reason_cd;
  }

  /**
   * @return remark
   */
  public String getRemark() {
    return remark;
  }

  /**
   * @param remark セットする remark
   */
  public void setRemark( String remark ) {
    this.remark = remark;
  }

  /**
   * @return created_at
   */
  public Timestamp getCreated_at() {
    return created_at;
  }

  /**
   * @param created_at セットする created_at
   */
  public void setCreated_at( Timestamp created_at ) {
    this.created_at = created_at;
  }

  /**
   * @return updated_at
   */
  public Timestamp getUpdated_at() {
    return updated_at;
  }

  /**
   * @param updated_at セットする updated_at
   */
  public void setUpdated_at( Timestamp updated_at ) {
    this.updated_at = updated_at;
  }

}
