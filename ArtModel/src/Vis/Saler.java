package Vis;

public class Saler extends AVisitor {

	@Override
	public void visit(Apple apple) {
		System.out.println("����Ա"+name+"��ƻ�����ӣ�����۸񲢽���");
	}

	@Override
	public void visit(Book book) {
		System.out.println("����Ա"+name+"ֱ�Ӽ�����۸񲢽���");
	}

}
