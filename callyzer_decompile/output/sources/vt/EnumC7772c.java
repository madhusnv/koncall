package vt;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vt.c */
/* loaded from: classes3.dex */
public final class EnumC7772c {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC7772c[] $VALUES;
    public static final EnumC7772c NAVIGATE = new EnumC7772c("NAVIGATE", 0);
    public static final EnumC7772c SUBSCRIPTION_EXPIRY = new EnumC7772c("SUBSCRIPTION_EXPIRY", 1);
    public static final EnumC7772c REDIRECT_TO_EXTENSION = new EnumC7772c("REDIRECT_TO_EXTENSION", 2);

    private static final /* synthetic */ EnumC7772c[] $values() {
        return new EnumC7772c[]{NAVIGATE, SUBSCRIPTION_EXPIRY, REDIRECT_TO_EXTENSION};
    }

    static {
        EnumC7772c[] enumC7772cArr$values = $values();
        $VALUES = enumC7772cArr$values;
        $ENTRIES = b8.m11548b(enumC7772cArr$values);
    }

    private EnumC7772c(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC7772c valueOf(String str) {
        return (EnumC7772c) Enum.valueOf(EnumC7772c.class, str);
    }

    public static EnumC7772c[] values() {
        return (EnumC7772c[]) $VALUES.clone();
    }
}
