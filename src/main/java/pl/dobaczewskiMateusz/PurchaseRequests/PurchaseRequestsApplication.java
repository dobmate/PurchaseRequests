package pl.dobaczewskiMateusz.PurchaseRequests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PurchaseRequestsApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PurchaseRequestsApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(PurchaseRequestsApplication.class, args);
	}

}
