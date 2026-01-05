package nx;

import kotlin.jvm.internal.AbstractC4148f;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nx.o */
/* loaded from: classes3.dex */
public final class EnumC5177o {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC5177o[] $VALUES;
    private final int mask;
    private final int value;
    public static final EnumC5177o IGNORE_CASE = new EnumC5177o("IGNORE_CASE", 0, 2, 0, 2, null);
    public static final EnumC5177o MULTILINE = new EnumC5177o("MULTILINE", 1, 8, 0, 2, null);
    public static final EnumC5177o LITERAL = new EnumC5177o("LITERAL", 2, 16, 0, 2, null);
    public static final EnumC5177o UNIX_LINES = new EnumC5177o("UNIX_LINES", 3, 1, 0, 2, null);
    public static final EnumC5177o COMMENTS = new EnumC5177o("COMMENTS", 4, 4, 0, 2, null);
    public static final EnumC5177o DOT_MATCHES_ALL = new EnumC5177o("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
    public static final EnumC5177o CANON_EQ = new EnumC5177o("CANON_EQ", 6, 128, 0, 2, null);

    private static final /* synthetic */ EnumC5177o[] $values() {
        return new EnumC5177o[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        EnumC5177o[] enumC5177oArr$values = $values();
        $VALUES = enumC5177oArr$values;
        $ENTRIES = b8.m11548b(enumC5177oArr$values);
    }

    private EnumC5177o(String str, int i10, int i11, int i12) {
        this.value = i11;
        this.mask = i12;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5177o valueOf(String str) {
        return (EnumC5177o) Enum.valueOf(EnumC5177o.class, str);
    }

    public static EnumC5177o[] values() {
        return (EnumC5177o[]) $VALUES.clone();
    }

    public int getMask() {
        return this.mask;
    }

    public int getValue() {
        return this.value;
    }

    public /* synthetic */ EnumC5177o(String str, int i10, int i11, int i12, int i13, AbstractC4148f abstractC4148f) {
        this(str, i10, i11, (i13 & 2) != 0 ? i11 : i12);
    }
}
