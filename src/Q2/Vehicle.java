package Q2;

    public class Vehicle {
        private String  brand ;
        private double rentalPrice;

        public Vehicle(String brand, double rentalPrice) {
            this.brand = brand;
            this.rentalPrice = rentalPrice;
        }

        public String getBrand() {

            return brand;
        }

        public void setBrand(String brand) {

            this.brand = brand;
        }

        public double getRentalPrice() {

            return rentalPrice;
        }

        public void setRentalPrice(double rentalPrice) {

            this.rentalPrice = rentalPrice;
        }

        public double calculateRentalCost(int days) {
            return days;
        }

        @Override
        public String toString() {
            return "Vehicle" +
                    "brand='" + brand + '\'' +
                    ", rentalPrice=" + rentalPrice
                    ;
        }
    }


