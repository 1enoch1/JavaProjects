import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Enoch Offiah on 08/10/18.
 *
 * this is the class that assigns controls to the drawn buttons
 * - how they affect animation on the Panel
 * - how the panel itself appears to a user

 */


public class Control_BWindow extends JPanel implements ActionListener {
    private boolean run = true;

    Ball ball = new Ball();
    JButton StopBall = new JButton("stop");
    JButton StartBall = new JButton("start");
    JPanel ballPanel = new JPanel();

    public void ball_Stopper() {
        run = false;

    }

    public void ball_Starter() {
        run = true;

    }

    public Control_BWindow() {
        Timer counter = new Timer(50, this);
        counter.start();
        ballPanel.add(StartBall);
        ballPanel.add(StopBall);
        this.add(ballPanel, BorderLayout.SOUTH);
        StartBall.addActionListener(new Start());
        StopBall.addActionListener(new Stop());
    }

    private void update() {
        ball.update();
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.lightGray);
        g.fillRect(0, 0, 450, 450);
        g.setColor(Color.black);
        g.drawRect(60, 60, 350, 350);
        ball.paint(g);
    }

    public void actionPerformed(ActionEvent e) {
        if (run) {
            update();
            repaint();
        }

    }
    class Start implements ActionListener {
        public void actionPerformed(ActionEvent e){
            ball_Starter();
            repaint();
        }
    }

    class Stop implements ActionListener {
        public void actionPerformed(ActionEvent e){
            ball_Stopper();
            repaint();
        }
    }
}
