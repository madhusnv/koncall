package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes3.dex */
public class XMSSMTKeyParameters extends AsymmetricKeyParameter {
    private final String treeDigest;

    public XMSSMTKeyParameters(boolean z6, String str) {
        super(z6);
        this.treeDigest = str;
    }

    public String getTreeDigest() {
        return this.treeDigest;
    }
}
