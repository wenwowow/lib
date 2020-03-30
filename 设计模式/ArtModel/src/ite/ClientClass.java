package ite;

final class ClientClass {

	public static void main(String[] args) {
		SkyTelevision tv=new SkyTelevision();
		display(tv);
	}
	public static void display(Television tv) {
		TVIterator i=tv.createIteraor();
		System.out.println("电视机频道：");
		while(!i.isLast()) {
			System.out.println(i.currentChannel());
			i.next();
		}
	}

}
