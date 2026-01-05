package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;

/* renamed from: j$.time.i */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3459i {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18222a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f18223b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f18223b = iArr;
        try {
            iArr[ChronoUnit.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18223b[ChronoUnit.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18223b[ChronoUnit.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18223b[ChronoUnit.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18223b[ChronoUnit.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f18223b[ChronoUnit.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f18223b[ChronoUnit.HALF_DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr2 = new int[ChronoField.values().length];
        f18222a = iArr2;
        try {
            iArr2[ChronoField.NANO_OF_SECOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f18222a[ChronoField.NANO_OF_DAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f18222a[ChronoField.MICRO_OF_SECOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f18222a[ChronoField.MICRO_OF_DAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f18222a[ChronoField.MILLI_OF_SECOND.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f18222a[ChronoField.MILLI_OF_DAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f18222a[ChronoField.SECOND_OF_MINUTE.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f18222a[ChronoField.SECOND_OF_DAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f18222a[ChronoField.MINUTE_OF_HOUR.ordinal()] = 9;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f18222a[ChronoField.MINUTE_OF_DAY.ordinal()] = 10;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            f18222a[ChronoField.HOUR_OF_AMPM.ordinal()] = 11;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            f18222a[ChronoField.CLOCK_HOUR_OF_AMPM.ordinal()] = 12;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            f18222a[ChronoField.HOUR_OF_DAY.ordinal()] = 13;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            f18222a[ChronoField.CLOCK_HOUR_OF_DAY.ordinal()] = 14;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            f18222a[ChronoField.AMPM_OF_DAY.ordinal()] = 15;
        } catch (NoSuchFieldError unused22) {
        }
    }
}
