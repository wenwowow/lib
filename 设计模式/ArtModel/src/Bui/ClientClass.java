package Bui;

public class ClientClass {

	public static void main(String[] args) {
		//��̬ȷ���ײ�����
		MealBuilder mb=(MealBuilder)BeanFactory.getBean("A");
		//����Ա��ָ����
		KFCWaiter waiter=new KFCWaiter();
		//����Ա׼���ײ�
		waiter.setMealBuilder(mb);
		//�ͻ�����ײ�
		Meal meal =waiter.construct();
		
		System.out.println("�ײ����:");
		System.out.println(meal.getFood());
		System.out.println(meal.getDrink());
	}

}
