package org.bouncycastle.pqc.legacy.crypto.rainbow;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes3.dex */
public class RainbowParameters implements CipherParameters {
    private final int[] DEFAULT_VI;

    /* renamed from: vi, reason: collision with root package name */
    private int[] f44754vi;

    public RainbowParameters() {
        int[] iArr = {6, 12, 17, 22, 33};
        this.DEFAULT_VI = iArr;
        this.f44754vi = iArr;
    }

    private void checkParams() {
        int[] iArr;
        int i10;
        int[] iArr2 = this.f44754vi;
        if (iArr2 == null) {
            throw new IllegalArgumentException("no layers defined.");
        }
        if (iArr2.length <= 1) {
            throw new IllegalArgumentException("Rainbow needs at least 1 layer, such that v1 < v2.");
        }
        int i11 = 0;
        do {
            iArr = this.f44754vi;
            if (i11 >= iArr.length - 1) {
                return;
            }
            i10 = iArr[i11];
            i11++;
        } while (i10 < iArr[i11]);
        throw new IllegalArgumentException("v[i] has to be smaller than v[i+1]");
    }

    public int getDocLength() {
        int[] iArr = this.f44754vi;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public int getNumOfLayers() {
        return this.f44754vi.length - 1;
    }

    public int[] getVi() {
        return this.f44754vi;
    }

    public RainbowParameters(int[] iArr) {
        this.DEFAULT_VI = new int[]{6, 12, 17, 22, 33};
        this.f44754vi = iArr;
        checkParams();
    }
}
