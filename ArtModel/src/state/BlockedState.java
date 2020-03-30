package state;

public class BlockedState extends ThreadState {
	public BlockedState() {
		state=StateSet.BLOCKED;
		System.out.println("����״̬");
	}
	public void resume(ThreadContext tc) {
		System.out.println("ֹͣ����resume()");
		if(state==StateSet.BLOCKED) {
			tc.setThreadState(new RunnableState());
		}
		else
			System.out.println("��ǰ�̲߳�������״̬");
	}

}
