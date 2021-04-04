/* รายชื่อสมาชิกกลุ่ม 6110613079 ชุติกาญจน์ กุศลเอี่ยม
             6110613301 กนกกร นามเปรมปรีดิ์ */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
public class MyFrame extends JFrame implements ActionListener{
    Subject subject = new Subject();
    int inputa;
    public MyFrame() {
        super("resize many shapes");
        setBounds(50,100, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
        public void paint(Graphics g){
            super.paint(g);
            new SquareObserver(subject);
            new CircleObserver(subject);
            new RectangleObserver(subject);
            new OvalObserver(subject);
            getContentPane().setLayout(null);
            JTextField input = new JTextField();
            input.setBounds(500, 50, 62, 20);
            Button b = new Button("resize");  
            b.setBounds(500,100,60,30);  
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String s = e.getActionCommand();
                    if (s.equals("resize")) {
                        inputa = Integer.valueOf(input.getText());
                        subject.setResize(100, g);
                    }
                }
            });
            
            getContentPane().add(input);
            getContentPane().add(b);
            setLocationRelativeTo(null);
            setVisible(true);
        }
        
        public void actionPerformed(ActionEvent e)  {
            String s = e.getActionCommand();
            if (s.equals("resize")) {
                new SquareObserver(subject);
                new CircleObserver(subject);
                new RectangleObserver(subject);
                new OvalObserver(subject);
            }
        }
        public static void main(String[] args) {
            MyFrame frame = new MyFrame();
            
            }
        }