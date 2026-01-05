package org.bouncycastle.crypto.agreement.kdf;

import java.io.IOException;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class DHKEKGenerator implements DerivationFunction {
    private ASN1ObjectIdentifier algorithm;
    private final Digest digest;
    private int keySize;
    private byte[] partyAInfo;

    /* renamed from: z */
    private byte[] f27557z;

    public DHKEKGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) {
        boolean z6;
        int i12 = i11;
        int i13 = i10;
        if (bArr.length - i12 < i13) {
            throw new OutputLengthException("output buffer too small");
        }
        long j6 = i12;
        int digestSize = this.digest.getDigestSize();
        if (j6 > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j10 = digestSize;
        int i14 = (int) (((j6 + j10) - 1) / j10);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i16 < i14) {
            Digest digest = this.digest;
            byte[] bArr3 = this.f27557z;
            digest.update(bArr3, i15, bArr3.length);
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(this.algorithm);
            aSN1EncodableVector2.add(new DEROctetString(Pack.intToBigEndian(i17)));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
            if (this.partyAInfo != null) {
                z6 = true;
                aSN1EncodableVector.add(new DERTaggedObject(true, i15, (ASN1Encodable) new DEROctetString(this.partyAInfo)));
            } else {
                z6 = true;
            }
            aSN1EncodableVector.add(new DERTaggedObject(z6, 2, new DEROctetString(Pack.intToBigEndian(this.keySize))));
            try {
                byte[] encoded = new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
                this.digest.update(encoded, 0, encoded.length);
                this.digest.doFinal(bArr2, 0);
                if (i12 > digestSize) {
                    System.arraycopy(bArr2, 0, bArr, i13, digestSize);
                    i13 += digestSize;
                    i12 -= digestSize;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i13, i12);
                }
                i17++;
                i16++;
                i15 = 0;
            } catch (IOException e2) {
                throw new IllegalArgumentException(AbstractC4801l.m9731e(e2, new StringBuilder("unable to encode parameter info: ")));
            }
        }
        this.digest.reset();
        return (int) j6;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        DHKDFParameters dHKDFParameters = (DHKDFParameters) derivationParameters;
        this.algorithm = dHKDFParameters.getAlgorithm();
        this.keySize = dHKDFParameters.getKeySize();
        this.f27557z = dHKDFParameters.getZ();
        this.partyAInfo = dHKDFParameters.getExtraInfo();
    }
}
