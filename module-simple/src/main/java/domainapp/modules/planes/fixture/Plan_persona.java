package domainapp.modules.planes.fixture;

import org.apache.isis.applib.services.registry.ServiceRegistry;
import org.apache.isis.testing.fixtures.applib.personas.PersonaWithBuilderScript;
import org.apache.isis.testing.fixtures.applib.personas.PersonaWithFinder;
import org.apache.isis.testing.fixtures.applib.setup.PersonaEnumPersistAll;

import domainapp.modules.planes.dom.plan.Plan;
import domainapp.modules.planes.dom.plan.Planes;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Plan_persona
implements PersonaWithBuilderScript<PlanBuilder>, PersonaWithFinder<Plan> {

    FOO("Foo"),
    BAR("Bar"),
    BAZ("Baz"),
    FRODO("Frodo"),
    FROYO("Froyo"),
    FIZZ("Fizz"),
    BIP("Bip"),
    BOP("Bop"),
    BANG("Bang"),
    BOO("Boo");

    private final String name;

    @Override
    public PlanBuilder builder() {
        return new PlanBuilder().setName(name);
    }

    @Override
    public Plan findUsing(final ServiceRegistry serviceRegistry) {
        Planes planes = serviceRegistry.lookupService(Planes.class).orElse(null);
        return planes.findByNameExact(name);
    }

    public static class PersistAll
    extends PersonaEnumPersistAll<Plan_persona, Plan> {

        public PersistAll() {
            super(Plan_persona.class);
        }
    }
}
