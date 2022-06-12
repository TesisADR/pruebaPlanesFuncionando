package domainapp.modules.planes.fixture;

import javax.inject.Inject;

import org.apache.isis.testing.fixtures.applib.personas.BuilderScriptWithResult;

import domainapp.modules.planes.dom.plan.Plan;
import domainapp.modules.planes.dom.plan.Planes;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
public class PlanBuilder extends BuilderScriptWithResult<Plan> {

    @Getter @Setter
    private String name;

    @Override
    protected Plan buildResult(final ExecutionContext ec) {

        checkParam("name", ec, String.class);

        return wrap(planes).create(name);
    }

    // -- DEPENDENCIES

    @Inject Planes planes;

}
