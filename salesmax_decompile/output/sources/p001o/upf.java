package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class upf extends rhd {

    /* renamed from: a */
    public short[] f49363a;

    /* renamed from: b */
    public int f49364b;

    public upf(short[] sArr) {
        sq8.m48649h(sArr, "bufferWithData");
        this.f49363a = sArr;
        this.f49364b = sArr.length;
        mo17042b(10);
    }

    @Override // p001o.rhd
    /* renamed from: b */
    public void mo17042b(int i) {
        short[] sArr = this.f49363a;
        if (sArr.length < i) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, bce.m18601d(i, sArr.length * 2));
            sq8.m48648g(sArrCopyOf, "copyOf(...)");
            this.f49363a = sArrCopyOf;
        }
    }

    @Override // p001o.rhd
    /* renamed from: d */
    public int mo17043d() {
        return this.f49364b;
    }

    /* renamed from: e */
    public final void m51912e(short s) {
        rhd.m46778c(this, 0, 1, null);
        short[] sArr = this.f49363a;
        int iMo17043d = mo17043d();
        this.f49364b = iMo17043d + 1;
        sArr[iMo17043d] = s;
    }

    @Override // p001o.rhd
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] mo17041a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f49363a, mo17043d());
        sq8.m48648g(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }
}
