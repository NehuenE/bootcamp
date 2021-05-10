package farm;

import farm.hens.Hen;
import farm.hens.Redhen;
import farm.hens.Whitehen;

import java.util.ArrayList;

public class Henhouse {


    private int housesize;
    private ArrayList<Hen> hens = new ArrayList();


    Henhouse() {
        housesize = 40; // this loads 1 egg per hen



        for (int i = 0; i < housesize; i++) {
            if (i < 24) {
                Redhen reds = new Redhen();
                reds.setColor();
                hens.add(reds);
            } else {
                Whitehen whites = new Whitehen();
                whites.setColor();
                hens.add(whites);

            }

        }
    }

    public ArrayList<Hen> gethens(){
        return  hens;
    }

}


