package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class NTRULPRimeKeyParameters extends AsymmetricKeyParameter {
    private final NTRULPRimeParameters params;

    public NTRULPRimeKeyParameters(boolean z6, NTRULPRimeParameters nTRULPRimeParameters) {
        super(z6);
        this.params = nTRULPRimeParameters;
    }

    public NTRULPRimeParameters getParameters() {
        return this.params;
    }
}
