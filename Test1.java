import java.util.Scanner;
public class Test1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
int roll = sc.nextInt();
char grade = sc.next().charAt(0);
System.out.println("My name" + name);
System.out.println("roll number " + roll);
System.out.println("grade " + grade);

}
}

