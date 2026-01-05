package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes3.dex */
public class AsymmetricKeyParameter implements CipherParameters {
    boolean privateKey;

    public AsymmetricKeyParameter(boolean z6) {
        this.privateKey = z6;
    }

    public boolean isPrivate() {
        return this.privateKey;
    }
}
