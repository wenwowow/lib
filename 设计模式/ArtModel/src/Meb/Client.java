package Meb;

public class Client {

	public static void main(String[] args) {
		AbstractChatroom happyChat=new chatGroup();
		Member member1,member2,member3,member4,member5;
		member1=new DiamodMember("张三");
		member2=new DiamodMember("李四");
		member3=new DiamodMember("王五");
		member4=new DiamodMember("小芳");
		member5=new DiamodMember("小红");
		
		happyChat.register(member1);
		happyChat.register(member2);
		happyChat.register(member3);
		happyChat.register(member4);
		happyChat.register(member5);
		
		member1.sendText("李四","李四，你好!");
	}

}
