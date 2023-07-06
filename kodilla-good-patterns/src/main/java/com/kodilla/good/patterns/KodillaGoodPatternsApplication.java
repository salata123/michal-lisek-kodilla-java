package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.MovieStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaGoodPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodillaGoodPatternsApplication.class, args);
		MovieStore movieStore = new MovieStore();
		movieStore.movieTitlesList();
	}
}
