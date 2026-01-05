package zp;

import com.websoptimization.callyzerbiz.R;
import d3.C1565s;
import im.EnumC3319u;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5416r;
import uv.AbstractC7548a;
import yv.C8789d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zp.p */
/* loaded from: classes3.dex */
public final class C9016p {

    /* renamed from: a */
    public final C5416r f43428a;

    /* renamed from: b */
    public final EnumC3319u f43429b;

    public C9016p(C5416r analysisData, EnumC3319u label) {
        AbstractC4154l.m8923f(analysisData, "analysisData");
        AbstractC4154l.m8923f(label, "label");
        this.f43428a = analysisData;
        this.f43429b = label;
    }

    /* renamed from: a */
    public final long m16478a() {
        int i10 = AbstractC9015o.f43427a[this.f43429b.ordinal()];
        if (i10 == 1) {
            return AbstractC7548a.f36340M;
        }
        if (i10 == 2) {
            return AbstractC7548a.f36341N;
        }
        if (i10 == 3) {
            return AbstractC7548a.f36342O;
        }
        if (i10 == 4) {
            return AbstractC7548a.f36343P;
        }
        int i11 = C1565s.f7818k;
        return C1565s.f7817j;
    }

    /* renamed from: b */
    public final String m16479b() {
        String strM16160g;
        int i10 = AbstractC9015o.f43427a[this.f43429b.ordinal()];
        if (i10 == 3 || i10 == 4) {
            return "-";
        }
        Long l9 = this.f43428a.f27214b;
        return (l9 == null || (strM16160g = C8789d.m16160g(false, l9.longValue())) == null) ? "0s" : strM16160g;
    }

    /* renamed from: c */
    public final int m16480c() {
        int i10 = AbstractC9015o.f43427a[this.f43429b.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? R.string.total : R.string.rejected : R.string.missed : R.string.outgoing : R.string.incoming;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9016p)) {
            return false;
        }
        C9016p c9016p = (C9016p) obj;
        return AbstractC4154l.m8918a(this.f43428a, c9016p.f43428a) && this.f43429b == c9016p.f43429b;
    }

    public final int hashCode() {
        return this.f43429b.hashCode() + (this.f43428a.hashCode() * 31);
    }

    public final String toString() {
        return "TotalCallsUiModel(analysisData=" + this.f43428a + ", label=" + this.f43429b + ")";
    }
}
