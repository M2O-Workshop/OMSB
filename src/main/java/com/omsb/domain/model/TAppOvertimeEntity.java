/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package com.omsb.domain.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

/**
 * @author yamamoto-t <br />
 *         サンプル用エンティティ <br />
 *         DB接続検証用に作成 <br />
 *         更新履歴 2016/11/01 yamamoto-t：新規作成 <br />
 */
@Entity
@Table(name = "t_app_overtime") // memo:デフォルトはクラス名=テーブル名（省略可）
public class TAppOvertimeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "employee_number", length = 50)
  private String employeeNumber;

  @Column(name = "overtime_on")
  private Date overtimeOn;

  @Column(name = "app_overtime_start_at")
  private Time appOvertimeStartAt;

  @Column(name = "app_overtime_end_at")
  private Time appOvertimeEndAt;

  @Column(name = "app_break_time")
  private BigDecimal appBreakTime;

  @Column(name = "app_reason_code", length = 2)
  private String appReasonCode;

  @Column(name = "app_remark", length = 200)
  private String appRemark;

  @Column(name = "created_at")
  private Timestamp createdAt;

  @Column(name = "updated_at")
  private Timestamp updatedAt;

  /**
   * 登録前処理
   */
  @PrePersist
  public void prePersist() {
    Timestamp now = new Timestamp( System.currentTimeMillis() );
    createdAt = now;
    updatedAt = now;
  }

  /**
   * 更新前処理
   */
  @PreUpdate
  public void preUpdate() {
    updatedAt = new Timestamp( System.currentTimeMillis() );
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
   * @return employeeNumber
   */
  public String getEmployeeNumber() {
    return employeeNumber;
  }

  /**
   * @param employeeNumber セットする employeeNumber
   */
  public void setEmployeeNumber( String employeeNumber ) {
    this.employeeNumber = employeeNumber;
  }

  /**
   * @return overtimeOn
   */
  public Date getOvertimeOn() {
    return overtimeOn;
  }

  /**
   * @param overtimeOn セットする overtimeOn
   */
  public void setOvertimeOn( Date overtimeOn ) {
    this.overtimeOn = overtimeOn;
  }

  /**
   * @return appOvertimeStartAt
   */
  public Time getAppOvertimeStartAt() {
    return appOvertimeStartAt;
  }

  /**
   * @param appOvertimeStartAt セットする appOvertimeStartAt
   */
  public void setAppOvertimeStartAt( Time appOvertimeStartAt ) {
    this.appOvertimeStartAt = appOvertimeStartAt;
  }

  /**
   * @return appOvertimeEndAt
   */
  public Time getAppOvertimeEndAt() {
    return appOvertimeEndAt;
  }

  /**
   * @param appOvertimeEndAt セットする appOvertimeEndAt
   */
  public void setAppOvertimeEndAt( Time appOvertimeEndAt ) {
    this.appOvertimeEndAt = appOvertimeEndAt;
  }

  /**
   * @return appBreakTime
   */
  public BigDecimal getAppBreakTime() {
    return appBreakTime;
  }

  /**
   * @param appBreakTime セットする appBreakTime
   */
  public void setAppBreakTime( BigDecimal appBreakTime ) {
    this.appBreakTime = appBreakTime;
  }

  /**
   * @return appReasonCode
   */
  public String getAppReasonCode() {
    return appReasonCode;
  }

  /**
   * @param appReasonCode セットする appReasonCode
   */
  public void setAppReasonCode( String appReasonCode ) {
    this.appReasonCode = appReasonCode;
  }

  /**
   * @return appRemark
   */
  public String getAppRemark() {
    return appRemark;
  }

  /**
   * @param appRemark セットする appRemark
   */
  public void setAppRemark( String appRemark ) {
    this.appRemark = appRemark;
  }

  /**
   * @return createdAt
   */
  public Timestamp getCreatedAt() {
    return createdAt;
  }

  /**
   * @param createdAt セットする createdAt
   */
  public void setCreatedAt( Timestamp createdAt ) {
    this.createdAt = createdAt;
  }

  /**
   * @return updatedAt
   */
  public Timestamp getUpdatedAt() {
    return updatedAt;
  }

  /**
   * @param updatedAt セットする updatedAt
   */
  public void setUpdatedAt( Timestamp updatedAt ) {
    this.updatedAt = updatedAt;
  }

}
