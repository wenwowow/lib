package Dec;

public class Decorating implements IBirthdayCake {
	private IBirthdayCake brithdayCake;
	public Decorating(IBirthdayCake birthdayCake) {
		this.brithdayCake=birthdayCake;
	}
	@Override
	public void Show() {
		brithdayCake.Show();
	}

}
