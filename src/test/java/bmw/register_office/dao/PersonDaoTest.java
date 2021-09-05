package bmw.register_office.dao;

import bmw.register_office.domain.Person;
import bmw.register_office.domain.PersonFemale;
import bmw.register_office.domain.PersonMale;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PersonDaoTest {

    @Test
    public void findPersons() {
        PersonDao dao = new PersonDao();
        List<Person> persons = dao.findPersons();

        persons.forEach(p ->{
            System.out.println("Имя: " +p.getFirstName());
            System.out.println("Пол: " +p.getClass().getName());
            System.out.println("Паспорт: " + p.getPassports().size());
            System.out.println("Сидетельство о рождении: " +p.getBirthCertificate());
//            if(p instanceof PersonMale){
//                System.out.println("Кол свидельств о рождении у мужа: " + ((PersonMale) p).getBirthCertificates().size());
//                System.out.println( "Кол свидельств о браке у мужа: " +((PersonMale) p).getMarriageCertificates().size());
//            }else{
//                System.out.println( "Кол свидельств о рождении у жены: " +((PersonFemale) p).getBirthCertificates().size());
//                System.out.println( "Кол свидельств о браке у жены: " + ((PersonFemale) p).getMarriageCertificates().size());
//            }
        });
    }
}