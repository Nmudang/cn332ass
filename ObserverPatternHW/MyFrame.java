/* รายชื่อสมาชิกกลุ่ม 6110613079 ชุติกาญจน์ กุศลเอี่ยม
             6110613301 กนกกร นามเปรมปรีดิ์ */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
public class MyFrame extends JFrame{
    int size;
    public MyFrame() {
        super("resize many shapes");
        setBounds(50,100, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        JTextField input = new JTextField();
        input.setBounds(500, 50, 100, 50);
        Button b = new Button("resize");  
        b.setBounds(500,100,60,30);  
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    input.setText("Pressed"+input.getText());
                    size = Integer.valueOf(input.getText());
            }
        });
        getContentPane().add(input);
        getContentPane().add(b); 
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void paint(int size, Graphics g){
        Subject subject = new Subject();
        new SquareObserver(subject);
        new CircleObserver(subject);
        new RectangleObserver(subject);
        new OvalObserver(subject);
        subject.setResize(size, g); //client can resize shapes by change first field
    }
        
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        }
    }