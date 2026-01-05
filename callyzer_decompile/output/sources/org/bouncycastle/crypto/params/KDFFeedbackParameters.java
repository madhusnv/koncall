package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public final class KDFFeedbackParameters implements DerivationParameters {
    private static final int UNUSED_R = -1;
    private final byte[] fixedInputData;

    /* renamed from: iv, reason: collision with root package name */
    private final byte[] f44619iv;

    /* renamed from: ki, reason: collision with root package name */
    private final byte[] f44620ki;

    /* renamed from: r */
    private final int f27775r;
    private final boolean useCounter;

    private KDFFeedbackParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, boolean z6) {
        if (bArr == null) {
            throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.f44620ki = Arrays.clone(bArr);
        if (bArr3 == null) {
            this.fixedInputData = new byte[0];
        } else {
            this.fixedInputData = Arrays.clone(bArr3);
        }
        this.f27775r = i10;
        if (bArr2 == null) {
            this.f44619iv = new byte[0];
        } else {
            this.f44619iv = Arrays.clone(bArr2);
        }
        this.useCounter = z6;
    }

    public static KDFFeedbackParameters createWithCounter(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        if (i10 == 8 || i10 == 16 || i10 == 24 || i10 == 32) {
            return new KDFFeedbackParameters(bArr, bArr2, bArr3, i10, true);
        }
        throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
    }

    public static KDFFeedbackParameters createWithoutCounter(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new KDFFeedbackParameters(bArr, bArr2, bArr3, -1, false);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputData);
    }

    public byte[] getIV() {
        return this.f44619iv;
    }

    public byte[] getKI() {
        return this.f44620ki;
    }

    public int getR() {
        return this.f27775r;
    }

    public boolean useCounter() {
        return this.useCounter;
    }
}
