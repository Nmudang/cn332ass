
package main.java;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author User
 */
public class ObserverApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String... args) throws IOException, GeneralSecurityException{
        // TODO code application logic here
        
        Customer cus = new Customer();
        ICustom bus = new Business("Business 1");
        ICustom oth = new Other("Other 1");
        cus.add(bus);
        cus.add(oth);
        bus.editCus(cus, "Businessman 2");
        cus.notifyCus();
        
        
        
    }
    
    
}
