package com.wanjy.dannie.dropper.historyRecyclerView;

/**
 * Created by manel on 10/10/2017.
 */

public class HistoryObject {
    private String deliveryId;
    private String time;

    public HistoryObject(String deliveryId, String time){
        this.deliveryId = deliveryId;
        this.time = time;
    }

    public String getDeliveryId(){return deliveryId;}
    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getTime(){return time;}
    public void setTime(String time) {
        this.time = time;
    }
}
