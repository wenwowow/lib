package Obv;

public class ConcreteSubjectB extends SubjectS {

	public ConcreteSubjectB() {
		super();
	}
	@Override
	public void notifyObserver() {
		System.out.println("BĿ�귢���ı���");
		for(ObserverO obs:observers) {
			obs.response();
		}
	}
}
