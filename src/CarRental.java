public class CarRental {
    public static void main(String[] args) {
        RentableCar[] rentableCars = new RentableCar[2];
        rentableCars[0] = new RentableCar("Volkswagen", 2010, 4);
        Person person = new Person("Jan", "Kowal", "Z234");
        Person rent = person.rent();
        rentableCars[0].isRent();
        System.out.println("Samochod: " + rentableCars[0].toString() + ", osoba: " + rent);
        rentableCars[0].handOver();
    }
}
