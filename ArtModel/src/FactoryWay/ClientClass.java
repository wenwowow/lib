package FactoryWay;

public class ClientClass {
	public static void main(String[] args) {
		Factory factory =new AFactory();
		Fruit fruit =factory.CreateFruit();
		fruit.eat();
	}
}
