package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.chrono.z */
/* loaded from: classes2.dex */
public final class EnumC3427z implements InterfaceC3411j {
    public static final EnumC3427z BEFORE_ROC;
    public static final EnumC3427z ROC;

    /* renamed from: a */
    public static final /* synthetic */ EnumC3427z[] f18107a;

    public static EnumC3427z valueOf(String str) {
        return (EnumC3427z) Enum.valueOf(EnumC3427z.class, str);
    }

    public static EnumC3427z[] values() {
        return (EnumC3427z[]) f18107a.clone();
    }

    static {
        EnumC3427z enumC3427z = new EnumC3427z("BEFORE_ROC", 0);
        BEFORE_ROC = enumC3427z;
        EnumC3427z enumC3427z2 = new EnumC3427z("ROC", 1);
        ROC = enumC3427z2;
        f18107a = new EnumC3427z[]{enumC3427z, enumC3427z2};
    }

    @Override // j$.time.chrono.InterfaceC3411j
    public final int getValue() {
        return ordinal();
    }
}
