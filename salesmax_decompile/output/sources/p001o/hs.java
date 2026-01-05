package p001o;

import ai.salesmax.services.model.ActivityMetrics;
import com.amplifyframework.datastore.generated.model.RealTimeMetrics;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class hs implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new ActivityMetrics((RealTimeMetrics) obj);
    }
}
