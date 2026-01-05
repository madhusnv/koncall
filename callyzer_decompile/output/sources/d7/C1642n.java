package d7;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d7.n */
/* loaded from: classes.dex */
public final class C1642n {
    /* renamed from: a */
    public static EnumC1644p m5327a(EnumC1645q state) {
        AbstractC4154l.m8923f(state, "state");
        int i10 = AbstractC1640m.f8116a[state.ordinal()];
        if (i10 == 1) {
            return EnumC1644p.ON_DESTROY;
        }
        if (i10 == 2) {
            return EnumC1644p.ON_STOP;
        }
        if (i10 != 3) {
            return null;
        }
        return EnumC1644p.ON_PAUSE;
    }

    /* renamed from: b */
    public static EnumC1644p m5328b(EnumC1645q state) {
        AbstractC4154l.m8923f(state, "state");
        int i10 = AbstractC1640m.f8116a[state.ordinal()];
        if (i10 == 1) {
            return EnumC1644p.ON_START;
        }
        if (i10 == 2) {
            return EnumC1644p.ON_RESUME;
        }
        if (i10 != 5) {
            return null;
        }
        return EnumC1644p.ON_CREATE;
    }

    /* renamed from: c */
    public static EnumC1644p m5329c(EnumC1645q state) {
        AbstractC4154l.m8923f(state, "state");
        int i10 = AbstractC1640m.f8116a[state.ordinal()];
        if (i10 == 1) {
            return EnumC1644p.ON_CREATE;
        }
        if (i10 == 2) {
            return EnumC1644p.ON_START;
        }
        if (i10 != 3) {
            return null;
        }
        return EnumC1644p.ON_RESUME;
    }
}
