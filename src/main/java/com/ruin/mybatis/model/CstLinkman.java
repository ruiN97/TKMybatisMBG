package com.ruin.mybatis.model;

import javax.persistence.*;

@Table(name = "cst_linkman")
public class CstLinkman {
    @Id
    @Column(name = "lkm_id")
    @GeneratedValue(generator = "JDBC")
    private Long lkmId;

    @Column(name = "lkm_email")
    private String lkmEmail;

    @Column(name = "lkm_gender")
    private String lkmGender;

    @Column(name = "lkm_memo")
    private String lkmMemo;

    @Column(name = "lkm_mobile")
    private String lkmMobile;

    @Column(name = "lkm_name")
    private String lkmName;

    @Column(name = "lkm_phone")
    private String lkmPhone;

    @Column(name = "lkm_position")
    private String lkmPosition;

    @Column(name = "lkm_cust_id")
    private Long lkmCustId;

    /**
     * @return lkm_id
     */
    public Long getLkmId() {
        return lkmId;
    }

    /**
     * @param lkmId
     */
    public void setLkmId(Long lkmId) {
        this.lkmId = lkmId;
    }

    /**
     * @return lkm_email
     */
    public String getLkmEmail() {
        return lkmEmail;
    }

    /**
     * @param lkmEmail
     */
    public void setLkmEmail(String lkmEmail) {
        this.lkmEmail = lkmEmail;
    }

    /**
     * @return lkm_gender
     */
    public String getLkmGender() {
        return lkmGender;
    }

    /**
     * @param lkmGender
     */
    public void setLkmGender(String lkmGender) {
        this.lkmGender = lkmGender;
    }

    /**
     * @return lkm_memo
     */
    public String getLkmMemo() {
        return lkmMemo;
    }

    /**
     * @param lkmMemo
     */
    public void setLkmMemo(String lkmMemo) {
        this.lkmMemo = lkmMemo;
    }

    /**
     * @return lkm_mobile
     */
    public String getLkmMobile() {
        return lkmMobile;
    }

    /**
     * @param lkmMobile
     */
    public void setLkmMobile(String lkmMobile) {
        this.lkmMobile = lkmMobile;
    }

    /**
     * @return lkm_name
     */
    public String getLkmName() {
        return lkmName;
    }

    /**
     * @param lkmName
     */
    public void setLkmName(String lkmName) {
        this.lkmName = lkmName;
    }

    /**
     * @return lkm_phone
     */
    public String getLkmPhone() {
        return lkmPhone;
    }

    /**
     * @param lkmPhone
     */
    public void setLkmPhone(String lkmPhone) {
        this.lkmPhone = lkmPhone;
    }

    /**
     * @return lkm_position
     */
    public String getLkmPosition() {
        return lkmPosition;
    }

    /**
     * @param lkmPosition
     */
    public void setLkmPosition(String lkmPosition) {
        this.lkmPosition = lkmPosition;
    }

    /**
     * @return lkm_cust_id
     */
    public Long getLkmCustId() {
        return lkmCustId;
    }

    /**
     * @param lkmCustId
     */
    public void setLkmCustId(Long lkmCustId) {
        this.lkmCustId = lkmCustId;
    }
}