package state;

public class RunningState extends ThreadState {
	public RunningState() {
		state=StateSet.RUNNING;
		System.out.println("����״̬");
	}
	public void suspend(ThreadContext tc) {
		System.out.println("����suspend()");
		if(state==StateSet.RUNNING) {
			tc.setThreadState(new BlockedState());
		}
		else
			System.out.println("��ǰ�̲߳�������״̬");		
	}
	public void stop(ThreadContext tc) {
		System.out.println("ֹͣstop()");
		if(state==StateSet.RUNNING) {
			tc.setThreadState(new DeadState());
		}
		else
			System.out.println("��ǰ�̲߳�������״̬");	
	}

}
