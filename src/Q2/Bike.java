package Q2;

    public class Bike extends Vehicle{
        public Bike(String brand, double rentalPrice) {

            super(brand, rentalPrice);
        }

        @Override
        public double  calculateRentalCost(int days) {
            return (getRentalPrice()*days)- 10;
        }

        @Override
        public String toString() {
            return (" bikeBrand : "+ getBrand()+ " rental price " + getRentalPrice());
        }
    }



