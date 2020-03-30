package Int;

public class Client {

	public static void main(String[] args) {
		Expression isMale=getMaleExpression();
		Expression isMarriedWoman=getMarriedWomanExpression();
		System.out.println("John ismale? "+isMale.interpret("John"));
		System.out.println("Julice is a married woman? "+isMarriedWoman.interpret("Married Julice"));
	}
	//规则：Julice是一个已婚女性
	private static Expression getMarriedWomanExpression() {
		Expression julice=new TerminalExpression("Julice");
		Expression married=new TerminalExpression("Married");
		return new AndExpression(julice,married);
	}
	//规则：Robert和John是男性
	private static Expression getMaleExpression() {
		Expression robert=new TerminalExpression("Robort");
		Expression john=new TerminalExpression("John");
		return new OrExpression(robert,john);
	}

}
