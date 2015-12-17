/*
 *  Romain vous présente son projet d'outil de dévleoppement intégré
 *  Copyleft 2015 Translait.
 *   /\_/\
 * =( °w° )=
 *   )   (  //
 *  (__ __)//
 */
package ch.hearc.ig.odi.moviemanager.bean;

import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.service.Services;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
@ManagedBean(name = "PersonDetailBean")
@RequestScoped
public class PersonDetail implements Serializable {

    @Inject
    Services services;

    private Person person;
    private List movies = null;

    /**
     * Creates a new instance of PersonDetail
     */
    public PersonDetail() {
    }

    /**
     * Retourne la personne
     * 
     * @return 
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Retourne la liste de films
     * 
     * @return 
     */
    public List getMovies() {
        return movies;
    }

    /**
     * Initialise les variables locale de la personne et la liste de films
     * associé.
     *
     * @return
     */
    public String showPerson(final Person person) {
        if (person != null) {
            this.person = person;
            this.movies = person.getListMovies();
            return "success";
        } else {
            return "failure";
        }

    }

}
