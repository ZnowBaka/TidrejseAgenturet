package com.example.tidrejseagenturet.Model;

public class TimeMachine {
    private int id;
    private String name;
    private int capacity;
    private boolean operationalStatus;
    private boolean bookingStatus;


    public TimeMachine(int id, String name, int capacity, boolean operationalStatus, boolean bookingStatus) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.operationalStatus = operationalStatus;
        this.bookingStatus = bookingStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isOperationalStatus() {
        return operationalStatus;
    }

    public void setOperationalStatus(boolean operationalStatus) {
        this.operationalStatus = operationalStatus;
    }

    public boolean isBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}// TimeMachine End
