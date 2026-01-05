package org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class SABERKeyParameters extends AsymmetricKeyParameter {
    private SABERParameters params;

    public SABERKeyParameters(boolean z6, SABERParameters sABERParameters) {
        super(z6);
        this.params = sABERParameters;
    }

    public SABERParameters getParameters() {
        return this.params;
    }
}
