package com.baseball.demo;



import org.springframework.stereotype.Component;

@Component("optionalCoach")
public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    
    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practices ";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getDailyFortune() + " Using constructor injector";
    }
}
