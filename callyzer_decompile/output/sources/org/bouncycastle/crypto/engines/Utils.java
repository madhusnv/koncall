package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CryptoServicePurpose;

/* loaded from: classes3.dex */
class Utils {
    public static CryptoServicePurpose getPurpose(boolean z6) {
        return z6 ? CryptoServicePurpose.ENCRYPTION : CryptoServicePurpose.DECRYPTION;
    }
}
