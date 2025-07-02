package framework.objects;

public class HorseObject {

    private int horseId;
    private int horseNumber;
    private String horseName;

    public HorseObject(int horseId, int horseNumber, String horseName) {
        this.horseId = horseId;
        this.horseNumber = horseNumber;
        this.horseName = horseName;
    }

    public int getHorseNumber() {
        return horseNumber;
    }

    public void setHorseNumber(int horseNumber) {
        this.horseNumber = horseNumber;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public int getHorseId() {
        return horseId;
    }

    public void setHorseId(int horseId) {
        this.horseId = horseId;
    }
}
