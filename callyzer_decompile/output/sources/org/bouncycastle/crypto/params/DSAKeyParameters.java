package org.bouncycastle.crypto.params;

/* loaded from: classes3.dex */
public class DSAKeyParameters extends AsymmetricKeyParameter {
    private DSAParameters params;

    public DSAKeyParameters(boolean z6, DSAParameters dSAParameters) {
        super(z6);
        this.params = dSAParameters;
    }

    public DSAParameters getParameters() {
        return this.params;
    }
}
