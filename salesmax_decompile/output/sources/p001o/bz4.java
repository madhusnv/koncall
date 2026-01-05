package p001o;

import com.amplifyframework.datastore.generated.model.RealTimeMetrics;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class bz4 implements rl7 {

    /* renamed from: a */
    public final /* synthetic */ Function f16979a;

    public /* synthetic */ bz4(Function function) {
        this.f16979a = function;
    }

    @Override // p001o.rl7
    public final Object apply(Object obj) {
        return this.f16979a.apply((RealTimeMetrics) obj);
    }
}
