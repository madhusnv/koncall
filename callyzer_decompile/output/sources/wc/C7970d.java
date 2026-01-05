package wc;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wc.d */
/* loaded from: classes.dex */
public final class C7970d {

    /* renamed from: a */
    public final Throwable f38342a;

    public C7970d(Throwable th2) {
        this.f38342a = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7970d) && AbstractC4154l.m8918a(this.f38342a, ((C7970d) obj).f38342a);
    }

    public final int hashCode() {
        Throwable th2 = this.f38342a;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    public final String toString() {
        return "ClosedSentinel(cause=" + this.f38342a + ')';
    }
}
