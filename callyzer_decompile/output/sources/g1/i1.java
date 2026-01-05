package g1;

import com.sun.mail.util.AbstractC1452a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import og.sf;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a */
    public final w0 f11017a;

    /* renamed from: b */
    public final g1 f11018b;

    /* renamed from: c */
    public final C2446z f11019c;

    /* renamed from: d */
    public final boolean f11020d;

    /* renamed from: e */
    public final Map f11021e;

    public i1(w0 w0Var, g1 g1Var, C2446z c2446z, sf sfVar, boolean z6, Map map) {
        this.f11017a = w0Var;
        this.f11018b = g1Var;
        this.f11019c = c2446z;
        this.f11020d = z6;
        this.f11021e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return AbstractC4154l.m8918a(this.f11017a, i1Var.f11017a) && AbstractC4154l.m8918a(this.f11018b, i1Var.f11018b) && AbstractC4154l.m8918a(this.f11019c, i1Var.f11019c) && AbstractC4154l.m8918a(null, null) && this.f11020d == i1Var.f11020d && AbstractC4154l.m8918a(this.f11021e, i1Var.f11021e);
    }

    public final int hashCode() {
        w0 w0Var = this.f11017a;
        int iHashCode = (w0Var == null ? 0 : w0Var.hashCode()) * 31;
        g1 g1Var = this.f11018b;
        int iHashCode2 = (iHashCode + (g1Var == null ? 0 : g1Var.hashCode())) * 31;
        C2446z c2446z = this.f11019c;
        return this.f11021e.hashCode() + AbstractC1452a.m4558e((((iHashCode2 + (c2446z == null ? 0 : c2446z.hashCode())) * 31) + 0) * 31, 31, this.f11020d);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f11017a + ", slide=" + this.f11018b + ", changeSize=" + this.f11019c + ", scale=" + ((Object) null) + ", hold=" + this.f11020d + ", effectsMap=" + this.f11021e + ')';
    }

    public /* synthetic */ i1(w0 w0Var, g1 g1Var, C2446z c2446z, sf sfVar, LinkedHashMap linkedHashMap, int i10) {
        this((i10 & 1) != 0 ? null : w0Var, (i10 & 2) != 0 ? null : g1Var, (i10 & 4) != 0 ? null : c2446z, (i10 & 8) != 0 ? null : sfVar, (i10 & 16) == 0, (i10 & 32) != 0 ? C6669s.f31944a : linkedHashMap);
    }
}
