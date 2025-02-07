package com.csc340.demo;

public class Agents {

    public String id;
    public String name;
    public int age;
    public String role;

    public Agents(String id, String name, int age, String role){
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;

    }

    public String getAgentID(){
        return id;
    }

    public void setAgentID(String agentID){
        this.id = agentID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }


}
