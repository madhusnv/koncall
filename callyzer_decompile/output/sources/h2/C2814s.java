package h2;

import a3.C0043b;
import b2.C0566x;
import c9.C0925t;
import dy.C1855c;
import ex.InterfaceC2141e;
import k1.x0;
import k2.e1;
import kotlin.jvm.internal.AbstractC4154l;
import og.ze;
import qw.C6361k;
import rw.C6669s;
import s4.C6745a;
import s4.C6756l;
import t3.w0;
import v3.InterfaceC7652x;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h2.s */
/* loaded from: classes.dex */
public final class C2814s extends AbstractC7878q implements InterfaceC7652x {

    /* renamed from: q */
    public C0925t f15769q;

    /* renamed from: r */
    public InterfaceC2141e f15770r;

    /* renamed from: s */
    public x0 f15771s;

    /* renamed from: t */
    public boolean f15772t;

    @Override // w2.AbstractC7878q
    public final void E0() {
        this.f15772t = false;
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        w0 w0VarMo13314z = i0Var.mo13314z(j6);
        if (!l0Var.mo12874R() || !this.f15772t) {
            C6361k c6361k = (C6361k) this.f15770r.invoke(new C6756l(ze.m11095a(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b)), new C6745a(j6));
            C0925t c0925t = this.f15769q;
            d0 d0Var = (d0) c6361k.f30755a;
            Object obj = c6361k.f30756b;
            if (!AbstractC4154l.m8918a(c0925t.m2679h(), d0Var)) {
                ((e1) c0925t.f5663m).setValue(d0Var);
                C2819x c2819x = (C2819x) c0925t.f5655e;
                C0043b c0043b = new C0043b(10, c0925t, obj);
                C1855c c1855c = c2819x.f15804b;
                boolean zM5489e = c1855c.m5489e();
                if (zM5489e) {
                    try {
                        c0043b.invoke();
                    } finally {
                        c1855c.mo1769j(null);
                    }
                }
                if (!zM5489e) {
                    c0925t.m2692u(obj);
                }
            }
        }
        this.f15772t = l0Var.mo12874R() || this.f15772t;
        return l0Var.g0(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b, C6669s.f31944a, new C0566x(12, l0Var, this, w0VarMo13314z));
    }
}
