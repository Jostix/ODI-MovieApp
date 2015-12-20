/*
 *  Romain vous présente son projet d'outil de dévleoppement intégré
 *  Copyleft 2015 Translait.
 *   /\_/\
 * =( °w° )=
 *   )   (  //
 *  (__ __)//
 */
package ch.hearc.ig.odi.moviemanager.bean;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.service.Services;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
@Named(value = "movieDetailBean")
@SessionScoped
public class MovieDetail implements Serializable{

    @Inject
    Services services;

    private Movie movie;

    /**
     * Creates a new instance of MovieDetail
     */
    public MovieDetail() {
    }
    
     /**
     * Retourne le film
     * 
     * @return 
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Initialise les variables locale du film et la liste de personnes
     * associé.
     *
     * @param movie
     * @return
     */
    public String showMovie(final Movie movie) {
        if (movie != null) {
            this.movie = movie;
            return "success";
        } else {
            return "failure";
        }

    }

}
