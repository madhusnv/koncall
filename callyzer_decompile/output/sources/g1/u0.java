package g1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;
import og.sf;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: b */
    public static final u0 f11094b = new u0(new i1((w0) null, (g1) null, (C2446z) null, (sf) null, (LinkedHashMap) null, 63));

    /* renamed from: a */
    public final i1 f11095a;

    public u0(i1 i1Var) {
        this.f11095a = i1Var;
    }

    /* renamed from: a */
    public final u0 m6101a(u0 u0Var) {
        i1 i1Var = u0Var.f11095a;
        w0 w0Var = i1Var.f11017a;
        i1 i1Var2 = this.f11095a;
        if (w0Var == null) {
            w0Var = i1Var2.f11017a;
        }
        g1 g1Var = i1Var.f11018b;
        if (g1Var == null) {
            g1Var = i1Var2.f11018b;
        }
        C2446z c2446z = i1Var.f11019c;
        if (c2446z == null) {
            c2446z = i1Var2.f11019c;
        }
        return new u0(new i1(w0Var, g1Var, c2446z, (sf) null, AbstractC6674x.m12780h(i1Var2.f11021e, i1Var.f11021e), 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u0) && AbstractC4154l.m8918a(((u0) obj).f11095a, this.f11095a);
    }

    public final int hashCode() {
        return this.f11095a.hashCode();
    }

    public final String toString() {
        if (equals(f11094b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        i1 i1Var = this.f11095a;
        w0 w0Var = i1Var.f11017a;
        sb2.append(w0Var != null ? w0Var.toString() : null);
        sb2.append(",\nSlide - ");
        g1 g1Var = i1Var.f11018b;
        sb2.append(g1Var != null ? g1Var.toString() : null);
        sb2.append(",\nShrink - ");
        C2446z c2446z = i1Var.f11019c;
        sb2.append(c2446z != null ? c2446z.toString() : null);
        sb2.append(",\nScale - ");
        sb2.append((String) null);
        return sb2.toString();
    }
}
