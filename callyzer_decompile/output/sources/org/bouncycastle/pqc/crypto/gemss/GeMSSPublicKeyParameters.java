package org.bouncycastle.pqc.crypto.gemss;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class GeMSSPublicKeyParameters extends GeMSSKeyParameters {

    /* renamed from: pk, reason: collision with root package name */
    private final byte[] f44681pk;

    public GeMSSPublicKeyParameters(GeMSSParameters geMSSParameters, byte[] bArr) {
        super(false, geMSSParameters);
        byte[] bArr2 = new byte[bArr.length];
        this.f44681pk = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f44681pk);
    }

    public byte[] getPK() {
        return this.f44681pk;
    }
}
