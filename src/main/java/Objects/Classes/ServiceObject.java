package Objects.Classes;

import Objects.Enums.ServiceStatus;

public class ServiceObject {

    private int serviceId; //primaryKey
    private int dutyId;    //forendKey
    private int userId;    //forendKey
    private ServiceStatus serviceStatus;

    public ServiceObject(int serviceId, int dutyId, int userId, ServiceStatus serviceStatus) {
        this.serviceId = serviceId;
        this.dutyId = dutyId;
        this.userId = userId;
        this.serviceStatus = serviceStatus;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getDutyId() {
        return dutyId;
    }

    public void setDutyId(int dutyId) {
        this.dutyId = dutyId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ServiceStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }
}
