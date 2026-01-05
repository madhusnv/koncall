package g4;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.k */
/* loaded from: classes.dex */
public final class EnumC2495k {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC2495k[] $VALUES;
    public static final EnumC2495k Paragraph = new EnumC2495k("Paragraph", 0);
    public static final EnumC2495k Span = new EnumC2495k("Span", 1);
    public static final EnumC2495k VerbatimTts = new EnumC2495k("VerbatimTts", 2);
    public static final EnumC2495k Url = new EnumC2495k("Url", 3);
    public static final EnumC2495k Link = new EnumC2495k("Link", 4);
    public static final EnumC2495k Clickable = new EnumC2495k("Clickable", 5);
    public static final EnumC2495k String = new EnumC2495k("String", 6);

    private static final /* synthetic */ EnumC2495k[] $values() {
        return new EnumC2495k[]{Paragraph, Span, VerbatimTts, Url, Link, Clickable, String};
    }

    static {
        EnumC2495k[] enumC2495kArr$values = $values();
        $VALUES = enumC2495kArr$values;
        $ENTRIES = b8.m11548b(enumC2495kArr$values);
    }

    private EnumC2495k(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2495k valueOf(String str) {
        return (EnumC2495k) Enum.valueOf(EnumC2495k.class, str);
    }

    public static EnumC2495k[] values() {
        return (EnumC2495k[]) $VALUES.clone();
    }
}
