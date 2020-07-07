public class CarRental {
    public static void main(String[] args) {
        RentableCar[] rentableCars = new RentableCar[2];
        rentableCars[0] = new RentableCar("Volkswagen", 2010, 4);
        rentableCars[0].rent("Jan", "Rajski", "Z234");
        System.out.println("Samochod: " + rentableCars[0].toString() + ", wypozyczony: "
                + rentableCars[0].isRent());
        rentableCars[0].handOver();

        System.out.println();

        rentableCars[1] = new RentableCar("BMW M5", 2016, 5);
        rentableCars[1].rent("Dawid", "Mroz", "Y522");
        System.out.println("Samochod: " + rentableCars[1].toString() + ", wypozyczony: "
                + rentableCars[1].isRent());
        rentableCars[1].handOver();
    }
}
