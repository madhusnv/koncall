package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class HQCKeyParameters extends AsymmetricKeyParameter {
    private HQCParameters params;

    public HQCKeyParameters(boolean z6, HQCParameters hQCParameters) {
        super(z6);
        this.params = hQCParameters;
    }

    public HQCParameters getParameters() {
        return this.params;
    }
}
