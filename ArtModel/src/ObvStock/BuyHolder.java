package ObvStock;

import java.util.ArrayList;
import java.util.List;

public class BuyHolder implements IStockHolder {
	private List<AStockPrice>attentionlist;
	private String name;
	public BuyHolder(String name) {
		attentionlist=new ArrayList<AStockPrice>();
		this.name=name;
	}
	@Override
	public void update(AStockPrice asp) {
		if(attentionlist.contains(asp)) {
			System.out.println(name);
			if(asp.getPrice()-asp.getPrice2()>0) {
				System.out.print(asp.code+":");
				System.out.print("ԭ�ۣ�"+asp.price2+"-�ּۣ�"+asp.price);
				System.out.println("���ˣ�ˬ");
			}else {
				System.out.print(asp.code+":");
				System.out.print("ԭ�ۣ�"+asp.price2+"-�ּۣ�"+asp.price);
				System.out.println("���ˣ���");
			}
		}
	}

	@Override
	public void AddHolder(AStockPrice asp) {
		attentionlist.add(asp);
		asp.Add(this);
	}

}
