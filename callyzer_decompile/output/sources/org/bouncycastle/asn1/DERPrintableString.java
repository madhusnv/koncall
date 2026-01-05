package org.bouncycastle.asn1;

/* loaded from: classes3.dex */
public class DERPrintableString extends ASN1PrintableString {
    public DERPrintableString(String str) {
        this(str, false);
    }

    public DERPrintableString(String str, boolean z6) {
        super(str, z6);
    }

    public DERPrintableString(byte[] bArr, boolean z6) {
        super(bArr, z6);
    }
}
