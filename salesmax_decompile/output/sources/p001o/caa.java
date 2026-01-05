package p001o;

import ai.salesmax.model.LeadsTeam;
import com.amplifyframework.datastore.generated.model.Team;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class caa implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new LeadsTeam((Team) obj);
    }
}
