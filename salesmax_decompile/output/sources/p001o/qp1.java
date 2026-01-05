package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class qp1 extends rhd {

    /* renamed from: a */
    public byte[] f42257a;

    /* renamed from: b */
    public int f42258b;

    public qp1(byte[] bArr) {
        sq8.m48649h(bArr, "bufferWithData");
        this.f42257a = bArr;
        this.f42258b = bArr.length;
        mo17042b(10);
    }

    @Override // p001o.rhd
    /* renamed from: b */
    public void mo17042b(int i) {
        byte[] bArr = this.f42257a;
        if (bArr.length < i) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bce.m18601d(i, bArr.length * 2));
            sq8.m48648g(bArrCopyOf, "copyOf(...)");
            this.f42257a = bArrCopyOf;
        }
    }

    @Override // p001o.rhd
    /* renamed from: d */
    public int mo17043d() {
        return this.f42258b;
    }

    /* renamed from: e */
    public final void m45740e(byte b) {
        rhd.m46778c(this, 0, 1, null);
        byte[] bArr = this.f42257a;
        int iMo17043d = mo17043d();
        this.f42258b = iMo17043d + 1;
        bArr[iMo17043d] = b;
    }

    @Override // p001o.rhd
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] mo17041a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f42257a, mo17043d());
        sq8.m48648g(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }
}
