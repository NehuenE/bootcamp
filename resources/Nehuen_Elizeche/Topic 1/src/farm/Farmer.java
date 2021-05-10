package farm;

public class Farmer {

    private Henhouse house;
    private String [][] redcarton;
    private String [][] whitecarton;

    {
        redcarton = new String[6][5];
        whitecarton = new String[6][5];
        for (int i = 0; i < redcarton[i].length; i++) {
            for (int j = 0; j < redcarton[j].length; j++) {

                redcarton[i][j]="(G)";
            }

        }
        for (int i = 0; i < whitecarton[i].length; i++) {
            for (int j = 0; j < whitecarton[j].length; j++) {

                redcarton[i][j]="(G)";
            }

        }
    }


    Farmer (){
        this.house = new Henhouse();

    }

    public void loadredcarton (){



        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                int num=0;
                if (house.gethens().get(num).Color() == "red")
                {
                    redcarton[i][j]= house.gethens().get(num).eggcolor();
                }
                else{
                    redcarton[i][j]="(G)";
                }
                num= num + 1;


            }

        }

    }
    public void loadwhitecarton (){

        int num=0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {

                if (house.gethens().get(num).Color() == "white")
                {
                    whitecarton[i][j]=house.gethens().get(num).eggcolor();
                }
                else{
                    whitecarton[i][j]="(O)";
                }
                num= num + 1;


            }

        }

    }
    public void drawcarton (){
        {

            System.out.println("================\n");
                for (int i = 0; i <6 ; i++) {
                    for (int j = 0; j <5 ; j++) {
                        System.out.print(whitecarton [i][j]);
                    }
                    System.out.println("\n");
                }
            System.out.println("================\n");
            for (int i = 0; i <6 ; i++) {
                for (int j = 0; j <5 ; j++) {
                    System.out.print(redcarton [i][j]);
                }
                System.out.println("\n");
            }

        }

    }

}
