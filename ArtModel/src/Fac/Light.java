package Fac;

public class Light {
	private String name;
	public Light(String name) {
		this.name=name;
	}
	public void on() {
		System.out.println(name+"µÆ¿ªÆô");
	}
	public void off() {
		System.out.println(name+"µÆ¹Ø±Õ");
	}
}
