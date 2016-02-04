package davis.john.interfacelabpart1;


import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by jrdavis on 2/2/16.
 */
public class Cars {



    public static void main(String[] args) {
        ArrayList<String> Cars = new ArrayList<String>();
        ArrayList<int[]> fl = new ArrayList<int[]>();

        driveable d1 = new porsche918();
        driveable d2 = new porsche918();
        driveable d3 = new porsche918();
        driveable d4 = new mclarenp1();
        driveable d5 = new mclarenp1();
        driveable d6 = new mclarenp1();
        driveable d7 = new laferrai();
        driveable d8 = new laferrai();
        driveable d9 = new laferrai();
        laferrai f1 = new laferrai();

        Cars.add(d1.turnOn());
        Cars.add(d2.turnOff());
        Cars.add(d3.refuel());
        Cars.add(d4.turnOn());
        Cars.add(d5.turnOff());
        Cars.add(d6.refuel());
        Cars.add(d7.turnOn());
        Cars.add(d8.turnOff());
        Cars.add(d9.refuel());


        for(int i=0;i<Cars.size();i++){
            System.out.println(Cars.get(i));
        }


    }
}
interface driveable{

    String turnOn();
    String turnOff();
    String refuel();
}

abstract class fuelstation{


    abstract int getFuel();
    abstract int getPower();



}