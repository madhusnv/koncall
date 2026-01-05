package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.format.p */
/* loaded from: classes2.dex */
public final class EnumC3446p implements InterfaceC3435e {
    public static final EnumC3446p INSENSITIVE;
    public static final EnumC3446p LENIENT;
    public static final EnumC3446p SENSITIVE;
    public static final EnumC3446p STRICT;

    /* renamed from: a */
    public static final /* synthetic */ EnumC3446p[] f18186a;

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: t */
    public final boolean mo7963t(C3453w c3453w, StringBuilder sb2) {
        return true;
    }

    public static EnumC3446p valueOf(String str) {
        return (EnumC3446p) Enum.valueOf(EnumC3446p.class, str);
    }

    public static EnumC3446p[] values() {
        return (EnumC3446p[]) f18186a.clone();
    }

    static {
        EnumC3446p enumC3446p = new EnumC3446p("SENSITIVE", 0);
        SENSITIVE = enumC3446p;
        EnumC3446p enumC3446p2 = new EnumC3446p("INSENSITIVE", 1);
        INSENSITIVE = enumC3446p2;
        EnumC3446p enumC3446p3 = new EnumC3446p("STRICT", 2);
        STRICT = enumC3446p3;
        EnumC3446p enumC3446p4 = new EnumC3446p("LENIENT", 3);
        LENIENT = enumC3446p4;
        f18186a = new EnumC3446p[]{enumC3446p, enumC3446p2, enumC3446p3, enumC3446p4};
    }

    @Override // j$.time.format.InterfaceC3435e
    /* renamed from: C */
    public final int mo7962C(C3451u c3451u, CharSequence charSequence, int i10) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            c3451u.f18203b = true;
            return i10;
        }
        if (iOrdinal == 1) {
            c3451u.f18203b = false;
            return i10;
        }
        if (iOrdinal == 2) {
            c3451u.f18204c = true;
            return i10;
        }
        if (iOrdinal != 3) {
            return i10;
        }
        c3451u.f18204c = false;
        return i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
