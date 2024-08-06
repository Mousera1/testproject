package abstractpackage;

public class Lionclass implements AnimalInterface {
	public void eat() {
		System.out.println("eating");
	}
	public void sound() {
		System.out.println("roaring");
	}
public static void main(String[] args) {
	Lionclass lion = new Lionclass();
	lion.eat();
	lion.sound();
		
		

	}
}
