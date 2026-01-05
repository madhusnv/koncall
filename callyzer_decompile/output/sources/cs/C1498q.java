package cs;

import js.C3850f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cs.q */
/* loaded from: classes3.dex */
public final class C1498q extends AbstractC1500s {

    /* renamed from: a */
    public final C3850f f7584a;

    /* renamed from: b */
    public final int f7585b;

    public C1498q(C3850f c3850f, int i10) {
        this.f7584a = c3850f;
        this.f7585b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1498q)) {
            return false;
        }
        C1498q c1498q = (C1498q) obj;
        return AbstractC4154l.m8918a(this.f7584a, c1498q.f7584a) && this.f7585b == c1498q.f7585b;
    }

    public final int hashCode() {
        C3850f c3850f = this.f7584a;
        return Integer.hashCode(this.f7585b) + ((c3850f == null ? 0 : c3850f.hashCode()) * 31);
    }

    public final String toString() {
        return "SetCallLogData(callLogData=" + this.f7584a + ", possion=" + this.f7585b + ")";
    }
}
