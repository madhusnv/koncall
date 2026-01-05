package ud;

import kotlin.NoWhenBranchMatchedException;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ud.l */
/* loaded from: classes.dex */
public final class EnumC7408l {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7408l[] $VALUES;
    public static final EnumC7408l Linux = new EnumC7408l("Linux", 0);
    public static final EnumC7408l MacOs = new EnumC7408l("MacOs", 1);
    public static final EnumC7408l Windows = new EnumC7408l("Windows", 2);
    public static final EnumC7408l Android = new EnumC7408l("Android", 3);
    public static final EnumC7408l Ios = new EnumC7408l("Ios", 4);
    public static final EnumC7408l Unknown = new EnumC7408l("Unknown", 5);

    private static final /* synthetic */ EnumC7408l[] $values() {
        return new EnumC7408l[]{Linux, MacOs, Windows, Android, Ios, Unknown};
    }

    static {
        EnumC7408l[] enumC7408lArr$values = $values();
        $VALUES = enumC7408lArr$values;
        $ENTRIES = b8.m11548b(enumC7408lArr$values);
    }

    private EnumC7408l(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7408l valueOf(String str) {
        return (EnumC7408l) Enum.valueOf(EnumC7408l.class, str);
    }

    public static EnumC7408l[] values() {
        return (EnumC7408l[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AbstractC7407k.f35197a[ordinal()]) {
            case 1:
                return "linux";
            case 2:
                return "macos";
            case 3:
                return "windows";
            case 4:
                return "android";
            case 5:
                return "ios";
            case 6:
                return "unknown";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
