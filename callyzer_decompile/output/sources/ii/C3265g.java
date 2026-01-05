package ii;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ii.g */
/* loaded from: classes.dex */
public final class C3265g extends AbstractC3266h {
    @Override // ii.AbstractC3266h
    /* renamed from: d */
    public final int[] mo7611d(int i10, int[] iArr) {
        if (iArr.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = AbstractC3266h.f17455c;
        System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
        System.arraycopy(this.f17456a, 0, iArr2, iArr3.length, 8);
        iArr2[12] = i10;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // ii.AbstractC3266h
    /* renamed from: g */
    public final int mo7612g() {
        return 12;
    }
}
