package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.math.RoundingMode;

/* loaded from: classes3.dex */
public abstract class ix5 {

    /* renamed from: a */
    public static final double f29337a = Math.log(2.0d);

    /* renamed from: b */
    public static final double[] f29338b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* renamed from: o.ix5$a */
    public static /* synthetic */ class C14400a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29339a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f29339a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29339a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29339a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29339a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29339a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29339a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29339a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29339a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m32877a(double d) {
        return kx5.m36275b(d) && (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || 52 - Long.numberOfTrailingZeros(kx5.m36274a(d)) <= Math.getExponent(d));
    }

    /* renamed from: b */
    public static double m32878b(double d, RoundingMode roundingMode) {
        if (!kx5.m36275b(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (C14400a.f29339a[roundingMode.ordinal()]) {
            case 1:
                mza.m39916f(m32877a(d));
                return d;
            case 2:
                return (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || m32877a(d)) ? d : ((long) d) - 1;
            case 3:
                return (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || m32877a(d)) ? d : ((long) d) + 1;
            case 4:
                return d;
            case 5:
                if (m32877a(d)) {
                    return d;
                }
                return ((long) d) + (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1 : -1);
            case 6:
                return Math.rint(d);
            case 7:
                double dRint = Math.rint(d);
                return Math.abs(d - dRint) == 0.5d ? d + Math.copySign(0.5d, d) : dRint;
            case 8:
                double dRint2 = Math.rint(d);
                return Math.abs(d - dRint2) == 0.5d ? d : dRint2;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: c */
    public static long m32879c(double d, RoundingMode roundingMode) {
        double dM32878b = m32878b(d, roundingMode);
        mza.m39911a(((-9.223372036854776E18d) - dM32878b < 1.0d) & (dM32878b < 9.223372036854776E18d), d, roundingMode);
        return (long) dM32878b;
    }
}
