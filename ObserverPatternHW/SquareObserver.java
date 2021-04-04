/* รายชื่อสมาชิกกลุ่ม 6110613079 ชุติกาญจน์ กุศลเอี่ยม
             6110613301 กนกกร นามเปรมปรีดิ์ */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class SquareObserver extends ShapeObserver{
    public SquareObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    public void update(int resize, Graphics g) {
        double size = Math.sqrt(resize);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.fillRect(50,100,(int)size,(int)size);
    }

}
