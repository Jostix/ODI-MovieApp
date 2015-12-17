/*
 *  Translat SA vous présente son projet de gestion de Projet Agile.
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
 *  Lance une erreur lorsqu'il existe un doublon
 * 
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
public class UniqueException extends Exception {

    /**
     * Constructeur standard de UniqueException
     */
    public UniqueException() {
        super();
    }

    /**
     * Constructeur avec un message en paramètre de UniqueException
     * 
     * @param msg
     */
    public UniqueException(String msg) {
        super(msg);
        MyLogger.getInstance().log(Level.SEVERE, msg);
    }

    /**
     * Constructeur avec une erreur en paramètre de UniqueException
     * 
     * @param t
     */
    public UniqueException(Throwable t) {
        super(t);
    }

    /**
     * Constructeur avec un message et une erreur en paramètre de UniqueException
     * 
     * @param msg
     * @param t
     */
    public UniqueException(String msg, Throwable t) {
        super(msg, t);
        MyLogger.getInstance().log(Level.SEVERE, msg, t);
    }
}
