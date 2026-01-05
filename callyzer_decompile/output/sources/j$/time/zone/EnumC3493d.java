package j$.time.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.zone.d */
/* loaded from: classes2.dex */
public final class EnumC3493d {
    public static final EnumC3493d STANDARD;
    public static final EnumC3493d UTC;
    public static final EnumC3493d WALL;

    /* renamed from: a */
    public static final /* synthetic */ EnumC3493d[] f18312a;

    public static EnumC3493d valueOf(String str) {
        return (EnumC3493d) Enum.valueOf(EnumC3493d.class, str);
    }

    public static EnumC3493d[] values() {
        return (EnumC3493d[]) f18312a.clone();
    }

    static {
        EnumC3493d enumC3493d = new EnumC3493d("UTC", 0);
        UTC = enumC3493d;
        EnumC3493d enumC3493d2 = new EnumC3493d("WALL", 1);
        WALL = enumC3493d2;
        EnumC3493d enumC3493d3 = new EnumC3493d("STANDARD", 2);
        STANDARD = enumC3493d3;
        f18312a = new EnumC3493d[]{enumC3493d, enumC3493d2, enumC3493d3};
    }
}
