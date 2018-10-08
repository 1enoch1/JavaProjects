import java.awt.*;

/**
 * Created by Enoch Offiah on 08/10/18.
 *
 * this is the class that draws the animated ball on top of the panel
 */

public class Ball {

        private int xB = 550;
        private int yB = 550;
        private int ballPace = 30;
        private int xPace = -ballPace-15;
        private int yPace = ballPace-10;
        private int ballDimension = 35;

        public void update() {
            xB = xB + xPace;
            yB = yB + yPace;
            if (xB < 70) {
                xPace = ballPace;
            }
            else if (xB + ballDimension > 400) {
                xPace = -ballPace;
            }
            if (yB < 70) {
                yPace = ballPace;
            }
            else if (yB + ballDimension > 400) {
                yPace = -ballPace;
            }
        }
        public void paint(Graphics g) {
            g.setColor(Color.RED);
            g.fillOval(xB, yB, ballDimension, ballDimension);
        }
    }

