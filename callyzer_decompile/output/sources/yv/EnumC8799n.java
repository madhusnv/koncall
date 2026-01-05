package yv;

import com.websoptimization.callyzerbiz.R;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.n */
/* loaded from: classes3.dex */
public final class EnumC8799n {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8799n[] $VALUES;
    public static final C8798m Companion;
    private final int themeMode;
    private final int themeOptionValue;
    public static final EnumC8799n Light = new EnumC8799n("Light", 0, R.string.light, 117);
    public static final EnumC8799n Dark = new EnumC8799n("Dark", 1, R.string.dark, 118);
    public static final EnumC8799n SystemTheme = new EnumC8799n("SystemTheme", 2, R.string.system_theme, 119);

    private static final /* synthetic */ EnumC8799n[] $values() {
        return new EnumC8799n[]{Light, Dark, SystemTheme};
    }

    static {
        EnumC8799n[] enumC8799nArr$values = $values();
        $VALUES = enumC8799nArr$values;
        $ENTRIES = b8.m11548b(enumC8799nArr$values);
        Companion = new C8798m();
    }

    private EnumC8799n(String str, int i10, int i11, int i12) {
        this.themeMode = i11;
        this.themeOptionValue = i12;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8799n valueOf(String str) {
        return (EnumC8799n) Enum.valueOf(EnumC8799n.class, str);
    }

    public static EnumC8799n[] values() {
        return (EnumC8799n[]) $VALUES.clone();
    }

    public final int getThemeMode() {
        return this.themeMode;
    }

    public final int getThemeName() {
        return this.themeMode;
    }

    public final int getThemeOptionValue() {
        return this.themeOptionValue;
    }
}
