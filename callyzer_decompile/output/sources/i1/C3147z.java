package i1;

import a2.C0036i;
import android.view.KeyEvent;
import bs.C0749g;
import d4.AbstractC1594v;
import d4.C1573a;
import d4.C1582j;
import d4.C1583k;
import d4.InterfaceC1596x;
import e1.AbstractC1913o;
import ex.InterfaceC2137a;
import k1.i2;
import lx.InterfaceC4574m;
import m1.InterfaceC4630l;
import n3.AbstractC4949c;
import p3.InterfaceC5822t;
import uw.InterfaceC7559c;
import v3.InterfaceC7640l;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.z */
/* loaded from: classes.dex */
public final class C3147z extends AbstractC3126e implements InterfaceC7640l {

    /* renamed from: M */
    public InterfaceC2137a f17014M;

    /* renamed from: N */
    public boolean f17015N;

    /* renamed from: O */
    public final e1.a0 f17016O;

    /* renamed from: T */
    public final e1.a0 f17017T;

    public C3147z(InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2, u0 u0Var, InterfaceC4630l interfaceC4630l) {
        super(interfaceC4630l, u0Var, true, null, null, interfaceC2137a);
        this.f17014M = interfaceC2137a2;
        this.f17015N = true;
        int i10 = AbstractC1913o.f9032a;
        this.f17016O = new e1.a0(6);
        this.f17017T = new e1.a0(6);
    }

    @Override // w2.AbstractC7878q
    public final void F0() {
        W0();
    }

    @Override // i1.AbstractC3126e
    public final void O0(InterfaceC1596x interfaceC1596x) {
        if (this.f17014M != null) {
            C0036i c0036i = new C0036i(16, this);
            InterfaceC4574m[] interfaceC4574mArr = AbstractC1594v.f7944a;
            ((C1583k) interfaceC1596x).m5202q(C1582j.f7844c, new C1573a(null, c0036i));
        }
    }

    @Override // i1.AbstractC3126e
    public final Object P0(InterfaceC5822t interfaceC5822t, InterfaceC7559c interfaceC7559c) {
        Object obj = null;
        C3146y c3146y = (!this.f16845x || this.f17014M == null) ? null : new C3146y(this, 0);
        C3141t c3141t = new C3141t(this, null, 1);
        C3146y c3146y2 = new C3146y(this, 1);
        k1.g0 g0Var = i2.f20132a;
        Object objM13488k = tx.c0.m13488k(new C0749g(interfaceC5822t, c3141t, c3146y, obj, c3146y2, null, 5), interfaceC7559c);
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        qw.a0 a0Var = qw.a0.f30746a;
        if (objM13488k != enumC7794a) {
            objM13488k = a0Var;
        }
        return objM13488k == enumC7794a ? objM13488k : a0Var;
    }

    @Override // i1.AbstractC3126e
    public final void S0() {
        W0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // i1.AbstractC3126e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean T0(android.view.KeyEvent r7) {
        /*
            r6 = this;
            long r0 = n3.AbstractC4949c.m9891c(r7)
            ex.a r7 = r6.f17014M
            if (r7 == 0) goto L26
            e1.a0 r7 = r6.f17016O
            java.lang.Object r2 = r7.m5520d(r0)
            if (r2 != 0) goto L26
            tx.z r2 = r6.z0()
            ab.b r3 = new ab.b
            r4 = 22
            r5 = 0
            r3.<init>(r6, r5, r4)
            r4 = 3
            tx.s1 r2 = tx.c0.m13502y(r2, r5, r5, r3, r4)
            r7.m5523g(r0, r2)
            r7 = 1
            goto L27
        L26:
            r7 = 0
        L27:
            e1.a0 r2 = r6.f17017T
            java.lang.Object r0 = r2.m5520d(r0)
            i1.x r0 = (i1.AbstractC3145x) r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C3147z.T0(android.view.KeyEvent):boolean");
    }

    @Override // i1.AbstractC3126e
    public final void U0(KeyEvent keyEvent) {
        long jM9891c = AbstractC4949c.m9891c(keyEvent);
        e1.a0 a0Var = this.f17016O;
        boolean z6 = false;
        if (a0Var.m5520d(jM9891c) != null) {
            tx.e1 e1Var = (tx.e1) a0Var.m5520d(jM9891c);
            if (e1Var != null) {
                if (e1Var.mo13509h()) {
                    e1Var.mo13510j(null);
                } else {
                    z6 = true;
                }
            }
            a0Var.m5522f(jM9891c);
        }
        if (z6) {
            return;
        }
        this.f16846y.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W0() {
        /*
            Method dump skipped, instructions count: 182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C3147z.W0():void");
    }
}
