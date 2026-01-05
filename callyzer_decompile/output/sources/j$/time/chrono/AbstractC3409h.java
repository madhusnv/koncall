package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* renamed from: j$.time.chrono.h */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3409h {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18069a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f18069a = iArr;
        try {
            iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18069a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
