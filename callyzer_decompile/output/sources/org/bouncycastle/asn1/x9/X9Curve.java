package org.bouncycastle.asn1.x9;

import com.sun.mail.util.AbstractC1452a;
import java.math.BigInteger;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class X9Curve extends ASN1Object implements X9ObjectIdentifiers {
    private ECCurve curve;
    private ASN1ObjectIdentifier fieldIdentifier;
    private byte[] seed;

    public X9Curve(X9FieldID x9FieldID, BigInteger bigInteger, BigInteger bigInteger2, ASN1Sequence aSN1Sequence) {
        int iM9728b;
        int iM9728b2;
        int i10;
        this.fieldIdentifier = null;
        ASN1ObjectIdentifier identifier = x9FieldID.getIdentifier();
        this.fieldIdentifier = identifier;
        if (identifier.equals((ASN1Primitive) X9ObjectIdentifiers.prime_field)) {
            this.curve = new ECCurve.Fp(((ASN1Integer) x9FieldID.getParameters()).getValue(), new BigInteger(1, AbstractC1452a.m4553D(aSN1Sequence, 0)), new BigInteger(1, AbstractC1452a.m4553D(aSN1Sequence, 1)), bigInteger, bigInteger2);
        } else {
            if (!this.fieldIdentifier.equals((ASN1Primitive) X9ObjectIdentifiers.characteristic_two_field)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(x9FieldID.getParameters());
            int iIntValueExact = ((ASN1Integer) aSN1Sequence2.getObjectAt(0)).intValueExact();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence2.getObjectAt(1);
            if (aSN1ObjectIdentifier.equals((ASN1Primitive) X9ObjectIdentifiers.tpBasis)) {
                iM9728b2 = AbstractC4801l.m9728b(aSN1Sequence2, 2);
                i10 = 0;
                iM9728b = 0;
            } else {
                if (!aSN1ObjectIdentifier.equals((ASN1Primitive) X9ObjectIdentifiers.ppBasis)) {
                    throw new IllegalArgumentException("This type of EC basis is not implemented");
                }
                ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(aSN1Sequence2.getObjectAt(2));
                int iM9728b3 = AbstractC4801l.m9728b(aSN1Sequence3, 0);
                int iM9728b4 = AbstractC4801l.m9728b(aSN1Sequence3, 1);
                iM9728b = AbstractC4801l.m9728b(aSN1Sequence3, 2);
                iM9728b2 = iM9728b3;
                i10 = iM9728b4;
            }
            this.curve = new ECCurve.F2m(iIntValueExact, iM9728b2, i10, iM9728b, new BigInteger(1, AbstractC1452a.m4553D(aSN1Sequence, 0)), new BigInteger(1, AbstractC1452a.m4553D(aSN1Sequence, 1)), bigInteger, bigInteger2);
        }
        if (aSN1Sequence.size() == 3) {
            this.seed = ((DERBitString) aSN1Sequence.getObjectAt(2)).getBytes();
        }
    }

    private void setFieldIdentifier() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (ECAlgorithms.isFpCurve(this.curve)) {
            aSN1ObjectIdentifier = X9ObjectIdentifiers.prime_field;
        } else {
            if (!ECAlgorithms.isF2mCurve(this.curve)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            aSN1ObjectIdentifier = X9ObjectIdentifiers.characteristic_two_field;
        }
        this.fieldIdentifier = aSN1ObjectIdentifier;
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        if (this.fieldIdentifier.equals((ASN1Primitive) X9ObjectIdentifiers.prime_field) || this.fieldIdentifier.equals((ASN1Primitive) X9ObjectIdentifiers.characteristic_two_field)) {
            aSN1EncodableVector.add(new X9FieldElement(this.curve.getA()).toASN1Primitive());
            X9FieldElement x9FieldElement = new X9FieldElement(this.curve.getB());
            aSN1EncodableVector.add(x9FieldElement.toASN1Primitive());
        }
        if (this.seed != null) {
            aSN1EncodableVector.add(new DERBitString(this.seed));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public X9Curve(ECCurve eCCurve) {
        this(eCCurve, null);
    }

    public X9Curve(ECCurve eCCurve, byte[] bArr) {
        this.fieldIdentifier = null;
        this.curve = eCCurve;
        this.seed = Arrays.clone(bArr);
        setFieldIdentifier();
    }
}
