import java.io.*;
class GcdLcm{
static int gcd(int a,int b){
if(b==0){
return a;
}
else{
return gcd(b, a % b);
}
static int lcm(int a,int b,int gdcValue){
return Math.abs(a*b)/gcdValue;
}
public static void main(String[] args){
int a=16, b=20, gcdValue;
gcdValue=gcd(a,b);
System.out.println("Gcd"+gcdValue);
System.out.println("Lcm"+lcm(a,b,gcdValue));
}
}
