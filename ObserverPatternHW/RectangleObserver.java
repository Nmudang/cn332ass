import java.awt.Color;
import java.awt.Graphics;

public class RectangleObserver extends ShapeObserver{
    public RectangleObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    public void update(int resize, Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(50,250,resize*2,resize);
    }

}
