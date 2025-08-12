import java.util.Scanner;

public class Ex {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
String s=sc.nextLine(); 
StringBuilder out=new StringBuilder();
for(int i=0;i<s.length();i+=2){
  char ch=s.charAt(i);
  int n = s.charAt(i+1)-'0';
  out.append(String.valueOf(ch).repeat(n));
}
System.out.println(out.toString()); 

}
}