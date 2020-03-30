package DProxy;

public class CRemoPic implements IShowPic {

	@Override
	public void ShowPic(String pic) {
		for(int i=0;i<3;i++) {
			System.out.println(i+1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
