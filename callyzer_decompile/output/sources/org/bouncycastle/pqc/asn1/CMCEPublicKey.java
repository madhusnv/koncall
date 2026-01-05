package org.bouncycastle.pqc.asn1;

import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class CMCEPublicKey extends ASN1Object {

    /* renamed from: T */
    private byte[] f27971T;

    public CMCEPublicKey(ASN1Sequence aSN1Sequence) {
        this.f27971T = AbstractC4801l.m9724B(aSN1Sequence, 0);
    }

    public static CMCEPublicKey getInstance(Object obj) {
        if (obj instanceof CMCEPublicKey) {
            return (CMCEPublicKey) obj;
        }
        if (obj != null) {
            return new CMCEPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getT() {
        return Arrays.clone(this.f27971T);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.f27971T));
        return new DERSequence(aSN1EncodableVector);
    }

    public CMCEPublicKey(byte[] bArr) {
        this.f27971T = bArr;
    }
}
