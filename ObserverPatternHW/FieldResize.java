import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
public class FieldResize implements ActionListener {
    public void actionPerformed(ActionEvent e)  {
        String s = e.getActionCommand();
        if (s.equals("resize")) {
            s.setText("Ok Button is clicked here");
        }
    }
}
