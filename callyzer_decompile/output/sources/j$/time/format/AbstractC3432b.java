package j$.time.format;

/* renamed from: j$.time.format.b */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3432b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f18144a;

    static {
        int[] iArr = new int[SignStyle.values().length];
        f18144a = iArr;
        try {
            iArr[SignStyle.EXCEEDS_PAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18144a[SignStyle.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18144a[SignStyle.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18144a[SignStyle.NOT_NEGATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
