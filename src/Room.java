import java.util.ArrayList;

public class Room {
	int roomid;
	int counter;
	int max;
	String roomname;
	ArrayList<Integer> users=new ArrayList<Integer>();

	ArrayList<Door> Doors=new ArrayList<Door>();
	
	public Room (int roomid,int max,String roomname)
	{
		this.roomid=roomid;
		this.max=max;
		counter=0;
		this.roomname=roomname;
		
	}
	public void addDoor(int doorid, String password,ArrayList<Integer> users)
	{
Doors.add(new Door(this.roomid,roomname,password,users));
	}
	public void loginUser()
	{
		counter++;
	}
	

}
