package p001o;

import java.util.function.Function;
import type.ScopeLevel;

/* loaded from: classes.dex */
public final /* synthetic */ class nsc implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ScopeLevel.valueOf((String) obj);
    }
}
