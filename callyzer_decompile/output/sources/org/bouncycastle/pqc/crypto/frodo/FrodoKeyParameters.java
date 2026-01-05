package org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class FrodoKeyParameters extends AsymmetricKeyParameter {
    private FrodoParameters params;

    public FrodoKeyParameters(boolean z6, FrodoParameters frodoParameters) {
        super(z6);
        this.params = frodoParameters;
    }

    public FrodoParameters getParameters() {
        return this.params;
    }
}
