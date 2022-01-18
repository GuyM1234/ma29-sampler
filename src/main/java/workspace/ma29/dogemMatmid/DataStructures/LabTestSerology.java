package workspace.ma29.dogemMatmid.DataStructures;

public class LabTestSerology extends Data{
    private String idNum;
    private String idType;
    private String firstName;
    private String lastName;
    private String resultDate;
    private String birthDate;
    private String labCode;
    private String stickerNumber;
    private String antidotes;
    private String kitNumber;

    public LabTestSerology(String idNum, String idType, String firstName, String lastName, String resultDate, String birthDate, String labCode,
                           String stickerNumber, String antidotes, String kitNumber) {
        this.idNum = idNum;
        this.idType = idType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.resultDate = resultDate;
        this.birthDate = birthDate;
        this.labCode = labCode;
        this.stickerNumber = stickerNumber;
        this.antidotes = antidotes;
        this.kitNumber = kitNumber;
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

    public String getResultDate() {
        return resultDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getLabCode() {
        return labCode;
    }

    public String getStickerNumber() {
        return stickerNumber;
    }

    public String getAntidotes() {
        return antidotes;
    }

    public String getKitNumber() {
        return kitNumber;
    }

    @Override
    public String toString() {
        return "LabTestSerology{" +
                "idNum='" + idNum + '\'' +
                ", idType='" + idType + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", resultDate='" + resultDate + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", labCode='" + labCode + '\'' +
                ", stickerNumber='" + stickerNumber + '\'' +
                ", antidotes='" + antidotes + '\'' +
                ", kitNumber='" + kitNumber + '\'' +
                '}';
    }
}
