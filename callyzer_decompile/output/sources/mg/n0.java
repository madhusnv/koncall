package mg;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 extends o0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public n0(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new l0(str, charArray), (Character) '=');
        if (charArray.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    @Override // mg.o0
    /* renamed from: a */
    public final void mo9625a(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        AbstractC4723b.m9611m(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16) | (bArr[i11 + 2] & 255);
            l0 l0Var = this.f23682a;
            char[] cArr = l0Var.f23665b;
            char[] cArr2 = l0Var.f23665b;
            sb2.append(cArr[i13 >>> 18]);
            sb2.append(cArr2[(i13 >>> 12) & 63]);
            sb2.append(cArr2[(i13 >>> 6) & 63]);
            sb2.append(cArr2[i13 & 63]);
            i11 += 3;
        }
        if (i11 < i10) {
            m9630b(sb2, bArr, i11, i10 - i11);
        }
    }
}
