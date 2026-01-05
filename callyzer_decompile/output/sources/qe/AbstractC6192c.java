package qe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qe.c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6192c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f30149a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f30150b;

    static {
        int[] iArr = new int[EnumC6195f.values().length];
        f30150b = iArr;
        try {
            iArr[EnumC6195f.AV_LOG_QUIET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f30150b[EnumC6195f.AV_LOG_TRACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f30150b[EnumC6195f.AV_LOG_DEBUG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f30150b[EnumC6195f.AV_LOG_INFO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f30150b[EnumC6195f.AV_LOG_WARNING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f30150b[EnumC6195f.AV_LOG_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f30150b[EnumC6195f.AV_LOG_FATAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f30150b[EnumC6195f.AV_LOG_PANIC.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f30150b[EnumC6195f.AV_LOG_STDERR.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f30150b[EnumC6195f.AV_LOG_VERBOSE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        int[] iArr2 = new int[EnumC6197h.values().length];
        f30149a = iArr2;
        try {
            iArr2[EnumC6197h.NEVER_PRINT_LOGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f30149a[EnumC6197h.PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f30149a[EnumC6197h.PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f30149a[EnumC6197h.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f30149a[EnumC6197h.ALWAYS_PRINT_LOGS.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
    }
}
