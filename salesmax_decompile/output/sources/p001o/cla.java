package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class cla extends rhd {

    /* renamed from: a */
    public long[] f18294a;

    /* renamed from: b */
    public int f18295b;

    public cla(long[] jArr) {
        sq8.m48649h(jArr, "bufferWithData");
        this.f18294a = jArr;
        this.f18295b = jArr.length;
        mo17042b(10);
    }

    @Override // p001o.rhd
    /* renamed from: b */
    public void mo17042b(int i) {
        long[] jArr = this.f18294a;
        if (jArr.length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, bce.m18601d(i, jArr.length * 2));
            sq8.m48648g(jArrCopyOf, "copyOf(...)");
            this.f18294a = jArrCopyOf;
        }
    }

    @Override // p001o.rhd
    /* renamed from: d */
    public int mo17043d() {
        return this.f18295b;
    }

    /* renamed from: e */
    public final void m21379e(long j) {
        rhd.m46778c(this, 0, 1, null);
        long[] jArr = this.f18294a;
        int iMo17043d = mo17043d();
        this.f18295b = iMo17043d + 1;
        jArr[iMo17043d] = j;
    }

    @Override // p001o.rhd
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] mo17041a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f18294a, mo17043d());
        sq8.m48648g(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }
}
