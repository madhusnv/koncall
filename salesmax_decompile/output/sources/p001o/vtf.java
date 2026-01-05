package p001o;

/* loaded from: classes6.dex */
public final class vtf extends zqh {

    /* renamed from: c */
    public final short f50875c;

    /* renamed from: d */
    public final short f50876d;

    public vtf(zqh zqhVar, int i, int i2) {
        super(zqhVar);
        this.f50875c = (short) i;
        this.f50876d = (short) i2;
    }

    @Override // p001o.zqh
    /* renamed from: c */
    public void mo46741c(xh1 xh1Var, byte[] bArr) {
        xh1Var.m56302c(this.f50875c, this.f50876d);
    }

    public String toString() {
        short s = this.f50875c;
        short s2 = this.f50876d;
        return "<" + Integer.toBinaryString((s & ((1 << s2) - 1)) | (1 << s2) | (1 << this.f50876d)).substring(1) + '>';
    }
}
