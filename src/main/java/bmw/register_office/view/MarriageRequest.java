package bmw.register_office.view;

import java.io.Serializable;
import java.time.LocalDate;

public class MarriageRequest implements Serializable {

    //husband
    private String husbandSurname;
    private String husbandGivenName;
    private String husbandPatronymic;
    private LocalDate husbandDayBirth;
    private String  husbandPassportSerial;
    private String  husbandPassportNumber;
    private LocalDate  husbandPassportIssueDater;
    //wife
    private String wifeSurname;
    private String wifeGivenName;
    private String wifePatronymic;
    private LocalDate wifeDayBirth;
    private String wifePassportSerial;
    private String  wifePassportNumber;
    private LocalDate  wifePassportIssueDater;

    private String marriageCertificateNumber;
    private LocalDate marriageCertificateDate;


}
