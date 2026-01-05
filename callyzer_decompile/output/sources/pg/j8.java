package pg;

import he.EnumC2915f;
import kotlin.NoWhenBranchMatchedException;
import org.bouncycastle.iana.AEADAlgorithm;
import yd.AbstractC8624g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class j8 {
    /* renamed from: a */
    public static final double m11714a(int i10, int i11, int i12, int i13, EnumC2915f enumC2915f) {
        double d2 = i12 / i10;
        double d10 = i13 / i11;
        int i14 = AbstractC8624g.f41897a[enumC2915f.ordinal()];
        if (i14 == 1) {
            return Math.max(d2, d10);
        }
        if (i14 == 2) {
            return Math.min(d2, d10);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static int m11715b(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
            default:
                return 0;
            case 16:
                return 17;
        }
    }
}
