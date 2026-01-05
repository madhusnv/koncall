package jy;

import a2.AbstractC0030c;
import hy.AbstractC3054e;
import hy.InterfaceC3055f;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5942w;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class t0 implements InterfaceC3055f {

    /* renamed from: a */
    public final String f19965a;

    /* renamed from: b */
    public final AbstractC3054e f19966b;

    public t0(String str, AbstractC3054e kind) {
        AbstractC4154l.m8923f(kind, "kind");
        this.f19965a = str;
        this.f19966b = kind;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: a */
    public final String mo7277a() {
        return this.f19965a;
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
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: e */
    public final AbstractC5942w mo7280e() {
        return this.f19966b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return AbstractC4154l.m8918a(this.f19965a, t0Var.f19965a) && AbstractC4154l.m8918a(this.f19966b, t0Var.f19966b);
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: f */
    public final int mo7281f() {
        return 0;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: g */
    public final String mo7282g(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // hy.InterfaceC3055f
    public final List getAnnotations() {
        return C6668r.f31943a;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: h */
    public final List mo7283h(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f19966b.hashCode() * 31) + this.f19965a.hashCode();
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: i */
    public final InterfaceC3055f mo7284i(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // hy.InterfaceC3055f
    public final boolean isInline() {
        return false;
    }

    @Override // hy.InterfaceC3055f
    /* renamed from: j */
    public final boolean mo7285j(int i10) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("PrimitiveDescriptor("), this.f19965a, ')');
    }
}
