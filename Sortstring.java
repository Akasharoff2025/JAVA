import java.util.Arrays;
import java .util.Scanner;
public class Sortstring
{
    public static void main(String[] args) {
  Scanner s = new Scanner(System.in) ;
  String strElement;
  System.err.println("Enter the number of string:");
  int n = s.nextInt();
  s.nextLine();
  String [] str = new String[n];
  System.err.println("Enter the string");
  for(int i=0;i<n;i++)
  {
    str [i]=s.nextLine();
  }
  Arrays.sort(str);
  System.err.println("\n Sorted String");
  for(String word:str)
  {
    System.err.println(word);
  }s.close();
    }
}