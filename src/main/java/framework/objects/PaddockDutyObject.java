package framework.objects;

import java.time.LocalDate;

public class PaddockDutyObject {

    private int dutyId;
    private int boarderId;
    private LocalDate dutyDate;

    public PaddockDutyObject(int dutyId, int boarderId, LocalDate dutyDate) {
        this.dutyId = dutyId;
        this.boarderId = boarderId;
        this.dutyDate = dutyDate;
    }

    public int getDutyId() {
        return dutyId;
    }

    public void setDutyId(int dutyId) {
        this.dutyId = dutyId;
    }

    public int getBoarderId() {
        return boarderId;
    }

    public void setBoarderId(int boarderId) {
        this.boarderId = boarderId;
    }

    public LocalDate getDutyDate() {
        return dutyDate;
    }

    public void setDutyDate(LocalDate dutyDate) {
        this.dutyDate = dutyDate;
    }
}
