package p001o;

import ai.salesmax.model.EngagementSummary;
import com.amplifyframework.datastore.generated.model.Engagement;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class kvg implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new EngagementSummary((Engagement) obj);
    }
}
