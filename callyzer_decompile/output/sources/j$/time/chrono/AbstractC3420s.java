package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* renamed from: j$.time.chrono.s */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3420s {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18093a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f18093a = iArr;
        try {
            iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18093a[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18093a[ChronoField.YEAR_OF_ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18093a[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18093a[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f18093a[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f18093a[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f18093a[ChronoField.ERA.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f18093a[ChronoField.YEAR.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
