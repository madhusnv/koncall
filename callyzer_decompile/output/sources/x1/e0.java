package x1;

import c3.C0848c;
import ex.InterfaceC2139c;
import k0.AbstractC3898h;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4381z;
import l4.InterfaceC4374s;
import nc.AbstractC4992c;
import s1.C6725t;
import t3.InterfaceC7033t;
import w3.w2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ v0 f39480a;

    /* renamed from: b */
    public final /* synthetic */ boolean f39481b;

    /* renamed from: c */
    public final /* synthetic */ w2 f39482c;

    /* renamed from: d */
    public final /* synthetic */ b2.y0 f39483d;

    /* renamed from: e */
    public final /* synthetic */ C4381z f39484e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC4374s f39485f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(v0 v0Var, boolean z6, w2 w2Var, b2.y0 y0Var, C4381z c4381z, InterfaceC4374s interfaceC4374s) {
        super(1);
        this.f39480a = v0Var;
        this.f39481b = z6;
        this.f39482c = w2Var;
        this.f39483d = y0Var;
        this.f39484e = c4381z;
        this.f39485f = interfaceC4374s;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        l4.h0 h0Var;
        InterfaceC7033t interfaceC7033t;
        InterfaceC7033t interfaceC7033t2;
        InterfaceC7033t interfaceC7033t3 = (InterfaceC7033t) obj;
        v0 v0Var = this.f39480a;
        k2.e1 e1Var = v0Var.f39717o;
        v0Var.f39710h = interfaceC7033t3;
        r1 r1VarM15480d = v0Var.m15480d();
        if (r1VarM15480d != null) {
            r1VarM15480d.f39669b = interfaceC7033t3;
        }
        if (this.f39481b) {
            k0 k0VarM15477a = v0Var.m15477a();
            k0 k0Var = k0.Selection;
            C4381z c4381z = this.f39484e;
            b2.y0 y0Var = this.f39483d;
            if (k0VarM15477a == k0Var) {
                if (((Boolean) v0Var.f39714l.getValue()).booleanValue() && ((Boolean) ((w3.w1) this.f39482c).f38046a.getValue()).booleanValue()) {
                    y0Var.m1706p();
                } else {
                    y0Var.m1702l();
                }
                v0Var.f39715m.setValue(Boolean.valueOf(AbstractC4992c.m9903d(y0Var, true)));
                v0Var.f39716n.setValue(Boolean.valueOf(AbstractC4992c.m9903d(y0Var, false)));
                e1Var.setValue(Boolean.valueOf(g4.n0.m6455b(c4381z.f21946b)));
            } else if (v0Var.m15477a() == k0.Cursor) {
                e1Var.setValue(Boolean.valueOf(AbstractC4992c.m9903d(y0Var, true)));
            }
            r0.m15461u(v0Var, c4381z, this.f39485f);
            r1 r1VarM15480d2 = v0Var.m15480d();
            if (r1VarM15480d2 != null && (h0Var = v0Var.f39707e) != null && v0Var.m15478b() && (interfaceC7033t = r1VarM15480d2.f39669b) != null && interfaceC7033t.mo13305s() && (interfaceC7033t2 = r1VarM15480d2.f39670c) != null) {
                g4.l0 l0Var = r1VarM15480d2.f39668a;
                C6725t c6725t = new C6725t(15, interfaceC7033t);
                C0848c c0848cM8431b = AbstractC3898h.m8431b(interfaceC7033t);
                C0848c c0848cMo13298S = interfaceC7033t.mo13298S(interfaceC7033t2, false);
                if (AbstractC4154l.m8918a((l4.h0) h0Var.f21907a.f21852b.get(), h0Var)) {
                    h0Var.f21908b.mo9097e(this.f39484e, this.f39485f, l0Var, c6725t, c0848cM8431b, c0848cMo13298S);
                }
            }
        }
        return qw.a0.f30746a;
    }
}
