package hei.tp06.core.service.Impl;

import hei.tp06.core.dao.EvenementDAO;
import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;
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

    @Inject
    EvenementDAO evenementDAO;

    public List<Evenement> findAll() {
        return evenementDAO.findAll();
    }

    public Evenement findOneById(Long id) {
        return evenementDAO.findOneById(id);
    }

    public Evenement findOneByTitle(String title) {
        return evenementDAO.findOneByTitle(title);
    }

    public void save(Evenement event){
        evenementDAO.save(event);
    }

}
