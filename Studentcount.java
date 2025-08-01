package Staticdemo;
class Student{
	String name;
	int rollno;
	static int studentcount=0;
	Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
		studentcount++;
		}
	public static void displaystudentcount() {
		System.out.println("Total number of Students is "+studentcount);
		}

	}
public class Studentcount {
	public static void main (String[]args){
		Student std1=new Student("joswin",69);
		Student std2=new Student("jos",88);
		Student std3=new Student("jo",90);
		Student.displaystudentcount();
	}
}
