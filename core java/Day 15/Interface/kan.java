interface printable
{
  void print();
}

interface showable extends printable
{
  void show();
}

class kan implements showable
{
   public void print()
{
   System.out.println("hello interface");
}

public void show()
{
  System.out.println("hello interface2");
}

public static void main(String args[])
{
  kan ko = new kan();
  ko.print();
  ko.show();
}
}