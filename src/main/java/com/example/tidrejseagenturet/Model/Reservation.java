package com.example.tidrejseagenturet.Model;

public class Reservation {
    private int reservationId;
    private int customerId;
    private int timeMachineId;
    private int timeMachinePeriodId;
    private int guideId;

    public Reservation(int reservationId, int customerId, int timeMachineId, int timeMachinePeriodId, int guideId) {
        this.reservationId = reservationId;
        this.customerId = customerId;
        this.timeMachineId = timeMachineId;
        this.timeMachinePeriodId = timeMachinePeriodId;
        this.guideId = guideId;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getTimeMachineId() {
        return timeMachineId;
    }

    public void setTimeMachineId(int timeMachineId) {
        this.timeMachineId = timeMachineId;
    }

    public int getTimeMachinePeriodId() {
        return timeMachinePeriodId;
    }

    public void setTimeMachinePeriodId(int timeMachinePeriodId) {
        this.timeMachinePeriodId = timeMachinePeriodId;
    }

    public int getGuideId() {
        return guideId;
    }

    public void setGuideId(int guideId) {
        this.guideId = guideId;
    }
}
