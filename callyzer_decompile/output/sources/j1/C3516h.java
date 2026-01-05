package j1;

import c3.C0847b;
import n1.AbstractC4941a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j1.h */
/* loaded from: classes.dex */
public final class C3516h extends AbstractC3517i {

    /* renamed from: a */
    public final long f18407a;

    public C3516h(long j6) {
        this.f18407a = j6;
        if ((j6 & 9223372034707292159L) != 9205357640488583168L) {
            return;
        }
        AbstractC4941a.m9886c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3516h)) {
            return false;
        }
        return C0847b.m2271b(this.f18407a, ((C3516h) obj).f18407a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f18407a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) C0847b.m2278i(this.f18407a)) + ')';
    }
}
