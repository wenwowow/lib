package abstractfactory_patttern;

public abstract class AbstractFactory {
	protected abstract Car getCar();
	public Car getCar(String name) {
		if("BMW".equalsIgnoreCase(name)) {
			return new BmwFactory().getCar();
		}else if("Benz".equalsIgnoreCase(name)) {
			return new BenzFactory().getCar();
		}if("Audi".equalsIgnoreCase(name)) {
			return new AudiFactory().getCar();
		}else {
			System.out.println("此产品无法生产");
			return null;
		}
	}
}
