package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class FalconPublicKeyParameters extends FalconKeyParameters {

    /* renamed from: H */
    private byte[] f28018H;

    public FalconPublicKeyParameters(FalconParameters falconParameters, byte[] bArr) {
        super(false, falconParameters);
        this.f28018H = Arrays.clone(bArr);
    }

    public byte[] getH() {
        return Arrays.clone(this.f28018H);
    }
}
