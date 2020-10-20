/*
 * Driver for the PearStore
 * 
 * Copyright Austin_Davis 2020
 */

public class PearDriver extends Store {

	public static void main(String[] args) {
		Store pear = new Store();
		
		pear.appList.add(new Application("twitter", "A social media app for messages" , "twitter.co", "iphone", "2.0", "twittee.com", 0.99));
		pear.appList.add(new Application("reddit", "A formum site" , "reddit", "windows", "1.6", "reddit.com", 0.99));
		pear.appList.add(new Application("insta", "A social media app for photos" , "facebook", "iphone", "1.0", "instagram.com", 0.99)); 
		
		System.out.println("unsorted");
		pear.view(pear.appList.get(0));
		pear.view(pear.appList.get(1));
		pear.view(pear.appList.get(2));
		
		pear.sort(0);
		
		System.out.println("sorted");
		pear.view((Application) pear.appList.get(0));
		pear.view((Application) pear.appList.get(1));
		pear.view((Application) pear.appList.get(2));
		
        pear.sort(1);
		
		System.out.println("sorted back");
		pear.view((Application) pear.appList.get(0));
		pear.view((Application) pear.appList.get(1));
		pear.view((Application) pear.appList.get(2));
		
	}
	private void display() {
		
	}
	
	private void login() {
		
	}
	
	private void createUser() {
		
	}

}
