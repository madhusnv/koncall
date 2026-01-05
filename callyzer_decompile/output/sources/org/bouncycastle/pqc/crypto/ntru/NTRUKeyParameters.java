package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public abstract class NTRUKeyParameters extends AsymmetricKeyParameter {
    private final NTRUParameters params;

    public NTRUKeyParameters(boolean z6, NTRUParameters nTRUParameters) {
        super(z6);
        this.params = nTRUParameters;
    }

    public NTRUParameters getParameters() {
        return this.params;
    }
}
