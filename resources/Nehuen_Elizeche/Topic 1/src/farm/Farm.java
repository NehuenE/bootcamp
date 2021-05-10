package farm;



public class Farm {

       private Farmer farmguy;

       Farm(){

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

