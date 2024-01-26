class main
{ 
  public static void main(String args[])
  {
    b t = new b();
    t.method();
  } 
}
class a
{
  void method()
  {
    System.out.println("in the class a");
  }
}
class b extends a
{
  void method()
  {
    System.out.println("in the class b...as overrids by class b");
  }
}