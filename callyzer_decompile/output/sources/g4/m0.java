package g4;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a */
    public final g0 f13678a;

    /* renamed from: b */
    public final g0 f13679b;

    /* renamed from: c */
    public final g0 f13680c;

    /* renamed from: d */
    public final g0 f13681d;

    public m0(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4) {
        this.f13678a = g0Var;
        this.f13679b = g0Var2;
        this.f13680c = g0Var3;
        this.f13681d = g0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return AbstractC4154l.m8918a(this.f13678a, m0Var.f13678a) && AbstractC4154l.m8918a(this.f13679b, m0Var.f13679b) && AbstractC4154l.m8918a(this.f13680c, m0Var.f13680c) && AbstractC4154l.m8918a(this.f13681d, m0Var.f13681d);
    }

    public final int hashCode() {
        g0 g0Var = this.f13678a;
        int iHashCode = (g0Var != null ? g0Var.hashCode() : 0) * 31;
        g0 g0Var2 = this.f13679b;
        int iHashCode2 = (iHashCode + (g0Var2 != null ? g0Var2.hashCode() : 0)) * 31;
        g0 g0Var3 = this.f13680c;
        int iHashCode3 = (iHashCode2 + (g0Var3 != null ? g0Var3.hashCode() : 0)) * 31;
        g0 g0Var4 = this.f13681d;
        return iHashCode3 + (g0Var4 != null ? g0Var4.hashCode() : 0);
    }
}
