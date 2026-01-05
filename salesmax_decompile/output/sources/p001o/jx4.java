package p001o;

import com.amplifyframework.datastore.generated.model.Activity;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class jx4 implements rl7 {

    /* renamed from: a */
    public final /* synthetic */ Function f31218a;

    public /* synthetic */ jx4(Function function) {
        this.f31218a = function;
    }

    @Override // p001o.rl7
    public final Object apply(Object obj) {
        return this.f31218a.apply((Activity) obj);
    }
}
