package j$.time.chrono;

import j$.time.temporal.ChronoField;

/* renamed from: j$.time.chrono.g */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3408g {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18068a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f18068a = iArr;
        try {
            iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18068a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
