package Dec;

public class Client {

	public static void main(String[] args) {
		IBirthdayCake birthdayCake=new Cake();
		birthdayCake.Show();
		Cream cream =new Cream(birthdayCake);
		cream.PutCream();
		Fruit fruit =new Fruit(cream);
		fruit.PutFruit();
		//fruit.Show();
	}
}
