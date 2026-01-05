package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class z27 extends rhd {

    /* renamed from: a */
    public float[] f56433a;

    /* renamed from: b */
    public int f56434b;

    public z27(float[] fArr) {
        sq8.m48649h(fArr, "bufferWithData");
        this.f56433a = fArr;
        this.f56434b = fArr.length;
        mo17042b(10);
    }

    @Override // p001o.rhd
    /* renamed from: b */
    public void mo17042b(int i) {
        float[] fArr = this.f56433a;
        if (fArr.length < i) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, bce.m18601d(i, fArr.length * 2));
            sq8.m48648g(fArrCopyOf, "copyOf(...)");
            this.f56433a = fArrCopyOf;
        }
    }

    @Override // p001o.rhd
    /* renamed from: d */
    public int mo17043d() {
        return this.f56434b;
    }

    /* renamed from: e */
    public final void m58657e(float f) {
        rhd.m46778c(this, 0, 1, null);
        float[] fArr = this.f56433a;
        int iMo17043d = mo17043d();
        this.f56434b = iMo17043d + 1;
        fArr[iMo17043d] = f;
    }

    @Override // p001o.rhd
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] mo17041a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f56433a, mo17043d());
        sq8.m48648g(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }
}
