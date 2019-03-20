package com.greglturnquist.learningspringboot.learningspringboot;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Chapter {
	@Id
	private String id;
	private String name;
	
	public Chapter(String name) {
		this.name  = name;
	}
}

/*
 * @Document 어노테이션은 이 클래스를 몽고db데이터 저장소에 저장하기에 적합한 것으로 지정한다.
 * 
 * 롬복 
 * @Data 어노테이션은 접근자 설정자 toString() method, equals() method , hashCode() method 
 * final 필드에 대한 생성자 생성
 */
