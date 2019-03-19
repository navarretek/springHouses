package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.House;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.HouseRepository;

@SpringBootApplication
public class SpringHousesStarterApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringHousesStarterApplication.class, args);
	}
	
	@Autowired
	HouseRepository repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		House h = new House("4321 w 43 st", 5);
		repo.save(h);
		
		House h2 = appContext.getBean("house", House.class);
		repo.save(h2);
		
		List<House> allHouses = repo.findAll();
		for(House house: allHouses) {
			System.out.println(house.toString());
		
		}
	}
}
