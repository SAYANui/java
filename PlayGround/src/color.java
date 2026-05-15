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
    }

    static void paint(Paper p) {
        p.color = "Red";
    }

    static void replace(Paper p) {
        p = new Paper();
        p.color = "Blue";
    }
}