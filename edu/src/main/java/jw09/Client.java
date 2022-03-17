package jw09;

/*
 * FileName : Client.java	
 * :: Client ������ ���� Bean
 */
public class  Client{
	
	///Field
	private String name;
	private String addr;
	private int age;
	private String [] info = { "����","����" };
	
	///Constructor
	public Client(){
		this.name = "ȫ�浿";		
		this.addr ="�Ѿ�";		
		this.age = 100;
		System.out.println("Client default Constructor ȣ���");
	}

	///Method getter/setter
	public String getName(){	
		System.out.println("Client getName() ȣ���");
		return this.name;
	}
	public String getAddr(){	
		System.out.println("Client getAddr() ȣ���");
		return this.addr ;
	}
	public int	 getAge(){	
		System.out.println("Client getAge() ȣ���");
		return this.age;
	}
	public String[] getInfo(){
		System.out.println("Client getInfo ȣ���");
		return this.info;
	}
	public void setName(String name){	
		System.out.println("Client setName() ȣ���");
		 this.name = name;
	}
	public void setAddr(String addr){	
		System.out.println("Client setAddr() ȣ���");
		 this.addr = addr;
	}
	public void	 setAge(int age){	
		System.out.println("Client setAge() ȣ���");
		 this.age = age;
	}
	public void setInfo(String[] info){
		System.out.println("Client setInfo ȣ���");
		 this.info = info;
	}
}