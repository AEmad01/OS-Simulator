import java.util.ArrayList;

public class Process {
	String name;
	int pid;
	int maxMemory;
    int state;
    int CPUusage=0; 
    int MEMusage=0;
    int user;
    int Threadcount;
    
  //  ArrayList<Process> Processes =new ArrayList<Process>();
    ArrayList<Thread> Threads =new ArrayList<Thread>();
//    public String toString()
//    {
//    	return ("")
//    }
	public Process(int user,int id, String name, int maxMemory)
	
	{
		this.user=user;
		this.state=state;
		this.pid=id;
		this.maxMemory=maxMemory;
		this.name=name;
		state=1;
		//Processes.add(this);
		
		
		
		
	}
//	public boolean terminate(int id, int user)
//	{if (user==user || user==0)
//		{try {Processes.get(id).state=0;
//		return true;}
//		catch (Exception e)
//		{
//			return false;
//		}}
//	else
//	return false;
//		
//	}
	public void addThread()
	{
		Threads.add(new Thread(this.pid));
	}

	public void changeState(String state)
	{
		switch (state)
	{case "Start": this.state=1;
		break;
		
		case "Ready": this.state=2;
		break;
		case "Running":
		this.state=3;
		break;
		case "Waiting":
		this.state=4;
		case "Terminated":
		this.state=0;
		break;
		
		
		
		
	}
	

}}
