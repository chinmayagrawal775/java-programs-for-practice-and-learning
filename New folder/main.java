class main
{
  public static void main(String args[])
  {
    even e = new even();
    odd o = new odd();
    e.start();
    o.start();
  }
}
class even extends Thread 
{
  public void run()
  {
    for(int i=1;i<=10;i++)
    {
      if(i%2==0)
      {
        System.out.println(" even number from thread 1 : "+i);
      }
    }
  }
}
class odd extends Thread 
{
  public void run()
  {
    for(int i=1;i<=10;i++)
    {
      if(i%2!=0)
      {
        System.out.println(" odd  number from thread 2 : "+i);
      }
    }
  }
}