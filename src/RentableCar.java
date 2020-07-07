import jdk.jshell.spi.SPIResolutionException;

public class RentableCar extends Car implements Rentable{
    public RentableCar(String name, int yearMade, int seats) {
        super(name, yearMade, seats);
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        //Person person = new Person();

        System.out.println(firstName + " " + lastName + " " + id);
    }

    @Override
    public boolean isRent() {
        return true;
    }

    @Override
    public void handOver() {
        System.out.println("zwroc");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
