package headfirst.command_pattern.two;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public static int getHIGH() {
        return HIGH;
    }

    public static int getMEDIUM() {
        return MEDIUM;
    }

    public static int getOFF() {
        return OFF;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void high() {
        speed = HIGH;
        System.out.println("最大");
    }

    public void off() {
        speed = OFF;
        System.out.println("关掉");
    }
}
