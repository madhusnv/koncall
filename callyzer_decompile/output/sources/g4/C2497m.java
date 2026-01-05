package g4;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.m */
/* loaded from: classes.dex */
public final class C2497m extends AbstractC2499o {

    /* renamed from: a */
    public final String f13676a;

    /* renamed from: b */
    public final m0 f13677b;

    public C2497m(String str, m0 m0Var) {
        this.f13676a = str;
        this.f13677b = m0Var;
    }

    @Override // g4.AbstractC2499o
    /* renamed from: a */
    public final m0 mo6453a() {
        return this.f13677b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2497m)) {
            return false;
        }
        C2497m c2497m = (C2497m) obj;
        return AbstractC4154l.m8918a(this.f13676a, c2497m.f13676a) && AbstractC4154l.m8918a(this.f13677b, c2497m.f13677b);
    }

    public final int hashCode() {
        int iHashCode = this.f13676a.hashCode() * 31;
        m0 m0Var = this.f13677b;
        return (iHashCode + (m0Var != null ? m0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f13676a, ')');
    }
}
