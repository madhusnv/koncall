package org.bouncycastle.asn1;

import java.math.BigInteger;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class ASN1Enumerated extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Enumerated.class, 10) { // from class: org.bouncycastle.asn1.ASN1Enumerated.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1Enumerated.createPrimitive(dEROctetString.getOctets(), false);
        }
    };
    private static final ASN1Enumerated[] cache = new ASN1Enumerated[12];
    private final byte[] contents;
    private final int start;

    public ASN1Enumerated(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.contents = BigInteger.valueOf(i10).toByteArray();
        this.start = 0;
    }

    public static ASN1Enumerated createPrimitive(byte[] bArr, boolean z6) {
        if (bArr.length > 1) {
            return new ASN1Enumerated(bArr, z6);
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i10 = bArr[0] & 255;
        ASN1Enumerated[] aSN1EnumeratedArr = cache;
        if (i10 >= aSN1EnumeratedArr.length) {
            return new ASN1Enumerated(bArr, z6);
        }
        ASN1Enumerated aSN1Enumerated = aSN1EnumeratedArr[i10];
        if (aSN1Enumerated != null) {
            return aSN1Enumerated;
        }
        ASN1Enumerated aSN1Enumerated2 = new ASN1Enumerated(bArr, z6);
        aSN1EnumeratedArr[i10] = aSN1Enumerated2;
        return aSN1Enumerated2;
    }

    public static ASN1Enumerated getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Enumerated)) {
            return (ASN1Enumerated) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(AbstractC5601a.m11234e(obj, "illegal object in getInstance: "));
        }
        try {
            return (ASN1Enumerated) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e2) {
            throw new IllegalArgumentException(AbstractC4801l.m9732f(e2, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1Enumerated) {
            return Arrays.areEqual(this.contents, ((ASN1Enumerated) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z6) {
        aSN1OutputStream.writeEncodingDL(z6, 10, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z6) {
        return ASN1OutputStream.getLengthOfEncodingDL(z6, this.contents.length);
    }

    public BigInteger getValue() {
        return new BigInteger(this.contents);
    }

    public boolean hasValue(int i10) {
        byte[] bArr = this.contents;
        int length = bArr.length;
        int i11 = this.start;
        return length - i11 <= 4 && ASN1Integer.intValue(bArr, i11, -1) == i10;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public int intValueExact() {
        byte[] bArr = this.contents;
        int length = bArr.length;
        int i10 = this.start;
        if (length - i10 <= 4) {
            return ASN1Integer.intValue(bArr, i10, -1);
        }
        throw new ArithmeticException("ASN.1 Enumerated out of int range");
    }

    public ASN1Enumerated(BigInteger bigInteger) {
        if (bigInteger.signum() < 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.contents = bigInteger.toByteArray();
        this.start = 0;
    }

    public boolean hasValue(BigInteger bigInteger) {
        return bigInteger != null && ASN1Integer.intValue(this.contents, this.start, -1) == bigInteger.intValue() && getValue().equals(bigInteger);
    }

    public ASN1Enumerated(byte[] bArr) {
        this(bArr, true);
    }

    public ASN1Enumerated(byte[] bArr, boolean z6) {
        if (ASN1Integer.isMalformed(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & 128) != 0) {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
        this.contents = z6 ? Arrays.clone(bArr) : bArr;
        this.start = ASN1Integer.signBytesToSkip(bArr);
    }

    public static ASN1Enumerated getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z6) {
        return (ASN1Enumerated) TYPE.getContextInstance(aSN1TaggedObject, z6);
    }
}
