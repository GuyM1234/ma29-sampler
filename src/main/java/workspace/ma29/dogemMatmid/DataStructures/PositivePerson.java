package workspace.ma29.dogemMatmid.DataStructures;

public class PositivePerson {
    private String idNum;
    private String idType;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private String buildingNumber;
    private String barcode;
    private String birthDate;
    private String labCode;
    private String resultDate;
    private String takeDate;
    private String stickerNumber;
    private String resultTestCorona;
    private String variant;
    private String testType;

    public PositivePerson(String idNum, String idType, String firstName, String lastName, String city, String street, String buildingNumber, String barcode, String birthDate,
                          String labCode, String resultDate, String takeDate, String stickerNumber, String resultTestCorona, String variant, String testType) {
        this.idNum = idNum;
        this.idType = idType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.barcode = barcode;
        this.birthDate = birthDate;
        this.labCode = labCode;
        this.resultDate = resultDate;
        this.takeDate = takeDate;
        this.stickerNumber = stickerNumber;
        this.resultTestCorona = resultTestCorona;
        this.variant = variant;
        this.testType = testType;
    }

    public String getIdNum() {
        return idNum;
    }

    public String getIdType() {
        return idType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getLabCode() {
        return labCode;
    }

    public String getResultDate() {
        return resultDate;
    }

    public String getTakeDate() {
        return takeDate;
    }

    public String getStickerNumber() {
        return stickerNumber;
    }

    public String getResultTestCorona() {
        return resultTestCorona;
    }

    public String getVariant() {
        return variant;
    }

    public String getTestType() {
        return testType;
    }

    @Override
    public String toString() {
        return "PositivePerson{" +
                "idNum='" + idNum + '\'' +
                ", idType='" + idType + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", barcode='" + barcode + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", labCode='" + labCode + '\'' +
                ", resultDate='" + resultDate + '\'' +
                ", takeDate='" + takeDate + '\'' +
                ", stickerNumber='" + stickerNumber + '\'' +
                ", resultTestCorona='" + resultTestCorona + '\'' +
                ", variant='" + variant + '\'' +
                ", testType='" + testType + '\'' +
                '}';
    }
}
