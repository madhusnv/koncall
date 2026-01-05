package d7;

import kotlin.jvm.internal.AbstractC4154l;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d7.q */
/* loaded from: classes.dex */
public final class EnumC1645q {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC1645q[] $VALUES;
    public static final EnumC1645q DESTROYED = new EnumC1645q("DESTROYED", 0);
    public static final EnumC1645q INITIALIZED = new EnumC1645q("INITIALIZED", 1);
    public static final EnumC1645q CREATED = new EnumC1645q("CREATED", 2);
    public static final EnumC1645q STARTED = new EnumC1645q("STARTED", 3);
    public static final EnumC1645q RESUMED = new EnumC1645q("RESUMED", 4);

    private static final /* synthetic */ EnumC1645q[] $values() {
        return new EnumC1645q[]{DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED};
    }

    static {
        EnumC1645q[] enumC1645qArr$values = $values();
        $VALUES = enumC1645qArr$values;
        $ENTRIES = b8.m11548b(enumC1645qArr$values);
    }

    private EnumC1645q(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static EnumC1645q valueOf(String str) {
        return (EnumC1645q) Enum.valueOf(EnumC1645q.class, str);
    }

    public static EnumC1645q[] values() {
        return (EnumC1645q[]) $VALUES.clone();
    }

    public final boolean isAtLeast(EnumC1645q state) {
        AbstractC4154l.m8923f(state, "state");
        return compareTo(state) >= 0;
    }
}
