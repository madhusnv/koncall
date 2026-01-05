package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.chrono.p */
/* loaded from: classes2.dex */
public final class EnumC3417p implements InterfaceC3411j {
    public static final EnumC3417p BCE;
    public static final EnumC3417p CE;

    /* renamed from: a */
    public static final /* synthetic */ EnumC3417p[] f18090a;

    public static EnumC3417p valueOf(String str) {
        return (EnumC3417p) Enum.valueOf(EnumC3417p.class, str);
    }

    public static EnumC3417p[] values() {
        return (EnumC3417p[]) f18090a.clone();
    }

    static {
        EnumC3417p enumC3417p = new EnumC3417p("BCE", 0);
        BCE = enumC3417p;
        EnumC3417p enumC3417p2 = new EnumC3417p("CE", 1);
        CE = enumC3417p2;
        f18090a = new EnumC3417p[]{enumC3417p, enumC3417p2};
    }

    @Override // j$.time.chrono.InterfaceC3411j
    public final int getValue() {
        return ordinal();
    }
}
