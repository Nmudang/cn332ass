import java.awt.*;
public abstract class ShapeObserver{
    protected Subject subject;
    public abstract void update(int resize, Graphics g);
 }