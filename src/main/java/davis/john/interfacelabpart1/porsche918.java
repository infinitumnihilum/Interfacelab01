package davis.john.interfacelabpart1;

/**
 * Created by jrdavis on 2/2/16.
 */
public class porsche918 implements driveable {

    public String turnOn() {
        return("Porsche 918 turns on: vroom");
    }

    public String turnOff() {
        return("Porsche 918 turns off: beep");
    }

    public String refuel() {
        return("Porsche 918 needs to refuel");
    }
}