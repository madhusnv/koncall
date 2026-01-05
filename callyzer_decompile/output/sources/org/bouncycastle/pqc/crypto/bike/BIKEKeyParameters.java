package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class BIKEKeyParameters extends AsymmetricKeyParameter {
    private BIKEParameters params;

    public BIKEKeyParameters(boolean z6, BIKEParameters bIKEParameters) {
        super(z6);
        this.params = bIKEParameters;
    }

    public BIKEParameters getParameters() {
        return this.params;
    }
}
