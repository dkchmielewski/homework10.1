public abstract class Vehicle implements Moveable{
    private String name;
    private int yearMade;

    public Vehicle(String name, int yearMade) {
        this.name = name;
        this.yearMade = yearMade;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", yearMade=" + yearMade +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYearMade() {
        return yearMade;
    }
}