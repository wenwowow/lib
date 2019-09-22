package S_proxy;

public class Person implements Speakable{
	@Override
	public void speak(String message) {
		System.out.println("Speak:  "+message);
	}
}
