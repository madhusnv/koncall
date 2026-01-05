package l7;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    public final c0 f22026a;

    /* renamed from: b */
    public boolean f22027b;

    /* renamed from: c */
    public boolean f22028c;

    /* renamed from: d */
    public int f22029d;

    /* renamed from: e */
    public String f22030e;

    /* renamed from: f */
    public boolean f22031f;

    /* renamed from: g */
    public boolean f22032g;

    public e0() {
        c0 c0Var = new c0();
        c0Var.f22009a = -1;
        c0Var.f22013e = -1;
        c0Var.f22014f = -1;
        this.f22026a = c0Var;
        this.f22029d = -1;
    }

    /* renamed from: a */
    public final void m9210a(int i10, InterfaceC2139c interfaceC2139c) {
        this.f22029d = i10;
        this.f22031f = false;
        p0 p0Var = new p0();
        interfaceC2139c.invoke(p0Var);
        this.f22031f = p0Var.f22094a;
        this.f22032g = p0Var.f22095b;
    }

    /* renamed from: b */
    public final void m9211b(InterfaceC2139c interfaceC2139c, String route) {
        AbstractC4154l.m8923f(route, "route");
        if (AbstractC5178p.m10101L(route)) {
            throw new IllegalArgumentException("Cannot pop up to an empty route");
        }
        this.f22030e = route;
        this.f22029d = -1;
        this.f22031f = false;
        p0 p0Var = new p0();
        interfaceC2139c.invoke(p0Var);
        this.f22031f = p0Var.f22094a;
        this.f22032g = p0Var.f22095b;
    }
}
