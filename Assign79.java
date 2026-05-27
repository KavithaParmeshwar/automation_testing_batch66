//Write a program with three classes (Employee ? TeamLeader ? Manager) to display details using inheritance

package mkt.automation;

class Employee 
{
	void work(String task) 
	{
		System.out.println("Employee: Completing " + task);
	}
}

class TeamLeader extends Employee 
{
	void review() 
	{
		System.out.println("TeamLeader: Reviewing the task");
	}
}

class Manager extends TeamLeader 
{
	void approve() 
	{
		System.out.println("Manager: Approving the task");
	}
}

public class Assign79 
{
	public static void main(String[] args) 
	{
		Manager m = new Manager();

		m.work("Automation Testing Task");
		m.review();
		m.approve();
	}
}