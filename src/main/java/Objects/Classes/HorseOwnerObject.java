package Objects.Classes;

public class HorseOwnerObject {

    private int ownerId;
    private String ownerFirstName;
    private String ownerLastName;
    private int phoneNumber;

    public HorseOwnerObject(int ownerId, String ownerFirstName, String ownerLastName, int phoneNumber) {
        this.ownerId = ownerId;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.phoneNumber = phoneNumber;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
