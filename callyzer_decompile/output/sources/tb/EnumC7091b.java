package tb;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tb.b */
/* loaded from: classes.dex */
public final class EnumC7091b {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7091b[] $VALUES;
    public static final EnumC7091b HTTP_REQUEST_VIA_HEADERS = new EnumC7091b("HTTP_REQUEST_VIA_HEADERS", 0);
    public static final EnumC7091b HTTP_REQUEST_VIA_QUERY_PARAMS = new EnumC7091b("HTTP_REQUEST_VIA_QUERY_PARAMS", 1);
    public static final EnumC7091b HTTP_REQUEST_CHUNK = new EnumC7091b("HTTP_REQUEST_CHUNK", 2);
    public static final EnumC7091b HTTP_REQUEST_TRAILING_HEADERS = new EnumC7091b("HTTP_REQUEST_TRAILING_HEADERS", 3);
    public static final EnumC7091b HTTP_REQUEST_EVENT = new EnumC7091b("HTTP_REQUEST_EVENT", 4);

    private static final /* synthetic */ EnumC7091b[] $values() {
        return new EnumC7091b[]{HTTP_REQUEST_VIA_HEADERS, HTTP_REQUEST_VIA_QUERY_PARAMS, HTTP_REQUEST_CHUNK, HTTP_REQUEST_TRAILING_HEADERS, HTTP_REQUEST_EVENT};
    }

    static {
        EnumC7091b[] enumC7091bArr$values = $values();
        $VALUES = enumC7091bArr$values;
        $ENTRIES = b8.m11548b(enumC7091bArr$values);
    }

    private EnumC7091b(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7091b valueOf(String str) {
        return (EnumC7091b) Enum.valueOf(EnumC7091b.class, str);
    }

    public static EnumC7091b[] values() {
        return (EnumC7091b[]) $VALUES.clone();
    }
}
