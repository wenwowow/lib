package Meb;

public class DiamodMember extends Member{

	public DiamodMember(String name) {
		super(name);
	}

	@Override
	public void sendText(String to, String message) {
		System.out.println("��ʯ��Ա������Ϣ��");
		chatroom.sendText(name, to, message);
	}

	@Override
	public void sendImage(String to, String image) {
		System.out.println("��ʯ��Ա����ͼƬ��");
		chatroom.sendText(name, to, image);
	}

}
