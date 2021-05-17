package Farm.Hens;

import Farm.eggs.Egg;

public class Redhen implements Hen {


    @Override
    public String Color() {
        return "red";
    }

    @Override
    public String eggcolor() {
        Egg eggs= new Egg();
            eggs.setColor("(D)");
        return  eggs.getColor();
    }

    @Override
    public int eggnumber() {
        return 2;
    }


}

