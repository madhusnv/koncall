package jy;

import hy.InterfaceC3055f;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5942w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class v0 implements InterfaceC3055f, InterfaceC3873j {

    /* renamed from: a */
    public final InterfaceC3055f f19974a;

    /* renamed from: b */
    public final String f19975b;

    /* renamed from: c */
    public final Set f19976c;

    public v0(InterfaceC3055f original) {
        AbstractC4154l.m8923f(original, "original");
        this.f19974a = original;
        this.f19975b = original.mo7277a() + '?';
        this.f19976c = n0.m8421b(original);
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: a */
    public final String mo7277a() {
        return this.f19975b;
    }

    @Override // jy.InterfaceC3873j
    /* renamed from: b */
    public final Set mo7286b() {
        return this.f19976c;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: c */
    public final boolean mo7278c() {
        return true;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: d */
    public final int mo7279d(String name) {
        AbstractC4154l.m8923f(name, "name");
        return this.f19974a.mo7279d(name);
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: e */
    public final AbstractC5942w mo7280e() {
        return this.f19974a.mo7280e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v0) {
            return AbstractC4154l.m8918a(this.f19974a, ((v0) obj).f19974a);
        }
        return false;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: f */
    public final int mo7281f() {
        return this.f19974a.mo7281f();
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: g */
    public final String mo7282g(int i10) {
        return this.f19974a.mo7282g(i10);
    }

    @Override // hy.InterfaceC3055f
    public final List getAnnotations() {
        return this.f19974a.getAnnotations();
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: h */
    public final List mo7283h(int i10) {
        return this.f19974a.mo7283h(i10);
    }

    public final int hashCode() {
        return this.f19974a.hashCode() * 31;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: i */
    public final InterfaceC3055f mo7284i(int i10) {
        return this.f19974a.mo7284i(i10);
    }

    @Override // hy.InterfaceC3055f
    public final boolean isInline() {
        return this.f19974a.isInline();
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: j */
    public final boolean mo7285j(int i10) {
        return this.f19974a.mo7285j(i10);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19974a);
        sb2.append('?');
        return sb2.toString();
    }
}
