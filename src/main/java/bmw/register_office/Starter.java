package bmw.register_office;

import bmw.register_office.rest.MarriageController;
import bmw.register_office.view.MarriageRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springContext.xml"});

        // MarriageController controller =context.getBean( MarriageController.class);
         MarriageController controller =context.getBean("controller", MarriageController.class);
         controller.findMarriageCertificate(new MarriageRequest());
    }
}
