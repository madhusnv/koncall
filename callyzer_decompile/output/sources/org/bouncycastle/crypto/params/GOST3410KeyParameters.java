package org.bouncycastle.crypto.params;

/* loaded from: classes3.dex */
public class GOST3410KeyParameters extends AsymmetricKeyParameter {
    private GOST3410Parameters params;

    public GOST3410KeyParameters(boolean z6, GOST3410Parameters gOST3410Parameters) {
        super(z6);
        this.params = gOST3410Parameters;
    }

    public GOST3410Parameters getParameters() {
        return this.params;
    }
}
