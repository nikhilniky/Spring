package com.learn.spring;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.util.Date;

public class Cricket implements Coach {

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
    String[] S={"sakbdbhja","njkzxfsf","mn,sfa"};
    private String emailAddress;
    private String team;
    public void setFortuneservice(HappyFortuneservice fortuneservice) {
        this.fortuneservice=fortuneservice;
    }
    @Override
    public String getDailyWorkout() {
        return "Bat ball means cricket";
    }

    @Override
    public String getDailyFortune() {
   /*    int i= (int) ((System.currentTimeMillis()/1000)%60)/10;
       if(i>2)
            return S[2];
       else*/
           return S[1];
    }


}










