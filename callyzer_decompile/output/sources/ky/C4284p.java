package ky;

import ex.InterfaceC2137a;
import hy.InterfaceC3055f;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import pg.AbstractC5942w;
import qw.C6366p;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ky.p */
/* loaded from: classes3.dex */
public final class C4284p implements InterfaceC3055f {

    /* renamed from: a */
    public final C6366p f21691a;

    public C4284p(InterfaceC2137a interfaceC2137a) {
        this.f21691a = nd.m10782c(interfaceC2137a);
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: a */
    public final String mo7277a() {
        return m8993b().mo7277a();
    }

    /* renamed from: b */
    public final InterfaceC3055f m8993b() {
        return (InterfaceC3055f) this.f21691a.getValue();
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: c */
    public final boolean mo7278c() {
        return false;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: d */
    public final int mo7279d(String name) {
        AbstractC4154l.m8923f(name, "name");
        return m8993b().mo7279d(name);
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: e */
    public final AbstractC5942w mo7280e() {
        return m8993b().mo7280e();
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: f */
    public final int mo7281f() {
        return m8993b().mo7281f();
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: g */
    public final String mo7282g(int i10) {
        return m8993b().mo7282g(i10);
    }

    @Override // hy.InterfaceC3055f
    public final List getAnnotations() {
        return C6668r.f31943a;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: h */
    public final List mo7283h(int i10) {
        return m8993b().mo7283h(i10);
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: i */
    public final InterfaceC3055f mo7284i(int i10) {
        return m8993b().mo7284i(i10);
    }

    @Override // hy.InterfaceC3055f
    public final boolean isInline() {
        return false;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: j */
    public final boolean mo7285j(int i10) {
        return m8993b().mo7285j(i10);
    }
}
