package org.bouncycastle.asn1;

/* loaded from: classes3.dex */
public class DERNumericString extends ASN1NumericString {
    public DERNumericString(String str) {
        this(str, false);
    }

    public DERNumericString(String str, boolean z6) {
        super(str, z6);
    }

    public DERNumericString(byte[] bArr, boolean z6) {
        super(bArr, z6);
    }
}
