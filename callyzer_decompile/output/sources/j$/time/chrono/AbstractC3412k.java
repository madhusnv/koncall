package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* renamed from: j$.time.chrono.k */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3412k {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18073a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f18073a = iArr;
        try {
            iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18073a[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18073a[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18073a[ChronoField.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18073a[ChronoField.YEAR_OF_ERA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f18073a[ChronoField.ERA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
