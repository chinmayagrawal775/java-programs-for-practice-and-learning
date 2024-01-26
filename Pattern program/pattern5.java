class pattern5
{
  public static void main(String args[])
  {
    for(int i=1;i<=4;i++)
    {
      int count=1;
      for(int j=0;j<4-i;j++)
      {
        System.out.print(" ");
      }
      for(int k=0;k<i*2-1;k++)
      {
        if(k%2==0)
        {
          System.out.print(count);
          count++;
        }        
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}