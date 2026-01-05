package z1;

import b2.f1;
import b2.y0;
import b3.C0592x;
import d4.AbstractC1592t;
import d4.AbstractC1594v;
import d4.C1573a;
import d4.C1582j;
import d4.C1583k;
import d4.C1595w;
import d4.InterfaceC1596x;
import g4.C2492h;
import g4.n0;
import l4.C4356a;
import l4.C4359d;
import l4.C4365j;
import l4.C4366k;
import l4.C4381z;
import l4.InterfaceC4374s;
import l4.h0;
import l4.i0;
import lx.InterfaceC4574m;
import og.pe;
import og.yf;
import qw.a0;
import v3.AbstractC7642n;
import v3.w1;
import x1.c0;
import x1.v0;
import x2.C8288l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z1.f */
/* loaded from: classes.dex */
public final class C8846f extends AbstractC7642n implements w1 {

    /* renamed from: B */
    public C4366k f42569B;

    /* renamed from: C */
    public C0592x f42570C;

    /* renamed from: s */
    public i0 f42571s;

    /* renamed from: t */
    public C4381z f42572t;

    /* renamed from: v */
    public v0 f42573v;

    /* renamed from: w */
    public boolean f42574w;

    /* renamed from: x */
    public boolean f42575x;

    /* renamed from: y */
    public InterfaceC4374s f42576y;

    /* renamed from: z */
    public y0 f42577z;

    public static final void O0(C8846f c8846f, v0 v0Var, String str, boolean z6, boolean z10) {
        if (z6 || !z10) {
            return;
        }
        h0 h0Var = v0Var.f39707e;
        c0 c0Var = v0Var.f39724v;
        a0 a0Var = null;
        if (h0Var != null) {
            C4381z c4381zM2607q = v0Var.f39706d.m2607q(pe.m10834i(new C4359d(), new C4356a(str, 1)));
            h0Var.m9112a(null, c4381zM2607q);
            c0Var.invoke(c4381zM2607q);
            a0Var = a0.f30746a;
        }
        if (a0Var == null) {
            int length = str.length();
            c0Var.invoke(new C4381z(str, 4, yf.m11072a(length, length)));
        }
    }

    @Override // v3.w1
    public final boolean q0() {
        return true;
    }

    @Override // v3.w1
    public final void t0(InterfaceC1596x interfaceC1596x) {
        C2492h c2492h = this.f42572t.f21945a;
        InterfaceC4574m[] interfaceC4574mArr = AbstractC1594v.f7944a;
        C1595w c1595w = AbstractC1592t.f7906C;
        InterfaceC4574m[] interfaceC4574mArr2 = AbstractC1594v.f7944a;
        InterfaceC4574m interfaceC4574m = interfaceC4574mArr2[16];
        c1595w.m5236a(interfaceC1596x, c2492h);
        C2492h c2492h2 = this.f42571s.f21909a;
        C1595w c1595w2 = AbstractC1592t.f7907D;
        InterfaceC4574m interfaceC4574m2 = interfaceC4574mArr2[17];
        c1595w2.m5236a(interfaceC1596x, c2492h2);
        long j6 = this.f42572t.f21946b;
        C1595w c1595w3 = AbstractC1592t.f7908E;
        InterfaceC4574m interfaceC4574m3 = interfaceC4574mArr2[18];
        c1595w3.m5236a(interfaceC1596x, new n0(j6));
        C1595w c1595w4 = AbstractC1592t.f7933q;
        InterfaceC4574m interfaceC4574m4 = interfaceC4574mArr2[8];
        c1595w4.m5236a(interfaceC1596x, C8288l.f39815a);
        boolean z6 = false;
        z6 = false;
        C8845e c8845e = new C8845e(this, z6 ? 1 : 0);
        C1595w c1595w5 = C1582j.f7848g;
        C1573a c1573a = new C1573a(null, c8845e);
        C1583k c1583k = (C1583k) interfaceC1596x;
        c1583k.m5202q(c1595w5, c1573a);
        if (!this.f42575x) {
            c1583k.m5202q(AbstractC1592t.f7925i, a0.f30746a);
        }
        int i10 = 1;
        if (this.f42575x && !this.f42574w) {
            z6 = true;
        }
        C1595w c1595w6 = AbstractC1592t.f7915L;
        InterfaceC4574m interfaceC4574m5 = interfaceC4574mArr2[24];
        c1595w6.m5236a(interfaceC1596x, Boolean.valueOf(z6));
        AbstractC1594v.m5225c(interfaceC1596x, new C8845e(this, i10));
        int i11 = 2;
        if (z6) {
            c1583k.m5202q(C1582j.f7851j, new C1573a(null, new C8845e(this, i11)));
            c1583k.m5202q(C1582j.f7855n, new C1573a(null, new C8845e(this, interfaceC1596x)));
        }
        c1583k.m5202q(C1582j.f7850i, new C1573a(null, new f1(6, this)));
        int i12 = this.f42569B.f21918e;
        C8844d c8844d = new C8844d(this, 3);
        c1583k.m5202q(AbstractC1592t.f7909F, new C4365j(i12));
        c1583k.m5202q(C1582j.f7856o, new C1573a(null, c8844d));
        c1583k.m5202q(C1582j.f7843b, new C1573a(null, new C8844d(this, 4)));
        c1583k.m5202q(C1582j.f7844c, new C1573a(null, new C8844d(this, 5)));
        if (!n0.m6455b(this.f42572t.f21946b)) {
            c1583k.m5202q(C1582j.f7857p, new C1573a(null, new C8844d(this, 6)));
            if (this.f42575x && !this.f42574w) {
                c1583k.m5202q(C1582j.f7858q, new C1573a(null, new C8844d(this, 1)));
            }
        }
        if (!this.f42575x || this.f42574w) {
            return;
        }
        c1583k.m5202q(C1582j.f7859r, new C1573a(null, new C8844d(this, 2)));
    }
}
