package p001o;

import java.util.function.Function;
import type.AuthorizationLevel;

/* loaded from: classes.dex */
public final /* synthetic */ class zg implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return AuthorizationLevel.valueOf((String) obj);
    }
}
