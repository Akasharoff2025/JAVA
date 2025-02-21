import java.util.Scanner;
public class Emp{
int empno;
String name;
void getdata()
{
Scanner scan=new Scanner(System.in);
System.out.println("\n\nEnter employee name:");
name=scan.nextLine();
System.out.println("\n\nEnter EMP no:");
empno=scan.nextInt();
}  
void display()
{
    System.out.println("Employee Name:"+name);
    System.out.println("Enter emp no:"+empno);
}
public static void main(String []args){
    Emp e=new Emp();
    e.getdata();
    System.out.println("\n\nEmployee Details");
    System.out.println("\n\n---------");
    e.display();
}
}
