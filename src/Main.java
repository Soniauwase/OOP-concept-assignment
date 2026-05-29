import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        for (int loop = 1; loop <= 3; loop++) {
            System.out.println("*******employee " + loop + " details *****");
            System.out.print("ENTER YOUR ID: ");
            int id = sc.nextInt();
            System.out.print("ENTER YOUR NAME: ");
            String name = sc.next();
            System.out.print("ENTER YOUR STATUS: ");
            String status = sc.next();
            System.out.print("ENTER YOUR SALARY: ");
            double salary = sc.nextDouble();
            Employee employee=new Employee(id,name,status,salary);
            System.out.println(employee);


//
//
//
        }
//
//


        }

    }