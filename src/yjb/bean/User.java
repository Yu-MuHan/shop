package yjb.bean;



public class User {
//	UUID      NOT NULL VARCHAR2(32) 
//	USERNAME           VARCHAR2(20) 
//	PASSWORD           VARCHAR2(20) 
//	NAME               VARCHAR2(20) 
//	EMAIL              VARCHAR2(30) 
//	TELEPHONE          VARCHAR2(20) 
//	BIRTHDAY           DATE         
//	SEX                VARCHAR2(10) 
//	STATE              NUMBER(11)   
//	CODE               VARCHAR2(64)
	
	private String uuid;
	private String userName;
	private String passWord;
	private String name;
	private String email;
	private String telephone;
	private String birthday;
	private String sex;
	private int state;
	private String code;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public User(String uuid, String userName, String passWord, String name, String email, String telephone,
			String birthday, String sex, int state, String code) {
		super();
		this.uuid = uuid;
		this.userName = userName;
		this.passWord = passWord;
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.birthday = birthday;
		this.sex = sex;
		this.state = state;
		this.code = code;
	}
	public User() {
		super();
	}
	
	
}
