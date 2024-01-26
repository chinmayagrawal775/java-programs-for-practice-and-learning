class pattern4
{
  public static void main(String args[])
  {
    char arr[] = {'H','E','L','L','O'};
    for(int i=0;i<5;i++)
    {
      for(char j=0;j<=i;j++)
      {
        System.out.print(arr[j]);
      }
      System.out.println();
    }
  }
}