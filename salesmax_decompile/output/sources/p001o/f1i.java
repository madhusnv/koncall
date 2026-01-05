package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class f1i extends rhd {

    /* renamed from: a */
    public short[] f22552a;

    /* renamed from: b */
    public int f22553b;

    public /* synthetic */ f1i(short[] sArr, id5 id5Var) {
        this(sArr);
    }

    @Override // p001o.rhd
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo17041a() {
        return e1i.m24124d(m25950f());
    }

    @Override // p001o.rhd
    /* renamed from: b */
    public void mo17042b(int i) {
        if (e1i.m24131y(this.f22552a) < i) {
            short[] sArr = this.f22552a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, bce.m18601d(i, e1i.m24131y(sArr) * 2));
            sq8.m48648g(sArrCopyOf, "copyOf(...)");
            this.f22552a = e1i.m24126j(sArrCopyOf);
        }
    }

    @Override // p001o.rhd
    /* renamed from: d */
    public int mo17043d() {
        return this.f22553b;
    }

    /* renamed from: e */
    public final void m25949e(short s) {
        rhd.m46778c(this, 0, 1, null);
        short[] sArr = this.f22552a;
        int iMo17043d = mo17043d();
        this.f22553b = iMo17043d + 1;
        e1i.m24122G(sArr, iMo17043d, s);
    }

    /* renamed from: f */
    public short[] m25950f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f22552a, mo17043d());
        sq8.m48648g(sArrCopyOf, "copyOf(...)");
        return e1i.m24126j(sArrCopyOf);
    }

    public f1i(short[] sArr) {
        sq8.m48649h(sArr, "bufferWithData");
        this.f22552a = sArr;
        this.f22553b = e1i.m24131y(sArr);
        mo17042b(10);
    }
}
