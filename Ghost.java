import java.util.Random;

public class Ghost {


    public Ghost() {

    }

    public String getColor() {
        String color ="";
        int x = new Random().nextInt(4);
        switch (x) {
            case 0: color = "yellow";
            break;
            case 1: color = "red";
            break;
            case 2: color = "purple";
            break;
            case 3: color = "white";
            break;
        }
        return color;

    }

}