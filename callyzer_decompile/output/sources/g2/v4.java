package g2;

import h2.AbstractC2808m;
import h2.C2807l;
import java.util.Locale;
import k2.C3953b;
import kx.C4266h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v4 extends f0 {

    /* renamed from: e */
    public final k2.e1 f12984e;

    /* renamed from: f */
    public final k2.e1 f12985f;

    /* renamed from: g */
    public final k2.e1 f12986g;

    public v4(Long l9, Long l10, Long l11, C4266h c4266h, int i10, z9 z9Var, Locale locale) {
        super(l11, c4266h, z9Var, locale);
        this.f12984e = C3953b.m8517t(null);
        this.f12985f = C3953b.m8517t(null);
        m6332g(l9, l10);
        this.f12986g = C3953b.m8517t(new a5(i10));
    }

    /* renamed from: d */
    public final int m6329d() {
        return ((a5) this.f12986g.getValue()).f11169a;
    }

    /* renamed from: e */
    public final Long m6330e() {
        C2807l c2807l = (C2807l) this.f12985f.getValue();
        if (c2807l != null) {
            return Long.valueOf(c2807l.f15727d);
        }
        return null;
    }

    /* renamed from: f */
    public final Long m6331f() {
        C2807l c2807l = (C2807l) this.f12984e.getValue();
        if (c2807l != null) {
            return Long.valueOf(c2807l.f15727d);
        }
        return null;
    }

    /* renamed from: g */
    public final void m6332g(Long l9, Long l10) {
        AbstractC2808m abstractC2808m = (AbstractC2808m) this.f11536b;
        C4266h c4266h = (C4266h) this.f11535a;
        C2807l c2807lMo6898b = l9 != null ? abstractC2808m.mo6898b(l9.longValue()) : null;
        C2807l c2807lMo6898b2 = l10 != null ? abstractC2808m.mo6898b(l10.longValue()) : null;
        if (c2807lMo6898b != null) {
            int i10 = c2807lMo6898b.f15724a;
            if (!c4266h.m8986h(i10)) {
                throw new IllegalArgumentException(("The provided start date year (" + i10 + ") is out of the years range of " + c4266h + '.').toString());
            }
        }
        if (c2807lMo6898b2 != null) {
            int i11 = c2807lMo6898b2.f15724a;
            if (!c4266h.m8986h(i11)) {
                throw new IllegalArgumentException(("The provided end date year (" + i11 + ") is out of the years range of " + c4266h + '.').toString());
            }
        }
        if (c2807lMo6898b2 != null) {
            if (c2807lMo6898b == null) {
                throw new IllegalArgumentException("An end date was provided without a start date.");
            }
            if (c2807lMo6898b.f15727d > c2807lMo6898b2.f15727d) {
                throw new IllegalArgumentException("The provided end date appears before the start date.");
            }
        }
        this.f12984e.setValue(c2807lMo6898b);
        this.f12985f.setValue(c2807lMo6898b2);
    }
}
