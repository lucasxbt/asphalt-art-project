import org.code.neighborhood.*;

public class ApplePainter extends BackgroundPainter {

    public void paintApple(String bodyColor, String accentColor) {
        takeAllPaint();
        getToStartBody();
        paintBody(bodyColor);
        getToStartString();
        paintString();
    }

    public void getToStartBody() {
      // gets painter to  starting  position
        move();
      move();
      move();
      turnRight();
       move();
      turnLeft();
      
    }

    public void paintBody(String color) {
       // paints the apple body
        paint(color);
      move();
      paint(color);
      move();
paint(color);
      move();
      turnRight();
      move();
      paint(color);
      move();
      turnLeft();
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      move();
    paint(color);
      move();
      turnRight();
      move();
    paint(color);
      turnLeft();
      move();
      turnRight();
      move();
      paint(color);
      move();
paint(color);
      move();
      paint(color);
      move();
paint(color);
      move();
      turnRight();
      move();
      paint(color);
      move();
      turnLeft();
      move();
paint(color);
      turnRight();
      move();
paint(color);
move();
paint(color);
      move();
      turnRight();
      move();
      paint(color);
      move();
      turnLeft();
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
move();
      paint(color);
move();
  paint(color);
      move();
      paint(color);
move();
      paint(color);
      turnLeft();
      move();
      turnLeft();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      turnRight();
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      turnRight();
      move();
      move();
      move();
      move();
      paint(color);
      turnRight();
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      turnRight();
      move();
       paint(color);
      turnRight();
      move();
       paint(color);
      move();
       paint(color);
      move();
       paint(color);
      move();
       paint(color);
      turnLeft();
      move();
      move();
      move();
      move();    
       turnLeft();
      move();
  paint(color);
      move();
  paint(color);
      move();
  paint(color);
      
    
    }

    public void getToStartString() {
      // go back to the  top to paint the stem
        move();
      move();
      move();
      turnLeft();
      move();
      move();
    }

    public void paintString() {
        // paint the stem of the apple
        paint("brown");
      move();
      paint("brown");
    }
}
