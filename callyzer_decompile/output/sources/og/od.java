package og;

import d3.C1565s;
import j3.C3551e;
import j3.C3552f;
import j3.C3557k;
import j3.C3560n;
import j3.C3561o;
import j3.C3568v;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6363m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class od {

    /* renamed from: a */
    public static C3552f f26708a;

    /* renamed from: a */
    public static final C6363m m10796a(Throwable exception) {
        AbstractC4154l.m8923f(exception, "exception");
        return new C6363m(exception);
    }

    /* renamed from: b */
    public static final C3552f m10797b() {
        C3552f c3552f = f26708a;
        if (c3552f != null) {
            return c3552f;
        }
        C3551e c3551e = new C3551e("Outlined.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = j3.h0.f19025a;
        d3.n0 n0Var = new d3.n0(C1565s.f7809b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new C3561o(7.41f, 8.59f));
        arrayList.add(new C3560n(12.0f, 13.17f));
        arrayList.add(new C3568v(4.59f, -4.58f));
        arrayList.add(new C3560n(18.0f, 10.0f));
        arrayList.add(new C3568v(-6.0f, 6.0f));
        arrayList.add(new C3568v(-6.0f, -6.0f));
        arrayList.add(new C3568v(1.41f, -1.41f));
        arrayList.add(C3557k.f19059c);
        C3551e.m8090a(c3551e, arrayList, n0Var);
        C3552f c3552fM8091b = c3551e.m8091b();
        f26708a = c3552fM8091b;
        return c3552fM8091b;
    }

    /* renamed from: c */
    public static final void m10798c(Object obj) {
        if (obj instanceof C6363m) {
            throw ((C6363m) obj).f30757a;
        }
    }
}
