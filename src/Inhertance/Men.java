package Inhertance;

public class Men extends Person {
int age;
String job;
Men(String Name,int age,String job){
	super(Name);
	this.age=age;
	this.job=job;
}
public void ShoeDeatail() {
	System.out.println("Men Details ");
	System.out.println("Name: "+this.Name+" "+"Age: "+this.age+" "+job);
}
public static void main(String[] args) {
	Men mn1= new Men("Mrityunjay", 24, "javaDevloper");
	Men mn2=new Men("Smrithi", 25, "java DEvloper");
	mn1.ShoeDeatail();
	mn2.ShoeDeatail();
	 
}
}
