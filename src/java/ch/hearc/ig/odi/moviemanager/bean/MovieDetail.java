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
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
@ManagedBean(name = "MovieDetailBean")
@RequestScoped
public class MovieDetail {

    @Inject
    Services services;

    private Movie movie;
    private List people = null;

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
     * Retourne la liste de personne
     * 
     * @return 
     */
    public List getPeople() {
        return people;
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
            this.people = movie.getListPeople();
            return "success";
        } else {
            return "failure";
        }

    }

}
