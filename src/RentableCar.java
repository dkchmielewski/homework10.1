public class RentableCar extends Car implements Rentable, Moveable{
    public RentableCar(String name, int yearMade, int seats) {
        super(name, yearMade, seats);
    }

    private boolean isCarRented = false;
    @Override
    public String rent(Person person) {
        System.out.println("Osoba wypozyczajaca: " + person.toString());
        setCarRented(true);
        return null;
    }

    @Override
    public boolean isRent() {
        return isCarRented;
    }

    @Override
    public String handOver() {
        System.out.println("zwroc");
        setCarRented(false);
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setCarRented(boolean carRented) {
        isCarRented = carRented;
    }
}
