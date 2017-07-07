# Largest
import java.io.*;
import java.util.*;
public class Largest
{
public static void main(String args[])throws IOEXception
{
int a,b,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Three Numbers");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=Integer.parseInt(br.readLine());
if(a>=b && a>=c);
{
System.out.println("Largest number: "+a);
}
if(b>=a && b>=c);
{
System.out.println("Largest number: "+b);
}
if(c>=a && c>=b);
{
System.out.println("Largest number: "+c);
}
}
}




