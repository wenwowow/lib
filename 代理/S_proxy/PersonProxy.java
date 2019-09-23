package S_proxy;

public class PersonProxy implements Speakable{
	private Person person;
	public PersonProxy(Person person) {
		this.person=person;
	}
	@Override
	public void speak(String message) {
		this.person.speak(message);
		System.out.println("����ʱ�䣺"+System.currentTimeMillis());
	}
}
