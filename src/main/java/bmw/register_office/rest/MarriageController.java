package bmw.register_office.rest;

import bmw.register_office.business.MarriageManager;
import bmw.register_office.view.MarriageRequest;
import bmw.register_office.view.MarriageResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("controller")
public class MarriageController {

    private static final Logger logger = LoggerFactory.getLogger(MarriageController.class);

    @Autowired
    @Qualifier("marriageManagerService")
    private MarriageManager marriageManager;


    public MarriageResponse findMarriageCertificate(MarriageRequest request){
        logger.info("findMarriageCertificate called");
        return  marriageManager. findMarriageCertificate(request);
    }
}
