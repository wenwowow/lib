package S_proxy;

public class Bootsrap {
	public static void main(String[] args) {
		Person person=new Person();
		PersonProxy proxy=new PersonProxy(person);
		proxy.speak("Lesson one!");
	}
}
