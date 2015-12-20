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
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

/**
 * Bean pour les personnes.
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
@ManagedBean(name = "personBean")
@RequestScoped
public class personBean implements Serializable {

    /**
     * Injection des services qui permettent d'alimenter notre liste de personne
     */
    @Inject
    Services services;

    /**
     * Constructeur du bean person
     */
    public personBean() {
    }

    /**
     * Retourne la liste de personne
     *
     * @return
     */
    public List getPeople() {
        return services.getPeopleList();
    }

}