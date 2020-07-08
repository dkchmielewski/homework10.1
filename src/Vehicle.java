public abstract class Vehicle implements Moveable{
    private String name;
    private int yearMade;

    public Vehicle(String name, int yearMade) {
        this.name = name;
        this.yearMade = yearMade;
    }

    @Override
    public String toString() {
        return "Samochod: " + name +
                ", rocznik: " + yearMade;
    }

    public String getName() {
        return name;
    }

    public int getYearMade() {
        return yearMade;
    }

    private String direction;

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public void turnLeft() {
        setDirection("w lewo");
        System.out.println(direction);;
    }

    @Override
    public void turnRight() {
        setDirection("w prawo");
        System.out.println(direction);;
    }

    @Override
    public void goForward() {
        setDirection("do przodu");
        System.out.println(direction);
    }

    @Override
    public void goBack() {
        setDirection("do tylu");
        System.out.println(direction);;
    }

}
