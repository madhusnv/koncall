package g2;

import h2.AbstractC2808m;
import h2.C2807l;
import java.util.Locale;
import k2.C3953b;
import kx.C4266h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h4 extends f0 {

    /* renamed from: e */
    public final k2.e1 f11718e;

    /* renamed from: f */
    public final k2.e1 f11719f;

    public h4(Long l9, Long l10, C4266h c4266h, int i10, z9 z9Var, Locale locale) {
        C2807l c2807lMo6898b;
        super(l10, c4266h, z9Var, locale);
        if (l9 != null) {
            c2807lMo6898b = ((AbstractC2808m) this.f11536b).mo6898b(l9.longValue());
            int i11 = c2807lMo6898b.f15724a;
            if (!c4266h.m8986h(i11)) {
                throw new IllegalArgumentException(("The provided initial date's year (" + i11 + ") is out of the years range of " + c4266h + '.').toString());
            }
        } else {
            c2807lMo6898b = null;
        }
        this.f11718e = C3953b.m8517t(c2807lMo6898b);
        this.f11719f = C3953b.m8517t(new a5(i10));
    }

    /* renamed from: d */
    public final int m6169d() {
        return ((a5) this.f11719f.getValue()).f11169a;
    }

    /* renamed from: e */
    public final Long m6170e() {
        C2807l c2807l = (C2807l) this.f11718e.getValue();
        if (c2807l != null) {
            return Long.valueOf(c2807l.f15727d);
        }
        return null;
    }
}
