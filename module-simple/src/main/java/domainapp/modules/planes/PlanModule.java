package domainapp.modules.planes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.apache.isis.testing.fixtures.applib.fixturescripts.FixtureScript;
import org.apache.isis.testing.fixtures.applib.modules.ModuleWithFixtures;

import domainapp.modules.planes.dom.plan.Plan;

@Configuration
@ComponentScan
public class PlanModule implements ModuleWithFixtures {

    @Override
    public FixtureScript getTeardownFixture() {
        return new FixtureScript() {
            @Override
            protected void execute(ExecutionContext executionContext) {
                repositoryService.removeAll(Plan.class);
            }
        };
    }
}
