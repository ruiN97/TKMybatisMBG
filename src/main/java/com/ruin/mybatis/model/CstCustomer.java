package com.ruin.mybatis.model;

import javax.persistence.*;

@Table(name = "cst_customer")
public class CstCustomer {
    @Id
    @Column(name = "cust_id")
    @GeneratedValue(generator = "JDBC")
    private Long custId;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_source")
    private String custSource;

    @Column(name = "cust_industry")
    private String custIndustry;

    @Column(name = "cust_level")
    private String custLevel;

    @Column(name = "cust_phone")
    private String custPhone;

    @Column(name = "cust_mobile")
    private String custMobile;

    /**
     * @return cust_id
     */
    public Long getCustId() {
        return custId;
    }

    /**
     * @param custId
     */
    public void setCustId(Long custId) {
        this.custId = custId;
    }

    /**
     * @return cust_name
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return cust_source
     */
    public String getCustSource() {
        return custSource;
    }

    /**
     * @param custSource
     */
    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    /**
     * @return cust_industry
     */
    public String getCustIndustry() {
        return custIndustry;
    }

    /**
     * @param custIndustry
     */
    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    /**
     * @return cust_level
     */
    public String getCustLevel() {
        return custLevel;
    }

    /**
     * @param custLevel
     */
    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    /**
     * @return cust_phone
     */
    public String getCustPhone() {
        return custPhone;
    }

    /**
     * @param custPhone
     */
    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    /**
     * @return cust_mobile
     */
    public String getCustMobile() {
        return custMobile;
    }

    /**
     * @param custMobile
     */
    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }
}