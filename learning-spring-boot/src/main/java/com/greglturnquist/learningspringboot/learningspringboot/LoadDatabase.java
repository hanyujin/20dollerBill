package com.greglturnquist.learningspringboot.learningspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {
	@Bean
	CommandLineRunner init(ChapterRepository repository) {
		return args->{
			Flux.just(
						new Chapter("Quick Start with Java"),
						new Chapter("Reactive Web with SPRING BOOT"),
						new Chapter("...and more!")).flatMap(repository::save).subscribe(System.out::println);
		};
	}
}

/*
 * @Configuratio 클래스가 빈의 소스
 * @Bean init() 리턴 값이 스프링 빈이라는 것을 나타냄.
 * 이 경우는 
 * CommandLineRunner 스프링 부트의 유틸리티 클래
 * */
 