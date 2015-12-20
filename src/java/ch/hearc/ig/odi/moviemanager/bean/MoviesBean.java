/*
 *  Romain vous présente son projet d'outil de dévleoppement intégré
 *  Copyleft 2015 Translait.
 *   /\_/\
 * =( °w° )=
 *   )   (  //
 *  (__ __)//
 */
package ch.hearc.ig.odi.moviemanager.bean;

import ch.hearc.ig.odi.moviemanager.service.Services;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
@Named(value = "moviesBean")
@RequestScoped
public class MoviesBean implements Serializable {

    /**
     * Injection des services qui permettent d'alimenter notre liste de personne
     */
    @Inject
    Services services;
    
    /**
     * Constructeur du bean movie
     */
    public MoviesBean() {
    }
    
    /**
     * Retourne la liste de films
     * 
     * @return 
     */
    public List getMovie(){
        return services.getMoviesList();
    }
}