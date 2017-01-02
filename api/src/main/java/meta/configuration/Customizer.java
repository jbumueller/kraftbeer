package meta.configuration;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

@Component
public class Customizer implements EmbeddedServletContainerCustomizer{
	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(9090);
	}
}
