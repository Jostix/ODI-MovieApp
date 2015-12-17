/*
 *  Romain vous présente son projet d'outil de dévleoppement intégré
 *  Copyleft 2015 Translait.
 *   /\_/\
 * =( °w° )=
 *   )   (  //
 *  (__ __)//
 */
package ch.hearc.ig.odi.moviemanager.log;

import ch.hearc.ig.odi.moviemanager.exception.LoggerException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
public class MyLogger {

    private static MyLogger instance = null;
    private Logger logger;

    /**
     * 
     * @throws LoggerException 
     */
    private MyLogger() throws LoggerException {
        logger = Logger.getLogger(MyLogger.class.getName());
        Handler[] handlers = logger.getHandlers();

        for (int i = 0; i < handlers.length; i++) {
            logger.removeHandler(handlers[i]);
        }

        try {
            FileHandler filehandler = new FileHandler("ProjetVeille.log");
            filehandler.setFormatter(new java.util.logging.SimpleFormatter());
            logger.addHandler(filehandler);
        } catch (Exception e) {
            System.out.println("Erreur pendant la création du logger: " + e);
            throw new LoggerException("Erreur pendant la création du logger" + e);
        }
    }

    /**
     * 
     * @return 
     */
    public static MyLogger getInstance() {
        if (instance == null) {
            try {
                instance = new MyLogger();
            } catch (LoggerException ex) {
                Logger.getLogger(MyLogger.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return instance;
    }

    /**
     * 
     * @param level
     * @param message 
     */
    public void log(Level level, String message) {
        logger.log(level, message);
    }

    /**
     * 
     * @param level
     * @param message
     * @param throwable 
     */
    public void log(Level level, String message, Throwable throwable) {
        logger.log(level, message, throwable);
    }
}
