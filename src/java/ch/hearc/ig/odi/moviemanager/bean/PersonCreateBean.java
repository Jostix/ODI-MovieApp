/*
 *  Romain vous présente son projet d'outil de dévleoppement intégré
 *  Copyleft 2015 Translait.
 *   /\_/\
 * =( °w° )=
 *   )   (  //
 *  (__ __)//
 */
package ch.hearc.ig.odi.moviemanager.bean;

import ch.hearc.ig.odi.moviemanager.exception.UniqueException;
import ch.hearc.ig.odi.moviemanager.service.Services;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
@Named(value = "personCreateBean")
@RequestScoped
public class PersonCreateBean {

    @Inject
    Services services;
    private Long id;
    private String firstname;
    private String lastname;

    /**
     * Creates a new instance of PersonCreateBean
     */
    public PersonCreateBean() {
    }

    /**
     * Retourne l'id de la personne
     * 
     * @return 
     */
    public Long getId() {
        return id;
    }

    /**
     * Met à jour l'id de la personne
     * 
     * @param id 
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * Retourne le prénom de la personne
     * 
     * @return 
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Met à jour le prénom de la personne
     * 
     * @param firstname 
     */
    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    /**
     * Retourne le nom de la personne
     * 
     * @return 
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Récupère le nom de la personne
     * 
     * @param lastname 
     */
    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    /**
     * Sauve une personne
     *
     * @return
     */
    public String createPerson() {
        try {
            services.savePerson(id, firstname, lastname);
            return "success";
        } catch (UniqueException ex) {
            return "failure";
        }

    }

}
