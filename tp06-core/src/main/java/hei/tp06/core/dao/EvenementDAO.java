package hei.tp06.core.dao;

import hei.tp06.core.entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EvenementDAO extends JpaRepository<Evenement, Long> {

    List<Evenement> findAll();

    Evenement findOneById(Long id);

    Evenement findOneByTitle(String title);


}