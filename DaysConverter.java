import java.util.Scanner;
public class DaysConverter{
public static void main(String[] args){
Scanner in=new Scanner(system.in);
System.out.println("Enter days");
int days=in.nextInt();
int years=days/365;
int weeks=days%365/7;
days=days%365%7;
System.out.println("No.of years"+years);
System.out.println("No.of years"+weeks);
System.out.println("No.of years"+days);
}
}