package Meb;

public class Client {

	public static void main(String[] args) {
		AbstractChatroom happyChat=new chatGroup();
		Member member1,member2,member3,member4,member5;
		member1=new DiamodMember("����");
		member2=new DiamodMember("����");
		member3=new DiamodMember("����");
		member4=new DiamodMember("С��");
		member5=new DiamodMember("С��");
		
		happyChat.register(member1);
		happyChat.register(member2);
		happyChat.register(member3);
		happyChat.register(member4);
		happyChat.register(member5);
		
		member1.sendText("����","���ģ����!");
	}

}
