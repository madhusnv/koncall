package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;

/* renamed from: j$.time.r */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3468r {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18240a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f18241b;

    static {
        int[] iArr = new int[ChronoUnit.values().length];
        f18241b = iArr;
        try {
            iArr[ChronoUnit.YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18241b[ChronoUnit.DECADES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18241b[ChronoUnit.CENTURIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18241b[ChronoUnit.MILLENNIA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18241b[ChronoUnit.ERAS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[ChronoField.values().length];
        f18240a = iArr2;
        try {
            iArr2[ChronoField.YEAR_OF_ERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f18240a[ChronoField.YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f18240a[ChronoField.ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
