package org.bouncycastle.pqc.asn1;

import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class CMCEPrivateKey extends ASN1Object {

    /* renamed from: C */
    private byte[] f27968C;
    private CMCEPublicKey PublicKey;
    private byte[] alpha;
    private byte[] delta;

    /* renamed from: g */
    private byte[] f27969g;

    /* renamed from: s */
    private byte[] f27970s;
    private int version;

    public CMCEPrivateKey(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this(i10, bArr, bArr2, bArr3, bArr4, bArr5, null);
    }

    public static CMCEPrivateKey getInstance(Object obj) {
        if (obj instanceof CMCEPrivateKey) {
            return (CMCEPrivateKey) obj;
        }
        if (obj != null) {
            return new CMCEPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getAlpha() {
        return Arrays.clone(this.alpha);
    }

    public byte[] getC() {
        return Arrays.clone(this.f27968C);
    }

    public byte[] getDelta() {
        return Arrays.clone(this.delta);
    }

    public byte[] getG() {
        return Arrays.clone(this.f27969g);
    }

    public CMCEPublicKey getPublicKey() {
        return this.PublicKey;
    }

    public byte[] getS() {
        return Arrays.clone(this.f27970s);
    }

    public int getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.delta));
        aSN1EncodableVector.add(new DEROctetString(this.f27968C));
        aSN1EncodableVector.add(new DEROctetString(this.f27969g));
        aSN1EncodableVector.add(new DEROctetString(this.alpha));
        aSN1EncodableVector.add(new DEROctetString(this.f27970s));
        CMCEPublicKey cMCEPublicKey = this.PublicKey;
        if (cMCEPublicKey != null) {
            aSN1EncodableVector.add(new CMCEPublicKey(cMCEPublicKey.getT()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CMCEPrivateKey(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, CMCEPublicKey cMCEPublicKey) {
        this.version = i10;
        if (i10 != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.delta = Arrays.clone(bArr);
        this.f27968C = Arrays.clone(bArr2);
        this.f27969g = Arrays.clone(bArr3);
        this.alpha = Arrays.clone(bArr4);
        this.f27970s = Arrays.clone(bArr5);
        this.PublicKey = cMCEPublicKey;
    }

    private CMCEPrivateKey(ASN1Sequence aSN1Sequence) {
        int iM9728b = AbstractC4801l.m9728b(aSN1Sequence, 0);
        this.version = iM9728b;
        if (iM9728b != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.delta = AbstractC4801l.m9724B(aSN1Sequence, 1);
        this.f27968C = AbstractC4801l.m9724B(aSN1Sequence, 2);
        this.f27969g = AbstractC4801l.m9724B(aSN1Sequence, 3);
        this.alpha = AbstractC4801l.m9724B(aSN1Sequence, 4);
        this.f27970s = AbstractC4801l.m9724B(aSN1Sequence, 5);
        if (aSN1Sequence.size() == 7) {
            this.PublicKey = CMCEPublicKey.getInstance(aSN1Sequence.getObjectAt(6));
        }
    }
}
