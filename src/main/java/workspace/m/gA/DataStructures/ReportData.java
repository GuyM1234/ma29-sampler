package workspace.m.gA.DataStructures;

public class ReportData extends Data{
    private String mdaCODE;
    private String idNum;
    private String idType;
//    private String supplierCode;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private String buildingNumber;
    private String barcode;
    private String getDate;
    private String takeDate;
    private String resultDate;

    public ReportData(String mdaCODE, String idNum, String idType, String firstName, String lastName,
                      String city, String street, String buildingNumber, String barcode, String getDate, String takeDate, String resultDate) {
        this.mdaCODE = mdaCODE;
        this.idNum = idNum;
        this.idType = idType;
//        this.supplierCode = supplierCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.barcode = barcode;
        this.getDate = getDate;
        this.takeDate = takeDate;
        this.resultDate = resultDate;
    }

    public String getMdaCODE() {
        return mdaCODE;
    }

    public void setMdaCODE(String mdaCODE) {
        this.mdaCODE = mdaCODE;
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

//    public String getSupplierCode() {
//        return supplierCode;
//    }
//
//    public void setSupplierCode(String supplierCode) {
//        this.supplierCode = supplierCode;
//    }

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getGetDate() {
        return getDate;
    }

    public void setGetDate(String getDate) {
        this.getDate = getDate;
    }

    public String getTakeDate() {
        return takeDate;
    }

    public void setTakeDate(String takeDate) {
        this.takeDate = takeDate;
    }

    public String getResultDate() {
        return resultDate;
    }

    public void setResultDate(String resultDate) {
        this.resultDate = resultDate;
    }

    @Override
    public String toString() {
        return "ReportData{" +
                "mdaCODE='" + mdaCODE + '\'' +
                ", idNum='" + idNum + '\'' +
                ", idType='" + idType + '\'' +
//                ", supplierCode='" + supplierCode + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", barcode='" + barcode + '\'' +
                ", getDate='" + getDate + '\'' +
                ", takeDate='" + takeDate + '\'' +
                ", resultDate='" + resultDate + '\'' +
                '}';
    }
}
