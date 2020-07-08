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
    public String turnLeft() {
        setDirection("w lewo");
        return direction;
    }

    @Override
    public String turnRight() {
        setDirection("w prawo");
        return direction;
    }

    @Override
    public String goForward() {
        setDirection("do przodu");
        return direction;
    }

    @Override
    public String goBack() {
        setDirection("do tylu");
        return direction;
    }

}
