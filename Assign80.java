//Write a program using multi-level inheritance to calculate salary (Employee ? Salary ? Bonus)

package mkt.automation;

class Employee1 
{
	int basic = 20000;
}

class Salary extends Employee1 
{
	int hra = 5000;
	int da = 3000;
	int salary;
	
	void calculateSalary() 
	{
		salary = basic + hra + da;
		System.out.println("Salary = " + salary);
	}
}

class Bonus extends Salary 
{
	int bonus = 2000;
	int total;

	void totalSalary() 
	{
		total = salary + bonus;
		System.out.println("Total Salary = " + total);
	}
}

public class Assign80 
{
	public static void main(String[] args) 
	{
		Bonus b = new Bonus();
		b.calculateSalary();
		b.totalSalary();
	}
}