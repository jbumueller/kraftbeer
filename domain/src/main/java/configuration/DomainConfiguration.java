package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kraftbike.domain.service.BikeService;
import kraftbike.domain.service.BikeServiceImpl;

@Configuration
public class DomainConfiguration {

	@Bean
	public BikeService getBikeService()
	{
		return new BikeServiceImpl();
	}
}
