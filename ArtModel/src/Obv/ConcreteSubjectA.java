package Obv;

public class ConcreteSubjectA extends SubjectS {

	public ConcreteSubjectA() {
		super();
	}
	@Override
	public void notifyObserver() {
		System.out.println("AĿ�귢���ı���");
		for(ObserverO obs:observers) {
			obs.response();
		}
	}
}
