package Mem;
//原发器 被备忘录存储它的内部状态
public class OriginatorChess {
	private MementoChess memchess;
	public OriginatorChess(MementoChess mem) {
		this.memchess=mem;
	}
	public void SetX(int x) {
		memchess.setX(x);
	}
	public void SetY(int y) {
		memchess.setY(y);
	}
	public MementoChess SavetoMemento() {
		return new MementoChess(memchess.getLabel(),memchess.getX(),memchess.getY());
	}
	public void Restore(MementoChess mem) {
		this.memchess.setLabel(mem.getLabel());
		this.memchess.setX(mem.getX());
		this.memchess.setY(mem.getY());
	}
	public void Show() {
		System.out.println("当前棋子状态："+memchess.getLabel()+"("+memchess.getX()+","+memchess.getY()+")");
	}
}
