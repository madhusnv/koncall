package p001o;

import java.util.function.Function;
import type.ContactStatus;

/* loaded from: classes.dex */
public final /* synthetic */ class bv3 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ContactStatus.valueOf((String) obj);
    }
}
