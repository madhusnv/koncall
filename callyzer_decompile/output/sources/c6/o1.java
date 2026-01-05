package c6;

import og.fa;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class o1 {

    /* renamed from: a */
    public final y1 f5492a;

    /* renamed from: b */
    public C7340b[] f5493b;

    public o1() {
        this(new y1((y1) null));
    }

    /* renamed from: a */
    public final void m2464a() {
        C7340b[] c7340bArr = this.f5493b;
        if (c7340bArr != null) {
            C7340b c7340bMo2475g = c7340bArr[0];
            C7340b c7340bMo2475g2 = c7340bArr[1];
            y1 y1Var = this.f5492a;
            if (c7340bMo2475g2 == null) {
                c7340bMo2475g2 = y1Var.f5541a.mo2475g(2);
            }
            if (c7340bMo2475g == null) {
                c7340bMo2475g = y1Var.f5541a.mo2475g(1);
            }
            mo2432g(C7340b.m13735a(c7340bMo2475g, c7340bMo2475g2));
            C7340b c7340b = this.f5493b[fa.m10642a(16)];
            if (c7340b != null) {
                mo2446f(c7340b);
            }
            C7340b c7340b2 = this.f5493b[fa.m10642a(32)];
            if (c7340b2 != null) {
                mo2445d(c7340b2);
            }
            C7340b c7340b3 = this.f5493b[fa.m10642a(64)];
            if (c7340b3 != null) {
                mo2447h(c7340b3);
            }
        }
    }

    /* renamed from: b */
    public abstract y1 mo2430b();

    /* renamed from: c */
    public void mo2448c(int i10, C7340b c7340b) {
        if (this.f5493b == null) {
            this.f5493b = new C7340b[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f5493b[fa.m10642a(i11)] = c7340b;
            }
        }
    }

    /* renamed from: e */
    public abstract void mo2431e(C7340b c7340b);

    /* renamed from: g */
    public abstract void mo2432g(C7340b c7340b);

    public o1(y1 y1Var) {
        this.f5492a = y1Var;
    }

    /* renamed from: d */
    public void mo2445d(C7340b c7340b) {
    }

    /* renamed from: f */
    public void mo2446f(C7340b c7340b) {
    }

    /* renamed from: h */
    public void mo2447h(C7340b c7340b) {
    }
}
