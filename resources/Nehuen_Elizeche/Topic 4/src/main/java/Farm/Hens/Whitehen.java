package Farm.Hens;

import Farm.eggs.Egg;

public class Whitehen implements Hen {

    @Override
    public String Color() {
        return "white";
    }

    @Override
    public String eggcolor() {
        Egg eggs= new Egg();
            eggs.setColor("(O)");
        return eggs.getColor();
    }

    @Override
    public int eggnumber() {
        return 2;
    }

}
