package org.bouncycastle.jcajce;

import javax.crypto.interfaces.PBEKey;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class PKCS12KeyWithParameters extends PKCS12Key implements PBEKey {
    private final int iterationCount;
    private final byte[] salt;

    public PKCS12KeyWithParameters(char[] cArr, boolean z6, byte[] bArr, int i10) {
        super(cArr, z6);
        this.salt = Arrays.clone(bArr);
        this.iterationCount = i10;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.iterationCount;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.salt;
    }

    public PKCS12KeyWithParameters(char[] cArr, byte[] bArr, int i10) {
        super(cArr);
        this.salt = Arrays.clone(bArr);
        this.iterationCount = i10;
    }
}
