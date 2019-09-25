package com.ermolin.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	

	public CricketCoach() {
		System.out.println("This is default constructor of CricketCoach");
	}

	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside method setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside method setTeam");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
		System.out.println("CricketCoach: inside method setFortuneService");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes a day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
