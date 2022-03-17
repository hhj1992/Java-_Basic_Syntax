package jp03.part06;

import java.io.*;

/*
*	FileName : UserVO.java
*
* 회원정보를 가지고 있는 UserVO :: ValueObject ==> RMI / EJB (Value Objrct Pattern)
* 화원의 정보를 갖는 UserVo instance는 file에 저장 될것이며...
* 객체를 입출력자원, network 자원으로 이동되기 위해서는
	Serializable 이라는 marker interface를 구현해야한다.  ==> 객체직열화...
*/
public class UserVO implements Serializable{

	//Field
	private int no;
	private String name;

	//con
	public UserVO(){
	}
	public UserVO(int no, String name){
		this.no = no;
		this.name = name;
	}

	//nethod
	//setter
	public void setNo(int no){
		this.no = no;
	}
	public void setName(String name){
		this.name = name;
	}
	//getter
	public int getNo(){
		return no;
	}
	public String getName(){
		return name;
	}
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append("UserVo [no = ");
		builder.append(no);
		builder.append(",name = ");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}