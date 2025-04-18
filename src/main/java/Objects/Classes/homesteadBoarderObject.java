package Objects.Classes;

public class homesteadBoarderObject {

    private int boarderId;
    private int horseNumber;
    private int ownerNumber;
    private String info;

    public homesteadBoarderObject(int boarderId, int horseNumber, int ownerNumber, String info) {
        this.boarderId = boarderId;
        this.horseNumber = horseNumber;
        this.ownerNumber = ownerNumber;
        this.info = info;
    }

    public int getBoarderId() {
        return boarderId;
    }

    public void setBoarderId(int boarderId) {
        this.boarderId = boarderId;
    }

    public int getHorseNumber() {
        return horseNumber;
    }

    public void setHorseNumber(int horseNumber) {
        this.horseNumber = horseNumber;
    }

    public int getOwnerNumber() {
        return ownerNumber;
    }

    public void setOwnerNumber(int ownerNumber) {
        this.ownerNumber = ownerNumber;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
