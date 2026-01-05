package fk;

import lj.InterfaceC4483f;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.j */
/* loaded from: classes.dex */
public final class EnumC2304j implements InterfaceC4483f {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC2304j[] $VALUES;
    private final int number;
    public static final EnumC2304j COLLECTION_UNKNOWN = new EnumC2304j("COLLECTION_UNKNOWN", 0, 0);
    public static final EnumC2304j COLLECTION_SDK_NOT_INSTALLED = new EnumC2304j("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
    public static final EnumC2304j COLLECTION_ENABLED = new EnumC2304j("COLLECTION_ENABLED", 2, 2);
    public static final EnumC2304j COLLECTION_DISABLED = new EnumC2304j("COLLECTION_DISABLED", 3, 3);
    public static final EnumC2304j COLLECTION_DISABLED_REMOTE = new EnumC2304j("COLLECTION_DISABLED_REMOTE", 4, 4);
    public static final EnumC2304j COLLECTION_SAMPLED = new EnumC2304j("COLLECTION_SAMPLED", 5, 5);

    private static final /* synthetic */ EnumC2304j[] $values() {
        return new EnumC2304j[]{COLLECTION_UNKNOWN, COLLECTION_SDK_NOT_INSTALLED, COLLECTION_ENABLED, COLLECTION_DISABLED, COLLECTION_DISABLED_REMOTE, COLLECTION_SAMPLED};
    }

    static {
        EnumC2304j[] enumC2304jArr$values = $values();
        $VALUES = enumC2304jArr$values;
        $ENTRIES = b8.m11548b(enumC2304jArr$values);
    }

    private EnumC2304j(String str, int i10, int i11) {
        this.number = i11;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC2304j valueOf(String str) {
        return (EnumC2304j) Enum.valueOf(EnumC2304j.class, str);
    }

    public static EnumC2304j[] values() {
        return (EnumC2304j[]) $VALUES.clone();
    }

    @Override // lj.InterfaceC4483f
    public int getNumber() {
        return this.number;
    }
}
