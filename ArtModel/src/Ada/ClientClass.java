package Ada;

public class ClientClass {

	public static void main(String[] args) {
//		MyFruit fru1=new Apple();
//		MyFruit fru2=(Apple)fru1.clone();
////		fru1.Display();
////		fru2.Display();
////		System.out.println("fru1:"+fru1.hashCode());
////		System.out.println("fru2:"+fru2.hashCode());
//		MyFruitStore.Add(1,fru1);
//		MyFruitStore.Add(2,fru2);
//		MyFruitStore.Add(3,new Apple());
//		MyFruitStore.Add(4,new Banana());
//		MyFruit fru=(MyFruit)MyFruitStore.Get(2);
//		fru.Display();
//		fru=(MyFruit)MyFruitStore.Get(1);
//		fru.Display();
		MyFruit fru1=new Apple();
		MyFruit fru2=new Banana();
		MyFruitStore mfs=MyFruitStore.Getfruitstore();
		mfs.Add(1,fru1);
		mfs.Add(2,fru2);
		mfs.Add(3,new Apple());
		mfs.Add(4,new Banana());
		MyFruitStore mfs2=MyFruitStore.Getfruitstore();
		InewJuicer newJucier=new Adapter();
		System.out.println(newJucier.newPortfruit1(mfs.Get(3),mfs.Get(4)));
	}

}
