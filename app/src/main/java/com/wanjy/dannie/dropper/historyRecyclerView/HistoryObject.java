package com.wanjy.dannie.dropper.historyRecyclerView;

/**
 * Created by manel on 10/10/2017.
 */

public class HistoryObject {
    private String rideId;
    private String time;

    public HistoryObject(String rideId, String time){
        this.rideId = rideId;
        this.time = time;
    }

    public String getDeliveryId(){return rideId;}
    public void setDeliveryId(String rideId) {
        this.rideId = rideId;
    }

    public String getTime(){return time;}
    public void setTime(String time) {
        this.time = time;
    }
}
