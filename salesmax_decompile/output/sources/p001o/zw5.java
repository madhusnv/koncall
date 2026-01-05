package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class zw5 extends rhd {

    /* renamed from: a */
    public double[] f57805a;

    /* renamed from: b */
    public int f57806b;

    public zw5(double[] dArr) {
        sq8.m48649h(dArr, "bufferWithData");
        this.f57805a = dArr;
        this.f57806b = dArr.length;
        mo17042b(10);
    }

    @Override // p001o.rhd
    /* renamed from: b */
    public void mo17042b(int i) {
        double[] dArr = this.f57805a;
        if (dArr.length < i) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, bce.m18601d(i, dArr.length * 2));
            sq8.m48648g(dArrCopyOf, "copyOf(...)");
            this.f57805a = dArrCopyOf;
        }
    }

    @Override // p001o.rhd
    /* renamed from: d */
    public int mo17043d() {
        return this.f57806b;
    }

    /* renamed from: e */
    public final void m59989e(double d) {
        rhd.m46778c(this, 0, 1, null);
        double[] dArr = this.f57805a;
        int iMo17043d = mo17043d();
        this.f57806b = iMo17043d + 1;
        dArr[iMo17043d] = d;
    }

    @Override // p001o.rhd
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] mo17041a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f57805a, mo17043d());
        sq8.m48648g(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }
}
