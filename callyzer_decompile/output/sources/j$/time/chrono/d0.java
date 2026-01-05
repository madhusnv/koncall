package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class d0 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18058a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f18058a = iArr;
        try {
            iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18058a[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18058a[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18058a[ChronoField.YEAR_OF_ERA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18058a[ChronoField.PROLEPTIC_MONTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f18058a[ChronoField.YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f18058a[ChronoField.ERA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
