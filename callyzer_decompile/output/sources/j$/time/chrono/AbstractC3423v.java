package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* renamed from: j$.time.chrono.v */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3423v {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18103a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f18103a = iArr;
        try {
            iArr[ChronoField.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18103a[ChronoField.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18103a[ChronoField.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
