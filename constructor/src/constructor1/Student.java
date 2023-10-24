package constructor1;

public class Student {
public String Name ;
public int  RollNo;
    Student(String name,int RollNo)
    {
        System.out.println("Name = "+name);
        System.out.println("Roll Number = "+RollNo);
    }
    Student()
    {
        Name="Prajwal";
        RollNo=12;
       System.out.println(Name);
        System.out.println(RollNo);

    }
}
