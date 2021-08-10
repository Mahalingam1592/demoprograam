package org.phone;

public class PhoneInfo {
	private void phoneName() {
	System.out.println("POCO");

	}
	
	private void phoneImei() {
		System.out.println("12345677890");

	}
	
	private void Storage() {
		System.out.println("16gb");

	}
	
	private void camera() {
		System.out.println("64mp");

	}
	
	private void osName() {
		System.out.println("android");

	}
	private void hi() {
		System.out.println("hi sri");
	}
public static void main(String[] args) {
	PhoneInfo c=new PhoneInfo();
	c.camera();
	c.osName();c.phoneImei();
	c.phoneName();
	c.Storage();
	c.hi();
	
	
}	

}
