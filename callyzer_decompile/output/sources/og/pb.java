package og;

import d3.C1565s;
import ec.C2005c;
import ec.C2011i;
import ec.InterfaceC2004b;
import j3.C3551e;
import j3.C3552f;
import j3.C3553g;
import j3.C3559m;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import md.C4715d;
import ox.C5770a;
import pd.C5896b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class pb {

    /* renamed from: a */
    public static C3552f f26732a;

    /* renamed from: a */
    public static final C3552f m10819a() {
        C3552f c3552f = f26732a;
        if (c3552f != null) {
            return c3552f;
        }
        C3551e c3551e = new C3551e("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = j3.h0.f19025a;
        d3.n0 n0Var = new d3.n0(C1565s.f7809b);
        C3553g c3553g = new C3553g();
        c3553g.m8100h(19.0f, 13.0f);
        c3553g.m8097e(-6.0f);
        c3553g.m8104l(6.0f);
        c3553g.m8097e(-2.0f);
        c3553g.m8104l(-6.0f);
        C3559m c3559m = new C3559m(5.0f);
        ArrayList arrayList = c3553g.f19011a;
        arrayList.add(c3559m);
        c3553g.m8104l(-2.0f);
        c3553g.m8097e(6.0f);
        arrayList.add(new j3.b0(5.0f));
        c3553g.m8097e(2.0f);
        c3553g.m8104l(6.0f);
        c3553g.m8097e(6.0f);
        c3553g.m8104l(2.0f);
        c3553g.m8094b();
        C3551e.m8090a(c3551e, arrayList, n0Var);
        C3552f c3552fM8091b = c3551e.m8091b();
        f26732a = c3552fM8091b;
        return c3552fM8091b;
    }

    /* renamed from: b */
    public static void m10820b(C5896b c5896b, Long l9) {
        AbstractC4154l.m8923f(c5896b, "<this>");
    }

    /* renamed from: c */
    public static final void m10821c(C5896b recordSeconds, long j6, InterfaceC2004b attributes, C4715d c4715d) {
        AbstractC4154l.m8923f(recordSeconds, "$this$recordSeconds");
        AbstractC4154l.m8923f(attributes, "attributes");
        C5770a.m11294e(j6);
    }

    /* renamed from: d */
    public static void m10822d(C5896b c5896b, long j6, C2005c c2005c, int i10) {
        InterfaceC2004b interfaceC2004b = c2005c;
        if ((i10 & 2) != 0) {
            interfaceC2004b = C2011i.f9543a;
        }
        m10821c(c5896b, j6, interfaceC2004b, null);
    }
}
