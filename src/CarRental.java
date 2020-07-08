public class CarRental {
    public static void main(String[] args) {
        RentableCar[] rentableCars = new RentableCar[2];
        rentableCars[0] = new RentableCar("Volkswagen", 2010, 4);
        rentableCars[1] = new RentableCar("Mitsubishi", 2006, 2);

        rentableCars[0].rent("Jack", "Sock", "S234");
        System.out.println(rentableCars[0].toString());
        System.out.println("Wypozyczony: " + rentableCars[0].isRent());
        rentableCars[0].handOver();
        System.out.println("Wypozyczony: " + rentableCars[0].isRent());

        System.out.println("--------------------------------");

        rentableCars[1].rent("Nick", "Kyrgios", "K987");
        System.out.println(rentableCars[1].toString());
        System.out.println("Wypozyczony: " + rentableCars[1].isRent());
        rentableCars[1].handOver();
        System.out.println("Wypozyczony: " + rentableCars[0].isRent());

    }
}
