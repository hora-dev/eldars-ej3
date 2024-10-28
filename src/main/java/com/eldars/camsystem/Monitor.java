package com.eldars.camsystem;

public class Monitor implements Observer {

    private final String monitorId;

    public Monitor(String monitorId) {
        this.monitorId = monitorId;
    }

    @Override
    public void update(String image) {
        System.out.println("Monitor " + monitorId + " mostrando nueva imagen: " + image);
    }
}
