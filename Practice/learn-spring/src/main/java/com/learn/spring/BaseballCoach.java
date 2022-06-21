package com.learn.spring;

public class BaseballCoach implements Coach {

	//for constructor injection
	private Fortuneservice fortuneservice;
	public BaseballCoach(Fortuneservice fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getDailyFortune();
	}
	public void atCreation() {
		System.out.println("Creation method calling");
	}
	public void atdestroy() {
		System.out.println("atdestroy method calling");
	}
}








