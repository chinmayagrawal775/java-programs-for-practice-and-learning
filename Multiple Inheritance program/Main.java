class Main
{
  public static void main(String args[])
  {
    child c = new child();
    c.childmsg();
    c.parent1msg();
    c.parent2msg();
  }
}
class parent1
{
  void parent1msg()
  {
    System.out.println("i am parent1");
  }
}
interface parent2
{
  void parent2msg();
}
class child extends parent1 implements parent2
{
  void childmsg()
  {
    System.out.println("i am child");
  }
  public void parent2msg()
  {
    System.out.println("i am parent2");
  }
}