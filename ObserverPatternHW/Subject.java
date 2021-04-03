import java.util.ArrayList;
import java.util.List;
import java.awt.*;
public class Subject {
	
   private List<ShapeObserver> observers = new ArrayList<ShapeObserver>();
   private int resize;

   public int getResize() {
      return resize;
   }

   public void setResize(int resize, Graphics g) {
      this.resize = resize;
      notifyAllObservers(resize, g);
   }

   public void attach(ShapeObserver observer){
      observers.add(observer);		
   }

   public void notifyAllObservers(int resize, Graphics g){
      for (ShapeObserver observer : observers) {
         observer.update(resize, g);
      }
   } 	
}