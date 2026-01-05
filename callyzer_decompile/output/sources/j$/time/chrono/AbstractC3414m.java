package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* renamed from: j$.time.chrono.m */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3414m {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18084a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f18084a = iArr;
        try {
            iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18084a[ChronoField.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18084a[ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18084a[ChronoField.DAY_OF_WEEK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18084a[ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f18084a[ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f18084a[ChronoField.EPOCH_DAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f18084a[ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f18084a[ChronoField.MONTH_OF_YEAR.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f18084a[ChronoField.PROLEPTIC_MONTH.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f18084a[ChronoField.YEAR_OF_ERA.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f18084a[ChronoField.YEAR.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f18084a[ChronoField.ERA.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
    }
}
