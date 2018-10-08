import javafx.event.ActionEvent;
import javax.swing.*;


/**
 * Created by Enoch Offiah on 08/10/18.
 *
 * this is the class that creates the GUI for viewing the animated ball
 */

public class ControlledBall extends JPanel {

    public static void main(String[] args) {
        JFrame controlBFrame = new JFrame();
        controlBFrame.setTitle("Controlled Ball");
        controlBFrame.setSize(450, 450);
        controlBFrame.setResizable(false);
        controlBFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlBFrame.add(new Control_BWindow());
        controlBFrame.setVisible(true);
    }
}