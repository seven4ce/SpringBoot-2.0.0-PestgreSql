package id.co.apotik.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MiniProjectApotik {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectApotik.class, args);
	}

}
