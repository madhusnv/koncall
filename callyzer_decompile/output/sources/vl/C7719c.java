package vl;

import javax.crypto.spec.GCMParameterSpec;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vl.c */
/* loaded from: classes.dex */
public final class C7719c extends GCMParameterSpec {

    /* renamed from: a */
    public final byte[] f37257a;

    public C7719c(int i10, byte[] bArr) {
        super(i10, bArr);
        if (bArr.length == 12) {
            this.f37257a = (byte[]) bArr.clone();
        } else {
            throw new IllegalArgumentException("GCM nonce must be 12 bytes, but given len=" + bArr.length);
        }
    }

    @Override // javax.crypto.spec.GCMParameterSpec
    public final byte[] getIV() {
        return (byte[]) this.f37257a.clone();
    }
}
