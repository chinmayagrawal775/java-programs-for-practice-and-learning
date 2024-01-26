class pattern
{
  public static void main(String args[])
  {
    for(int i=1;i<5;i++)
    {
      for(int j=0;j<5-i;j++)
      {
        System.out.print(" ");
      }
      for(int k=0;k<i*2-1;k++)
      {
        if(k==0 || k==i*2-2)
        {
          System.out.print("1");
        }
        else
        {
          if(k%2==0)
          {
            System.out.print(i-1);
          }
          else
          {
            System.out.print(" ");
          }
        }
      }
      System.out.println("");
    }
  }
}