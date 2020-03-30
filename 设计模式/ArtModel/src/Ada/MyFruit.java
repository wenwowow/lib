package Ada;

public class MyFruit implements Cloneable {
	protected String Kind;
	public Object clone() {
		Object obj=null;
		try {
			obj=super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	public String Get() {
		return Kind;
	}
	public void Display() {
		System.out.print(Kind);
	}
}
