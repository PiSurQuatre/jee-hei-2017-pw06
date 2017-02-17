package hei.tp06.core.service.Impl;

import hei.tp06.core.dao.EvenementDAO;
import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by pic on 14/02/2017.
 */
@Named
@Transactional
public class EvenementServiceImpl implements EvenementService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EvenementServiceImpl.class);

    @Inject
    EvenementDAO evenementDAO;

    public List<Evenement> findAll() {
        LOGGER.debug("Récupération de tous les événements");
        return evenementDAO.findAll();
    }

    public Evenement findOneById(Long id) {

        LOGGER.debug("Récupération d'un événement par son Id");
        return evenementDAO.findOneById(id);
    }

    public Evenement findOneByTitle(String title) {

        LOGGER.debug("Récupération d'un événement par son Titre");
        return evenementDAO.findOneByTitle(title);
    }

    public void save(Evenement event){

        LOGGER.debug("Sauvegarde d'un événement");
        evenementDAO.save(event);
    }

    public void delete(Long id) {
        LOGGER.debug("Delete d'un événement");
        evenementDAO.delete(id);
    }

}
