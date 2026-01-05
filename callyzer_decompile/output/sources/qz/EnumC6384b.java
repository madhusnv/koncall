package qz;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qz.b */
/* loaded from: classes3.dex */
public final class EnumC6384b {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC6384b[] $VALUES;
    public static final C6383a Companion;
    private final int httpCode;
    public static final EnumC6384b NO_ERROR = new EnumC6384b("NO_ERROR", 0, 0);
    public static final EnumC6384b PROTOCOL_ERROR = new EnumC6384b("PROTOCOL_ERROR", 1, 1);
    public static final EnumC6384b INTERNAL_ERROR = new EnumC6384b("INTERNAL_ERROR", 2, 2);
    public static final EnumC6384b FLOW_CONTROL_ERROR = new EnumC6384b("FLOW_CONTROL_ERROR", 3, 3);
    public static final EnumC6384b SETTINGS_TIMEOUT = new EnumC6384b("SETTINGS_TIMEOUT", 4, 4);
    public static final EnumC6384b STREAM_CLOSED = new EnumC6384b("STREAM_CLOSED", 5, 5);
    public static final EnumC6384b FRAME_SIZE_ERROR = new EnumC6384b("FRAME_SIZE_ERROR", 6, 6);
    public static final EnumC6384b REFUSED_STREAM = new EnumC6384b("REFUSED_STREAM", 7, 7);
    public static final EnumC6384b CANCEL = new EnumC6384b("CANCEL", 8, 8);
    public static final EnumC6384b COMPRESSION_ERROR = new EnumC6384b("COMPRESSION_ERROR", 9, 9);
    public static final EnumC6384b CONNECT_ERROR = new EnumC6384b("CONNECT_ERROR", 10, 10);
    public static final EnumC6384b ENHANCE_YOUR_CALM = new EnumC6384b("ENHANCE_YOUR_CALM", 11, 11);
    public static final EnumC6384b INADEQUATE_SECURITY = new EnumC6384b("INADEQUATE_SECURITY", 12, 12);
    public static final EnumC6384b HTTP_1_1_REQUIRED = new EnumC6384b("HTTP_1_1_REQUIRED", 13, 13);

    private static final /* synthetic */ EnumC6384b[] $values() {
        return new EnumC6384b[]{NO_ERROR, PROTOCOL_ERROR, INTERNAL_ERROR, FLOW_CONTROL_ERROR, SETTINGS_TIMEOUT, STREAM_CLOSED, FRAME_SIZE_ERROR, REFUSED_STREAM, CANCEL, COMPRESSION_ERROR, CONNECT_ERROR, ENHANCE_YOUR_CALM, INADEQUATE_SECURITY, HTTP_1_1_REQUIRED};
    }

    static {
        EnumC6384b[] enumC6384bArr$values = $values();
        $VALUES = enumC6384bArr$values;
        $ENTRIES = b8.m11548b(enumC6384bArr$values);
        Companion = new C6383a();
    }

    private EnumC6384b(String str, int i10, int i11) {
        this.httpCode = i11;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC6384b valueOf(String str) {
        return (EnumC6384b) Enum.valueOf(EnumC6384b.class, str);
    }

    public static EnumC6384b[] values() {
        return (EnumC6384b[]) $VALUES.clone();
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
