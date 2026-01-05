package tb;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tb.c */
/* loaded from: classes.dex */
public final class EnumC7092c {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7092c[] $VALUES;
    public static final EnumC7092c NONE = new EnumC7092c("NONE", 0);
    public static final EnumC7092c X_AMZ_CONTENT_SHA256 = new EnumC7092c("X_AMZ_CONTENT_SHA256", 1);

    private static final /* synthetic */ EnumC7092c[] $values() {
        return new EnumC7092c[]{NONE, X_AMZ_CONTENT_SHA256};
    }

    static {
        EnumC7092c[] enumC7092cArr$values = $values();
        $VALUES = enumC7092cArr$values;
        $ENTRIES = b8.m11548b(enumC7092cArr$values);
    }

    private EnumC7092c(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7092c valueOf(String str) {
        return (EnumC7092c) Enum.valueOf(EnumC7092c.class, str);
    }

    public static EnumC7092c[] values() {
        return (EnumC7092c[]) $VALUES.clone();
    }
}
