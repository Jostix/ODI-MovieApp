/*
 *  Translait SA vous présente son projet de gestion de Projet Agile.
 *  Copyleft 2015 Translait.
 *   /\_/\
 * =( °w° )=
 *   )   (  //
 *  (__ __)//
 */
package ch.hearc.ig.odi.moviemanager.business;

/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
public class Movie {
    private Long id;
    private String name;
    private String producer;

    /**
     * Constructeur de Movie
     * 
     * @param id
     * @param name
     * @param producer 
     */
    public Movie(final Long id,final String name,final String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
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
    
    
}
