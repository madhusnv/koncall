package p001o;

import java.util.function.Function;
import type.HasParent;

/* loaded from: classes.dex */
public final /* synthetic */ class ttc implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return HasParent.valueOf((String) obj);
    }
}
