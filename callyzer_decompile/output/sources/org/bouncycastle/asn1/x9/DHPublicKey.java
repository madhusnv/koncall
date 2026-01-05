package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* loaded from: classes3.dex */
public class DHPublicKey extends ASN1Object {

    /* renamed from: y */
    private ASN1Integer f27536y;

    public DHPublicKey(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'y' cannot be null");
        }
        this.f27536y = new ASN1Integer(bigInteger);
    }

    public static DHPublicKey getInstance(Object obj) {
        if (obj == null || (obj instanceof DHPublicKey)) {
            return (DHPublicKey) obj;
        }
        if (obj instanceof ASN1Integer) {
            return new DHPublicKey((ASN1Integer) obj);
        }
        throw new IllegalArgumentException(AbstractC5601a.m11234e(obj, "Invalid DHPublicKey: "));
    }

    public BigInteger getY() {
        return this.f27536y.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f27536y;
    }

    private DHPublicKey(ASN1Integer aSN1Integer) {
        if (aSN1Integer == null) {
            throw new IllegalArgumentException("'y' cannot be null");
        }
        this.f27536y = aSN1Integer;
    }

    public static DHPublicKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z6) {
        return getInstance(ASN1Integer.getInstance(aSN1TaggedObject, z6));
    }
}
