/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

/**
 *
 * @author User
 */
public class WriteLogFile {

    Logger logger = Logger.getLogger("MyLog");
    FileHandler fh;

    public WriteLogFile() {
        try {
            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:\\Users\\User\\Documents\\NetBeansProjects\\Observers\\MyLogFile.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            // the following statement is used to log any messages  
            logger.info("Start log");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("Hi How r u?");
    }

    public void wirte(String content) {
        logger.info(content);
    }

}
