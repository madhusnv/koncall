package u0;

import c0.b2;
import i0.C3071b;
import i0.d0;
import i0.e0;
import i0.g0;
import i0.n1;
import java.util.ArrayList;
import java.util.Collection;
import mk.C4764c;
import pg.o7;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u0.f */
/* loaded from: classes.dex */
public final class C7296f implements g0 {

    /* renamed from: a */
    public final g0 f34803a;

    /* renamed from: b */
    public final C3071b f34804b;

    /* renamed from: c */
    public final C7298h f34805c;

    /* renamed from: d */
    public final C7297g f34806d;

    public C7296f(g0 g0Var, C7297g c7297g, C4764c c4764c) {
        this.f34803a = g0Var;
        this.f34806d = c7297g;
        this.f34804b = new C3071b(g0Var.mo7311h());
        this.f34805c = new C7298h(g0Var.mo7319q());
    }

    @Override // i0.g0
    /* renamed from: a */
    public final InterfaceFutureC8957d mo7308a() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // i0.g0
    /* renamed from: b */
    public final n1 mo7309b() {
        return this.f34803a.mo7309b();
    }

    @Override // c0.a2
    /* renamed from: d */
    public final void mo2143d(b2 b2Var) {
        o7.m11806a();
        this.f34806d.mo2143d(b2Var);
    }

    @Override // c0.a2
    /* renamed from: e */
    public final void mo2144e(b2 b2Var) {
        o7.m11806a();
        this.f34806d.mo2144e(b2Var);
    }

    @Override // c0.a2
    /* renamed from: g */
    public final void mo2145g(b2 b2Var) {
        o7.m11806a();
        this.f34806d.mo2145g(b2Var);
    }

    @Override // i0.g0
    /* renamed from: h */
    public final d0 mo7311h() {
        return this.f34804b;
    }

    @Override // i0.g0
    /* renamed from: k */
    public final void mo7314k(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // i0.g0
    /* renamed from: l */
    public final void mo7315l(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // i0.g0
    /* renamed from: o */
    public final boolean mo7317o() {
        return false;
    }

    @Override // i0.g0
    /* renamed from: q */
    public final e0 mo7319q() {
        return this.f34805c;
    }

    @Override // c0.a2
    /* renamed from: r */
    public final void mo2146r(b2 b2Var) {
        o7.m11806a();
        this.f34806d.mo2146r(b2Var);
    }
}
