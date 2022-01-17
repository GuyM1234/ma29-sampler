package workspace.ma29.dogemMatmid.DataStructures;

import health_care_provider.HealthCareInfoProvider;
import health_care_provider.models.PersonInsured;

public class LabTest extends Data{
    private String idNum;
    private String idType;
    private String firstName;
    private String lastName;
    private String resultDate;
    private String birthDate;
    private String labCode;
    private String stickerNumber;
    private String resultTestCorona;
    private String variant;
    private String testType;
    private String joinDate;
    private String healthCardId;
    private String healthCareName;

    public LabTest(String idNum, String idType, String firstName, String lastName, String resultDate, String birthDate, String labCode, String stickerNumber
            , String resultTestCorona, String variant, String testType) {
        this.idNum = idNum;
        this.idType = idType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.resultDate = resultDate;
        this.birthDate = birthDate;
        this.labCode = labCode;
        this.stickerNumber = stickerNumber;
        this.resultTestCorona = resultTestCorona;
        this.variant = variant;
        this.testType = testType;
    }

    public void setHealthData() {
        HealthCareInfoProvider healthCareInfoProvider = new HealthCareInfoProvider();
        try {
            PersonInsured person = healthCareInfoProvider.fetchInfo(Integer.parseInt(this.idNum), Integer.parseInt(this.idType));
            this.joinDate = String.valueOf(person.getJoinDate());
            this.healthCardId = String.valueOf(person.getHealthCareId());
            this.healthCareName =  person.getHealthCareName();
        } catch (Exception e) {
            System.out.println(this.idNum + " has invalid input");
        }
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getResultDate() {
        return resultDate;
    }

    public void setResultDate(String resultDate) {
        this.resultDate = resultDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getLabCode() {
        return labCode;
    }

    public void setLabCode(String labCode) {
        this.labCode = labCode;
    }

    public String getStickerNumber() {
        return stickerNumber;
    }

    public void setStickerNumber(String stickerNumber) {
        this.stickerNumber = stickerNumber;
    }

    public String getResultTestCorona() {
        return resultTestCorona;
    }

    public void setResultTestCorona(String resultTestCorona) {
        this.resultTestCorona = resultTestCorona;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getHealthCardId() {
        return healthCardId;
    }

    public void setHealthCardId(String healthCardId) {
        this.healthCardId = healthCardId;
    }

    public String getHealthCareName() {
        return healthCareName;
    }

    public void setHealthCareName(String healthCareName) {
        this.healthCareName = healthCareName;
    }


    @Override
    public String toString() {
        return "LabTest{" +
                "idNum='" + idNum + '\'' +
                ", idType='" + idType + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", resultDate='" + resultDate + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", labCode='" + labCode + '\'' +
                ", stickerNumber='" + stickerNumber + '\'' +
                ", resultTestCorona='" + resultTestCorona + '\'' +
                ", variant='" + variant + '\'' +
                ", testType='" + testType + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", healthCardId='" + healthCardId + '\'' +
                ", healthCareName='" + healthCareName + '\'' +
                '}';
    }
}
