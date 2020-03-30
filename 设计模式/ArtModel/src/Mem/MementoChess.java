package Mem;

public class MementoChess {
	private int x;
	private int y;
	private String label;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public MementoChess(String label, int x2, int y2) {
		this.label=label;
		this.x=x2;
		this.y=y2;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
