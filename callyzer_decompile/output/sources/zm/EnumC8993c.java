package zm;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zm.c */
/* loaded from: classes3.dex */
public final class EnumC8993c {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC8993c[] $VALUES;
    public static final EnumC8993c NOT_FOUND = new EnumC8993c("NOT_FOUND", 0);
    public static final EnumC8993c CON_COM_FAILED = new EnumC8993c("CON_COM_FAILED", 1);
    public static final EnumC8993c DEVICE_OUT_OF_SPACE = new EnumC8993c("DEVICE_OUT_OF_SPACE", 2);
    public static final EnumC8993c LARGE_SIZE = new EnumC8993c("LARGE_SIZE", 3);
    public static final EnumC8993c SPACE_GET_FAILED = new EnumC8993c("SPACE_GET_FAILED", 4);
    public static final EnumC8993c UPLOAD_FAILED = new EnumC8993c("UPLOAD_FAILED", 5);
    public static final EnumC8993c SPACE_UPDATE_FAILED = new EnumC8993c("SPACE_UPDATE_FAILED", 6);
    public static final EnumC8993c SUCCESS = new EnumC8993c("SUCCESS", 7);
    public static final EnumC8993c DELETED = new EnumC8993c("DELETED", 8);
    public static final EnumC8993c OUT_OF_SPACE = new EnumC8993c("OUT_OF_SPACE", 9);
    public static final EnumC8993c UPLOAD_IN_PROGRESS = new EnumC8993c("UPLOAD_IN_PROGRESS", 10);
    public static final EnumC8993c COMPRESS_IN_PROGRESS = new EnumC8993c("COMPRESS_IN_PROGRESS", 11);

    private static final /* synthetic */ EnumC8993c[] $values() {
        return new EnumC8993c[]{NOT_FOUND, CON_COM_FAILED, DEVICE_OUT_OF_SPACE, LARGE_SIZE, SPACE_GET_FAILED, UPLOAD_FAILED, SPACE_UPDATE_FAILED, SUCCESS, DELETED, OUT_OF_SPACE, UPLOAD_IN_PROGRESS, COMPRESS_IN_PROGRESS};
    }

    static {
        EnumC8993c[] enumC8993cArr$values = $values();
        $VALUES = enumC8993cArr$values;
        $ENTRIES = b8.m11548b(enumC8993cArr$values);
    }

    private EnumC8993c(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC8993c valueOf(String str) {
        return (EnumC8993c) Enum.valueOf(EnumC8993c.class, str);
    }

    public static EnumC8993c[] values() {
        return (EnumC8993c[]) $VALUES.clone();
    }
}
