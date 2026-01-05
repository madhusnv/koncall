package p001o;

import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Api;
import java.math.RoundingMode;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public abstract class fl8 {

    /* renamed from: a */
    public static final byte[] f23605a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b */
    public static final int[] f23606b = {1, 10, 100, 1000, TransferRecord.MAXIMUM_UPLOAD_PARTS, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: c */
    public static final int[] f23607c = {3, 31, MediaError.DetailedErrorCode.HLS_SEGMENT_PARSING, 3162, 31622, 316227, 3162277, 31622776, 316227766, Api.BaseClientBuilder.API_PRIORITY_OTHER};

    /* renamed from: d */
    public static final int[] f23608d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: e */
    public static int[] f23609e = {Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, 65536, 2345, 477, Opcodes.INSTANCEOF, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* renamed from: o.fl8$a */
    public static /* synthetic */ class C13481a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23610a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f23610a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23610a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23610a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23610a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23610a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23610a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23610a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23610a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: a */
    public static int m27017a(int i, int i2) {
        long j = i + i2;
        int i3 = (int) j;
        mza.m39912b(j == ((long) i3), "checkedAdd", i, i2);
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m27018b(int i, int i2, RoundingMode roundingMode) {
        dgd.m23062o(roundingMode);
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (C13481a.f23610a[roundingMode.ordinal()]) {
            case 1:
                mza.m39916f(i4 == 0);
                z = false;
                return !z ? i3 + i5 : i3;
            case 2:
                z = false;
                if (!z) {
                }
                break;
            case 3:
                if (i5 >= 0) {
                }
                if (!z) {
                }
                break;
            case 4:
                if (!z) {
                }
                break;
            case 5:
                if (i5 <= 0) {
                }
                if (!z) {
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i3 & 1) != 0))) {
                        }
                    }
                } else if (iAbs2 <= 0) {
                }
                if (!z) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: c */
    public static boolean m27019c(int i) {
        return (i > 0) & ((i & (i + (-1))) == 0);
    }

    /* renamed from: d */
    public static int m27020d(int i, int i2) {
        return (~(~(i - i2))) >>> 31;
    }

    /* renamed from: e */
    public static int m27021e(int i, RoundingMode roundingMode) {
        mza.m39915e("x", i);
        switch (C13481a.f23610a[roundingMode.ordinal()]) {
            case 1:
                mza.m39916f(m27019c(i));
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
                return (31 - iNumberOfLeadingZeros) + m27020d((-1257966797) >>> iNumberOfLeadingZeros, i);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: f */
    public static int m27022f(int i, int i2) {
        return br8.m19645l(i * i2);
    }
}
