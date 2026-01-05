package p001o;

import ai.salesmax.model.ActivitySummary;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class st implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((ActivitySummary) obj).toActivities();
    }
}
