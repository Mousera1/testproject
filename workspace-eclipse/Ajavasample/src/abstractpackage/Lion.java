package abstractpackage;

public class Lion extends Animal{
	public void eat() {
		System.out.println("eating");
	}

	public static void main(String[] args) {
		
		Lion lion =new Lion();
		lion.eat();
		lion.sound();
	
		

	}

}
