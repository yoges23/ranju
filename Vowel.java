import java.util.*;
import java.lang.*;
public class Vowel
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
String e=scan.nextLine();
char p=e.charAt(0);
if((p=='a')||(p=='e')||(p=='i')||(p=='o')||(p=='u'))
{
System.out.print("Vowel");
}
else
{
    System.out.println("Consonent");
}
}
}
