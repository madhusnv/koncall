package h2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class r0 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f15767a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f15768b;

    static {
        int[] iArr = new int[t0.values().length];
        try {
            iArr[t0.Filled.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t0.Outlined.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f15767a = iArr;
        int[] iArr2 = new int[EnumC2817v.values().length];
        try {
            iArr2[EnumC2817v.Focused.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumC2817v.UnfocusedEmpty.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC2817v.UnfocusedNotEmpty.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f15768b = iArr2;
    }
}
