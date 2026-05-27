//Write a Program for Multi Level Inheritance

package mkt.automation;

class Student 
{   
	void study() 
	{
		System.out.println("Student is Learning");
	}
}

class Exam extends Student
{

	void giveExam() 
	{
        System.out.println("Student is Taking Exam");
	}
}

class Result extends Exam 
{
	void showResult() 
	{
        System.out.println("Result is Declared");
	}
}

public class Assign78 
{
	public static void main(String[] args) 
	{
        Result r = new Result();

		r.study();
		r.giveExam();
		r.showResult();
	}
}