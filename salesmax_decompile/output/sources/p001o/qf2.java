package p001o;

/* loaded from: classes4.dex */
public class qf2 extends rf2 {
    public qf2(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // p001o.rf2
    /* renamed from: d */
    public int[] mo35486d(int[] iArr, int i) {
        if (iArr.length != mo35487g() / 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        rf2.m46637k(iArr2, this.f43481a);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // p001o.rf2
    /* renamed from: g */
    public int mo35487g() {
        return 12;
    }
}
