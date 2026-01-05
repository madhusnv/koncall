package og;

import kotlin.jvm.internal.AbstractC4154l;
import r1.C6433r;
import r1.C6434s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class td {
    /* renamed from: a */
    public static eb.g1 m10933a(String value) {
        AbstractC4154l.m8923f(value, "value");
        return value.equals("EMAIL") ? eb.d1.f9288b : value.equals("SMS") ? eb.f1.f9310b : new eb.e1(value);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* renamed from: b */
    public static final int m10934b(boolean z6, C6433r c6433r, int i10) {
        return z6 ? ((C6434s) c6433r.f31030l.get(i10)).f31052p : ((C6434s) c6433r.f31030l.get(i10)).f31053q;
    }
}
