package com.example.tidrejseagenturet.Model;

//    Stone Age: 3.3 million to 5,000 years ago.
//    Bronze Age: 5,000 to 1,400 years ago (1,200 BC)
//    Iron Age: 1,200 BC to 500 BC.
//    Classical Era: 500 BC to 500 AD.
//    Medieval Era: 500 AD to 1500 AD.
//    Early Modern Era: 1500 AD to 1800 AD.
//    Modern Era: 1800 AD to present.


public class TimePeriod {
    private int id;
    private String timeEra;
    private String eraDescription;

    public TimePeriod(int id, String timeEra, String eraDescription) {
        this.id = id;
        this.timeEra = timeEra;
        this.eraDescription = eraDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimeEra() {
        return timeEra;
    }

    public void setTimeEra(String timeEra) {
        this.timeEra = timeEra;
    }

    public String getEraDescription() {
        return eraDescription;
    }

    public void setEraDescription(String eraDescription) {
        this.eraDescription = eraDescription;
    }
}// TimePeriod End
