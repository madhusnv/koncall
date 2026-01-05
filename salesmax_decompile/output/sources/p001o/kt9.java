package p001o;

import ai.salesmax.model.MissedOpportunitiesSummary;
import com.amplifyframework.datastore.generated.model.MissedOpportunities;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class kt9 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new MissedOpportunitiesSummary((MissedOpportunities) obj);
    }
}
