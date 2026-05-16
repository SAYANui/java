class Paper {
    String color = "White";
}

public class color {
    public static void main(String[] args) {
        Paper myPaper = new Paper(); // Original object (White)

        paint(myPaper);
        System.out.println(myPaper.color); // Prints: Red

        replace(myPaper);
        System.out.println(myPaper.color); // Prints: Red (Not Blue!)


        int blue= 20;


        {
            blue =30; // int blue =30 is wrong (not again initialized ) //
            int red =20;
        }
        int red=40; // true because red don't know the content inside BLOCK //
        System.out.println("the actual red:"+ red); // red is 40  not 20


    }






    static void paint(Paper p) {
        p.color = "Red";
    }

    static void replace(Paper p) {
        p = new Paper();
        p.color = "Blue";
    }
}