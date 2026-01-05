package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class HQCPublicKeyParameters extends HQCKeyParameters {

    /* renamed from: pk, reason: collision with root package name */
    private byte[] f44707pk;

    public HQCPublicKeyParameters(HQCParameters hQCParameters, byte[] bArr) {
        super(true, hQCParameters);
        this.f44707pk = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return getPublicKey();
    }

    public byte[] getPublicKey() {
        return Arrays.clone(this.f44707pk);
    }
}
