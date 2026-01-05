package p001o;

import com.amplifyframework.core.model.temporal.Temporal;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class la6 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((Temporal.DateTime) obj).format();
    }
}
