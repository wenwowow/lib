package Vis;

public class Client {

	public static void main(String[] args) {
		IProduct b1=new Book();
		IProduct b2=new Book();
		IProduct a1=new Apple();
		AVisitor visitor;
		
		BuyBasket basket =new BuyBasket();
		basket.addProduct(b1);
		basket.addProduct(b2);
		basket.addProduct(a1);
		
		visitor=(AVisitor)BeanFactory.getBean("visitor");
		
		visitor.setName("����");
		basket.accept(visitor);
	}

}
