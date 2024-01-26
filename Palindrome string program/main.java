import java.util.*;
class main
{
  public static void main(String args[])
  {
    Scanner obj = new Scanner(System.in);
    String s = obj.nextLine();
    String rs = "";
    int l = s.length() - 1;
    while(l >= 0)
    {
      rs = rs + s.charAt(l);
      l--;
    }
    if(s.equals(rs))
    {
      System.out.println("string is palindrome");
    }
    else
    {
      System.out.println("string is not palindrome");
    }
  }
}