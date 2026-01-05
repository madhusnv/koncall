package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes3.dex */
public class DLBitString extends ASN1BitString {
    public DLBitString(byte b10, int i10) {
        super(b10, i10);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z6) {
        aSN1OutputStream.writeEncodingDL(z6, 3, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z6) {
        return ASN1OutputStream.getLengthOfEncodingDL(z6, this.contents.length);
    }

    public DLBitString(int i10) {
        super(ASN1BitString.getBytes(i10), ASN1BitString.getPadBits(i10));
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z6, byte b10, byte[] bArr, int i10, int i11) throws IOException {
        aSN1OutputStream.writeEncodingDL(z6, 3, b10, bArr, i10, i11);
    }

    public static int encodedLength(boolean z6, int i10) {
        return ASN1OutputStream.getLengthOfEncodingDL(z6, i10);
    }

    public DLBitString(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER), 0);
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z6, byte[] bArr, int i10, int i11) throws IOException {
        aSN1OutputStream.writeEncodingDL(z6, 3, bArr, i10, i11);
    }

    public DLBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DLBitString(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    public DLBitString(byte[] bArr, boolean z6) {
        super(bArr, z6);
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }
}
