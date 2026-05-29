package Q2;

import java.util.Scanner;

import Q2.Bike;
import Q2.Car;
import Q2.Vehicle;

import java.util.Arrays;
import java.util.Scanner;

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {

        public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            boolean running=true;


            System.out.println(" ********   WELCOME!!! choose vehicle  To Rent  ************** ");

            System.out.println("1.car rental");
            System.out.println("2. bike  rental");
            System.out.println("3.exit");
            System.out.print(" enter your choice ");
            String choice = input.next();
            switch (choice) {
                case "1":
                    System.out.print("enter the car brand : ");
                    String CarBrand = input.next();
                    Car car = new Car(CarBrand, 5000);
                    System.out.print("enter day you want to rent car ");
                    int day = input.nextInt();
                    System.out.println(car.calculateRentalCost(day));

                    break;
                case "2":
                    input.nextLine();
                    System.out.print(" you are welcome to rent Bike! you want to continue y/n");
                    String bike = input.next();
                    System.out.print(" enter the bike brand");
                    String bikeBrand = input.next();
                    System.out.print("enter the day you rent the bike");
                    int  bikeDay = input.nextInt();
                    Bike v1 = new Bike(bikeBrand, 3000);
                    System.out.println(v1.calculateRentalCost(bikeDay));
                    break;
                case "3":
                    System.out.println(" thank you for working with us!");
                    running =false;
                    break;
                default:
                    System.out.println(" invalid choice , choose 1 , 2 or 3");

                    input.close();
                    break;




            }
        }



    }





