package Vis;

public class Customer extends AVisitor {

	@Override
	public void visit(Apple apple) {
		System.out.println("�˿�"+name+"ѡƻ��");
	}

	@Override
	public void visit(Book book) {
		System.out.println("�˿�"+name+"����");
	}

}
