import java.awt.Color;
import java.awt.Graphics;

public class SquareObserver extends ShapeObserver{
    public SquareObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    public void update(int resize, Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(50,100,resize,resize);
    }

}
