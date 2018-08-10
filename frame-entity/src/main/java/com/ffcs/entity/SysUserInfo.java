package com.ffcs.entity;

import javax.persistence.*;

@Table(name = "`sys_user_info`")
public class SysUserInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.uid
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.realname
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.nick
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String nick;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.gender
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.identity_auth
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private Boolean identityAuth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.identity_type
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String identityType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.identity_no
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String identityNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.identity_img
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String identityImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.driver_auth
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private Byte driverAuth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.driver_no
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String driverNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.driver_img
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String driverImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.country
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.province
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.city
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.address
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.ctime
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private Integer ctime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.mtime
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private Integer mtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.status
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private Boolean status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.wx_number
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String wxNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.driver_auth_error
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String driverAuthError;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.team
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String team;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.zone
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String zone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.bonus_ponits
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private Long bonusPonits;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.empiric_value
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private Long empiricValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.gold
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private Long gold;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.contribute
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private Long contribute;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.popular
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private Long popular;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.wealth
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private Long wealth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_info.note
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.uid
     *
     * @return the value of sys_user_info.uid
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.uid
     *
     * @param uid the value for sys_user_info.uid
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.realname
     *
     * @return the value of sys_user_info.realname
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.realname
     *
     * @param realname the value for sys_user_info.realname
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.nick
     *
     * @return the value of sys_user_info.nick
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getNick() {
        return nick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.nick
     *
     * @param nick the value for sys_user_info.nick
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.gender
     *
     * @return the value of sys_user_info.gender
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.gender
     *
     * @param gender the value for sys_user_info.gender
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.identity_auth
     *
     * @return the value of sys_user_info.identity_auth
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public Boolean getIdentityAuth() {
        return identityAuth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.identity_auth
     *
     * @param identityAuth the value for sys_user_info.identity_auth
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setIdentityAuth(Boolean identityAuth) {
        this.identityAuth = identityAuth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.identity_type
     *
     * @return the value of sys_user_info.identity_type
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.identity_type
     *
     * @param identityType the value for sys_user_info.identity_type
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.identity_no
     *
     * @return the value of sys_user_info.identity_no
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getIdentityNo() {
        return identityNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.identity_no
     *
     * @param identityNo the value for sys_user_info.identity_no
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.identity_img
     *
     * @return the value of sys_user_info.identity_img
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getIdentityImg() {
        return identityImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.identity_img
     *
     * @param identityImg the value for sys_user_info.identity_img
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setIdentityImg(String identityImg) {
        this.identityImg = identityImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.driver_auth
     *
     * @return the value of sys_user_info.driver_auth
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public Byte getDriverAuth() {
        return driverAuth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.driver_auth
     *
     * @param driverAuth the value for sys_user_info.driver_auth
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setDriverAuth(Byte driverAuth) {
        this.driverAuth = driverAuth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.driver_no
     *
     * @return the value of sys_user_info.driver_no
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getDriverNo() {
        return driverNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.driver_no
     *
     * @param driverNo the value for sys_user_info.driver_no
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setDriverNo(String driverNo) {
        this.driverNo = driverNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.driver_img
     *
     * @return the value of sys_user_info.driver_img
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getDriverImg() {
        return driverImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.driver_img
     *
     * @param driverImg the value for sys_user_info.driver_img
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setDriverImg(String driverImg) {
        this.driverImg = driverImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.country
     *
     * @return the value of sys_user_info.country
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.country
     *
     * @param country the value for sys_user_info.country
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.province
     *
     * @return the value of sys_user_info.province
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.province
     *
     * @param province the value for sys_user_info.province
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.city
     *
     * @return the value of sys_user_info.city
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.city
     *
     * @param city the value for sys_user_info.city
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.address
     *
     * @return the value of sys_user_info.address
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.address
     *
     * @param address the value for sys_user_info.address
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.ctime
     *
     * @return the value of sys_user_info.ctime
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public Integer getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.ctime
     *
     * @param ctime the value for sys_user_info.ctime
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.mtime
     *
     * @return the value of sys_user_info.mtime
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public Integer getMtime() {
        return mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.mtime
     *
     * @param mtime the value for sys_user_info.mtime
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.status
     *
     * @return the value of sys_user_info.status
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.status
     *
     * @param status the value for sys_user_info.status
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.wx_number
     *
     * @return the value of sys_user_info.wx_number
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getWxNumber() {
        return wxNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.wx_number
     *
     * @param wxNumber the value for sys_user_info.wx_number
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setWxNumber(String wxNumber) {
        this.wxNumber = wxNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.driver_auth_error
     *
     * @return the value of sys_user_info.driver_auth_error
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getDriverAuthError() {
        return driverAuthError;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.driver_auth_error
     *
     * @param driverAuthError the value for sys_user_info.driver_auth_error
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setDriverAuthError(String driverAuthError) {
        this.driverAuthError = driverAuthError;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.team
     *
     * @return the value of sys_user_info.team
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getTeam() {
        return team;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.team
     *
     * @param team the value for sys_user_info.team
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.zone
     *
     * @return the value of sys_user_info.zone
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getZone() {
        return zone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.zone
     *
     * @param zone the value for sys_user_info.zone
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setZone(String zone) {
        this.zone = zone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.bonus_ponits
     *
     * @return the value of sys_user_info.bonus_ponits
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public Long getBonusPonits() {
        return bonusPonits;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.bonus_ponits
     *
     * @param bonusPonits the value for sys_user_info.bonus_ponits
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setBonusPonits(Long bonusPonits) {
        this.bonusPonits = bonusPonits;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.empiric_value
     *
     * @return the value of sys_user_info.empiric_value
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public Long getEmpiricValue() {
        return empiricValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.empiric_value
     *
     * @param empiricValue the value for sys_user_info.empiric_value
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setEmpiricValue(Long empiricValue) {
        this.empiricValue = empiricValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.gold
     *
     * @return the value of sys_user_info.gold
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public Long getGold() {
        return gold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.gold
     *
     * @param gold the value for sys_user_info.gold
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setGold(Long gold) {
        this.gold = gold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.contribute
     *
     * @return the value of sys_user_info.contribute
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public Long getContribute() {
        return contribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.contribute
     *
     * @param contribute the value for sys_user_info.contribute
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setContribute(Long contribute) {
        this.contribute = contribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.popular
     *
     * @return the value of sys_user_info.popular
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public Long getPopular() {
        return popular;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.popular
     *
     * @param popular the value for sys_user_info.popular
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setPopular(Long popular) {
        this.popular = popular;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.wealth
     *
     * @return the value of sys_user_info.wealth
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public Long getWealth() {
        return wealth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.wealth
     *
     * @param wealth the value for sys_user_info.wealth
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setWealth(Long wealth) {
        this.wealth = wealth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_info.note
     *
     * @return the value of sys_user_info.note
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_info.note
     *
     * @param note the value for sys_user_info.note
     *
     * @mbg.generated Thu Aug 09 19:04:20 CST 2018
     */
    public void setNote(String note) {
        this.note = note;
    }
}