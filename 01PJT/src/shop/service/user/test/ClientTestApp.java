package shop.service.user.test;

import shop.service.user.Client;

public class ClientTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Client client = new Client("È«±æµ¿", 100, null, false);
			
			System.out.println("ÀÌ¸§ : "+client.getName());
			
			System.out.println(client);
	}

}
