package spring.service.domain;

import java.io.Serializable;

/*
 * FileName : User.java
 *  :: 사용자 정보를 갖는 Bean 		:  	Value Object
 *  :: Controller 에서 Model 로  		: 	client 요구사항 ==> Model) 
 * ::  Model 에서 Control 로  			:   Model data 처리결과 ==> Control 
 *  즉 Presentation Layer/Business Layer 를 오가면 Data 이동(Data Transfer Object::DTO)
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