package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;

/* renamed from: j$.time.t */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3470t {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18244a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f18245b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f18245b = iArr;
        try {
            iArr[ChronoUnit.MONTHS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18245b[ChronoUnit.YEARS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18245b[ChronoUnit.DECADES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18245b[ChronoUnit.CENTURIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18245b[ChronoUnit.MILLENNIA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f18245b[ChronoUnit.ERAS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[ChronoField.values().length];
        f18244a = iArr2;
        try {
            iArr2[ChronoField.MONTH_OF_YEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f18244a[ChronoField.PROLEPTIC_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f18244a[ChronoField.YEAR_OF_ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f18244a[ChronoField.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f18244a[ChronoField.ERA.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
