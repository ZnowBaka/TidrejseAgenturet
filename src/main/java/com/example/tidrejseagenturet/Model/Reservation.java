package com.example.tidrejseagenturet.Model;

public class Reservation {
    private int id;
    private int userId;
    private int guideId;
    private TimeMachine timeMachine;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGuideId() {
        return guideId;
    }

    public void setGuideId(int guideId) {
        this.guideId = guideId;
    }

    public TimeMachine getTimeMachine() {
        return timeMachine;
    }

    public void setTimeMachine(TimeMachine timeMachine) {
        this.timeMachine = timeMachine;
    }

    public Reservation(int id, int userId, int guideId, TimeMachine timeMachine) {
        this.id = id;
        this.userId = userId;
        this.guideId = guideId;
        this.timeMachine = timeMachine;
    }
}
