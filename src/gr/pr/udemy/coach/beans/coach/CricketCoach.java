package gr.pr.udemy.coach.beans.coach;

import gr.pr.udemy.coach.interfaces.Coach;
import gr.pr.udemy.coach.interfaces.FortuneService;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public String getDailyWorkout() {
		return "Practice Fast bowling for 15 minutes";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
}
