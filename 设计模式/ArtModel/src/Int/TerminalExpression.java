package Int;

public class TerminalExpression implements Expression {
	private String data;
	public TerminalExpression(String data) {
		this.data=data;
	}
	@Override
	public boolean interpret(String context) {
		if(context.contains(data)) {
			//System.out.println("111");
			return true;
		}
		return false;
	}
}
