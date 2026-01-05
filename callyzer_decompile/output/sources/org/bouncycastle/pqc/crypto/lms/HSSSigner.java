package org.bouncycastle.pqc.crypto.lms;

import java.io.IOException;
import mm.AbstractC4801l;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.MessageSigner;

/* loaded from: classes3.dex */
public class HSSSigner implements MessageSigner {
    private HSSPrivateKeyParameters privKey;
    private HSSPublicKeyParameters pubKey;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        try {
            return HSS.generateSignature(this.privKey, bArr).getEncoded();
        } catch (IOException e2) {
            throw new IllegalStateException(AbstractC4801l.m9731e(e2, new StringBuilder("unable to encode signature: ")));
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z6, CipherParameters cipherParameters) {
        if (z6) {
            this.privKey = (HSSPrivateKeyParameters) cipherParameters;
        } else {
            this.pubKey = (HSSPublicKeyParameters) cipherParameters;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        try {
            HSSPublicKeyParameters hSSPublicKeyParameters = this.pubKey;
            return HSS.verifySignature(hSSPublicKeyParameters, HSSSignature.getInstance(bArr2, hSSPublicKeyParameters.getL()), bArr);
        } catch (IOException e2) {
            throw new IllegalStateException(AbstractC4801l.m9731e(e2, new StringBuilder("unable to decode signature: ")));
        }
    }
}
