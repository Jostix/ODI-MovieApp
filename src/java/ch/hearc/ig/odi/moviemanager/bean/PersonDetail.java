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
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
@Named(value = "personDetailBean")
@SessionScoped
public class PersonDetail implements Serializable {

    @Inject
    Services services;

    private Person person;

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
     * Initialise les variables locale de la personne et la liste de films
     * associé.
     *
     * @param person
     * @return
     */
    public String showPerson(final Person person) {
        if (person != null) {
            this.person = person;
            return "success";
        } else {
            return "failure";
        }

    }

}
