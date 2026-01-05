package org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class PicnicKeyParameters extends AsymmetricKeyParameter {
    final PicnicParameters parameters;

    public PicnicKeyParameters(boolean z6, PicnicParameters picnicParameters) {
        super(z6);
        this.parameters = picnicParameters;
    }

    public PicnicParameters getParameters() {
        return this.parameters;
    }
}
