package pkg_1;

public class Student {
int age;
int roll_no;
public void display1()
{
	System.out.println("welcome to all of you");}
public void display2()
{
	System.out.println("Automation is very easy");}
public static void main(String[] args) {
	Student rg= new Student();
	
	rg.display1();
	rg.display2();
	rg.age=27;
	System.out.println(rg.age);
	rg.roll_no=64;
	System.out.println(rg.roll_no);
}


}
