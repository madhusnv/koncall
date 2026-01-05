package g2;

import android.view.View;
import androidx.compose.ui.focus.AbstractC0259a;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq.C0408k;
import b3.C0592x;
import com.sun.mail.util.AbstractC1452a;
import d4.AbstractC1586n;
import dr.C1770t;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import f2.C2187j;
import h2.AbstractC2812q;
import j2.AbstractC3542v;
import java.util.WeakHashMap;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import o1.C5243b;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import s2.AbstractC6740i;
import s2.C6734c;
import s4.InterfaceC6747c;
import uw.InterfaceC7559c;
import w2.C7876o;
import w2.InterfaceC7879r;
import w4.AbstractC7917i;
import w4.C7931w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m5 {

    /* renamed from: a */
    public final /* synthetic */ C0592x f12077a;

    /* renamed from: b */
    public final /* synthetic */ boolean f12078b;

    /* renamed from: c */
    public final /* synthetic */ String f12079c;

    /* renamed from: d */
    public final /* synthetic */ String f12080d;

    /* renamed from: e */
    public final /* synthetic */ String f12081e;

    /* renamed from: f */
    public final /* synthetic */ w3.p2 f12082f;

    /* renamed from: g */
    public final /* synthetic */ k2.w0 f12083g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2139c f12084h;

    /* renamed from: i */
    public final /* synthetic */ k2.b1 f12085i;

    /* renamed from: j */
    public final /* synthetic */ k2.b1 f12086j;

    public m5(C0592x c0592x, boolean z6, String str, String str2, String str3, w3.p2 p2Var, k2.w0 w0Var, InterfaceC2139c interfaceC2139c, k2.b1 b1Var, k2.b1 b1Var2) {
        this.f12077a = c0592x;
        this.f12078b = z6;
        this.f12079c = str;
        this.f12080d = str2;
        this.f12081e = str3;
        this.f12082f = p2Var;
        this.f12083g = w0Var;
        this.f12084h = interfaceC2139c;
        this.f12085i = b1Var;
        this.f12086j = b1Var2;
    }

    /* renamed from: a */
    public final void m6204a(boolean z6, InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, i1.p1 p1Var, boolean z10, d3.l0 l0Var, long j6, float f6, float f10, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        int i12;
        float f11;
        float f12;
        long j10;
        i1.p1 p1Var2;
        d3.l0 l0Var2;
        boolean z11;
        i1.p1 p1Var3;
        d3.l0 l0Var3;
        i1.p1 p1Var4;
        boolean z12;
        C3966o c3966o;
        i1.p1 p1Var5;
        boolean z13;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(720925481);
        int i13 = i10 | (c3966o2.m8615h(z6) ? 4 : 2) | (c3966o2.m8614g(interfaceC7879r) ? 256 : 128) | 919168000;
        if ((i11 & 6) == 0) {
            i12 = i11 | (c3966o2.m8616i(c6734c) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c3966o2.m8614g(this) ? 32 : 16;
        }
        if ((i13 & 306783379) == 306783378 && (i12 & 19) == 18 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            p1Var5 = p1Var;
            z13 = z10;
            l0Var2 = l0Var;
            j10 = j6;
            f11 = f6;
            f12 = f10;
            c3966o = c3966o2;
        } else {
            c3966o2.m8603U();
            if ((i10 & 1) == 0 || c3966o2.m8584A()) {
                i1.p1 p1VarM11707b = pg.j0.m11707b(c3966o2);
                float f13 = w6.f13116a;
                d3.l0 l0VarM6134a = ea.m6134a(AbstractC3542v.f18909c, c3966o2);
                long jM6345d = y1.m6345d(AbstractC3542v.f18907a, c3966o2);
                f11 = w6.f13116a;
                f12 = w6.f13117b;
                j10 = jM6345d;
                p1Var2 = p1VarM11707b;
                l0Var2 = l0VarM6134a;
                z11 = true;
            } else {
                c3966o2.m8601S();
                p1Var2 = p1Var;
                z11 = z10;
                l0Var2 = l0Var;
                j10 = j6;
                f11 = f6;
                f12 = f10;
            }
            c3966o2.m8624q();
            Object objM8596M = c3966o2.m8596M();
            Object obj = C3961j.f20408a;
            if (objM8596M == obj) {
                objM8596M = AbstractC1452a.m4571r(qw.a0.f30746a, k2.s0.f20544c, c3966o2);
            }
            k2.w0 w0Var = (k2.w0) objM8596M;
            View view = (View) c3966o2.m8618k(AndroidCompositionLocals_androidKt.f2138f);
            InterfaceC6747c interfaceC6747c = (InterfaceC6747c) c3966o2.m8618k(w3.k1.f37836h);
            WeakHashMap weakHashMap = o1.w1.f25863v;
            boolean z14 = z11;
            int i14 = C5243b.m10315e(c3966o2).f25869f.m10311e().f34958b;
            c3966o2.m8607Y(321499814);
            if (z6) {
                Object objM8596M2 = c3966o2.m8596M();
                if (objM8596M2 == obj) {
                    p1Var3 = p1Var2;
                    objM8596M2 = new C2187j(w0Var, 2);
                    c3966o2.j0(objM8596M2);
                } else {
                    p1Var3 = p1Var2;
                }
                p5.m6228b(view, interfaceC6747c, (InterfaceC2137a) objM8596M2, c3966o2, KyberEngine.KyberPolyBytes);
            } else {
                p1Var3 = p1Var2;
            }
            c3966o2.m8623p(false);
            Object objM8596M3 = c3966o2.m8596M();
            if (objM8596M3 == obj) {
                objM8596M3 = new h1.j0(Boolean.FALSE);
                c3966o2.j0(objM8596M3);
            }
            h1.j0 j0Var = (h1.j0) objM8596M3;
            j0Var.f15486c.setValue(Boolean.valueOf(z6));
            if (((Boolean) j0Var.f15485b.getValue()).booleanValue() || ((Boolean) j0Var.f15486c.getValue()).booleanValue()) {
                Object objM8596M4 = c3966o2.m8596M();
                if (objM8596M4 == obj) {
                    l0Var3 = l0Var2;
                    objM8596M4 = C3953b.m8517t(new d3.p0(d3.p0.f7805b));
                    c3966o2.j0(objM8596M4);
                } else {
                    l0Var3 = l0Var2;
                }
                k2.w0 w0Var2 = (k2.w0) objM8596M4;
                boolean zM8614g = c3966o2.m8614g(interfaceC6747c) | c3966o2.m8612e(i14);
                Object objM8596M5 = c3966o2.m8596M();
                if (zM8614g || objM8596M5 == obj) {
                    objM8596M5 = new h5(interfaceC6747c, i14, w0Var, new C2463q(w0Var2, 2));
                    c3966o2.j0(objM8596M5);
                }
                h5 h5Var = (h5) objM8596M5;
                int i15 = g5.f11635a;
                ((v6) this.f12083g.getValue()).getClass();
                p1Var4 = p1Var3;
                l0Var2 = l0Var3;
                z12 = z14;
                AbstractC7917i.m15047a(h5Var, interfaceC2137a, new C7931w(!((Boolean) AbstractC2812q.m6917i(c3966o2).getValue()).booleanValue() ? 393248 : 393216, true, true, true), AbstractC6740i.m12902d(-1082380263, new e5(this, interfaceC7879r, z12, j0Var, w0Var2, p1Var4, l0Var2, j10, f11, f12, c6734c), c3966o2), c3966o2, 3120, 0);
                c3966o = c3966o2;
            } else {
                z12 = z14;
                p1Var4 = p1Var3;
                c3966o = c3966o2;
            }
            p1Var5 = p1Var4;
            z13 = z12;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new f5(this, z6, interfaceC2137a, interfaceC7879r, p1Var5, z13, l0Var2, j10, f11, f12, c6734c, i10, i11);
        }
    }

    /* renamed from: b */
    public final InterfaceC7879r m6205b(InterfaceC7879r interfaceC7879r) {
        InterfaceC7879r interfaceC7879rM712b = AbstractC0259a.m712b(interfaceC7879r, this.f12077a);
        k2.w0 w0Var = this.f12083g;
        InterfaceC2139c interfaceC2139c = this.f12084h;
        boolean z6 = this.f12078b;
        l5 l5Var = new l5(interfaceC2139c, w0Var, z6);
        return interfaceC7879rM712b.mo14852e(AbstractC1586n.m5204b(C7876o.f37669a.mo14852e(new SuspendPointerInputElement(l5Var, null, new p3.a0(new C1770t(l5Var, (InterfaceC7559c) null, 19)), 6)), false, new C0408k(z6, this.f12079c, this.f12080d, this.f12081e, l5Var, this.f12082f)));
    }
}
