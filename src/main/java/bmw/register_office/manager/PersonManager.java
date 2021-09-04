package bmw.register_office.manager;

import bmw.register_office.domain.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class PersonManager {

    public static void main(String[] args) {

        sessionExampleHibernate();
        jpaExample();
    }

    private static void jpaExample() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Person p = new Person();
        p.setFirstName("Алесей");
        p.setLastName("Федоров");
        em.persist(p);
        System.out.println(p.getPersonId());
        em.getTransaction().commit();
        em.close();

        em = emf.createEntityManager();
        List<Person> persons = em.createQuery("FROM Person",Person.class).getResultList();
        for(Person p1 : persons){
            System.out.println("Id: " + p1.getPersonId()+ " Имя: "+ p1.getFirstName() + " Фамилия: " + p1.getLastName());
        }

        em.close();

    }

    private static void sessionExampleHibernate() {
        SessionFactory sf = buildSessionFactory();
        System.out.println();
        System.out.println();
        System.out.println();
        Session session = sf.openSession();
        session.getTransaction().begin();
        Person p = new Person();
        p.setFirstName("Василий");
        p.setLastName("Сидоров");
        Long id = (Long) session.save(p);
        System.out.println(id);
        session.getTransaction().commit();
        session.close();
        session = sf.openSession();
        Person person = session.get(Person.class, id);

        System.out.println("ID: " + person.getPersonId()+ " Имя: "+ person.getFirstName() + " Фамилия: " + person.getLastName());
        session.close();

        session = sf.openSession();
        List<Person> persons = session.createQuery("FROM Person",Person.class).list();
        for(Person p1 : persons){
            System.out.println("Id: " + p1.getPersonId()+ " Имя: "+ p1.getFirstName() + " Фамилия: " + p1.getLastName());
        }
        session.close();
    }


    private static SessionFactory buildSessionFactory(){
        try {
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml").build();
            Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
            return metadata.getSessionFactoryBuilder().build();
        }catch (Throwable ex){
            System.err.println("Initial SessionFactory create failed " +ex );
            throw new ExceptionInInitializerError();
        }
    }

}
