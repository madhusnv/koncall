package im;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e1 extends f1 {

    /* renamed from: a */
    public final Throwable f17548a;

    public e1(Throwable th2) {
        super(0);
        this.f17548a = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && AbstractC4154l.m8918a(this.f17548a, ((e1) obj).f17548a);
    }

    public final int hashCode() {
        Throwable th2 = this.f17548a;
        if (th2 == null) {
            return 0;
        }
        return th2.hashCode();
    }

    public final String toString() {
        return "UnknownError(error=" + this.f17548a + ")";
    }
}
