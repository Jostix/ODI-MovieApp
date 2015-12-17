/*
 *  Romain vous présente son projet d'outil de dévleoppement intégré
 *  Copyleft 2015 Translait.
 *   /\_/\
 * =( °w° )=
 *   )   (  //
 *  (__ __)//
 */
package ch.hearc.ig.odi.moviemanager.business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
public class Movie {

    private Long id;
    private String name;
    private String producer;
    private List<Person> listPeople;

    /**
     * Constructeur de Movie
     *
     * @param id
     * @param name
     * @param producer
     */
    public Movie(final Long id, final String name, final String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.listPeople = new ArrayList<Person>();
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
     * Met à jour l'id du film
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
     * Retourne le producteur du film
     *
     * @return
     */
    public String getProducer() {
        return producer;
    }

    /**
     * Met à jour le producteur du film
     *
     * @param producer
     */
    public void setProducer(final String producer) {
        this.producer = producer;
    }

    /**
     * Retourne une liste de personnes.
     *
     * @return
     */
    public List<Person> getListPeople() {
        return listPeople;
    }

    /**
     * Met à jour la liste de personne
     *
     * @param listPeople
     */
    public void setListPeople(final List<Person> listPeople) {
        this.listPeople = listPeople;
    }

    /**
     * Retourne le nombre de personne que possède le film.
     *
     * @return
     */
    public int countMovie() {
        return this.listPeople.size();
    }

}
