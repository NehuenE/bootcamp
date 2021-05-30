package Farm;


import Farm.Farm.Farm;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static Logger topic2 = Logger.getLogger(Application.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		topic2.debug("Log debug");
		topic2.info("Log Info");
		topic2.warn("Log warning");
		topic2.error("Log error");
		topic2.fatal("Log fatal");
		SpringApplication.run(Application.class, args);
		Farm farm = new Farm();
		farm.loadwork();
		farm.showcarton();

	}


}

