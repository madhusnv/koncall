package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* renamed from: j$.time.chrono.q */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3418q {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18091a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f18091a = iArr;
        try {
            iArr[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18091a[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18091a[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18091a[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18091a[ChronoField.YEAR_OF_ERA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f18091a[ChronoField.DAY_OF_YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f18091a[ChronoField.YEAR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f18091a[ChronoField.ERA.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
