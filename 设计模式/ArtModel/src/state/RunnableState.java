package state;

public class RunnableState extends ThreadState {
	public RunnableState() {
		state=StateSet.RANNABLE;
		System.out.println("����״̬");
	}
	public void getCpu(ThreadContext tc) {
		System.out.println("��ȡCPUʱ��");
		if(state==StateSet.RANNABLE) {
			tc.setThreadState(new RunningState());
		}
		else
			System.out.println("��ǰ�̲߳��Ǿ���״̬");
		
	}

}
