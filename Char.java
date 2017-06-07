import java.util.*;
import java.lang.*;
import static java.lang.Character.isLetter;
public class Char {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       String a=scan.next();
       char p=a.charAt(0);
       if(isLetter(p))
       {
           System.out.print("Alphabet");
       }
       else
       {
           System.out.print("Not a alphabet");
       }
