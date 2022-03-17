package spring.service.domain;

import java.io.Serializable;

/*
 * FileName : User.java
 *  :: ����� ������ ���� Bean 		:  	Value Object
 *  :: Controller ���� Model ��  		: 	client �䱸���� ==> Model) 
 * ::  Model ���� Control ��  			:   Model data ó����� ==> Control 
 *  �� Presentation Layer/Business Layer �� ������ Data �̵�(Data Transfer Object::DTO)
 *  :: POJO(Plain Old Java Object)
*/
public class  User implements Serializable{
	
	///Field
	private String userId;
	private String userPasswd;

	///Constructor
	public User(){
		System.out.println("UserVO Default Constructor");
	}
	public User(String userId, String userPasswd) {
		this.userId = userId;
		this.userPasswd = userPasswd;
	}

	///Method(getter/setter Method)
	public void setUserId(String userId){
		this.userId =  userId;	
	}
	public void setUserPasswd(String userPasswd){
		this.userPasswd = userPasswd;
	}
	public String getUserId(){
		return userId;
	}
	public String getUserPasswd(){
		return userPasswd;	
	}

	public String toString() {
		return "UserVO [userId=" + userId + ", userPasswd=" + userPasswd + "]";
	}
	
}//end of class