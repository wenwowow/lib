package proxy;

public class Client {

	public static void main(String[] args) {
		CLocalPic cls=new CLocalPic();
		cls.ShowPic("�ҵĺ�ͼƬ");
		IShowPic ipic=new CRemoPic();
		IShowPic proxy=(IShowPic)new CLocalPic();
		proxy.ShowPic("AAA");
	}
}
