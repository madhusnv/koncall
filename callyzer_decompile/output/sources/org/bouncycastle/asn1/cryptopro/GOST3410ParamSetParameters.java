package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* loaded from: classes3.dex */
public class GOST3410ParamSetParameters extends ASN1Object {

    /* renamed from: a */
    ASN1Integer f27500a;
    int keySize;

    /* renamed from: p */
    ASN1Integer f27501p;

    /* renamed from: q */
    ASN1Integer f27502q;

    public GOST3410ParamSetParameters(int i10, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.keySize = i10;
        this.f27501p = new ASN1Integer(bigInteger);
        this.f27502q = new ASN1Integer(bigInteger2);
        this.f27500a = new ASN1Integer(bigInteger3);
    }

    public static GOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof GOST3410ParamSetParameters)) {
            return (GOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new GOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(AbstractC5601a.m11234e(obj, "Invalid GOST3410Parameter: "));
    }

    public BigInteger getA() {
        return this.f27500a.getPositiveValue();
    }

    public int getKeySize() {
        return this.keySize;
    }

    public int getLKeySize() {
        return this.keySize;
    }

    public BigInteger getP() {
        return this.f27501p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f27502q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(new ASN1Integer(this.keySize));
        aSN1EncodableVector.add(this.f27501p);
        aSN1EncodableVector.add(this.f27502q);
        aSN1EncodableVector.add(this.f27500a);
        return new DERSequence(aSN1EncodableVector);
    }

    public GOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.keySize = ((ASN1Integer) objects.nextElement()).intValueExact();
        this.f27501p = (ASN1Integer) objects.nextElement();
        this.f27502q = (ASN1Integer) objects.nextElement();
        this.f27500a = (ASN1Integer) objects.nextElement();
    }

    public static GOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z6) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z6));
    }
}
