package d3;

import c3.C0849d;
import kotlin.jvm.internal.AbstractC4154l;
import og.c2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 extends h0 {

    /* renamed from: e */
    public final C0849d f7743e;

    /* renamed from: f */
    public final C1555i f7744f;

    public e0(C0849d c0849d) {
        C1555i c1555iM5178a;
        this.f7743e = c0849d;
        if (c2.m10572c(c0849d)) {
            c1555iM5178a = null;
        } else {
            c1555iM5178a = AbstractC1558l.m5178a();
            g0.m5128b(c1555iM5178a, c0849d);
        }
        this.f7744f = c1555iM5178a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return AbstractC4154l.m8918a(this.f7743e, ((e0) obj).f7743e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7743e.hashCode();
    }
}
