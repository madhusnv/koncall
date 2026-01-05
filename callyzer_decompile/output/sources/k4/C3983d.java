package k4;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k4.d */
/* loaded from: classes.dex */
public final class C3983d {

    /* renamed from: a */
    public final Object f20663a;

    public final boolean equals(Object obj) {
        if (obj instanceof C3983d) {
            return AbstractC4154l.m8918a(this.f20663a, ((C3983d) obj).f20663a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f20663a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f20663a + ')';
    }
}
