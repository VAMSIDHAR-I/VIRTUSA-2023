import java.util.*;
public class CompositePrime{
public static void main(String[] args){
int
i,j,m=0,flag=0,prime=0,composite=0,n,count;
Scanner s= new Scanner(System.in);
System.out.println("Enter the no.of values");
count=s.nextInt();
for(j=0;j<count;j++){
n=s.nextInt();
m=n/2;
if(n==0||n==1){
prime=prime+1;
}
else
{
for(i=2;i<=m;i++){
if(n%i==0){
composite=composite+1;
flag=1;
break;
}
}
if(flag==0){
prime=prime+1;
}
}
}
System.out.println("no.of prime"+prime);
System.out.println("no.of composite"+composite);
}
}