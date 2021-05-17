package Farm.Farmer;

import Farm.Henhouse.Henhouse;

public class Farmer {

    private Henhouse house;
    private String [][] redcarton;
    private String [][] whitecarton;






    public Farmer(){
        this.house = new Henhouse();

    }

    public void loadredcarton (){

            redcarton = new String[6][5];

            for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                int num=0;

                    if (house.gethens().get(num).Color() == "red") {
                        redcarton[i][j] = house.gethens().get(num).eggcolor();
                    }
                    else {
                        redcarton[i][j]="(G)";
                    }

                num= num + 1;
            }
        }
    }
    public void loadwhitecarton (){

        whitecarton = new String[6][5];
        int num=0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                    if (house.gethens().get(num).Color() == "white") {
                        whitecarton[i][j] = house.gethens().get(num).eggcolor();
                    }
                    else {
                        whitecarton[i][j] = "(G)";
                    }
                num = num + 1;
            }
        }
    }
    public void drawcarton (){
        {

            System.out.println("================\n");
            for (int i = 0; i <6 ; i++) {
                for (int j = 0; j <5 ; j++) {
                    System.out.print(redcarton [i][j]);
                }
                System.out.println("\n");
            }
            System.out.println("================\n");
            for (int i = 0; i <6 ; i++) {
                for (int j = 0; j <5 ; j++) {
                    System.out.print(whitecarton [i][j]);
                }
                System.out.println("\n");
            }

        }

    }

}
