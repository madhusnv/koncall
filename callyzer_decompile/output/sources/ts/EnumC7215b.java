package ts;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ts.b */
/* loaded from: classes3.dex */
public final class EnumC7215b {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7215b[] $VALUES;
    public static final EnumC7215b InitialFolderSelect = new EnumC7215b("InitialFolderSelect", 0);
    public static final EnumC7215b FolderSelectInSettings = new EnumC7215b("FolderSelectInSettings", 1);
    public static final EnumC7215b NeedStoragePermission = new EnumC7215b("NeedStoragePermission", 2);
    public static final EnumC7215b AutoStartPermission = new EnumC7215b("AutoStartPermission", 3);
    public static final EnumC7215b AppUpdated = new EnumC7215b("AppUpdated", 4);
    public static final EnumC7215b Error = new EnumC7215b("Error", 5);

    private static final /* synthetic */ EnumC7215b[] $values() {
        return new EnumC7215b[]{InitialFolderSelect, FolderSelectInSettings, NeedStoragePermission, AutoStartPermission, AppUpdated, Error};
    }

    static {
        EnumC7215b[] enumC7215bArr$values = $values();
        $VALUES = enumC7215bArr$values;
        $ENTRIES = b8.m11548b(enumC7215bArr$values);
    }

    private EnumC7215b(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7215b valueOf(String str) {
        return (EnumC7215b) Enum.valueOf(EnumC7215b.class, str);
    }

    public static EnumC7215b[] values() {
        return (EnumC7215b[]) $VALUES.clone();
    }
}
