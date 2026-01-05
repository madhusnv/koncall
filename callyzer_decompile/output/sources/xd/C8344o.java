package xd;

import c3.C0850e;
import d3.C1559m;
import f3.C2196b;
import gx.AbstractC2747a;
import he.C2914e;
import lw.C4554s;
import nf.C5047i;
import og.d2;
import og.ze;
import pg.w9;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6745a;
import t3.InterfaceC7023j;
import t3.a1;
import t3.c1;
import t3.i0;
import t3.k0;
import t3.l0;
import t3.w0;
import v3.InterfaceC7644p;
import v3.InterfaceC7652x;
import v3.n0;
import w2.AbstractC7878q;
import w2.InterfaceC7866e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xd.o */
/* loaded from: classes.dex */
public final class C8344o extends AbstractC7878q implements InterfaceC7644p, InterfaceC7652x {

    /* renamed from: q */
    public C8339j f39959q;

    /* renamed from: r */
    public InterfaceC7866e f39960r;

    /* renamed from: s */
    public InterfaceC7023j f39961s;

    /* renamed from: t */
    public float f39962t;

    /* renamed from: v */
    public C1559m f39963v;

    @Override // w2.AbstractC7878q
    public final boolean A0() {
        return false;
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: H */
    public final int mo146H(n0 n0Var, i0 i0Var, int i10) {
        if (this.f39959q.mo7533h() == 9205357640488583168L) {
            return i0Var.a0(i10);
        }
        int iA0 = i0Var.a0(C6745a.m12918i(M0(AbstractC6746b.m12924b(i10, 0, 13))));
        return Math.max(AbstractC2747a.m6747k(C0850e.m2291b(L0(d2.m10598a(i10, iA0)))), iA0);
    }

    public final long L0(long j6) {
        if (C0850e.m2294e(j6)) {
            return 0L;
        }
        long jMo7533h = this.f39959q.mo7533h();
        if (jMo7533h == 9205357640488583168L) {
            return j6;
        }
        float fM2293d = C0850e.m2293d(jMo7533h);
        if (Float.isInfinite(fM2293d) || Float.isNaN(fM2293d)) {
            fM2293d = C0850e.m2293d(j6);
        }
        float fM2291b = C0850e.m2291b(jMo7533h);
        if (Float.isInfinite(fM2291b) || Float.isNaN(fM2291b)) {
            fM2291b = C0850e.m2291b(j6);
        }
        long jM10598a = d2.m10598a(fM2293d, fM2291b);
        long jMo13315a = this.f39961s.mo13315a(jM10598a, j6);
        int i10 = a1.f33955a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo13315a >> 32));
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            return j6;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jMo13315a));
        return (Float.isInfinite(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat2)) ? j6 : c1.m13281j(jM10598a, jMo13315a);
    }

    public final long M0(long j6) {
        float fM12920k;
        int iM12919j;
        float fM11911b;
        boolean zM12916g = C6745a.m12916g(j6);
        boolean zM12915f = C6745a.m12915f(j6);
        if (!zM12916g || !zM12915f) {
            boolean z6 = C6745a.m12914e(j6) && C6745a.m12913d(j6);
            long jMo7533h = this.f39959q.mo7533h();
            if (jMo7533h != 9205357640488583168L) {
                if (z6 && (zM12916g || zM12915f)) {
                    fM12920k = C6745a.m12918i(j6);
                    iM12919j = C6745a.m12917h(j6);
                } else {
                    float fM2293d = C0850e.m2293d(jMo7533h);
                    float fM2291b = C0850e.m2291b(jMo7533h);
                    if (Float.isInfinite(fM2293d) || Float.isNaN(fM2293d)) {
                        fM12920k = C6745a.m12920k(j6);
                    } else {
                        C2914e c2914e = AbstractC8348s.f39967b;
                        fM12920k = w9.m11911b(fM2293d, C6745a.m12920k(j6), C6745a.m12918i(j6));
                    }
                    if (!Float.isInfinite(fM2291b) && !Float.isNaN(fM2291b)) {
                        C2914e c2914e2 = AbstractC8348s.f39967b;
                        fM11911b = w9.m11911b(fM2291b, C6745a.m12919j(j6), C6745a.m12917h(j6));
                        long jL0 = L0(d2.m10598a(fM12920k, fM11911b));
                        return C6745a.m12911b(j6, AbstractC6746b.m12929g(AbstractC2747a.m6747k(C0850e.m2293d(jL0)), j6), 0, AbstractC6746b.m12928f(AbstractC2747a.m6747k(C0850e.m2291b(jL0)), j6), 0, 10);
                    }
                    iM12919j = C6745a.m12919j(j6);
                }
                fM11911b = iM12919j;
                long jL02 = L0(d2.m10598a(fM12920k, fM11911b));
                return C6745a.m12911b(j6, AbstractC6746b.m12929g(AbstractC2747a.m6747k(C0850e.m2293d(jL02)), j6), 0, AbstractC6746b.m12928f(AbstractC2747a.m6747k(C0850e.m2291b(jL02)), j6), 0, 10);
            }
            if (z6) {
                return C6745a.m12911b(j6, C6745a.m12918i(j6), 0, C6745a.m12917h(j6), 0, 10);
            }
        }
        return j6;
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: V */
    public final int mo147V(n0 n0Var, i0 i0Var, int i10) {
        if (this.f39959q.mo7533h() == 9205357640488583168L) {
            return i0Var.mo13311b(i10);
        }
        int iMo13311b = i0Var.mo13311b(C6745a.m12918i(M0(AbstractC6746b.m12924b(i10, 0, 13))));
        return Math.max(AbstractC2747a.m6747k(C0850e.m2291b(L0(d2.m10598a(i10, iMo13311b)))), iMo13311b);
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final k0 mo148b(l0 l0Var, i0 i0Var, long j6) {
        w0 w0VarMo13314z = i0Var.mo13314z(M0(j6));
        return l0Var.g0(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b, C6669s.f31944a, new C4554s(w0VarMo13314z, 2));
    }

    @Override // v3.InterfaceC7644p
    public final void h0(v3.i0 i0Var) {
        C2196b c2196b = i0Var.f36917a;
        long jL0 = L0(c2196b.mo5913e());
        InterfaceC7866e interfaceC7866e = this.f39960r;
        C2914e c2914e = AbstractC8348s.f39967b;
        long jM11095a = ze.m11095a(AbstractC2747a.m6747k(C0850e.m2293d(jL0)), AbstractC2747a.m6747k(C0850e.m2291b(jL0)));
        long jMo5913e = c2196b.mo5913e();
        long jMo14848a = interfaceC7866e.mo14848a(jM11095a, ze.m11095a(AbstractC2747a.m6747k(C0850e.m2293d(jMo5913e)), AbstractC2747a.m6747k(C0850e.m2291b(jMo5913e))), i0Var.getLayoutDirection());
        float f6 = (int) (jMo14848a >> 32);
        float f10 = (int) (jMo14848a & 4294967295L);
        ((C5047i) c2196b.f10124b.f24b).m9985W(f6, f10);
        this.f39959q.m7536g(i0Var, jL0, this.f39962t, this.f39963v);
        ((C5047i) c2196b.f10124b.f24b).m9985W(-f6, -f10);
        i0Var.m14622b();
    }

    @Override // v3.InterfaceC7652x
    public final int k0(n0 n0Var, i0 i0Var, int i10) {
        if (this.f39959q.mo7533h() == 9205357640488583168L) {
            return i0Var.mo13313y(i10);
        }
        int iMo13313y = i0Var.mo13313y(C6745a.m12917h(M0(AbstractC6746b.m12924b(0, i10, 7))));
        return Math.max(AbstractC2747a.m6747k(C0850e.m2293d(L0(d2.m10598a(iMo13313y, i10)))), iMo13313y);
    }

    @Override // v3.InterfaceC7652x
    public final int x0(n0 n0Var, i0 i0Var, int i10) {
        if (this.f39959q.mo7533h() == 9205357640488583168L) {
            return i0Var.mo13312x(i10);
        }
        int iMo13312x = i0Var.mo13312x(C6745a.m12917h(M0(AbstractC6746b.m12924b(0, i10, 7))));
        return Math.max(AbstractC2747a.m6747k(C0850e.m2293d(L0(d2.m10598a(iMo13312x, i10)))), iMo13312x);
    }
}
