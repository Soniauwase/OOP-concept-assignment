public class Manager extends Payment{
    @Override
    double Calculate_Bonus(double salary) {
        return 0.2 * salary;
    }
}
