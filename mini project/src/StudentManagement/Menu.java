package StudentManagement;

import java.util.Scanner;

public class Menu {
    public int ch;
    void menu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n::CONTENT::");
        System.out.println(":: 1 : Add student record   ");
        System.out.println(":: 2 : Show all record      ");
        System.out.println(":: 3 : Show result          ");
        System.out.println(":: 4 : Update student data  ");
        System.out.println(":: 0 : Exit                 ");
        System.out.println();
        System.out.println("Enter Your Choice : ");
       ch = sc.nextInt();
    }
}
