package org.bouncycastle.pqc.legacy.crypto.gmss;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class GMSSKeyParameters extends AsymmetricKeyParameter {
    private GMSSParameters params;

    public GMSSKeyParameters(boolean z6, GMSSParameters gMSSParameters) {
        super(z6);
        this.params = gMSSParameters;
    }

    public GMSSParameters getParameters() {
        return this.params;
    }
}
