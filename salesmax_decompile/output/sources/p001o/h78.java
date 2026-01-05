package p001o;

import java.util.function.Function;
import type.ProductServiceType;

/* loaded from: classes.dex */
public final /* synthetic */ class h78 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ProductServiceType.valueOf((String) obj);
    }
}
