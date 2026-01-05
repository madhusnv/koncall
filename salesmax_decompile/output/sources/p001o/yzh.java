package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class yzh extends rhd {

    /* renamed from: a */
    public byte[] f56341a;

    /* renamed from: b */
    public int f56342b;

    public /* synthetic */ yzh(byte[] bArr, id5 id5Var) {
        this(bArr);
    }

    @Override // p001o.rhd
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo17041a() {
        return xzh.m57053d(m58583f());
    }

    @Override // p001o.rhd
    /* renamed from: b */
    public void mo17042b(int i) {
        if (xzh.m57060y(this.f56341a) < i) {
            byte[] bArr = this.f56341a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bce.m18601d(i, xzh.m57060y(bArr) * 2));
            sq8.m48648g(bArrCopyOf, "copyOf(...)");
            this.f56341a = xzh.m57055j(bArrCopyOf);
        }
    }

    @Override // p001o.rhd
    /* renamed from: d */
    public int mo17043d() {
        return this.f56342b;
    }

    /* renamed from: e */
    public final void m58582e(byte b) {
        rhd.m46778c(this, 0, 1, null);
        byte[] bArr = this.f56341a;
        int iMo17043d = mo17043d();
        this.f56342b = iMo17043d + 1;
        xzh.m57051G(bArr, iMo17043d, b);
    }

    /* renamed from: f */
    public byte[] m58583f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f56341a, mo17043d());
        sq8.m48648g(bArrCopyOf, "copyOf(...)");
        return xzh.m57055j(bArrCopyOf);
    }

    public yzh(byte[] bArr) {
        sq8.m48649h(bArr, "bufferWithData");
        this.f56341a = bArr;
        this.f56342b = xzh.m57060y(bArr);
        mo17042b(10);
    }
}
