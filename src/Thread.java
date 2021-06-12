
public class Thread {
	int pid;
	int tid=0;
	int state;
	
	
	public Thread (int pid)
	{
		this.pid=pid;
		this.tid=tid++;
	}
	public void terminate(int pid, int tid)
	{
	  this.state=0;
	  return;
	}

}
