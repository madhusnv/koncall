package org.bouncycastle.crypto.params;

/* loaded from: classes3.dex */
public class ECKeyParameters extends AsymmetricKeyParameter {
    private final ECDomainParameters parameters;

    public ECKeyParameters(boolean z6, ECDomainParameters eCDomainParameters) {
        super(z6);
        if (eCDomainParameters == null) {
            throw new NullPointerException("'parameters' cannot be null");
        }
        this.parameters = eCDomainParameters;
    }

    public ECDomainParameters getParameters() {
        return this.parameters;
    }
}
