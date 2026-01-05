package p001o;

import com.amplifyframework.datastore.generated.model.Engagement;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class uv4 implements rl7 {

    /* renamed from: a */
    public final /* synthetic */ Function f49534a;

    public /* synthetic */ uv4(Function function) {
        this.f49534a = function;
    }

    @Override // p001o.rl7
    public final Object apply(Object obj) {
        return this.f49534a.apply((Engagement) obj);
    }
}
