package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class HQCPrivateKeyParameters extends HQCKeyParameters {

    /* renamed from: sk, reason: collision with root package name */
    private byte[] f44706sk;

    public HQCPrivateKeyParameters(HQCParameters hQCParameters, byte[] bArr) {
        super(true, hQCParameters);
        this.f44706sk = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f44706sk);
    }

    public byte[] getPrivateKey() {
        return Arrays.clone(this.f44706sk);
    }
}
