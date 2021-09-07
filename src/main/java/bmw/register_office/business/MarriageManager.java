package bmw.register_office.business;

import bmw.register_office.dao.MarriageDao;
import bmw.register_office.dao.PersonDao;
import bmw.register_office.domain.MarriageCertificate;
import bmw.register_office.domain.Person;
import bmw.register_office.domain.PersonFemale;
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
import java.util.List;

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
        //MarriageCertificate cert = marriageDao.findMarriageCertificate(request);
        personDao.findPersons();

        personDao.addPerson(getPerson(1));
        personDao.addPerson(getPerson(3));
        MarriageCertificate mc = getMarriageCertificate();
        //marriageDao.saveAndFlush(mc);
        System.out.println();
        List<MarriageCertificate> list = marriageDao.findByNumber("1234567");
        for (MarriageCertificate n : list){
            System.out.println("ID сертификата - " +  n.getMarriageCertificateId());
            System.out.println("Номер сертификата - " +  n.getNumber());
        }
        System.out.println();
        List<MarriageCertificate> list2 = marriageDao.findByNum("1234567");
        for (MarriageCertificate n : list2){
            System.out.println("ID сертификата - " +  n.getMarriageCertificateId());
            System.out.println("Номер сертификата - " +  n.getNumber());
        }
        System.out.println();
        List<MarriageCertificate> list3 = marriageDao.findSomething("1234567");
        for (MarriageCertificate n : list3){
            System.out.println("ID сертификата - " +  n.getMarriageCertificateId());
            System.out.println("Номер сертификата - " +  n.getNumber());
        }

        //marriageDao.findAll();
        //marriageDao.findById(1L);

        return new MarriageResponse();
    }

    private MarriageCertificate getMarriageCertificate(){
        MarriageCertificate mc = new MarriageCertificate();
        mc.setIssueDate(LocalDate.now());
        mc.setNumber("1234567");
        mc.setActive(true);
        List<Person> persons = personDao.findPersons();

        for(Person person : persons){
            if(person instanceof PersonMale){
                mc.setHusband((PersonMale) person);
            }else {
                mc.setWife((PersonFemale) person);
            }
        }
        return mc;
    }


    private Person getPerson(int sex){
        Person p =  sex ==1 ? new  PersonMale() :  new PersonFemale();
        p.setFirstName("1" + sex);
        p.setLastName("2" + sex);
        p.setPatronymic("2" + sex);
        p.setDateOfBirth(LocalDate.of(2007,11,23));
        return  p;
    }

}
