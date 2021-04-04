/* รายชื่อสมาชิกกลุ่ม 6110613079 ชุติกาญจน์ กุศลเอี่ยม
             6110613301 กนกกร นามเปรมปรีดิ์ */
import java.awt.Color;
import java.awt.Graphics;

public class OvalObserver extends ShapeObserver{
    public OvalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    public void update(int resize, Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(300,250,resize,resize*2);
    }

}

