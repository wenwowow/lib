package state;

public class RunningState extends ThreadState {
	public RunningState() {
		state=StateSet.RUNNING;
		System.out.println("运行状态");
	}
	public void suspend(ThreadContext tc) {
		System.out.println("阻塞suspend()");
		if(state==StateSet.RUNNING) {
			tc.setThreadState(new BlockedState());
		}
		else
			System.out.println("当前线程不是运行状态");		
	}
	public void stop(ThreadContext tc) {
		System.out.println("停止stop()");
		if(state==StateSet.RUNNING) {
			tc.setThreadState(new DeadState());
		}
		else
			System.out.println("当前线程不是运行状态");	
	}

}
