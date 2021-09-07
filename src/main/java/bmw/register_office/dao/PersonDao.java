package bmw.register_office.dao;

import bmw.register_office.domain.Person;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
public class PersonDao {

    @PersistenceContext
    private EntityManager entityManager;

//    public PersonDao() {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
//        entityManager = factory.createEntityManager();
//    }

    public List<Person> findPersons(){
        Query query = entityManager.createNamedQuery("Person.findPersons");
        return query.getResultList();
    }

    public Long addPerson(Person person){
        entityManager.persist(person);
        entityManager.flush();
        return person.getPersonId();
    }
}
