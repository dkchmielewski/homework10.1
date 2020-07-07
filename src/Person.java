public class Person implements Rentable{
    private String firstName;
    private String lastName;
    private String id;

    public Person(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public Person rent() {
        return rent();
    }

    @Override
    public void handOver() {

    }

    @Override
    public boolean isRent() {
        return false;
    }
}
