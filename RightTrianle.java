import java.util.Scanner;
public class RightTrianle{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter no.of rows");
int rows=sc.nextInt();
for(i=1;i<=rows;i++){
for(j=1;j<=i;j++){
System.out.println("*");
}
System.out.println();
}
}
}
