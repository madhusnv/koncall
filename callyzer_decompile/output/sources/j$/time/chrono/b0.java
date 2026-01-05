package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class b0 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18055a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f18055a = iArr;
        try {
            iArr[ChronoField.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18055a[ChronoField.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18055a[ChronoField.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
