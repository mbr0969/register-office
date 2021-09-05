package bmw.register_office.dao;

import bmw.register_office.business.MarriageManager;
import bmw.register_office.domain.MarriageCertificate;
import bmw.register_office.view.MarriageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Component
@PropertySource(value ={ "classpath:/register.properties"})
public class MarriageDao {

    private EntityManager entityManager;
    @Value("${test.value}")
    private String test;

    private static final Logger logger = LoggerFactory.getLogger(MarriageDao.class);

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public MarriageCertificate findMarriageCertificate(MarriageRequest request){
        logger.info("MarriageDao.findMarriageCertificate called: {}", test);

        return new MarriageCertificate();

    }
}
