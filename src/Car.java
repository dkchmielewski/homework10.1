public class Car extends Vehicle{
    private int seats;

    public Car(String name, int yearMade, int seats) {
        super(name, yearMade);
        this.seats = seats;
    }

    @Override
    public String toString() {
        return super.toString() + ", ilosc miejsc: " + seats;
    }

    public int getSeats() {
        return seats;
    }
}
