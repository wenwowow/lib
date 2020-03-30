package DProxy;

public class Client {

	public static void main(String[] args) {
		IShowPic isp=new CRemoPic();
		CLocalPic cpic=new CLocalPic(isp);
		IShowPic localpic=(IShowPic)cpic.getProxyInatance();
		
		localpic.ShowPic("AAA");
	}

}
