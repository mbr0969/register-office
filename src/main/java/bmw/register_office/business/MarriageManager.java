package bmw.register_office.business;

import bmw.register_office.dao.MarriageDao;
import bmw.register_office.dao.PersonDao;
import bmw.register_office.domain.MarriageCertificate;
import bmw.register_office.domain.Person;
import bmw.register_office.domain.PersonMale;
import bmw.register_office.view.MarriageRequest;
import bmw.register_office.view.MarriageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service("marriageManagerService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MarriageManager {

    private static final Logger logger = LoggerFactory.getLogger(MarriageManager.class);

    @Autowired
    private MarriageDao marriageDao;
    @Autowired
    private PersonDao personDao;

    @Transactional
    public MarriageResponse findMarriageCertificate(MarriageRequest request){
        logger.info("MarriageManager.findMarriageCertificate called");
        MarriageCertificate cert = marriageDao.findMarriageCertificate(request);
        personDao.findPersons();

        Person p = new PersonMale();
        p.setFirstName("Мария");
        p.setLastName("Пелешко");
        p.setPatronymic("Вячеславовна");
        p.setDateOfBirth(LocalDate.of(2007,11,23));
        Long id =personDao.addPerson(p);
        logger.info("Person added id {}", id);
        return new MarriageResponse();
    }

}
