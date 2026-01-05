package o1;

import a2.C0037j;
import androidx.compose.foundation.layout.AbstractC0242a;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.AbstractC6753i;
import s4.C6745a;
import s4.C6756l;
import v3.InterfaceC7652x;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.k */
/* loaded from: classes.dex */
public final class C5252k extends AbstractC7878q implements InterfaceC7652x {

    /* renamed from: q */
    public float f25775q;

    @Override // v3.InterfaceC7652x
    /* renamed from: H */
    public final int mo146H(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f25775q) : i0Var.a0(i10);
    }

    public final long L0(boolean z6, long j6) {
        int iRound;
        int iM12917h = C6745a.m12917h(j6);
        if (iM12917h == Integer.MAX_VALUE || (iRound = Math.round(iM12917h * this.f25775q)) <= 0) {
            return 0L;
        }
        if (!z6 || AbstractC0242a.m653g(iRound, iM12917h, j6)) {
            return (iRound << 32) | (iM12917h & 4294967295L);
        }
        return 0L;
    }

    public final long M0(boolean z6, long j6) {
        int iRound;
        int iM12918i = C6745a.m12918i(j6);
        if (iM12918i == Integer.MAX_VALUE || (iRound = Math.round(iM12918i / this.f25775q)) <= 0) {
            return 0L;
        }
        if (!z6 || AbstractC0242a.m653g(iM12918i, iRound, j6)) {
            return (iM12918i << 32) | (iRound & 4294967295L);
        }
        return 0L;
    }

    public final long N0(boolean z6, long j6) {
        int iM12919j = C6745a.m12919j(j6);
        int iRound = Math.round(iM12919j * this.f25775q);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z6 || AbstractC0242a.m653g(iRound, iM12919j, j6)) {
            return (iRound << 32) | (iM12919j & 4294967295L);
        }
        return 0L;
    }

    public final long O0(boolean z6, long j6) {
        int iM12920k = C6745a.m12920k(j6);
        int iRound = Math.round(iM12920k / this.f25775q);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z6 || AbstractC0242a.m653g(iM12920k, iRound, j6)) {
            return (iM12920k << 32) | (iRound & 4294967295L);
        }
        return 0L;
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: V */
    public final int mo147V(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 / this.f25775q) : i0Var.mo13311b(i10);
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        long jM0 = M0(true, j6);
        if (C6756l.m12948a(jM0, 0L)) {
            jM0 = L0(true, j6);
            if (C6756l.m12948a(jM0, 0L)) {
                jM0 = O0(true, j6);
                if (C6756l.m12948a(jM0, 0L)) {
                    jM0 = N0(true, j6);
                    if (C6756l.m12948a(jM0, 0L)) {
                        jM0 = M0(false, j6);
                        if (C6756l.m12948a(jM0, 0L)) {
                            jM0 = L0(false, j6);
                            if (C6756l.m12948a(jM0, 0L)) {
                                jM0 = O0(false, j6);
                                if (C6756l.m12948a(jM0, 0L)) {
                                    jM0 = N0(false, j6);
                                    if (C6756l.m12948a(jM0, 0L)) {
                                        jM0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!C6756l.m12948a(jM0, 0L)) {
            int i10 = (int) (jM0 >> 32);
            int i11 = (int) (jM0 & 4294967295L);
            if (!((i11 >= 0) & (i10 >= 0))) {
                AbstractC6753i.m12938a("width and height must be >= 0");
            }
            j6 = AbstractC6746b.m12930h(i10, i10, i11, i11);
        }
        t3.w0 w0VarMo13314z = i0Var.mo13314z(j6);
        return l0Var.g0(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b, C6669s.f31944a, new C0037j(w0VarMo13314z, 7));
    }

    @Override // v3.InterfaceC7652x
    public final int k0(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f25775q) : i0Var.mo13313y(i10);
    }

    @Override // v3.InterfaceC7652x
    public final int x0(v3.n0 n0Var, t3.i0 i0Var, int i10) {
        return i10 != Integer.MAX_VALUE ? Math.round(i10 * this.f25775q) : i0Var.mo13312x(i10);
    }
}
