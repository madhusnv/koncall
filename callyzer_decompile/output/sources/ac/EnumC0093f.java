package ac;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ac.f */
/* loaded from: classes.dex */
public final class EnumC0093f {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC0093f[] $VALUES;
    public static final EnumC0093f LEGACY = new EnumC0093f("LEGACY", 0);
    public static final EnumC0093f STANDARD = new EnumC0093f("STANDARD", 1);
    public static final EnumC0093f ADAPTIVE = new EnumC0093f("ADAPTIVE", 2);

    private static final /* synthetic */ EnumC0093f[] $values() {
        return new EnumC0093f[]{LEGACY, STANDARD, ADAPTIVE};
    }

    static {
        EnumC0093f[] enumC0093fArr$values = $values();
        $VALUES = enumC0093fArr$values;
        $ENTRIES = b8.m11548b(enumC0093fArr$values);
    }

    private EnumC0093f(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0093f valueOf(String str) {
        return (EnumC0093f) Enum.valueOf(EnumC0093f.class, str);
    }

    public static EnumC0093f[] values() {
        return (EnumC0093f[]) $VALUES.clone();
    }
}
