package j$.time;

import j$.time.temporal.ChronoField;

/* renamed from: j$.time.w */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3489w {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18303a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f18303a = iArr;
        try {
            iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18303a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
