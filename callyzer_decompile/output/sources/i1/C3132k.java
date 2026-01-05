package i1;

import a3.C0043b;
import c3.C0850e;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1565s;
import f3.C2196b;
import f3.InterfaceC2198d;
import kotlin.jvm.internal.AbstractC4154l;
import s4.EnumC6757m;
import v3.AbstractC7634f;
import v3.InterfaceC7644p;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.k */
/* loaded from: classes.dex */
public final class C3132k extends AbstractC7878q implements InterfaceC7644p, v3.l1 {

    /* renamed from: q */
    public long f16892q;

    /* renamed from: r */
    public d3.l0 f16893r;

    /* renamed from: s */
    public long f16894s;

    /* renamed from: t */
    public EnumC6757m f16895t;

    /* renamed from: v */
    public d3.h0 f16896v;

    /* renamed from: w */
    public d3.l0 f16897w;

    /* renamed from: x */
    public d3.h0 f16898x;

    @Override // v3.l1
    public final void c0() {
        this.f16894s = 9205357640488583168L;
        this.f16895t = null;
        this.f16896v = null;
        this.f16897w = null;
        AbstractC7634f.m14552m(this);
    }

    @Override // v3.InterfaceC7644p
    public final void h0(v3.i0 i0Var) {
        v3.i0 i0Var2;
        d3.h0 h0Var;
        C2196b c2196b = i0Var.f36917a;
        if (this.f16893r != d3.h0.f7748a) {
            i0Var2 = i0Var;
            if (C0850e.m2290a(c2196b.mo5913e(), this.f16894s) && i0Var2.getLayoutDirection() == this.f16895t && AbstractC4154l.m8918a(this.f16897w, this.f16893r)) {
                h0Var = this.f16896v;
                AbstractC4154l.m8920c(h0Var);
            } else {
                AbstractC7634f.m14559t(this, new C0043b(11, this, i0Var2));
                h0Var = this.f16898x;
                this.f16898x = null;
            }
            this.f16896v = h0Var;
            this.f16894s = c2196b.mo5913e();
            this.f16895t = i0Var2.getLayoutDirection();
            this.f16897w = this.f16893r;
            AbstractC4154l.m8920c(h0Var);
            if (!C1565s.m5187c(this.f16892q, C1565s.f7817j)) {
                d3.h0.m5139k(i0Var2, h0Var, this.f16892q);
            }
        } else if (C1565s.m5187c(this.f16892q, C1565s.f7817j)) {
            i0Var2 = i0Var;
        } else {
            i0Var2 = i0Var;
            InterfaceC2198d.o0(i0Var2, this.f16892q, 0L, 0L, DefinitionKt.NO_Float_VALUE, null, 126);
        }
        i0Var2.m14622b();
    }
}
