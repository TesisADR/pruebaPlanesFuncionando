package domainapp.webapp.application.services.homepage;

import java.util.List;

import javax.inject.Inject;

import org.apache.isis.applib.annotation.DomainObject;
import org.apache.isis.applib.annotation.DomainObjectLayout;
import org.apache.isis.applib.annotation.HomePage;
import org.apache.isis.applib.annotation.Nature;

import domainapp.modules.planes.dom.plan.Plan;
import domainapp.modules.planes.dom.plan.Planes;

@DomainObject(
        nature = Nature.VIEW_MODEL,
        logicalTypeName = "planes.HomePageViewModel"
        )
@HomePage
@DomainObjectLayout()
public class HomePageViewModel {

    public String title() {
        return getObjects().size() + " objects";
    }

    public List<Plan> getObjects() {
        return planes.listAll();
    }

    @Inject Planes planes;
}
