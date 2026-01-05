package p001o;

import com.amplifyframework.core.model.temporal.Temporal;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class t71 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((Temporal.DateTime) obj).toDate();
    }
}
