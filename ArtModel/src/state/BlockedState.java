package state;

public class BlockedState extends ThreadState {
	public BlockedState() {
		state=StateSet.BLOCKED;
		System.out.println("×èÈû×´Ì¬");
	}
	public void resume(ThreadContext tc) {
		System.out.println("Í£Ö¹×èÈûresume()");
		if(state==StateSet.BLOCKED) {
			tc.setThreadState(new RunnableState());
		}
		else
			System.out.println("µ±Ç°Ïß³Ì²»ÊÇ×èÈû×´Ì¬");
	}

}
