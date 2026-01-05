package j$.time;

import j$.time.temporal.ChronoField;

/* renamed from: j$.time.k */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3461k {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18225a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f18225a = iArr;
        try {
            iArr[ChronoField.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18225a[ChronoField.MONTH_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
