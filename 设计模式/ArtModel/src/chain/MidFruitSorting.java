package chain;

public class MidFruitSorting extends AbstractFruitSort {

	public MidFruitSorting(int weight) {
		super(weight);
	}

	@Override
	protected void pushBox(String fruit) {
		fruitBox.add("ˮ����ͷ��"+fruit);
	}

}
