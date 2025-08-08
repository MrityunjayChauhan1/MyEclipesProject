package oopS;

public class Student
{
	 // Declaring attributes
	String Name;
	String Section;
	int Class;
	 //initialize attributes
	Student(String Name,String Sectrion,int Class){
		this.Name=Name;
		this.Section=Sectrion;
		this.Class=Class;
	}
	 // print details	
	public void Details() {
		System.out.println("Student Details !!");
		System.out.println("Name: "+ Name +" "+"Section: "+Section +" "+"Class: "+Class);
	}
	public static void main(String[] args) {
		Student st=new Student("Mrityunjay", "A", 12);
		Student st1=new Student("Smrithi", "A", 12);
	//	st.Name("Smrithi");
		st.Details();
		st1.Details();
	}
}
