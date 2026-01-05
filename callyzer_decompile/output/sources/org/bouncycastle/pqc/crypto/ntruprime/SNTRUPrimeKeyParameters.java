package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class SNTRUPrimeKeyParameters extends AsymmetricKeyParameter {
    private final SNTRUPrimeParameters params;

    public SNTRUPrimeKeyParameters(boolean z6, SNTRUPrimeParameters sNTRUPrimeParameters) {
        super(z6);
        this.params = sNTRUPrimeParameters;
    }

    public SNTRUPrimeParameters getParameters() {
        return this.params;
    }
}
