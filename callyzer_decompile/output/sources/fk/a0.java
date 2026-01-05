package fk;

import lj.InterfaceC4483f;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 implements InterfaceC4483f {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    private final int number;
    public static final a0 LOG_ENVIRONMENT_UNKNOWN = new a0("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
    public static final a0 LOG_ENVIRONMENT_AUTOPUSH = new a0("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
    public static final a0 LOG_ENVIRONMENT_STAGING = new a0("LOG_ENVIRONMENT_STAGING", 2, 2);
    public static final a0 LOG_ENVIRONMENT_PROD = new a0("LOG_ENVIRONMENT_PROD", 3, 3);

    private static final /* synthetic */ a0[] $values() {
        return new a0[]{LOG_ENVIRONMENT_UNKNOWN, LOG_ENVIRONMENT_AUTOPUSH, LOG_ENVIRONMENT_STAGING, LOG_ENVIRONMENT_PROD};
    }

    static {
        a0[] a0VarArr$values = $values();
        $VALUES = a0VarArr$values;
        $ENTRIES = b8.m11548b(a0VarArr$values);
    }

    private a0(String str, int i10, int i11) {
        this.number = i11;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }

    @Override // lj.InterfaceC4483f
    public int getNumber() {
        return this.number;
    }
}
