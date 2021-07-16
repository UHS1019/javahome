//ÀÚ½Ä
package ¼±ÅÃJAVA;

public class Truck extends Cars{
	
	String name = "È«¿ì¸®";
	Truck(){}
	
	Truck(String name){
		super(name);
		System.out.println("Truck ±âº»»ý¼ºÀÚ");
		System.out.println("SUPER:" + super.name);
		System.out.println("³»²¨:" + this.name);
	}

	public static void main(String[] args) {
		Truck bonggo = new Truck("ºÀ°í");
		System.out.println("³»²¨:" + bonggo.name);
	}

}
