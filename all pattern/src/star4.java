public class star4 {
    public static void main(String[] args) {
        int radius = 5; // Increase this for a smoother "round" look
        double aspectRatio = 2.2; // Adjust this if the circle looks too wide or thin

        // We loop from -radius to +radius to center the circle at (0,0)
        for (int y = -radius; y <= radius; y++) {
            for (int x = (int)(-radius * aspectRatio); x <= (int)(radius * aspectRatio); x++) {

                // Normalizing the coordinates
                double normalizedX = x / aspectRatio;
                double normalizedY = y;

                // Circle Equation: x^2 + y^2 <= r^2
                if (Math.pow(normalizedX, 2) + Math.pow(normalizedY, 2) <= Math.pow(radius, 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next row
            System.out.println();
        }
    }
}