package Objects.Classes;

import Objects.Enums.AccStatus;

public class UserObject {

    private int userId;
    private String userName;
    private String password;
    private AccStatus accStatus;

    public UserObject(String userName, String password, AccStatus accStatus, int userId) {
        this.userName = userName;
        this.password = password;
        this.accStatus = accStatus;
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccStatus getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(AccStatus accStatus) {
        this.accStatus = accStatus;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}