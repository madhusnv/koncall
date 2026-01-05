package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes3.dex */
public class CMacWithIV extends CMac {
    public CMacWithIV(BlockCipher blockCipher) {
        super(blockCipher);
    }

    public CMacWithIV(BlockCipher blockCipher, int i10) {
        super(blockCipher, i10);
    }

    @Override // org.bouncycastle.crypto.macs.CMac
    public void validate(CipherParameters cipherParameters) {
    }
}
