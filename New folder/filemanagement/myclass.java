import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.applet.*;
public class myclass extends Applet        
{
  public void paint(Graphics g)    
  {
    try
    {
      int count;
      File file= new File("C:\\Users\\Sony\\Downloads\\Chinmay\\5\\java programs\\New folder\\filemanagement\\myfile.txt");
      Scanner obj = new Scanner(file);
      obj.useDelimiter("\\Z");
      count=Integer.parseInt(obj.nextLine());
      count++;
      String visitor=String.valueOf(count);
      g.drawString("visitor number",100,100);
      g.drawString(visitor,100,80);
      FileWriter fw = new FileWriter("myfile.txt",false);
      fw.write(count + "");
      fw.close(); 
    }
    catch(IOException ioe){
      System.err.println(ioe.getMessage());
    }  
  }
}





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