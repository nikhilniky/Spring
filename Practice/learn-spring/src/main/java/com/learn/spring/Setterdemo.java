package com.learn.spring;

public class Setterdemo {

    private Fortuneservice fortuneservice;

    public void setEmailAddress(String emailAddress) {
        System.out.println("Setter email");
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("set team");
        this.team = team;
    }

    private String emailAddress;
    private String team;
    public void setFortuneservice(HappyFortuneservice fortuneservice) {
        this.fortuneservice=fortuneservice;
    }
}
