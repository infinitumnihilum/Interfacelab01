package davis.john.interfacelabpart1;

/**
 * Created by jrdavis on 2/2/16.
 */
public class laferrai implements driveable {
int fuellevel = 2;

    public int getFuellevel() {
        return fuellevel;
    }



    public String turnOn() {
        return("Laferrai turns on: vroom");
    }

    public String turnOff() {
        return("Laferrai turns off: boop");
    }

    public String refuel() {
        return("Laferrai needs moar energy");
    }
}