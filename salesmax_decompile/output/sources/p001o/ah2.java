package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class ah2 extends rhd {

    /* renamed from: a */
    public char[] f14704a;

    /* renamed from: b */
    public int f14705b;

    public ah2(char[] cArr) {
        sq8.m48649h(cArr, "bufferWithData");
        this.f14704a = cArr;
        this.f14705b = cArr.length;
        mo17042b(10);
    }

    @Override // p001o.rhd
    /* renamed from: b */
    public void mo17042b(int i) {
        char[] cArr = this.f14704a;
        if (cArr.length < i) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, bce.m18601d(i, cArr.length * 2));
            sq8.m48648g(cArrCopyOf, "copyOf(...)");
            this.f14704a = cArrCopyOf;
        }
    }

    @Override // p001o.rhd
    /* renamed from: d */
    public int mo17043d() {
        return this.f14705b;
    }

    /* renamed from: e */
    public final void m17044e(char c) {
        rhd.m46778c(this, 0, 1, null);
        char[] cArr = this.f14704a;
        int iMo17043d = mo17043d();
        this.f14705b = iMo17043d + 1;
        cArr[iMo17043d] = c;
    }

    @Override // p001o.rhd
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] mo17041a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f14704a, mo17043d());
        sq8.m48648g(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }
}
