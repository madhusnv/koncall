package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class ck1 extends rhd {

    /* renamed from: a */
    public boolean[] f18262a;

    /* renamed from: b */
    public int f18263b;

    public ck1(boolean[] zArr) {
        sq8.m48649h(zArr, "bufferWithData");
        this.f18262a = zArr;
        this.f18263b = zArr.length;
        mo17042b(10);
    }

    @Override // p001o.rhd
    /* renamed from: b */
    public void mo17042b(int i) {
        boolean[] zArr = this.f18262a;
        if (zArr.length < i) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, bce.m18601d(i, zArr.length * 2));
            sq8.m48648g(zArrCopyOf, "copyOf(...)");
            this.f18262a = zArrCopyOf;
        }
    }

    @Override // p001o.rhd
    /* renamed from: d */
    public int mo17043d() {
        return this.f18263b;
    }

    /* renamed from: e */
    public final void m21332e(boolean z) {
        rhd.m46778c(this, 0, 1, null);
        boolean[] zArr = this.f18262a;
        int iMo17043d = mo17043d();
        this.f18263b = iMo17043d + 1;
        zArr[iMo17043d] = z;
    }

    @Override // p001o.rhd
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] mo17041a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f18262a, mo17043d());
        sq8.m48648g(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }
}
