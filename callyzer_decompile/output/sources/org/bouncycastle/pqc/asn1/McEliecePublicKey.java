package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

/* loaded from: classes3.dex */
public class McEliecePublicKey extends ASN1Object {

    /* renamed from: g */
    private final GF2Matrix f27985g;

    /* renamed from: n */
    private final int f27986n;

    /* renamed from: t */
    private final int f27987t;

    public McEliecePublicKey(int i10, int i11, GF2Matrix gF2Matrix) {
        this.f27986n = i10;
        this.f27987t = i11;
        this.f27985g = new GF2Matrix(gF2Matrix);
    }

    public static McEliecePublicKey getInstance(Object obj) {
        if (obj instanceof McEliecePublicKey) {
            return (McEliecePublicKey) obj;
        }
        if (obj != null) {
            return new McEliecePublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GF2Matrix getG() {
        return new GF2Matrix(this.f27985g);
    }

    public int getN() {
        return this.f27986n;
    }

    public int getT() {
        return this.f27987t;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f27986n));
        aSN1EncodableVector.add(new ASN1Integer(this.f27987t));
        aSN1EncodableVector.add(new DEROctetString(this.f27985g.getEncoded()));
        return new DERSequence(aSN1EncodableVector);
    }

    private McEliecePublicKey(ASN1Sequence aSN1Sequence) {
        this.f27986n = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        this.f27987t = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intValueExact();
        this.f27985g = new GF2Matrix(((ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets());
    }
}
