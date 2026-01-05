package cd;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cd.g */
/* loaded from: classes.dex */
public final class C0952g extends AbstractC0954i {

    /* renamed from: a */
    public final int f5728a;

    /* renamed from: b */
    public final Throwable f5729b;

    public C0952g(Throwable th2, int i10) {
        this.f5728a = i10;
        this.f5729b = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0952g)) {
            return false;
        }
        C0952g c0952g = (C0952g) obj;
        return this.f5728a == c0952g.f5728a && AbstractC4154l.m8918a(this.f5729b, c0952g.f5729b);
    }

    public final int hashCode() {
        return this.f5729b.hashCode() + (Integer.hashCode(this.f5728a) * 31);
    }

    public final String toString() {
        return "Exception(attempts=" + this.f5728a + ", exception=" + this.f5729b + ')';
    }
}
