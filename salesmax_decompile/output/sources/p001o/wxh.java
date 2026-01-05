package p001o;

import p001o.uth;

/* loaded from: classes2.dex */
public final class wxh {

    /* renamed from: a */
    public final byte[] f52866a = new byte[10];

    /* renamed from: b */
    public boolean f52867b;

    /* renamed from: c */
    public int f52868c;

    /* renamed from: d */
    public long f52869d;

    /* renamed from: e */
    public int f52870e;

    /* renamed from: f */
    public int f52871f;

    /* renamed from: g */
    public int f52872g;

    /* renamed from: a */
    public void m55379a(uth uthVar, uth.C17452a c17452a) {
        if (this.f52868c > 0) {
            uthVar.mo7071a(this.f52869d, this.f52870e, this.f52871f, this.f52872g, c17452a);
            this.f52868c = 0;
        }
    }

    /* renamed from: b */
    public void m55380b() {
        this.f52867b = false;
        this.f52868c = 0;
    }

    /* renamed from: c */
    public void m55381c(uth uthVar, long j, int i, int i2, int i3, uth.C17452a c17452a) {
        op0.m42518h(this.f52872g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f52867b) {
            int i4 = this.f52868c;
            int i5 = i4 + 1;
            this.f52868c = i5;
            if (i4 == 0) {
                this.f52869d = j;
                this.f52870e = i;
                this.f52871f = 0;
            }
            this.f52871f += i2;
            this.f52872g = i3;
            if (i5 >= 16) {
                m55379a(uthVar, c17452a);
            }
        }
    }

    /* renamed from: d */
    public void m55382d(uq6 uq6Var) {
        if (this.f52867b) {
            return;
        }
        uq6Var.mo40498m(this.f52866a, 0, 10);
        uq6Var.mo40490c();
        if (fa.m26331j(this.f52866a) == 0) {
            return;
        }
        this.f52867b = true;
    }
}
