/* รายชื่อสมาชิกกลุ่ม 6110613079 ชุติกาญจน์ กุศลเอี่ยม
             6110613301 กนกกร นามเปรมปรีดิ์ */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.Graphics;
public class MyFrame extends JFrame{
    int size;
    Subject subject;
    private int i;
    public MyFrame() {
        super("resize many shapes");
        subject = new Subject();
        size = 100; 
        i = 0;
        setBounds(50,100, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        JTextField input = new JTextField();
        input.setBounds(500, 50, 100, 50);
        Button b = new Button("resize");  
        b.setBounds(500,100,60,30);  
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                i++;
                input.setText(input.getText());
                size = Integer.valueOf(input.getText());
                if (i%2 == 0)
                    setBounds(50,100, 800, 600);
                else
                    setBounds(50,100, 801, 601); 
                }
            });
        getContentPane().add(input);
        getContentPane().add(b); 
        setLocationRelativeTo(null);
        setVisible(true);
                     
    }
                 
    public void paint(Graphics g){
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
             