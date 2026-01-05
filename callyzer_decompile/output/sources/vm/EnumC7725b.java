package vm;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vm.b */
/* loaded from: classes3.dex */
public final class EnumC7725b {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7725b[] $VALUES;
    public static final C7724a Companion;
    public static final EnumC7725b Text = new EnumC7725b("Text", 0);
    public static final EnumC7725b Numeric = new EnumC7725b("Numeric", 1);
    public static final EnumC7725b TextArea = new EnumC7725b("TextArea", 2);
    public static final EnumC7725b Email = new EnumC7725b("Email", 3);
    public static final EnumC7725b Website = new EnumC7725b("Website", 4);
    public static final EnumC7725b Date = new EnumC7725b("Date", 5);

    private static final /* synthetic */ EnumC7725b[] $values() {
        return new EnumC7725b[]{Text, Numeric, TextArea, Email, Website, Date};
    }

    static {
        EnumC7725b[] enumC7725bArr$values = $values();
        $VALUES = enumC7725bArr$values;
        $ENTRIES = b8.m11548b(enumC7725bArr$values);
        Companion = new C7724a();
    }

    private EnumC7725b(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7725b valueOf(String str) {
        return (EnumC7725b) Enum.valueOf(EnumC7725b.class, str);
    }

    public static EnumC7725b[] values() {
        return (EnumC7725b[]) $VALUES.clone();
    }
}
