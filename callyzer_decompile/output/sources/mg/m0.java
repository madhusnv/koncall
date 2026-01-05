package mg;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m0 extends o0 {

    /* renamed from: e */
    public final char[] f23677e;

    public m0(l0 l0Var) {
        super(l0Var, (Character) null);
        this.f23677e = new char[512];
        char[] cArr = l0Var.f23665b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i10 = 0; i10 < 256; i10++) {
            char[] cArr2 = this.f23677e;
            cArr2[i10] = cArr[i10 >>> 4];
            cArr2[i10 | 256] = cArr[i10 & 15];
        }
    }

    @Override // mg.o0
    /* renamed from: a */
    public final void mo9625a(StringBuilder sb2, byte[] bArr, int i10) {
        AbstractC4723b.m9611m(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            char[] cArr = this.f23677e;
            sb2.append(cArr[i12]);
            sb2.append(cArr[i12 | 256]);
        }
    }
}
