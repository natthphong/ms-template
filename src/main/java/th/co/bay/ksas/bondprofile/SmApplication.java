package th.co.bay.ksas.bondprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableCaching
@EnableScheduling
@SpringBootApplication
public class SmApplication {


	public static void main(String[] args) {
		SpringApplication.run(SmApplication.class, args);
	}


}
