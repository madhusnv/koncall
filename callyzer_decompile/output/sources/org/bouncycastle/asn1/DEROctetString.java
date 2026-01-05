package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes3.dex */
public class DEROctetString extends ASN1OctetString {
    public DEROctetString(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z6) {
        aSN1OutputStream.writeEncodingDL(z6, 4, this.string);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z6) {
        return ASN1OutputStream.getLengthOfEncodingDL(z6, this.string.length);
    }

    public DEROctetString(byte[] bArr) {
        super(bArr);
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z6, byte[] bArr, int i10, int i11) throws IOException {
        aSN1OutputStream.writeEncodingDL(z6, 4, bArr, i10, i11);
    }

    public static int encodedLength(boolean z6, int i10) {
        return ASN1OutputStream.getLengthOfEncodingDL(z6, i10);
    }

    @Override // org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }
}
