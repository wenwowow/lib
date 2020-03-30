package Pro;

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
	public void Display() {
		System.out.println(Kind);
		System.out.println(this.toString());
	}
}
