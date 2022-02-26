package com.environmentalmonitoring.springcloud.entities;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	//用户的编号
	private int user_Id;
	//用户名
	private String userName;
	//用户密码
	private String passWord;
	//用户联系方式
	private String telephone;
	//权限	判断是否是用户或者管理员
	private int authority;
	//用户登出时间
	private Date publish;
	//用户注册时间
	private Date register;
	//所在数据库的来源
	private String db_source;
	
	//空参 构造函数
	public User() {
		super();
	}
	//除去user_Id ，含有剩下参数的构造函数
	public User(String userName, String passWord, String telephone, int authority, Date publish, Date register,String db_source) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.telephone = telephone;
		this.authority = authority;
		this.publish = publish;
		this.register = register;
		this.db_source = db_source;
	}
	
	//全参构造函数
	public User(int user_Id, String userName, String passWord, String telephone, int authority, Date publish,
			Date register,String db_source) {
		super();
		this.user_Id = user_Id;
		this.userName = userName;
		this.passWord = passWord;
		this.telephone = telephone;
		this.authority = authority;
		this.publish = publish;
		this.register = register;
		this.db_source = db_source;
	}
	
	//get 和 set
	
	public User(String passWord, String telephone) {
		super();
		this.passWord = passWord;
		this.telephone = telephone;
	}
	public int getUser_Id() {
		return user_Id;
	}
	public Date getRegister() {
		return register;
	}
	public void setRegister(Date register) {
		this.register = register;
	}
	public String getDb_source() {
		return db_source;
	}
	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public int getAuthority() {
		return authority;
	}
	public void setAuthority(int authority) {
		this.authority = authority;
	}
	public Date getPublish() {
		return publish;
	}
	public void setPublish(Date publish) {
		this.publish = publish;
	}
	
	//toString对象输出
	@Override
	public String toString() {
		return "User [user_Id=" + user_Id + ", userName=" + userName + ", passWord=" + passWord + ", telephone="
				+ telephone + ", authority=" + authority + ", publish=" + publish + ", register=" + register
				+ ", db_source=" + db_source + "]";
	}

}
