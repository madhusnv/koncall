package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

/* loaded from: classes3.dex */
public class KDFParameters implements DerivationParameters {

    /* renamed from: iv, reason: collision with root package name */
    byte[] f44621iv;
    byte[] shared;

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.shared = bArr;
        this.f44621iv = bArr2;
    }

    public byte[] getIV() {
        return this.f44621iv;
    }

    public byte[] getSharedSecret() {
        return this.shared;
    }
}
