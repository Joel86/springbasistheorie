package be.vdab;

import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.gaming.Spelletje;
import be.vdab.restclients.RestClientsConfig;
import be.vdab.services.EuroService;
import be.vdab.services.ServicesConfig;

public class Main {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(
						new Class[] {ServicesConfig.class, RestClientsConfig.class})) {
			System.out.println(context.getBean(EuroService.class).naarDollar(BigDecimal.valueOf(2)));
		}
		try(ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("Container.xml")) {
			System.out.println(context.getBean(Spelletje.class).getAantalVijanden());
		}
	}

}
