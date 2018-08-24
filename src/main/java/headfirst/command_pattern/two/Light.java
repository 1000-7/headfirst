package headfirst.command_pattern.two;

public class Light {

    public String type;

    public Light(String type) {
        this.type = type;
    }

    public void on() {
        System.out.println("light is on");
    }

    public void off() {
        System.out.println("light is off");
    }
}
