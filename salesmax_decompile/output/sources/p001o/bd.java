package p001o;

import com.amplifyframework.core.model.temporal.Temporal;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class bd implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((Temporal.Time) obj).format();
    }
}
