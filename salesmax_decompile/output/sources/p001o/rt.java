package p001o;

import ai.salesmax.model.ActivitySummary;
import com.amplifyframework.datastore.generated.model.Activity;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class rt implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new ActivitySummary((Activity) obj);
    }
}
