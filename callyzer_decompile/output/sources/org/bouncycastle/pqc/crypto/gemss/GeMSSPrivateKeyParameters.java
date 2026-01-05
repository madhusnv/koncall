package org.bouncycastle.pqc.crypto.gemss;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class GeMSSPrivateKeyParameters extends GeMSSKeyParameters {

    /* renamed from: sk, reason: collision with root package name */
    final byte[] f44680sk;

    public GeMSSPrivateKeyParameters(GeMSSParameters geMSSParameters, byte[] bArr) {
        super(false, geMSSParameters);
        byte[] bArr2 = new byte[bArr.length];
        this.f44680sk = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f44680sk);
    }
}
