public class Car extends Vehicle{
    private int seats;

    public Car(String name, int yearMade, int seats) {
        super(name, yearMade);
        this.seats = seats;
    }

    @Override
    public void turnLeft() {
        System.out.println("lewo");
    }

    @Override
    public void turnRight() {
        System.out.println("prawo");
    }

    @Override
    public void goForward() {
        System.out.println("przod");
    }

    @Override
    public void goBack() {
        System.out.println("tyl");
    }

    @Override
    public String toString() {
        return super.toString() + ", ilosc miejsc: " + seats;
    }

    public int getSeats() {
        return seats;
    }
}
