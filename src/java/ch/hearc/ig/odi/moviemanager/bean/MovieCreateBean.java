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
@Named(value = "movieCreateBean")
@RequestScoped
public class MovieCreateBean {

    @Inject
    Services services;
    private Long id;
    private String name;
    private String producer;

    /**
     * Creates a new instance of MovieCreateBean
     */
    public MovieCreateBean() {
    }

    /**
     * Retourne l'id du film
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * Met à jour l'Id du film
     *
     * @param id
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * Retourne le nom du film
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Met à jour le nom du film
     *
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Retourne le producteur
     *
     * @return
     */
    public String getProducer() {
        return producer;
    }

    /**
     * Met à jour le producteur
     *
     * @param producer
     */
    public void setProducer(final String producer) {
        this.producer = producer;
    }

    /**
     * Ajoute un film dans la liste
     *
     * @return
     */
    public String createMovie() {
        try {
            services.saveMovie(id, name, producer);
            return "success";
        } catch (UniqueException ex) {
            return "failure";
        }
    }

}
