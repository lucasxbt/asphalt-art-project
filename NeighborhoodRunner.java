import org.code.neighborhood.*;

public class NeighborhoodRunner {
    public static void main(String[] args) {
        BackgroundPainter BP = new BackgroundPainter();
        ApplePainter AP = new ApplePainter();

        // set paint amounts for both painters
        BP.setPaint(1000);
        AP.setPaint(1000); 

        BP.paintBackground("White", 8); //paint background white
        AP.paintApple("red", "white");   // paint the APPLE
    }
}
