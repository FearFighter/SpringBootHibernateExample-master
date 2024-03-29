package org.arpit.java2blog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude= HibernateJpaAutoConfiguration.class)
public class SpringBootHibernateApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootHibernateApplication.class, args);   
	}
}