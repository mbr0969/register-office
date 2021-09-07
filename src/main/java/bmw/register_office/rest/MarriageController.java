package bmw.register_office.rest;

import bmw.register_office.business.MarriageManager;
import bmw.register_office.view.MarriageRequest;
import bmw.register_office.view.MarriageResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Service("controller")
@Path("/mc")
public class MarriageController {

    private static final Logger logger = LoggerFactory.getLogger(MarriageController.class);

    @Autowired
    @Qualifier("marriageManagerService")
    private MarriageManager marriageManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public MarriageResponse findMarriageCertificate(){
        logger.info("findMarriageCertificate called");
        return  marriageManager.findMarriageCertificate(null);
    }
}
