package farm.hens;

public class Factory {

    public static Hen spawnhen (String Color) {
        switch (Color){
            case "red":
                return new Redhen();
            case "white":
                return new Whitehen();
            default:
                return null;

        }

    }
}
