package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

/* loaded from: classes3.dex */
public final class zzbh {
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r3 == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        boolean z = true;
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (zzbg.zza[roundingMode.ordinal()]) {
            case 1:
                zzbi.zza(false);
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    z = false;
                    break;
                }
                break;
            case 4:
                return i3 + i5;
            case 5:
                if (i5 <= 0) {
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (((roundingMode == RoundingMode.HALF_EVEN ? 1 : 0) & i3 & 1) == 0) {
                        }
                    }
                } else if (iAbs2 <= 0) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static int zzb(int i, RoundingMode roundingMode) {
        if (i <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (zzbg.zza[roundingMode.ordinal()]) {
            case 1:
                zzbi.zza(((i + (-1)) & i) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((((-1257966797) >>> iNumberOfLeadingZeros) - i) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }
}
