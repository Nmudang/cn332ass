import java.awt.Color;
import java.awt.Graphics;

public class CircleObserver extends ShapeObserver{
    public CircleObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    public void update(int resize, Graphics g) {
        g.setColor(Color.green);
        g.fillOval(300,100,resize,resize);
    }

}
