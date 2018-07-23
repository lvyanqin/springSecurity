/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.beans;

import java.sql.Timestamp;

/**
 *
 * @author Administrator
 */
public class UserBean {
    private Integer id;
	private String cardNumber;
	private String mobile;
	private String email;
	private String account;
	private String accessToken;
	private String newAccessToken;
	private String accessTokenSecret;
	private String openid;
	private String password;
	private String realName;
	private Integer gender;
	private Integer provinceId;
        private String provinceName;
	private Integer districtId;
	private Integer cityId;
	private String middleSchool;
	private Timestamp regTime;
	private String regIp;
	private Timestamp lastLoginTime;
	private String lastLoginIp;
	private Integer loginWayId;
	private Integer utype;
	private String emailCode;
	private String mobileCode;
	private Integer loginCount;
	private Integer isBuy;
	private Integer liberalScience;
	private Integer source;
	private String searchKey;
	private String sourceKey;
	private String sourceUrlReferrer;
	private String account163;
	private String accessToken163;
	private String userId163;
	private String grade;
	private String className;
	private String teacherPosition;
	private String lastLoginBrowserVersion;
	private String lastLoginTicket;
	private Integer gaoKaoYear;
	private String userPic;
	private String userIcon;
	private String nickname;
	private Integer appUsed;
	private String validateType;
	private String webDoMain;

	// Constructors

	/** default constructor */
	public UserBean() {
	}

	/** minimal constructor */
	public UserBean(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public UserBean(Integer id, String cardNumber, String mobile, String email,
			String account, String accessToken, String newAccessToken,
			String accessTokenSecret, String openid, String password,
			String realName, Integer gender, Integer provinceId,
			Integer districtId, Integer cityId, String middleSchool,
			Timestamp regTime, String regIp, Timestamp lastLoginTime,
			String lastLoginIp, Integer loginWayId, Integer utype,
			String emailCode, String mobileCode, Integer loginCount,
			Integer isBuy, Integer liberalScience, Integer source,
			String searchKey, String sourceKey, String sourceUrlReferrer,
			String account163, String accessToken163, String userId163,
			String grade, String className, String teacherPosition,
			String lastLoginBrowserVersion, String lastLoginTicket,
			Integer gaoKaoYear, String userPic, String userIcon,
			String nickname, Integer appUsed, String validateType) {
		this.id = id;
		this.cardNumber = cardNumber;
		this.mobile = mobile;
		this.email = email;
		this.account = account;
		this.accessToken = accessToken;
		this.newAccessToken = newAccessToken;
		this.accessTokenSecret = accessTokenSecret;
		this.openid = openid;
		this.password = password;
		this.realName = realName;
		this.gender = gender;
		this.provinceId = provinceId;
		this.districtId = districtId;
		this.cityId = cityId;
		this.middleSchool = middleSchool;
		this.regTime = regTime;
		this.regIp = regIp;
		this.lastLoginTime = lastLoginTime;
		this.lastLoginIp = lastLoginIp;
		this.loginWayId = loginWayId;
		this.utype = utype;
		this.emailCode = emailCode;
		this.mobileCode = mobileCode;
		this.loginCount = loginCount;
		this.isBuy = isBuy;
		this.liberalScience = liberalScience;
		this.source = source;
		this.searchKey = searchKey;
		this.sourceKey = sourceKey;
		this.sourceUrlReferrer = sourceUrlReferrer;
		this.account163 = account163;
		this.accessToken163 = accessToken163;
		this.userId163 = userId163;
		this.grade = grade;
		this.className = className;
		this.teacherPosition = teacherPosition;
		this.lastLoginBrowserVersion = lastLoginBrowserVersion;
		this.lastLoginTicket = lastLoginTicket;
		this.gaoKaoYear = gaoKaoYear;
		this.userPic = userPic;
		this.userIcon = userIcon;
		this.nickname = nickname;
		this.appUsed = appUsed;
		this.validateType = validateType;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
        
	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getNewAccessToken() {
		return this.newAccessToken;
	}

	public void setNewAccessToken(String newAccessToken) {
		this.newAccessToken = newAccessToken;
	}

	public String getAccessTokenSecret() {
		return this.accessTokenSecret;
	}

	public void setAccessTokenSecret(String accessTokenSecret) {
		this.accessTokenSecret = accessTokenSecret;
	}

	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public Integer getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getMiddleSchool() {
		return this.middleSchool;
	}

	public void setMiddleSchool(String middleSchool) {
		this.middleSchool = middleSchool;
	}

	public Timestamp getRegTime() {
		return this.regTime;
	}

	public void setRegTime(Timestamp regTime) {
		this.regTime = regTime;
	}

	public String getRegIp() {
		return this.regIp;
	}

	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}

	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Integer getLoginWayId() {
		return this.loginWayId;
	}

	public void setLoginWayId(Integer loginWayId) {
		this.loginWayId = loginWayId;
	}

	public Integer getUtype() {
		return this.utype;
	}

	public void setUtype(Integer utype) {
		this.utype = utype;
	}

	public String getEmailCode() {
		return this.emailCode;
	}

	public void setEmailCode(String emailCode) {
		this.emailCode = emailCode;
	}

	public String getMobileCode() {
		return this.mobileCode;
	}

	public void setMobileCode(String mobileCode) {
		this.mobileCode = mobileCode;
	}

	public Integer getLoginCount() {
		return this.loginCount;
	}

	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	public Integer getIsBuy() {
		return this.isBuy;
	}

	public void setIsBuy(Integer isBuy) {
		this.isBuy = isBuy;
	}

	public Integer getLiberalScience() {
		return this.liberalScience;
	}

	public void setLiberalScience(Integer liberalScience) {
		this.liberalScience = liberalScience;
	}

	public Integer getSource() {
		return this.source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public String getSearchKey() {
		return this.searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public String getSourceKey() {
		return this.sourceKey;
	}

	public void setSourceKey(String sourceKey) {
		this.sourceKey = sourceKey;
	}

	public String getSourceUrlReferrer() {
		return this.sourceUrlReferrer;
	}

	public void setSourceUrlReferrer(String sourceUrlReferrer) {
		this.sourceUrlReferrer = sourceUrlReferrer;
	}

	public String getAccount163() {
		return this.account163;
	}

	public void setAccount163(String account163) {
		this.account163 = account163;
	}

	public String getAccessToken163() {
		return this.accessToken163;
	}

	public void setAccessToken163(String accessToken163) {
		this.accessToken163 = accessToken163;
	}

	public String getUserId163() {
		return this.userId163;
	}

	public void setUserId163(String userId163) {
		this.userId163 = userId163;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getTeacherPosition() {
		return this.teacherPosition;
	}

	public void setTeacherPosition(String teacherPosition) {
		this.teacherPosition = teacherPosition;
	}

	public String getLastLoginBrowserVersion() {
		return this.lastLoginBrowserVersion;
	}

	public void setLastLoginBrowserVersion(String lastLoginBrowserVersion) {
		this.lastLoginBrowserVersion = lastLoginBrowserVersion;
	}

	public String getLastLoginTicket() {
		return this.lastLoginTicket;
	}

	public void setLastLoginTicket(String lastLoginTicket) {
		this.lastLoginTicket = lastLoginTicket;
	}

	public Integer getGaoKaoYear() {
		return this.gaoKaoYear;
	}

	public void setGaoKaoYear(Integer gaoKaoYear) {
		this.gaoKaoYear = gaoKaoYear;
	}

	public String getUserPic() {
		return this.userPic;
	}

	public void setUserPic(String userPic) {
		this.userPic = userPic;
	}

	public String getUserIcon() {
		return this.userIcon;
	}

	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Integer getAppUsed() {
		return this.appUsed;
	}

	public void setAppUsed(Integer appUsed) {
		this.appUsed = appUsed;
	}

	public String getValidateType() {
		return this.validateType;
	}

	public void setValidateType(String validateType) {
		this.validateType = validateType;
	}

    /**
     * @return the provinceName
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * @param provinceName the provinceName to set
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * @return the webDoMain
     */
    public String getWebDoMain() {
        return webDoMain;
    }

    /**
     * @param webDoMain the webDoMain to set
     */
    public void setWebDoMain(String webDoMain) {
        this.webDoMain = webDoMain;
    }
}
