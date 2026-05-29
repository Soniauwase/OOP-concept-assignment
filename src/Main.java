import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          Employee emp1 = new Employee(12,"Cynthia", "Manager", 124000);
        Employee emp2 = new Employee(1,"Fanny", "Developer", 390000);
        Employee emp3 = new Employee(12,"Delucie", "Manager", 309000);

        List<Employee> sonia = new ArrayList<>();
//        employees.add(emp1);
//        employees.add(emp2);
//        employees.add(emp3);
//        System.out.println(employees);

        Scanner sc = new Scanner(System.in);

        for (int loop = 1 ; loop <= 3 ; loop ++){
            System.out.println("*******employee " + loop + " details *****");
            System.out.print("ENTER YOUR ID: ");
            int id = sc.nextInt();
            System.out.print("ENTER YOUR NAME: ");
            String name = sc.next();
            System.out.print("ENTER YOUR STATUS: ");
            String status = sc.next();
            System.out.print("ENTER YOUR SALARY: ");
            double salary = sc.nextDouble();

            Employee chapati = new Employee(id,name,status,salary);
            if(chapati.getEmployee_sstatus().equalsIgnoreCase("manager")){
                sonia.add(chapati);
            }


        }

        System.out.println(sonia);


    }

}