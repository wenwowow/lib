package chain;

public class BigFruitSorting extends AbstractFruitSort {

	public BigFruitSorting(int weight) {
		super(weight);
	}

	@Override
	protected void pushBox(String fruit) {
		fruitBox.add("���У�"+fruit);
	}

}
