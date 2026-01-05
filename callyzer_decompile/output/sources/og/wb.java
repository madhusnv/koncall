package og;

import android.view.View;
import android.view.ViewParent;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1565s;
import j3.C3551e;
import j3.C3552f;
import j3.C3553g;
import java.lang.reflect.Field;
import kh.C4077a;
import ph.C5949d;
import ph.C5951f;
import ph.C5952g;
import ph.C5954i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class wb {

    /* renamed from: a */
    public static C3552f f26896a;

    /* renamed from: a */
    public static vb m11028a(int i10) {
        return i10 != 0 ? i10 != 1 ? new C5954i() : new C5949d() : new C5954i();
    }

    /* renamed from: b */
    public static final C3552f m11029b() {
        C3552f c3552f = f26896a;
        if (c3552f != null) {
            return c3552f;
        }
        C3551e c3551e = new C3551e("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = j3.h0.f19025a;
        d3.n0 n0Var = new d3.n0(C1565s.f7809b);
        C3553g c3553g = new C3553g();
        c3553g.m8100h(19.0f, 6.41f);
        c3553g.m8098f(17.59f, 5.0f);
        c3553g.m8098f(12.0f, 10.59f);
        c3553g.m8098f(6.41f, 5.0f);
        c3553g.m8098f(5.0f, 6.41f);
        c3553g.m8098f(10.59f, 12.0f);
        c3553g.m8098f(5.0f, 17.59f);
        c3553g.m8098f(6.41f, 19.0f);
        c3553g.m8098f(12.0f, 13.41f);
        c3553g.m8098f(17.59f, 19.0f);
        c3553g.m8098f(19.0f, 17.59f);
        c3553g.m8098f(13.41f, 12.0f);
        c3553g.m8094b();
        C3551e.m8090a(c3551e, c3553g.f19011a, n0Var);
        C3552f c3552fM8091b = c3551e.m8091b();
        f26896a = c3552fM8091b;
        return c3552fM8091b;
    }

    /* renamed from: c */
    public static void m11030c(View view, C5952g c5952g) {
        C4077a c4077a = c5952g.f29152a.f29136b;
        if (c4077a == null || !c4077a.f20947a) {
            return;
        }
        float fM2453e = DefinitionKt.NO_Float_VALUE;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            Field field = c6.v0.f5527a;
            fM2453e += c6.n0.m2453e((View) parent);
        }
        C5951f c5951f = c5952g.f29152a;
        if (c5951f.f29146l != fM2453e) {
            c5951f.f29146l = fM2453e;
            c5952g.m11991l();
        }
    }
}
