public class RentableCar extends Car implements Rentable{
    public RentableCar(String name, int yearMade, int seats) {
        super(name, yearMade, seats);
    }
    Person person;

    @Override
    public Person rent() {
        return person;
    }

    @Override
    public void handOver() {
        if (isRent()) {
            System.out.println("zwroc");
        } else
            System.out.println("zatrzymaj");
    }

    @Override
    public boolean isRent() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", wypozyczony: " + isRent();
    }
}
