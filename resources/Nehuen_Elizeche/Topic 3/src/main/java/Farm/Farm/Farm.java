package Farm.Farm;


import Farm.Farmer.Farmer;

public class Farm {

    private Farmer farmguy;

    public Farm(){

        farmguy = new Farmer() ;

    }

    public void loadwork(){

        farmguy.loadredcarton();
        farmguy.loadwhitecarton();
    }

    public void showcarton(){
        farmguy.drawcarton();

    }


}
