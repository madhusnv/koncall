package s1;

import a3.C0045d;
import d4.AbstractC1592t;
import d4.AbstractC1594v;
import d4.C1573a;
import d4.C1574b;
import d4.C1581i;
import d4.C1582j;
import d4.C1583k;
import d4.C1595w;
import d4.InterfaceC1596x;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import lx.InterfaceC4574m;
import v3.w1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 extends AbstractC7878q implements w1 {

    /* renamed from: q */
    public InterfaceC2137a f32123q;

    /* renamed from: r */
    public o0 f32124r;

    /* renamed from: s */
    public k1.x0 f32125s;

    /* renamed from: t */
    public boolean f32126t;

    /* renamed from: v */
    public C1581i f32127v;

    /* renamed from: w */
    public final q0 f32128w = new q0(this, 0);

    /* renamed from: x */
    public q0 f32129x;

    public r0(InterfaceC2137a interfaceC2137a, o0 o0Var, k1.x0 x0Var, boolean z6) {
        this.f32123q = interfaceC2137a;
        this.f32124r = o0Var;
        this.f32125s = x0Var;
        this.f32126t = z6;
        L0();
    }

    @Override // w2.AbstractC7878q
    public final boolean A0() {
        return false;
    }

    public final void L0() {
        this.f32127v = new C1581i(new p0(this, 1), new p0(this, 2));
        this.f32129x = this.f32126t ? new q0(this, 1) : null;
    }

    @Override // v3.w1
    public final void t0(InterfaceC1596x interfaceC1596x) {
        AbstractC1594v.m5233k(interfaceC1596x);
        C1583k c1583k = (C1583k) interfaceC1596x;
        c1583k.m5202q(AbstractC1592t.f7914K, this.f32128w);
        if (this.f32125s == k1.x0.Vertical) {
            C1581i c1581i = this.f32127v;
            if (c1581i == null) {
                AbstractC4154l.m8928k("scrollAxisRange");
                throw null;
            }
            AbstractC1594v.m5235m(interfaceC1596x, c1581i);
        } else {
            C1581i c1581i2 = this.f32127v;
            if (c1581i2 == null) {
                AbstractC4154l.m8928k("scrollAxisRange");
                throw null;
            }
            C1595w c1595w = AbstractC1592t.f7935s;
            InterfaceC4574m interfaceC4574m = AbstractC1594v.f7944a[10];
            c1595w.m5236a(interfaceC1596x, c1581i2);
        }
        q0 q0Var = this.f32129x;
        if (q0Var != null) {
            c1583k.m5202q(C1582j.f7847f, new C1573a(null, q0Var));
        }
        c1583k.m5202q(C1582j.f7841B, new C1573a(null, new C0045d(4, new p0(this, 0))));
        C1574b c1574bMo12087e = this.f32124r.mo12087e();
        C1595w c1595w2 = AbstractC1592t.f7922f;
        InterfaceC4574m interfaceC4574m2 = AbstractC1594v.f7944a[21];
        c1595w2.m5236a(interfaceC1596x, c1574bMo12087e);
    }
}
