package polymorphism;

public class Student {
String Name;
String Section;
int Class;

Student(String Name,String Section,int Class){
	this.Name=Name;
	this.Section=Section;
	this.Class=Class;
}
public void ShowDetails() {
	System.out.println("Show Deatails ");
	System.out.println("Name: "+Name+" "+"Section: "+Section+" "+"Class: "+Class);
}
public void ShowDetails(boolean hideClass) {
	System.out.println("Showing by HideSection!!");
	System.out.println("Name: "+this.Name+" "+"Secton: "+this.Section+" "+(hideClass?" ": Class));
}
public static void main(String[] args) {
	Student s1=new Student("Mrityunjay Chauhan", "A (N)", 12);
	Student s2=new Student("Smrithi", "A (N)", 12);
	Student s3=new Student("James", "B (True)", 11);
	Student s4=new Student("Jonson", "C (False)", 11);
	s1.ShowDetails();
	s2.ShowDetails();
	s3.ShowDetails(true);
    s4.ShowDetails(false);	
}
}
