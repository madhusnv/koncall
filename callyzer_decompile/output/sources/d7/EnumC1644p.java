package d7;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d7.p */
/* loaded from: classes.dex */
public final class EnumC1644p {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ EnumC1644p[] $VALUES;
    public static final C1642n Companion;
    public static final EnumC1644p ON_CREATE = new EnumC1644p("ON_CREATE", 0);
    public static final EnumC1644p ON_START = new EnumC1644p("ON_START", 1);
    public static final EnumC1644p ON_RESUME = new EnumC1644p("ON_RESUME", 2);
    public static final EnumC1644p ON_PAUSE = new EnumC1644p("ON_PAUSE", 3);
    public static final EnumC1644p ON_STOP = new EnumC1644p("ON_STOP", 4);
    public static final EnumC1644p ON_DESTROY = new EnumC1644p("ON_DESTROY", 5);
    public static final EnumC1644p ON_ANY = new EnumC1644p("ON_ANY", 6);

    private static final /* synthetic */ EnumC1644p[] $values() {
        return new EnumC1644p[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
    }

    static {
        EnumC1644p[] enumC1644pArr$values = $values();
        $VALUES = enumC1644pArr$values;
        $ENTRIES = b8.m11548b(enumC1644pArr$values);
        Companion = new C1642n();
    }

    private EnumC1644p(String str, int i10) {
    }

    public static final EnumC1644p downFrom(EnumC1645q enumC1645q) {
        Companion.getClass();
        return C1642n.m5327a(enumC1645q);
    }

    public static final EnumC1644p downTo(EnumC1645q state) {
        Companion.getClass();
        AbstractC4154l.m8923f(state, "state");
        int i10 = AbstractC1640m.f8116a[state.ordinal()];
        if (i10 == 1) {
            return ON_STOP;
        }
        if (i10 == 2) {
            return ON_PAUSE;
        }
        if (i10 != 4) {
            return null;
        }
        return ON_DESTROY;
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static final EnumC1644p upFrom(EnumC1645q enumC1645q) {
        Companion.getClass();
        return C1642n.m5328b(enumC1645q);
    }

    public static final EnumC1644p upTo(EnumC1645q enumC1645q) {
        Companion.getClass();
        return C1642n.m5329c(enumC1645q);
    }

    public static EnumC1644p valueOf(String str) {
        return (EnumC1644p) Enum.valueOf(EnumC1644p.class, str);
    }

    public static EnumC1644p[] values() {
        return (EnumC1644p[]) $VALUES.clone();
    }

    public final EnumC1645q getTargetState() {
        switch (AbstractC1643o.f8120a[ordinal()]) {
            case 1:
            case 2:
                return EnumC1645q.CREATED;
            case 3:
            case 4:
                return EnumC1645q.STARTED;
            case 5:
                return EnumC1645q.RESUMED;
            case 6:
                return EnumC1645q.DESTROYED;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
