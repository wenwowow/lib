package Meb;

public class DiamodMember extends Member{

	public DiamodMember(String name) {
		super(name);
	}

	@Override
	public void sendText(String to, String message) {
		System.out.println("钻石会员发送消息：");
		chatroom.sendText(name, to, message);
	}

	@Override
	public void sendImage(String to, String image) {
		System.out.println("钻石会员发送图片：");
		chatroom.sendText(name, to, image);
	}

}
