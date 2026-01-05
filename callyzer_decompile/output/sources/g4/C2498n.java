package g4;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.n */
/* loaded from: classes.dex */
public final class C2498n extends AbstractC2499o {

    /* renamed from: a */
    public final String f13682a;

    /* renamed from: b */
    public final m0 f13683b;

    public C2498n(String str, m0 m0Var) {
        this.f13682a = str;
        this.f13683b = m0Var;
    }

    @Override // g4.AbstractC2499o
    /* renamed from: a */
    public final m0 mo6453a() {
        return this.f13683b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2498n)) {
            return false;
        }
        C2498n c2498n = (C2498n) obj;
        return AbstractC4154l.m8918a(this.f13682a, c2498n.f13682a) && AbstractC4154l.m8918a(this.f13683b, c2498n.f13683b);
    }

    public final int hashCode() {
        int iHashCode = this.f13682a.hashCode() * 31;
        m0 m0Var = this.f13683b;
        return (iHashCode + (m0Var != null ? m0Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("LinkAnnotation.Url(url="), this.f13682a, ')');
    }
}
