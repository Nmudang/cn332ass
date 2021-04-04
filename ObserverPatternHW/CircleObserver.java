import java.awt.Color;
import java.awt.Graphics;
import java.lang.Math;

public class CircleObserver extends ShapeObserver{
    public CircleObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    public void update(int resize, Graphics g) {
        double size = Math.sqrt(resize);
        g.setColor(Color.green);
        g.fillOval(300,100, (int)size,(int)size);
    }

}
