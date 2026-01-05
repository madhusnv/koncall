package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class yk8 extends rhd {

    /* renamed from: a */
    public int[] f55635a;

    /* renamed from: b */
    public int f55636b;

    public yk8(int[] iArr) {
        sq8.m48649h(iArr, "bufferWithData");
        this.f55635a = iArr;
        this.f55636b = iArr.length;
        mo17042b(10);
    }

    @Override // p001o.rhd
    /* renamed from: b */
    public void mo17042b(int i) {
        int[] iArr = this.f55635a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, bce.m18601d(i, iArr.length * 2));
            sq8.m48648g(iArrCopyOf, "copyOf(...)");
            this.f55635a = iArrCopyOf;
        }
    }

    @Override // p001o.rhd
    /* renamed from: d */
    public int mo17043d() {
        return this.f55636b;
    }

    /* renamed from: e */
    public final void m57918e(int i) {
        rhd.m46778c(this, 0, 1, null);
        int[] iArr = this.f55635a;
        int iMo17043d = mo17043d();
        this.f55636b = iMo17043d + 1;
        iArr[iMo17043d] = i;
    }

    @Override // p001o.rhd
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] mo17041a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f55635a, mo17043d());
        sq8.m48648g(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
