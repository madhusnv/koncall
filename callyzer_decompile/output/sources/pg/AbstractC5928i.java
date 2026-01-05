package pg;

import d7.InterfaceC1637j;
import fw.C2392f;
import g7.AbstractC2538c;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.util.List;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import og.pe;
import td.C7126c;
import td.C7131h;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.i */
/* loaded from: classes.dex */
public abstract class AbstractC5928i {
    /* renamed from: a */
    public static final C7126c m11690a(C7131h c7131h) {
        int i10 = c7131h.f34357d;
        int i11 = c7131h.f34359f;
        int i12 = c7131h.f34358e;
        List listM10834i = (i10 == 24 && i12 == 0 && i11 == 0) ? pe.m10834i(1, 0, 0, 0) : (i10 == 23 && i12 == 59 && i11 == 60) ? pe.m10834i(0, 23, 59, 59) : pe.m10834i(0, Integer.valueOf(i10), Integer.valueOf(i12), Integer.valueOf(i11));
        Instant instant = LocalDateTime.of(c7131h.f34354a, c7131h.f34355b, c7131h.f34356c, ((Number) listM10834i.get(1)).intValue(), ((Number) listM10834i.get(2)).intValue(), ((Number) listM10834i.get(3)).intValue(), c7131h.f34360g).plusDays(((Number) listM10834i.get(0)).intValue()).atOffset(ZoneOffset.ofTotalSeconds(c7131h.f34361h)).toInstant();
        AbstractC4154l.m8920c(instant);
        return new C7126c(instant);
    }

    /* renamed from: b */
    public static final d7.w0 m11691b(d7.c1 c1Var, C4147e c4147e, String str, d7.y0 y0Var, AbstractC2538c extras) {
        d7.a1 a1VarM16035k;
        if (y0Var != null) {
            d7.b1 store = c1Var.getViewModelStore();
            AbstractC4154l.m8923f(store, "store");
            AbstractC4154l.m8923f(extras, "extras");
            a1VarM16035k = new d7.a1(store, y0Var, extras);
        } else if (c1Var instanceof InterfaceC1637j) {
            d7.b1 store2 = c1Var.getViewModelStore();
            d7.y0 factory = ((InterfaceC1637j) c1Var).getDefaultViewModelProviderFactory();
            AbstractC4154l.m8923f(store2, "store");
            AbstractC4154l.m8923f(factory, "factory");
            AbstractC4154l.m8923f(extras, "extras");
            a1VarM16035k = new d7.a1(store2, factory, extras);
        } else {
            a1VarM16035k = C8687a.m16035k(c1Var, null, 6);
        }
        return str != null ? a1VarM16035k.f8067a.m2630j(c4147e, str) : a1VarM16035k.m5303a(c4147e);
    }

    /* renamed from: c */
    public static final d7.w0 m11692c(Class cls, d7.c1 c1Var, C2392f c2392f, AbstractC2538c abstractC2538c, InterfaceC3962k interfaceC3962k) {
        return m11691b(c1Var, kotlin.jvm.internal.a0.m8901a(cls), null, c2392f, abstractC2538c);
    }
}
