package p001o;

import ai.salesmax.model.LeadTeamMember;
import com.amplifyframework.datastore.generated.model.TeamMember;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class a4h implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new LeadTeamMember((TeamMember) obj);
    }
}
