public class Developer extends Payment{
    @Override
    double Calculate_Bonus(double salary) {
        return 0.1* salary;
    }
}
