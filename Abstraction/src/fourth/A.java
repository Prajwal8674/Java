package fourth;

public abstract class A {
    A()
    {
        System.out.println("This Is Constructor Of Abstract Class ");
    }
    abstract void a_method();
    void non_abstract()
    {
        System.out.println("This Is  Normal Method Of a class ");
    }
}
