package abstractfactory_patttern;

public class DefaultFactory extends AbstractFactory{
	private AudiFactory defaultFactory=new AudiFactory();
	public Car getCar() {
		return defaultFactory.getCar();
	}
}
