package og;

import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1565s;
import ex.InterfaceC2137a;
import j3.C3551e;
import j3.C3552f;
import j3.C3553g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import qw.AbstractC6358h;
import qw.C6365o;
import qw.C6366p;
import qw.C6374x;
import qw.EnumC6359i;
import qw.InterfaceC6357g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class nd {

    /* renamed from: a */
    public static C3552f f26675a;

    /* renamed from: a */
    public static final C3552f m10780a() {
        C3552f c3552f = f26675a;
        if (c3552f != null) {
            return c3552f;
        }
        C3551e c3551e = new C3551e("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = j3.h0.f19025a;
        d3.n0 n0Var = new d3.n0(C1565s.f7809b);
        C3553g c3553g = new C3553g();
        c3553g.m8100h(11.0f, 7.0f);
        c3553g.m8097e(2.0f);
        c3553g.m8104l(2.0f);
        c3553g.m8097e(-2.0f);
        c3553g.m8094b();
        c3553g.m8100h(11.0f, 11.0f);
        c3553g.m8097e(2.0f);
        c3553g.m8104l(6.0f);
        c3553g.m8097e(-2.0f);
        c3553g.m8094b();
        c3553g.m8100h(12.0f, 2.0f);
        c3553g.m8095c(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        c3553g.m8102j(4.48f, 10.0f, 10.0f, 10.0f);
        c3553g.m8102j(10.0f, -4.48f, 10.0f, -10.0f);
        c3553g.m8101i(17.52f, 2.0f, 12.0f, 2.0f);
        c3553g.m8094b();
        c3553g.m8100h(12.0f, 20.0f);
        c3553g.m8096d(-4.41f, DefinitionKt.NO_Float_VALUE, -8.0f, -3.59f, -8.0f, -8.0f);
        c3553g.m8102j(3.59f, -8.0f, 8.0f, -8.0f);
        c3553g.m8102j(8.0f, 3.59f, 8.0f, 8.0f);
        c3553g.m8102j(-3.59f, 8.0f, -8.0f, 8.0f);
        c3553g.m8094b();
        C3551e.m8090a(c3551e, c3553g.f19011a, n0Var);
        C3552f c3552fM8091b = c3551e.m8091b();
        f26675a = c3552fM8091b;
        return c3552fM8091b;
    }

    /* renamed from: b */
    public static InterfaceC6357g m10781b(EnumC6359i mode, InterfaceC2137a interfaceC2137a) {
        C6374x c6374x = C6374x.f30774a;
        AbstractC4154l.m8923f(mode, "mode");
        int i10 = AbstractC6358h.f30754a[mode.ordinal()];
        if (i10 == 1) {
            return new C6366p(interfaceC2137a);
        }
        if (i10 == 2) {
            C6365o c6365o = new C6365o();
            c6365o.f30760a = interfaceC2137a;
            c6365o.f30761b = c6374x;
            return c6365o;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        qw.b0 b0Var = new qw.b0();
        b0Var.f30750a = interfaceC2137a;
        b0Var.f30751b = c6374x;
        return b0Var;
    }

    /* renamed from: c */
    public static C6366p m10782c(InterfaceC2137a initializer) {
        AbstractC4154l.m8923f(initializer, "initializer");
        return new C6366p(initializer);
    }
}
