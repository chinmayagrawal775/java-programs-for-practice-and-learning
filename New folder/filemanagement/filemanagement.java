import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.applet.*;
/*
class filemanagement
{
  public static void main(String args[]) throws IOException
  {
    public static int count;
    File file= new File("C:\\Users\\Sony\\Desktop\\New folder\\myfile.txt");
    Scanner obj = new Scanner(file);
    obj.useDelimiter("\\Z");
    count=Integer.parseInt(obj.nextLine());
    count++;
    FileWriter fw = new FileWriter("myfile.txt",false);
    fw.write(count + "");
    fw.close();
  }
}*/
public class myclass extends Applet
{
    public static int count;
    File file= new File("C:\\Users\\Sony\\Desktop\\New folder\\myfile.txt");
    Scanner obj = new Scanner(file);
    obj.useDelimiter("\\Z");
    count=Integer.parseInt(obj.nextLine());
    System.out.println(count);
    count++;
    System.out.println(count);
    FileWriter fw = new FileWriter("myfile.txt",false);
    fw.write(count + "");
    fw.close();
}
