package org.bouncycastle.crypto.params;

import java.security.SecureRandom;

/* loaded from: classes3.dex */
public class DSAParameterGenerationParameters {
    public static final int DIGITAL_SIGNATURE_USAGE = 1;
    public static final int KEY_ESTABLISHMENT_USAGE = 2;
    private final int certainty;

    /* renamed from: l */
    private final int f27750l;

    /* renamed from: n */
    private final int f27751n;
    private final SecureRandom random;
    private final int usageIndex;

    public DSAParameterGenerationParameters(int i10, int i11, int i12, SecureRandom secureRandom) {
        this(i10, i11, i12, secureRandom, -1);
    }

    public int getCertainty() {
        return this.certainty;
    }

    public int getL() {
        return this.f27750l;
    }

    public int getN() {
        return this.f27751n;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public int getUsageIndex() {
        return this.usageIndex;
    }

    public DSAParameterGenerationParameters(int i10, int i11, int i12, SecureRandom secureRandom, int i13) {
        this.f27750l = i10;
        this.f27751n = i11;
        this.certainty = i12;
        this.usageIndex = i13;
        this.random = secureRandom;
    }
}
