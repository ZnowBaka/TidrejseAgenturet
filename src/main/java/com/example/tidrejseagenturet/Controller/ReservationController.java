package com.example.tidrejseagenturet.Controller;


import com.almasb.fxgl.core.collection.Array;
import com.example.tidrejseagenturet.Model.DatabaseHandler;
import com.example.tidrejseagenturet.Model.Reservation;

public class ReservationController {
    DatabaseHandler databaseHandler = new DatabaseHandler();
    public Array<Reservation> reservationList = new Array<>();

public int newReservation(int customerID, int timeMachineID, int timeMachinePeriodID, int guideID){
    try{
        Reservation reservation = new Reservation(customerID, timeMachineID, timeMachinePeriodID, guideID);
        databaseHandler.createBooking(reservation);
        reservationList.add(reservation);
        return 1;
    } catch (java.sql.SQLException e) {
        throw new RuntimeException(e);
        return 2;
    }
}



}// ReservationController End
