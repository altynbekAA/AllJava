package abstraction;

import java.util.List;

public abstract class Phone1 {
	List<String > contactList;
	public String name;
	public String model;
	public int memory;
	public static int age;
	
	public final void hi() {
		System.out.println("Hello");
	}
	
	public abstract void call();
	public abstract void call(String number);
	public abstract void lockScreen();
	public abstract void texting();
	public abstract void takePicture();



}
