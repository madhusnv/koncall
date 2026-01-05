package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class FalconKeyParameters extends AsymmetricKeyParameter {
    private final FalconParameters params;

    public FalconKeyParameters(boolean z6, FalconParameters falconParameters) {
        super(z6);
        this.params = falconParameters;
    }

    public FalconParameters getParameters() {
        return this.params;
    }
}
