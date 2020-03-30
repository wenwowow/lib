package ObvStock;

import java.util.ArrayList;
import java.util.List;

public abstract class AStockPrice {
	protected float price,price2;
	protected String code;
	protected List<IStockHolder> stockHolderlist;
	
	public AStockPrice(String code) {
		this.code=code;
		price=price2=0;
		stockHolderlist=new ArrayList<IStockHolder>();
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price=price;
		notifyHolder();
	}
	public float getPrice2() {
		return price2;
	}
	public void setPrice2(float price2) {
		this.price2=price2;
		notifyHolder();
	}
	public void Add(IStockHolder Ish) {
		stockHolderlist.add(Ish);
	}
	public void Remove(IStockHolder Ish) {
		stockHolderlist.remove(Ish);
	}
	abstract protected void notifyHolder();
	@Override
	public int hashCode() {
		final int prime=31;
		int result=1;
		result=prime*result+((code==null)?0:1);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		AStockPrice other=(AStockPrice)obj;
		if(code==null) {
			if(other.code!=null)
				return false;
		}else if(!code.contentEquals(other.code))
			return false;
		return true;
	}
}
