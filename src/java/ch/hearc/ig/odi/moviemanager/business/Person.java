/*
 *  Romain vous présente son projet d'outil de dévleoppement intégré
 *  Copyleft 2015 Translait.
 *   /\_/\
 * =( °w° )=
 *   )   (  //
 *  (__ __)//
 */
package ch.hearc.ig.odi.moviemanager.business;

import ch.hearc.ig.odi.moviemanager.exception.UniqueException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
public class Person {

    private Long id;
    private String firstname;
    private String lastname;
    private List<Movie> listMovies;

    /**
     * Constructeur person
     *
     * @param id L'identifiant unique de la personne.
     * @param firstname Le prénom de la personne.
     * @param lastname Le nom de la personne.
     */
    public Person(final Long id, final String firstname, final String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.listMovies = new ArrayList<Movie>();
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
     * Retourne la prénom de la personne
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
     * Met à jour le nom de la personne.
     *
     * @param lastname
     */
    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    /**
     * Retourne la liste de films
     *
     * @return
     */
    public List<Movie> getListMovies() {
        return listMovies;
    }

    /**
     * Met à jour la liste de films
     *
     * @param listMovies
     */
    public void setListMovies(List<Movie> listMovies) {
        this.listMovies = listMovies;
    }

    /**
     * Ajoute un film à la personne
     *
     * @param movie
     * @throws ch.hearc.ig.odi.moviemanager.exception.UniqueException
     */
    public void addMovie(final Movie movie) throws UniqueException {
        Movie mov = new Movie(movie.getId(), movie.getName(), movie.getProducer());
        this.listMovies.add(mov);
    }

}
