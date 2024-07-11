import java.io.*;
class Basic
{
public static void main(String args[])
{
     System.out.println("WELCOME TO" + " "+ "SATHYA");
int a=10;
System.out.println(a);
System.out.println("value of a="+a);
int b=20;
System.out.println(a+b);
System.out.println("sum is "+(a+b));
System.out.println("sum is "+a+b);
String s="Navya";
String s1="100";
System.out.println(Integer.parseInt(s1)+a);
System.out.println(s+Integer.toString(a));
int c=0345;
int d=0x34f;
System.out.println(c);//default prints the value in integer literal
System.out.println(d);
float f=5.78678f;
char ch='N';
int ascii=ch;
System.out.println(ch);
System.out.println(ascii);
//int g=null throws an in compatible error;
String s3=null;
System.out.println(s3);
long h=1234455667888L;
System.out.println(h);
}
}