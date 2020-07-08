public class RentableCar extends Car implements Rentable, Moveable{
    public RentableCar(String name, int yearMade, int seats) {
        super(name, yearMade, seats);
    }

    private boolean isCarRented = false;
    @Override
    public void rent(String firstName, String lastName, String id) {
        setCarRented(true);
        Person person = new Person(firstName, lastName, id);
        System.out.println("Osoba wypozyczajaca: " + person.toString());
    }

    @Override
    public boolean isRent() {
        return isCarRented;
    }

    @Override
    public void handOver() {
        setCarRented(false);
        Person person = null;
        System.out.println("zwroc");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setCarRented(boolean carRented) {
        isCarRented = carRented;
    }

}
