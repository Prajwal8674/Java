package jj;
interface Printable{
    void print();
}

class TestTnterface1 implements Printable
{
    public void print(){System.out.println("Hello");}

    public interface Showable
    {
        void print();
    }
}
    Class Show implements TestTnterface1.Showable
        {
public void print(){System.out.println("Hello   world");}
        }


public static void main(String args[]){
        TestTnterface1 obj = new TestTnterface1();
        TestTnterface1.Showable obj1 = new Show();
        obj.print();
        obj1.print();
        }
        }