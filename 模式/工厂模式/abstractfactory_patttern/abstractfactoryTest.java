package abstractfactory_patttern;

public class abstractfactoryTest {
	public static void main(String[] args) {
		DefaultFactory factory=new DefaultFactory();
		System.out.println(factory.getCar("Benz").getname());
	}
}
