package Ada;

public class Adapter extends OldJuicer implements InewJuicer {

	@Override
	public String newPortfruit1(MyFruit fruit1, MyFruit fruit2) {
		String str="��Ϲ�֭��"+onePort(fruit1);
		str+=onePort(fruit2);
		return str;
	}

}
