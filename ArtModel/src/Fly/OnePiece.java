package Fly;

public class OnePiece extends APiece {

	public OnePiece(String inKind) {
		super(inKind);
	}
	@Override
	public void Play(int x, int y) {
		System.out.println("��"+inKind+"�ӷ���("+x+","+y+")��λ��");
	}

}
