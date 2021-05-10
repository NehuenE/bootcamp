package farm;

public class Farmer {

    private Henhouse house;
    private String [][] redcarton;
    private String [][] whitecarton;

    {
        redcarton = new String[6][5];
        whitecarton = new String[6][5];
    }


    Farmer (){
        this.house = new Henhouse();

    }

    public void loadredcarton (){



        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                int num=0;
                if (house.gethens().get(num).getColor() == "red")
                {
                    redcarton[i][j]="(D)";
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

                if (house.gethens().get(num).getColor() == "white")
                {
                    whitecarton[i][j]="(G)";
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
