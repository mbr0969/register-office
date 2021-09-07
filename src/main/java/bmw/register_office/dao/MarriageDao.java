package bmw.register_office.dao;

import bmw.register_office.domain.MarriageCertificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component
//@PropertySource(value ={ "classpath:/register.properties"})
@Repository
public interface MarriageDao  extends JpaRepository<MarriageCertificate, Long> {

    List<MarriageCertificate> findByNumber(String number);

    List<MarriageCertificate> findByNum(@Param("number") String number);

    @Query("SELECT mc FROM MarriageCertificate mc WHERE mc.number = :number")
    List<MarriageCertificate> findSomething(@Param("number") String number);


//    private EntityManager entityManager;
//    @Value("${test.value}")
//    private String test;
//
//    private static final Logger logger = LoggerFactory.getLogger(MarriageDao.class);
//
//    public String getTest() {
//        return test;
//    }
//
//    public void setTest(String test) {
//        this.test = test;
//    }
//
//    public MarriageCertificate findMarriageCertificate(MarriageRequest request){
//        logger.info("MarriageDao.findMarriageCertificate called: {}", test);
//
//        return new MarriageCertificate();
//
//    }
}
