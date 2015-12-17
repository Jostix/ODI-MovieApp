/*
 *  Translait SA vous présente son projet de gestion de Projet Agile.
 *  Copyleft 2015 Translait.
 *   /\_/\
 * =( °w° )=
 *   )   (  //
 *  (__ __)//
 */
package ch.hearc.ig.odi.moviemanager.exception;

import ch.hearc.ig.odi.moviemanager.log.MyLogger;
import java.util.logging.Level;

/**
 * LoggerException lance une erreur lors d'un problème au niveau du logger.
 * 
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
public class LoggerException extends Exception {

    /**
     * Constructeur standard de LoggerException
     */
    public LoggerException() {
        super();
    }

    /**
     * Constructeur avec un message en paramètre de LoggerException
     * 
     * @param msg 
     */
    public LoggerException(String msg) {
        super(msg);
        MyLogger.getInstance().log(Level.SEVERE, msg);
    }

    /**
     * Constructeur avec une erreur en paramètre de LoggerException
     * 
     * @param t 
     */
    public LoggerException(Throwable t) {
        super(t);
    }

    /**
     * Constructeur avec un message et une erreur en paramètre de LoggerException
     * 
     * @param msg
     * @param t 
     */
    public LoggerException(String msg, Throwable t) {
        super(msg, t);
        MyLogger.getInstance().log(Level.SEVERE, msg, t);
    }
}
