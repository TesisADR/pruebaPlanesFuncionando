package domainapp.webapp.application;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import domainapp.modules.planes.PlanModule;

@Configuration
@Import(PlanModule.class)
@ComponentScan
public class ApplicationModule {

}
