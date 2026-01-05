package j$.time;

import j$.time.temporal.ChronoField;

/* renamed from: j$.time.m */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3463m {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18229a;

    static {
        int[] iArr = new int[ChronoField.values().length];
        f18229a = iArr;
        try {
            iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18229a[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
