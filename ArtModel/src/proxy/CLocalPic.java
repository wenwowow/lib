package proxy;

public class CLocalPic implements IShowPic,Runnable {
	private IShowPic pic;
	private String picname;
	@Override
	public void ShowPic(String picname) {
		pic=new CRemoPic();
		this.picname=picname;
		System.out.println("׼������ͼƬ"+picname);
		Thread th=new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		pic.ShowPic(picname);
		System.out.println(picname+"ͼƬ�������!");
	}

}
