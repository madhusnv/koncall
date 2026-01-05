package qe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qe.f */
/* loaded from: classes.dex */
public enum EnumC6195f {
    AV_LOG_STDERR(-16),
    AV_LOG_QUIET(-8),
    AV_LOG_PANIC(0),
    AV_LOG_FATAL(8),
    AV_LOG_ERROR(16),
    AV_LOG_WARNING(24),
    AV_LOG_INFO(32),
    AV_LOG_VERBOSE(40),
    AV_LOG_DEBUG(48),
    AV_LOG_TRACE(56);

    private final int value;

    EnumC6195f(int i10) {
        this.value = i10;
    }

    public static EnumC6195f from(int i10) {
        EnumC6195f enumC6195f = AV_LOG_STDERR;
        if (i10 == enumC6195f.getValue()) {
            return enumC6195f;
        }
        EnumC6195f enumC6195f2 = AV_LOG_QUIET;
        if (i10 == enumC6195f2.getValue()) {
            return enumC6195f2;
        }
        EnumC6195f enumC6195f3 = AV_LOG_PANIC;
        if (i10 == enumC6195f3.getValue()) {
            return enumC6195f3;
        }
        EnumC6195f enumC6195f4 = AV_LOG_FATAL;
        if (i10 == enumC6195f4.getValue()) {
            return enumC6195f4;
        }
        EnumC6195f enumC6195f5 = AV_LOG_ERROR;
        if (i10 == enumC6195f5.getValue()) {
            return enumC6195f5;
        }
        EnumC6195f enumC6195f6 = AV_LOG_WARNING;
        if (i10 == enumC6195f6.getValue()) {
            return enumC6195f6;
        }
        EnumC6195f enumC6195f7 = AV_LOG_INFO;
        if (i10 == enumC6195f7.getValue()) {
            return enumC6195f7;
        }
        EnumC6195f enumC6195f8 = AV_LOG_VERBOSE;
        if (i10 == enumC6195f8.getValue()) {
            return enumC6195f8;
        }
        EnumC6195f enumC6195f9 = AV_LOG_DEBUG;
        return i10 == enumC6195f9.getValue() ? enumC6195f9 : AV_LOG_TRACE;
    }

    public int getValue() {
        return this.value;
    }
}
