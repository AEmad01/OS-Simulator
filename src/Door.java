import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Door {
	int id=0;
	int state;
	int Roomid;
	String password;
	ArrayList<Integer> users;

	public Door (int Roomid, String Roomname, String password, ArrayList<Integer> users)
	{
		Process D =new Process(1,Roomid,Roomname,1024);
		this.id=id++;
		this.Roomid=Roomid;
		this.password=password;
		D.changeState("Ready");
		state=0;
		this.users=users;
		
	}
	
	public void open(String password ,int user, Room r) throws InterruptedException
	{
		int userid=users.indexOf(user);
		
		if (this.password.equals(password)&& userid!=-1)
		{
		if (r.counter<r.max)
		{
			state=1;
		System.out.println("Door open");
		System.out.println("Closing in 5 seconds");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Closing in 4 seconds");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Closing in 3 seconds");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Closing in 2 seconds");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Closing in 1 seconds");
         this.close();
 		System.out.println("Door closed");

         return;
		}
		System.out.println("Wrong Password");
		}
		System.out.println("Room full");
			
	}
	public void close()
	{
		state=0;
	}
	public static void main(String[] args) throws InterruptedException
	{
		
//	Door x = new Door(5,"H11","abc");
//	Scanner sc=new Scanner(System.in);
//String p = sc.nextLine();
//System.out.println(p);
//x.open(p);
	}

}
