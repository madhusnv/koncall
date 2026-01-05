package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class FalconPrivateKeyParameters extends FalconKeyParameters {

    /* renamed from: F */
    private final byte[] f28015F;

    /* renamed from: f */
    private final byte[] f28016f;

    /* renamed from: g */
    private final byte[] f28017g;

    /* renamed from: pk, reason: collision with root package name */
    private final byte[] f44676pk;

    public FalconPrivateKeyParameters(FalconParameters falconParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, falconParameters);
        this.f28016f = Arrays.clone(bArr);
        this.f28017g = Arrays.clone(bArr2);
        this.f28015F = Arrays.clone(bArr3);
        this.f44676pk = Arrays.clone(bArr4);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(this.f28016f, this.f28017g, this.f28015F);
    }

    public byte[] getG() {
        return Arrays.clone(this.f28017g);
    }

    public byte[] getPublicKey() {
        return Arrays.clone(this.f44676pk);
    }

    public byte[] getSpolyF() {
        return Arrays.clone(this.f28015F);
    }

    public byte[] getSpolyf() {
        return Arrays.clone(this.f28016f);
    }
}
