package Objects.Classes;

public class HomesteadBoarderObject {

    private int boarderId;
    private int horseId;
    private int ownerId;
    private String info;

    public HomesteadBoarderObject(int boarderId, int horseId, int ownerId, String info) {
        this.boarderId = boarderId;
        this.horseId = horseId;
        this.ownerId = ownerId;
        this.info = info;
    }

    public int getBoarderId() {
        return boarderId;
    }

    public void setBoarderId(int boarderId) {
        this.boarderId = boarderId;
    }

    public int getHorseId() {
        return horseId;
    }

    public void setHorseId(int horseId) {
        this.horseId = horseId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
