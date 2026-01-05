package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f0 implements InterfaceC3411j {
    public static final f0 BE;
    public static final f0 BEFORE_BE;

    /* renamed from: a */
    public static final /* synthetic */ f0[] f18067a;

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f18067a.clone();
    }

    static {
        f0 f0Var = new f0("BEFORE_BE", 0);
        BEFORE_BE = f0Var;
        f0 f0Var2 = new f0("BE", 1);
        BE = f0Var2;
        f18067a = new f0[]{f0Var, f0Var2};
    }

    @Override // j$.time.chrono.InterfaceC3411j
    public final int getValue() {
        return ordinal();
    }
}
