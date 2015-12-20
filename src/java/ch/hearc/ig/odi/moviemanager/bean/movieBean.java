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
 *
 * @author Romain Ducret <romain.ducret1@he-arc.ch>
 */
@ManagedBean(name = "movieBean")
@RequestScoped
public class movieBean implements Serializable {

    /**
     * Injection des services qui permettent d'alimenter notre liste de personne
     */
    @Inject
    Services services;
    
    /**
     * Constructeur du bean movie
     */
    public movieBean() {
    }
    
    /**
     * Retourne la liste de films
     * 
     * @return 
     */
    public List getMovie(){
        return services.getMoviesList();
    }
}