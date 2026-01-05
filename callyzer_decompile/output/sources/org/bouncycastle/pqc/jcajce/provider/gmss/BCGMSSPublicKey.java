package org.bouncycastle.pqc.jcajce.provider.gmss;

import com.sun.mail.util.AbstractC1452a;
import java.security.PublicKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.asn1.GMSSPublicKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.ParSet;
import org.bouncycastle.pqc.jcajce.provider.util.KeyUtil;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSParameters;
import org.bouncycastle.pqc.legacy.crypto.gmss.GMSSPublicKeyParameters;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
public class BCGMSSPublicKey implements CipherParameters, PublicKey {
    private static final long serialVersionUID = 1;
    private GMSSParameters gmssParameterSet;
    private GMSSParameters gmssParams;
    private byte[] publicKeyBytes;

    public BCGMSSPublicKey(GMSSPublicKeyParameters gMSSPublicKeyParameters) {
        this(gMSSPublicKeyParameters.getPublicKey(), gMSSPublicKeyParameters.getParameters());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "GMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.gmss, new ParSet(this.gmssParameterSet.getNumOfLayers(), this.gmssParameterSet.getHeightOfTrees(), this.gmssParameterSet.getWinternitzParameter(), this.gmssParameterSet.getK()).toASN1Primitive()), new GMSSPublicKey(this.publicKeyBytes));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public GMSSParameters getParameterSet() {
        return this.gmssParameterSet;
    }

    public byte[] getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public String toString() {
        String strM4564k = AbstractC1452a.m4564k(new StringBuilder("GMSS public key : "), new String(Hex.encode(this.publicKeyBytes)), "\nHeight of Trees: \n");
        for (int i10 = 0; i10 < this.gmssParameterSet.getHeightOfTrees().length; i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strM4564k);
            sb2.append("Layer ");
            sb2.append(i10);
            sb2.append(" : ");
            sb2.append(this.gmssParameterSet.getHeightOfTrees()[i10]);
            sb2.append(" WinternitzParameter: ");
            sb2.append(this.gmssParameterSet.getWinternitzParameter()[i10]);
            sb2.append(" K: ");
            strM4564k = AbstractC5601a.m11233d(this.gmssParameterSet.getK()[i10], "\n", sb2);
        }
        return strM4564k;
    }

    public BCGMSSPublicKey(byte[] bArr, GMSSParameters gMSSParameters) {
        this.gmssParameterSet = gMSSParameters;
        this.publicKeyBytes = bArr;
    }
}
