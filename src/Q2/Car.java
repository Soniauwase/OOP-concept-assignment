package Q2;


    public class Car extends Vehicle{
        public Car(String brand, double rentalPrice) {
            super(brand, rentalPrice);

        }

        @Override
        public double calculateRentalCost(int days) {
            return  getRentalPrice()* days;

        }

        @Override
        public String toString() {
            return
                    " carBrand='" + getBrand() + '\'' +
                            ", rentalPrice=" + getRentalPrice() ;
        }
    }


