package p001o;

import androidx.compose.ui.focus.InterfaceC1929c;
import java.util.HashSet;
import p001o.alb;

/* loaded from: classes2.dex */
public final class na1 extends alb.AbstractC12216c implements uh9, yx5, ncf, bdd, flb, uwc, lh9, it7, r67, d77, f77, vgc {

    /* renamed from: L */
    public alb.InterfaceC12215b f36603L;

    /* renamed from: M */
    public boolean f36604M;

    /* renamed from: Q */
    public ma1 f36605Q;

    /* renamed from: X */
    public HashSet f36606X;

    /* renamed from: Y */
    public mh9 f36607Y;

    /* renamed from: o.na1$a */
    public static final class C15530a extends kf9 implements uk7 {
        public C15530a() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69021invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69021invoke() {
            alb.InterfaceC12215b interfaceC12215bA0 = na1.this.a0();
            sq8.m48647f(interfaceC12215bA0, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            tq.m50332a(interfaceC12215bA0);
            throw null;
        }
    }

    public na1(alb.InterfaceC12215b interfaceC12215b) {
        sq8.m48649h(interfaceC12215b, "element");
        m17372V(a0c.m16303f(interfaceC12215b));
        this.f36603L = interfaceC12215b;
        this.f36604M = true;
        this.f36606X = new HashSet();
    }

    @Override // p001o.alb.AbstractC12216c
    /* renamed from: M */
    public void mo17364M() {
        b0(true);
    }

    @Override // p001o.alb.AbstractC12216c
    /* renamed from: N */
    public void mo17365N() {
        e0();
    }

    @Override // p001o.lh9
    /* renamed from: a */
    public void mo37217a(long j) {
    }

    public final alb.InterfaceC12215b a0() {
        return this.f36603L;
    }

    public final void b0(boolean z) {
        if (!m17361J()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((zzb.m60153a(32) & m17356E()) != 0) {
        }
        if (((zzb.m60153a(4) & m17356E()) != 0) && !z) {
            xh9.m56314a(this);
        }
        if ((zzb.m60153a(2) & m17356E()) != 0) {
            if (oa1.m41859c(this)) {
                xzb xzbVarM17354C = m17354C();
                sq8.m48646e(xzbVarM17354C);
                ((vh9) xzbVarM17354C).I1(this);
                xzbVarM17354C.g1();
            }
            if (!z) {
                xh9.m56314a(this);
                sk5.m48436h(this).o0();
            }
        }
        if ((zzb.m60153a(128) & m17356E()) != 0) {
        }
        if ((zzb.m60153a(256) & m17356E()) != 0) {
        }
        if ((zzb.m60153a(16) & m17356E()) != 0) {
        }
        if ((zzb.m60153a(8) & m17356E()) != 0) {
            sk5.m48437i(this).mo5074s();
        }
    }

    @Override // p001o.ncf
    /* renamed from: c */
    public void mo40256c(ycf ycfVar) {
        sq8.m48649h(ycfVar, "<this>");
        alb.InterfaceC12215b interfaceC12215b = this.f36603L;
        sq8.m48647f(interfaceC12215b, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        tq.m50332a(interfaceC12215b);
        throw null;
    }

    public final void c0() {
        this.f36604M = true;
        zx5.m60064a(this);
    }

    public final void d0(alb.InterfaceC12215b interfaceC12215b) {
        sq8.m48649h(interfaceC12215b, "value");
        if (m17361J()) {
            e0();
        }
        this.f36603L = interfaceC12215b;
        m17372V(a0c.m16303f(interfaceC12215b));
        if (m17361J()) {
            b0(false);
        }
    }

    @Override // p001o.bdd
    /* renamed from: e */
    public boolean mo18660e() {
        alb.InterfaceC12215b interfaceC12215b = this.f36603L;
        sq8.m48647f(interfaceC12215b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        tq.m50332a(interfaceC12215b);
        throw null;
    }

    public final void e0() {
        if (!m17361J()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((zzb.m60153a(32) & m17356E()) != 0) {
        }
        if ((zzb.m60153a(8) & m17356E()) != 0) {
            sk5.m48437i(this).mo5074s();
        }
    }

    @Override // p001o.flb
    /* renamed from: f */
    public elb mo27027f() {
        ma1 ma1Var = this.f36605Q;
        return ma1Var != null ? ma1Var : glb.m29009a();
    }

    public final void f0() {
        if (m17361J()) {
            this.f36606X.clear();
            sk5.m48437i(this).getSnapshotObserver().m54368h(this, oa1.f37986c, new C15530a());
        }
    }

    @Override // p001o.r67
    /* renamed from: i */
    public void mo40257i(g77 g77Var) {
        sq8.m48649h(g77Var, "focusState");
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // p001o.yx5
    /* renamed from: k */
    public void mo40258k(w14 w14Var) {
        sq8.m48649h(w14Var, "<this>");
        alb.InterfaceC12215b interfaceC12215b = this.f36603L;
        sq8.m48647f(interfaceC12215b, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        tq.m50332a(interfaceC12215b);
        boolean z = this.f36604M;
        throw null;
    }

    @Override // p001o.uh9
    /* renamed from: l */
    public b1b mo40259l(c1b c1bVar, y0b y0bVar, long j) {
        sq8.m48649h(c1bVar, "$this$measure");
        sq8.m48649h(y0bVar, "measurable");
        alb.InterfaceC12215b interfaceC12215b = this.f36603L;
        sq8.m48647f(interfaceC12215b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        tq.m50332a(interfaceC12215b);
        throw null;
    }

    @Override // p001o.uwc
    /* renamed from: o */
    public Object mo40260o(zl5 zl5Var, Object obj) {
        sq8.m48649h(zl5Var, "<this>");
        alb.InterfaceC12215b interfaceC12215b = this.f36603L;
        sq8.m48647f(interfaceC12215b, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        tq.m50332a(interfaceC12215b);
        throw null;
    }

    @Override // p001o.d77
    /* renamed from: p */
    public void mo22407p(InterfaceC1929c interfaceC1929c) {
        sq8.m48649h(interfaceC1929c, "focusProperties");
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // p001o.it7
    /* renamed from: r */
    public void mo32721r(mh9 mh9Var) {
        sq8.m48649h(mh9Var, "coordinates");
        alb.InterfaceC12215b interfaceC12215b = this.f36603L;
        sq8.m48647f(interfaceC12215b, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        tq.m50332a(interfaceC12215b);
        throw null;
    }

    @Override // p001o.vgc
    /* renamed from: s */
    public boolean mo40261s() {
        return m17361J();
    }

    @Override // p001o.bdd
    /* renamed from: t */
    public void mo18661t() {
        alb.InterfaceC12215b interfaceC12215b = this.f36603L;
        sq8.m48647f(interfaceC12215b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        tq.m50332a(interfaceC12215b);
        throw null;
    }

    public String toString() {
        return this.f36603L.toString();
    }

    @Override // p001o.yx5
    /* renamed from: u */
    public void mo40262u() {
        this.f36604M = true;
        zx5.m60064a(this);
    }

    @Override // p001o.lh9
    /* renamed from: w */
    public void mo37218w(mh9 mh9Var) {
        sq8.m48649h(mh9Var, "coordinates");
        this.f36607Y = mh9Var;
    }

    @Override // p001o.bdd
    /* renamed from: x */
    public boolean mo18663x() {
        alb.InterfaceC12215b interfaceC12215b = this.f36603L;
        sq8.m48647f(interfaceC12215b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        tq.m50332a(interfaceC12215b);
        throw null;
    }

    @Override // p001o.bdd
    /* renamed from: y */
    public void mo18664y(lcd lcdVar, ncd ncdVar, long j) {
        sq8.m48649h(lcdVar, "pointerEvent");
        sq8.m48649h(ncdVar, "pass");
        alb.InterfaceC12215b interfaceC12215b = this.f36603L;
        sq8.m48647f(interfaceC12215b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        tq.m50332a(interfaceC12215b);
        throw null;
    }
}
