package j3;

import a1.C0005d;
import a3.C0045d;
import d3.AbstractC1558l;
import d3.AbstractC1561o;
import d3.C1555i;
import d3.C1565s;
import d3.n0;
import ex.InterfaceC2139c;
import f3.InterfaceC2198d;
import i0.m0;
import java.util.ArrayList;
import java.util.List;
import nf.C5047i;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.c */
/* loaded from: classes.dex */
public final class C3549c extends d0 {

    /* renamed from: b */
    public float[] f18943b;

    /* renamed from: c */
    public final ArrayList f18944c = new ArrayList();

    /* renamed from: d */
    public boolean f18945d = true;

    /* renamed from: e */
    public long f18946e = C1565s.f7817j;

    /* renamed from: f */
    public List f18947f;

    /* renamed from: g */
    public boolean f18948g;

    /* renamed from: h */
    public C1555i f18949h;

    /* renamed from: i */
    public InterfaceC2139c f18950i;

    /* renamed from: j */
    public final C0045d f18951j;

    /* renamed from: k */
    public String f18952k;

    /* renamed from: l */
    public float f18953l;

    /* renamed from: m */
    public float f18954m;

    /* renamed from: n */
    public float f18955n;

    /* renamed from: o */
    public float f18956o;

    /* renamed from: p */
    public float f18957p;

    /* renamed from: q */
    public float f18958q;

    /* renamed from: r */
    public float f18959r;

    /* renamed from: s */
    public boolean f18960s;

    public C3549c() {
        int i10 = h0.f19025a;
        this.f18947f = C6668r.f31943a;
        this.f18948g = true;
        this.f18951j = new C0045d(17, this);
        this.f18952k = "";
        this.f18956o = 1.0f;
        this.f18957p = 1.0f;
        this.f18960s = true;
    }

    @Override // j3.d0
    /* renamed from: a */
    public final void mo8083a(InterfaceC2198d interfaceC2198d) {
        if (this.f18960s) {
            float[] fArrM5094a = this.f18943b;
            if (fArrM5094a == null) {
                fArrM5094a = d3.b0.m5094a();
                this.f18943b = fArrM5094a;
            } else {
                d3.b0.m5097d(fArrM5094a);
            }
            d3.b0.m5099f(fArrM5094a, this.f18958q + this.f18954m, this.f18959r + this.f18955n);
            float f6 = this.f18953l;
            if (fArrM5094a.length >= 16) {
                double d2 = f6 * 0.017453292519943295d;
                float fSin = (float) Math.sin(d2);
                float fCos = (float) Math.cos(d2);
                float f10 = fArrM5094a[0];
                float f11 = fArrM5094a[4];
                float f12 = (fSin * f11) + (fCos * f10);
                float f13 = -fSin;
                float f14 = (f11 * fCos) + (f10 * f13);
                float f15 = fArrM5094a[1];
                float f16 = fArrM5094a[5];
                float f17 = (fSin * f16) + (fCos * f15);
                float f18 = (f16 * fCos) + (f15 * f13);
                float f19 = fArrM5094a[2];
                float f20 = fArrM5094a[6];
                float f21 = (fSin * f20) + (fCos * f19);
                float f22 = (f20 * fCos) + (f19 * f13);
                float f23 = fArrM5094a[3];
                float f24 = fArrM5094a[7];
                fArrM5094a[0] = f12;
                fArrM5094a[1] = f17;
                fArrM5094a[2] = f21;
                fArrM5094a[3] = (fSin * f24) + (fCos * f23);
                fArrM5094a[4] = f14;
                fArrM5094a[5] = f18;
                fArrM5094a[6] = f22;
                fArrM5094a[7] = (fCos * f24) + (f13 * f23);
            }
            float f25 = this.f18956o;
            float f26 = this.f18957p;
            if (fArrM5094a.length >= 16) {
                fArrM5094a[0] = fArrM5094a[0] * f25;
                fArrM5094a[1] = fArrM5094a[1] * f25;
                fArrM5094a[2] = fArrM5094a[2] * f25;
                fArrM5094a[3] = fArrM5094a[3] * f25;
                fArrM5094a[4] = fArrM5094a[4] * f26;
                fArrM5094a[5] = fArrM5094a[5] * f26;
                fArrM5094a[6] = fArrM5094a[6] * f26;
                fArrM5094a[7] = fArrM5094a[7] * f26;
                fArrM5094a[8] = fArrM5094a[8] * 1.0f;
                fArrM5094a[9] = fArrM5094a[9] * 1.0f;
                fArrM5094a[10] = fArrM5094a[10] * 1.0f;
                fArrM5094a[11] = fArrM5094a[11] * 1.0f;
            }
            d3.b0.m5099f(fArrM5094a, -this.f18954m, -this.f18955n);
            this.f18960s = false;
        }
        if (this.f18948g) {
            if (!this.f18947f.isEmpty()) {
                C1555i c1555iM5178a = this.f18949h;
                if (c1555iM5178a == null) {
                    c1555iM5178a = AbstractC1558l.m5178a();
                    this.f18949h = c1555iM5178a;
                }
                AbstractC3548b.m8082d(this.f18947f, c1555iM5178a);
            }
            this.f18948g = false;
        }
        C0005d c0005dMo5899X = interfaceC2198d.mo5899X();
        long jM81z = c0005dMo5899X.m81z();
        c0005dMo5899X.m75t().mo5107i();
        try {
            C0005d c0005d = (C0005d) ((C5047i) c0005dMo5899X.f24b).f24823b;
            float[] fArr = this.f18943b;
            if (fArr != null) {
                c0005d.m75t().mo5109k(fArr);
            }
            C1555i c1555i = this.f18949h;
            if (!this.f18947f.isEmpty() && c1555i != null) {
                c0005d.m75t().mo5110l(c1555i);
            }
            ArrayList arrayList = this.f18944c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((d0) arrayList.get(i10)).mo8083a(interfaceC2198d);
            }
        } finally {
            m0.m7392y(c0005dMo5899X, jM81z);
        }
    }

    @Override // j3.d0
    /* renamed from: b */
    public final InterfaceC2139c mo8084b() {
        return this.f18950i;
    }

    @Override // j3.d0
    /* renamed from: d */
    public final void mo8085d(C0045d c0045d) {
        this.f18950i = c0045d;
    }

    /* renamed from: e */
    public final void m8086e(int i10, d0 d0Var) {
        ArrayList arrayList = this.f18944c;
        if (i10 < arrayList.size()) {
            arrayList.set(i10, d0Var);
        } else {
            arrayList.add(d0Var);
        }
        m8088g(d0Var);
        d0Var.mo8085d(this.f18951j);
        m8089c();
    }

    /* renamed from: f */
    public final void m8087f(long j6) {
        if (this.f18945d && j6 != 16) {
            long j10 = this.f18946e;
            if (j10 == 16) {
                this.f18946e = j6;
                return;
            }
            int i10 = h0.f19025a;
            if (C1565s.m5192h(j10) == C1565s.m5192h(j6) && C1565s.m5191g(j10) == C1565s.m5191g(j6) && C1565s.m5189e(j10) == C1565s.m5189e(j6)) {
                return;
            }
            this.f18945d = false;
            this.f18946e = C1565s.f7817j;
        }
    }

    /* renamed from: g */
    public final void m8088g(d0 d0Var) {
        if (!(d0Var instanceof C3555i)) {
            if (d0Var instanceof C3549c) {
                C3549c c3549c = (C3549c) d0Var;
                if (c3549c.f18945d && this.f18945d) {
                    m8087f(c3549c.f18946e);
                    return;
                } else {
                    this.f18945d = false;
                    this.f18946e = C1565s.f7817j;
                    return;
                }
            }
            return;
        }
        C3555i c3555i = (C3555i) d0Var;
        AbstractC1561o abstractC1561o = c3555i.f19026b;
        if (this.f18945d && abstractC1561o != null) {
            if (abstractC1561o instanceof n0) {
                m8087f(((n0) abstractC1561o).f7801a);
            } else {
                this.f18945d = false;
                this.f18946e = C1565s.f7817j;
            }
        }
        AbstractC1561o abstractC1561o2 = c3555i.f19031g;
        if (this.f18945d && abstractC1561o2 != null) {
            if (abstractC1561o2 instanceof n0) {
                m8087f(((n0) abstractC1561o2).f7801a);
            } else {
                this.f18945d = false;
                this.f18946e = C1565s.f7817j;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f18952k);
        ArrayList arrayList = this.f18944c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d0 d0Var = (d0) arrayList.get(i10);
            sb2.append("\t");
            sb2.append(d0Var.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
