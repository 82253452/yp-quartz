package com.ffcs.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`busi_account`")
public class BusiAccount {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_account.id
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_account.uid
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_account.username
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_account.password
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_account.status
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_account.ctime
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    private Date ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_account.mtime
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    private Date mtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_account.id
     *
     * @return the value of busi_account.id
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_account.id
     *
     * @param id the value for busi_account.id
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_account.uid
     *
     * @return the value of busi_account.uid
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_account.uid
     *
     * @param uid the value for busi_account.uid
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_account.username
     *
     * @return the value of busi_account.username
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_account.username
     *
     * @param username the value for busi_account.username
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_account.password
     *
     * @return the value of busi_account.password
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_account.password
     *
     * @param password the value for busi_account.password
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_account.status
     *
     * @return the value of busi_account.status
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_account.status
     *
     * @param status the value for busi_account.status
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_account.ctime
     *
     * @return the value of busi_account.ctime
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_account.ctime
     *
     * @param ctime the value for busi_account.ctime
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_account.mtime
     *
     * @return the value of busi_account.mtime
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    public Date getMtime() {
        return mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_account.mtime
     *
     * @param mtime the value for busi_account.mtime
     *
     * @mbg.generated Wed Aug 08 15:59:08 CST 2018
     */
    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }
}