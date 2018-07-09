import java.io.*;
import java.util.*;
class Wipr{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s=sc.nextLine();
String s1[]=s.split(" ");
System.out.println("enter the option");
int n=sc.nextInt();
int t=s1.length;
String s2[]=new String[t];
switch(n)
{
case 0:
 for(int i=0;i<t;i++)
 {
 StringBuffer sb=new StringBuffer(s1[i]);
 sb.reverse();
 System.out.println(sb.toString());
}
 System.out.println(" ");
break;
case 1:
for(int i=0;i<t;i++)
{
StringBuffer sb=new StringBuffer(s1[i]);
 sb.reverse();
 s2[i]=sb.toString();
String te=s2[i];
 int temp=te.length();
for(int j=0;j<temp;j++)
{
char ch=te.charAt(j);
if(ch>='a'&&ch<='z')
System.out.print(Character.toUpperCase(ch));
else
System.out.print(Character.toLowerCase(ch));
}
System.out.print(" ");
}
break;
case 2:
for(int i=0;i<t;i++)
{
StringBuffer sb=new StringBuffer(s1[i]);
 sb.reverse();
 s2[i]=sb.toString();
String te=s2[i];
String tee=s1[i];
 int temp=te.length();
for(int j=0;j<temp;j++)
{
char ch=te.charAt(j);
char c=tee.charAt(j);
if(Character.isUpperCase(c))
System.out.print(Character.toUpperCase(ch));
else
System.out.print(Character.toLowerCase(ch));
}
System.out.print(" ");
}
break;
}
}
}

   
