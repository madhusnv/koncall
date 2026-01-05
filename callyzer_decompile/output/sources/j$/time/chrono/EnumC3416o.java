package j$.time.chrono;

import j$.time.temporal.C3485o;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.chrono.o */
/* loaded from: classes2.dex */
public final class EnumC3416o implements InterfaceC3411j {
    public static final EnumC3416o AH;

    /* renamed from: a */
    public static final /* synthetic */ EnumC3416o[] f18089a;

    @Override // j$.time.chrono.InterfaceC3411j
    public final int getValue() {
        return 1;
    }

    public static EnumC3416o valueOf(String str) {
        return (EnumC3416o) Enum.valueOf(EnumC3416o.class, str);
    }

    public static EnumC3416o[] values() {
        return (EnumC3416o[]) f18089a.clone();
    }

    static {
        EnumC3416o enumC3416o = new EnumC3416o("AH", 0);
        AH = enumC3416o;
        f18089a = new EnumC3416o[]{enumC3416o};
    }

    @Override // j$.time.temporal.TemporalAccessor
    /* renamed from: l */
    public final C3485o mo7812l(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return C3485o.m8013f(1L, 1L);
        }
        return super.mo7812l(temporalField);
    }
}
