package Vis;

public class Saler extends AVisitor {

	@Override
	public void visit(Apple apple) {
		System.out.println("收银员"+name+"给苹果过秤，计算价格并结账");
	}

	@Override
	public void visit(Book book) {
		System.out.println("收银员"+name+"直接计算书价格并结账");
	}

}
