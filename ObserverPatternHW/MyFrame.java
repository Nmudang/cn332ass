import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
public class MyFrame extends JFrame{
    private int resize;
    public MyFrame() {
        super("resize many shapes");
        setBounds(50,100, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        final JTextField input = new JTextField();
		input.setBounds(500, 50, 62, 20);
        Button b=new Button("resize");  
        b.setBounds(500,100,60,30);  
        b.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                resize =  Integer.valueOf(input.getText()); 
                input.setText(input.getText());
            }  
            });  
        getContentPane().add(input);
        getContentPane().add(b);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void paint(Graphics g){
        Subject subject = new Subject();
        new SquareObserver(subject);
        new CircleObserver(subject);
        new RectangleObserver(subject);
        new OvalObserver(subject);
        subject.setResize(resize, g);
        }

    public static void main(String[] args) {
        Subject subject = new Subject();
        MyFrame frame = new MyFrame();
        
    }
}

