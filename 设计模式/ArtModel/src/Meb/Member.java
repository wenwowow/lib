package Meb;

public abstract class Member {
	protected AbstractChatroom chatroom;
	protected String name;
	public Member(String name) {
		this.name=name;
	}
	public AbstractChatroom getChatroom() {
		return chatroom;
	}
	public void setChatroom(AbstractChatroom chatroom) {
		this.chatroom = chatroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public abstract void sendText(String to,String message);
	public abstract  void sendImage(String to,String message);
	public void receiveText(String from, String newMessage) {
		System.out.println(from+"发送文本给"+this.name+"内容为："+newMessage);
	};
	public void receiveImage(String from, String image) {
		System.out.println(from+"发送图片给"+this.name+"内容为："+image);
	};

}
