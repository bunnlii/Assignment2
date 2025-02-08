package com.csc340.demo;

public class Agents {

    //Agents Class (for video game called Valorant by Riot Games)

    public String uuid ;
    public String displayName ;
    public String developerName;
    public String description;

    public Agents(String uuid, String displayName, String developerName, String description){
        this.uuid = uuid;
        this.displayName = displayName;
        this.developerName = developerName;
        this.description = description;
    }

    public String getUuid(){
        return uuid;
    }

    public void setUuid(String uuid ){
        this.uuid = uuid;
    }

    public String getDisplayName(){
        return displayName;
    }

    public void setDisplayName(String displayName){
        this.displayName = displayName;
    }

    public String getDeveloperName(){
        return developerName;
    }

    public void setDeveloperName(String developerName){
        this.developerName = developerName;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
