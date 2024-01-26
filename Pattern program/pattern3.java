class pattern3
{
  public static void main(String args[])
  {
    for(int i=1;i<=4;i++)
    {
      int count=i;
      for(int j=0;j<4-i;j++)
      {
        System.out.print(" ");
      }
      for(int k=0;k<i*2-1;k++)
      {
        if(k<i)
        {
          System.out.print(k+1);
        }
        else
        {
          count--;
          System.out.print(count);          
        }
      }
      System.out.println();
    }
  }
}