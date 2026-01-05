package kn;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kn.c */
/* loaded from: classes3.dex */
public final class EnumC4123c {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC4123c[] $VALUES;
    public static final EnumC4123c UPLOAD_NO_ERROR = new EnumC4123c("UPLOAD_NO_ERROR", 0);
    public static final EnumC4123c UPLOAD_OUT_OF_SPACE_ERROR = new EnumC4123c("UPLOAD_OUT_OF_SPACE_ERROR", 1);
    public static final EnumC4123c UPLOAD_NO_CONNECTION_ERROR = new EnumC4123c("UPLOAD_NO_CONNECTION_ERROR", 2);
    public static final EnumC4123c UPLOAD_SUBSCRIPTION_EXPIRED = new EnumC4123c("UPLOAD_SUBSCRIPTION_EXPIRED", 3);
    public static final EnumC4123c UPLOAD_SERVER_NOT_RESPONDING = new EnumC4123c("UPLOAD_SERVER_NOT_RESPONDING", 4);

    private static final /* synthetic */ EnumC4123c[] $values() {
        return new EnumC4123c[]{UPLOAD_NO_ERROR, UPLOAD_OUT_OF_SPACE_ERROR, UPLOAD_NO_CONNECTION_ERROR, UPLOAD_SUBSCRIPTION_EXPIRED, UPLOAD_SERVER_NOT_RESPONDING};
    }

    static {
        EnumC4123c[] enumC4123cArr$values = $values();
        $VALUES = enumC4123cArr$values;
        $ENTRIES = b8.m11548b(enumC4123cArr$values);
    }

    private EnumC4123c(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4123c valueOf(String str) {
        return (EnumC4123c) Enum.valueOf(EnumC4123c.class, str);
    }

    public static EnumC4123c[] values() {
        return (EnumC4123c[]) $VALUES.clone();
    }
}
