package Farm.Henhouse;

import Farm.Hens.Factory;
import Farm.Hens.Hen;

import java.util.ArrayList;

public class Henhouse {

    private int housesize = 40; // this loads 1 egg per hen
    private ArrayList<Hen> hens = new ArrayList();


    public Henhouse() {

        int henpercentage = ((housesize *70)/100);


        for (int i = 0; i < 40; i++) {
            if (i < 28 ) {
                Hen reds = Factory.spawnhen("red");
                hens.add(i, reds);
            } else {
                Hen whites = Factory.spawnhen("white");
                hens.add(whites);

            }

        }
    }

    public ArrayList<Hen> gethens(){
        return  hens;
    }

}
