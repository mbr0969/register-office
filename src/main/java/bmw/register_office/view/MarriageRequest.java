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

    public String getHusbandSurname() {
        return husbandSurname;
    }

    public void setHusbandSurname(String husbandSurname) {
        this.husbandSurname = husbandSurname;
    }

    public String getHusbandGivenName() {
        return husbandGivenName;
    }

    public void setHusbandGivenName(String husbandGivenName) {
        this.husbandGivenName = husbandGivenName;
    }

    public String getHusbandPatronymic() {
        return husbandPatronymic;
    }

    public void setHusbandPatronymic(String husbandPatronymic) {
        this.husbandPatronymic = husbandPatronymic;
    }

    public LocalDate getHusbandDayBirth() {
        return husbandDayBirth;
    }

    public void setHusbandDayBirth(LocalDate husbandDayBirth) {
        this.husbandDayBirth = husbandDayBirth;
    }

    public String getHusbandPassportSerial() {
        return husbandPassportSerial;
    }

    public void setHusbandPassportSerial(String husbandPassportSerial) {
        this.husbandPassportSerial = husbandPassportSerial;
    }

    public String getHusbandPassportNumber() {
        return husbandPassportNumber;
    }

    public void setHusbandPassportNumber(String husbandPassportNumber) {
        this.husbandPassportNumber = husbandPassportNumber;
    }

    public LocalDate getHusbandPassportIssueDater() {
        return husbandPassportIssueDater;
    }

    public void setHusbandPassportIssueDater(LocalDate husbandPassportIssueDater) {
        this.husbandPassportIssueDater = husbandPassportIssueDater;
    }

    public String getWifeSurname() {
        return wifeSurname;
    }

    public void setWifeSurname(String wifeSurname) {
        this.wifeSurname = wifeSurname;
    }

    public String getWifeGivenName() {
        return wifeGivenName;
    }

    public void setWifeGivenName(String wifeGivenName) {
        this.wifeGivenName = wifeGivenName;
    }

    public String getWifePatronymic() {
        return wifePatronymic;
    }

    public void setWifePatronymic(String wifePatronymic) {
        this.wifePatronymic = wifePatronymic;
    }

    public LocalDate getWifeDayBirth() {
        return wifeDayBirth;
    }

    public void setWifeDayBirth(LocalDate wifeDayBirth) {
        this.wifeDayBirth = wifeDayBirth;
    }

    public String getWifePassportSerial() {
        return wifePassportSerial;
    }

    public void setWifePassportSerial(String wifePassportSerial) {
        this.wifePassportSerial = wifePassportSerial;
    }

    public String getWifePassportNumber() {
        return wifePassportNumber;
    }

    public void setWifePassportNumber(String wifePassportNumber) {
        this.wifePassportNumber = wifePassportNumber;
    }

    public LocalDate getWifePassportIssueDater() {
        return wifePassportIssueDater;
    }

    public void setWifePassportIssueDater(LocalDate wifePassportIssueDater) {
        this.wifePassportIssueDater = wifePassportIssueDater;
    }

    public String getMarriageCertificateNumber() {
        return marriageCertificateNumber;
    }

    public void setMarriageCertificateNumber(String marriageCertificateNumber) {
        this.marriageCertificateNumber = marriageCertificateNumber;
    }

    public LocalDate getMarriageCertificateDate() {
        return marriageCertificateDate;
    }

    public void setMarriageCertificateDate(LocalDate marriageCertificateDate) {
        this.marriageCertificateDate = marriageCertificateDate;
    }

    private LocalDate wifeDayBirth;
    private String wifePassportSerial;
    private String  wifePassportNumber;
    private LocalDate  wifePassportIssueDater;

    private String marriageCertificateNumber;
    private LocalDate marriageCertificateDate;


}
