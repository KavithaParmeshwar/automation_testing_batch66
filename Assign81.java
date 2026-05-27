//Write a Program for Hierarchical Level Inheritance

package mkt.automation;

class TeamLeader1 
{
	void role() 
	{
		System.out.println("Team Leader manages the testing team");
	}
}

class Trainee1 extends TeamLeader1 
{
	void work() 
	{
		System.out.println("Trainee1 performs Manual Testing");
	}
}

class Trainee2 extends TeamLeader1 
{
	void work() 
	{
		System.out.println("Trainee2 performs Automation Testing");
	}
}

public class Assign81 
{
	public static void main(String[] args) 
	{
		Trainee1 t1 = new Trainee1();
		t1.role();
		t1.work();

		System.out.println();

		Trainee2 t2 = new Trainee2();
		t2.role();
		t2.work();
	}
}