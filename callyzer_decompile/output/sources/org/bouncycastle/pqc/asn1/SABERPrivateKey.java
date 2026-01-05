package org.bouncycastle.pqc.asn1;

import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: classes3.dex */
public class SABERPrivateKey extends ASN1Object {
    private SABERPublicKey PublicKey;
    private byte[] hpk;

    /* renamed from: s */
    private byte[] f27992s;
    private int version;

    /* renamed from: z */
    private byte[] f27993z;

    public SABERPrivateKey(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.version = i10;
        if (i10 != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.f27993z = bArr;
        this.f27992s = bArr2;
        this.hpk = bArr3;
    }

    public static SABERPrivateKey getInstance(Object obj) {
        if (obj instanceof SABERPrivateKey) {
            return (SABERPrivateKey) obj;
        }
        if (obj != null) {
            return new SABERPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getHpk() {
        return this.hpk;
    }

    public SABERPublicKey getPublicKey() {
        return this.PublicKey;
    }

    public byte[] getS() {
        return this.f27992s;
    }

    public int getVersion() {
        return this.version;
    }

    public byte[] getZ() {
        return this.f27993z;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.f27993z));
        aSN1EncodableVector.add(new DEROctetString(this.f27992s));
        aSN1EncodableVector.add(new DEROctetString(this.hpk));
        return new DERSequence(aSN1EncodableVector);
    }

    public SABERPrivateKey(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, SABERPublicKey sABERPublicKey) {
        this.version = i10;
        if (i10 != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.f27993z = bArr;
        this.f27992s = bArr2;
        this.hpk = bArr3;
        this.PublicKey = sABERPublicKey;
    }

    private SABERPrivateKey(ASN1Sequence aSN1Sequence) {
        int iM9728b = AbstractC4801l.m9728b(aSN1Sequence, 0);
        this.version = iM9728b;
        if (iM9728b != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.f27993z = AbstractC4801l.m9724B(aSN1Sequence, 1);
        this.f27992s = AbstractC4801l.m9724B(aSN1Sequence, 2);
        this.PublicKey = SABERPublicKey.getInstance(aSN1Sequence.getObjectAt(3));
        this.hpk = AbstractC4801l.m9724B(aSN1Sequence, 4);
    }
}
