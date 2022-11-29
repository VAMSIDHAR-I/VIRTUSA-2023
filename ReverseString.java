public class ReverseString{
public static void main(String[] args){
String s="Java";
String reversedString="";
for(int i=s.length()-1;i>=0;i--){
reversedString=reversedString+s.charAt(i);
}
Sytem.out.print("The ReversedString'"+s+"'is:");
System.out.println(reversedString);
}
}