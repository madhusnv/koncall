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
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* renamed from: a */
    ASN1Integer f27494a;

    /* renamed from: b */
    ASN1Integer f27495b;

    /* renamed from: p */
    ASN1Integer f27496p;

    /* renamed from: q */
    ASN1Integer f27497q;

    /* renamed from: x */
    ASN1Integer f27498x;

    /* renamed from: y */
    ASN1Integer f27499y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i10, BigInteger bigInteger5) {
        this.f27494a = new ASN1Integer(bigInteger);
        this.f27495b = new ASN1Integer(bigInteger2);
        this.f27496p = new ASN1Integer(bigInteger3);
        this.f27497q = new ASN1Integer(bigInteger4);
        this.f27498x = new ASN1Integer(i10);
        this.f27499y = new ASN1Integer(bigInteger5);
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(AbstractC5601a.m11234e(obj, "Invalid GOST3410Parameter: "));
    }

    public BigInteger getA() {
        return this.f27494a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f27496p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f27497q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f27494a);
        aSN1EncodableVector.add(this.f27495b);
        aSN1EncodableVector.add(this.f27496p);
        aSN1EncodableVector.add(this.f27497q);
        aSN1EncodableVector.add(this.f27498x);
        aSN1EncodableVector.add(this.f27499y);
        return new DERSequence(aSN1EncodableVector);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f27494a = (ASN1Integer) objects.nextElement();
        this.f27495b = (ASN1Integer) objects.nextElement();
        this.f27496p = (ASN1Integer) objects.nextElement();
        this.f27497q = (ASN1Integer) objects.nextElement();
        this.f27498x = (ASN1Integer) objects.nextElement();
        this.f27499y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z6) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z6));
    }
}
