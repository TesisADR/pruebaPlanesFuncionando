package domainapp.modules.planes.dom.plan;

import javax.annotation.processing.Generated;
import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

@Generated(value="org.datanucleus.jdo.query.JDOQueryProcessor")
public class QPlan extends PersistableExpressionImpl<Plan> implements PersistableExpression<Plan>
{
    public static final QPlan jdoCandidate = candidate("this");

    public static QPlan candidate(String name)
    {
        return new QPlan(null, name, 5);
    }

    public static QPlan candidate()
    {
        return jdoCandidate;
    }

    public static QPlan parameter(String name)
    {
        return new QPlan(Plan.class, name, ExpressionType.PARAMETER);
    }

    public static QPlan variable(String name)
    {
        return new QPlan(Plan.class, name, ExpressionType.VARIABLE);
    }

    public final ObjectExpression<org.apache.isis.applib.services.repository.RepositoryService> repositoryService;
    public final ObjectExpression<org.apache.isis.applib.services.title.TitleService> titleService;
    public final ObjectExpression<org.apache.isis.applib.services.message.MessageService> messageService;
    public final StringExpression name;
    public final StringExpression notes;

    public QPlan(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.repositoryService = new ObjectExpressionImpl<org.apache.isis.applib.services.repository.RepositoryService>(this, "repositoryService");
        this.titleService = new ObjectExpressionImpl<org.apache.isis.applib.services.title.TitleService>(this, "titleService");
        this.messageService = new ObjectExpressionImpl<org.apache.isis.applib.services.message.MessageService>(this, "messageService");
        this.name = new StringExpressionImpl(this, "name");
        this.notes = new StringExpressionImpl(this, "notes");
    }

    public QPlan(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.repositoryService = new ObjectExpressionImpl<org.apache.isis.applib.services.repository.RepositoryService>(this, "repositoryService");
        this.titleService = new ObjectExpressionImpl<org.apache.isis.applib.services.title.TitleService>(this, "titleService");
        this.messageService = new ObjectExpressionImpl<org.apache.isis.applib.services.message.MessageService>(this, "messageService");
        this.name = new StringExpressionImpl(this, "name");
        this.notes = new StringExpressionImpl(this, "notes");
    }
}
