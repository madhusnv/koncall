package p001o;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class mif {
    /* renamed from: a */
    public static final Set m39134a(Set set) {
        sq8.m48649h(set, "builder");
        return ((whf) set).m54431e();
    }

    /* renamed from: b */
    public static final Set m39135b() {
        return new whf();
    }

    /* renamed from: c */
    public static final Set m39136c(int i) {
        return new whf(i);
    }

    /* renamed from: d */
    public static final Set m39137d(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        sq8.m48648g(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
