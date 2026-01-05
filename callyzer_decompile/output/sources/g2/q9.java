package g2;

import d3.C1565s;
import f2.AbstractC2188k;
import f2.C2181d;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.C3977z;
import k2.InterfaceC3962k;
import s4.C6750f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class q9 {

    /* renamed from: a */
    public static final k2.i2 f12510a = new k2.i2(w1.f13087t);

    /* renamed from: b */
    public static final C3977z f12511b = new C3977z(w1.f13086s);

    /* renamed from: c */
    public static final r9 f12512c;

    /* renamed from: d */
    public static final r9 f12513d;

    static {
        long j6 = C1565s.f7817j;
        f12512c = new r9(true, Float.NaN, j6);
        f12513d = new r9(false, Float.NaN, j6);
    }

    /* renamed from: a */
    public static final r9 m6289a(boolean z6, float f6, long j6) {
        return (C6750f.m12935a(f6, Float.NaN) && C1565s.m5187c(j6, C1565s.f7817j)) ? z6 ? f12512c : f12513d : new r9(z6, f6, j6);
    }

    /* renamed from: b */
    public static r9 m6290b(int i10, long j6) {
        boolean z6 = (i10 & 1) != 0;
        if ((i10 & 4) != 0) {
            j6 = C1565s.f7817j;
        }
        return m6289a(z6, Float.NaN, j6);
    }

    /* renamed from: c */
    public static final i1.p0 m6291c(boolean z6, float f6, long j6, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        i1.p0 p0VarM6289a;
        boolean z10 = true;
        if ((i11 & 1) != 0) {
            z6 = true;
        }
        if ((i11 & 2) != 0) {
            f6 = Float.NaN;
        }
        if ((i11 & 4) != 0) {
            j6 = C1565s.f7817j;
        }
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8607Y(-1280632857);
        if (((Boolean) c3966o.m8618k(f12510a)).booleanValue()) {
            h1.w1 w1Var = AbstractC2188k.f10100a;
            k2.w0 w0VarM8520w = C3953b.m8520w(new C1565s(j6), c3966o);
            boolean z11 = (((i10 & 14) ^ 6) > 4 && c3966o.m8615h(z6)) || (i10 & 6) == 4;
            if ((((i10 & 112) ^ 48) <= 32 || !c3966o.m8611d(f6)) && (i10 & 48) != 32) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object objM8596M = c3966o.m8596M();
            if (z12 || objM8596M == C3961j.f20408a) {
                objM8596M = new C2181d(z6, f6, w0VarM8520w);
                c3966o.j0(objM8596M);
            }
            p0VarM6289a = (C2181d) objM8596M;
        } else {
            p0VarM6289a = m6289a(z6, f6, j6);
        }
        c3966o.m8623p(false);
        return p0VarM6289a;
    }
}
