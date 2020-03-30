package SimpleFactory;

public class ClientClass {
	public static void main(String[] args) {
		Factory factory=new Factory();
		Fruit fruit=factory.CreateFruit("A");
		fruit.eat();
	}
}
