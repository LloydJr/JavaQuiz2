package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {

    String color;
    Integer speed;

    String migrationMonth;

    public RedRobin() {
        color = "red";
        speed = 10;
    }
    public String color(){
        return color;
    }
    public int getSpeed(){
        return speed;
    }

    @Override
    public String getMigrationMonth() {
        return migrationMonth;
    }

    @Override
    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
    }
}
