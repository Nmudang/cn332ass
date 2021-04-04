/* รายชื่อสมาชิกกลุ่ม 6110613079 ชุติกาญจน์ กุศลเอี่ยม
             6110613301 กนกกร นามเปรมปรีดิ์ */
import java.awt.Color;
import java.awt.Graphics;

public class RectangleObserver extends ShapeObserver{
    public RectangleObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    public void update(int resize, Graphics g) {
        double size = Math.sqrt(resize);
        g.setColor(Color.blue);
        g.fillRect(50,250,(int)size*2,(int)size);
    }

}
