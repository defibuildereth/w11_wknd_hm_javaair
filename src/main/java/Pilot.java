public class Pilot extends Employee{

    private String licenseNum;

    public Pilot(String name, Rank rank, String licenseNum) {
        super(name, rank);
        this.licenseNum = licenseNum;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String flyPlane() {
        return "pilot is flying the plane";
    }
}
