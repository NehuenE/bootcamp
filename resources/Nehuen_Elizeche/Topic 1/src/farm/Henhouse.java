package farm;

import farm.hens.Factory;
import farm.hens.Hen;

import java.util.ArrayList;

public class Henhouse {

    private int housesize = 40; // this loads 1 egg per hen
    private ArrayList<Hen> hens = new ArrayList();


    Henhouse() {

        int henpercentage = ((housesize *70)/100);


        for (int i = 0; i < housesize; i++) {
            if (i < henpercentage ) {
                Hen reds = Factory.spawnhen("red");
                hens.add(reds);
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


