package t1;

import b2.C0554l;
import k2.C3966o;
import kotlin.jvm.internal.AbstractC4154l;
import q1.C6081i;
import s1.AbstractC6731z;
import s1.InterfaceC6728w;
import s2.AbstractC6740i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t1.o */
/* loaded from: classes.dex */
public final class C6990o implements InterfaceC6728w {

    /* renamed from: a */
    public final AbstractC7000y f33829a;

    /* renamed from: b */
    public final AbstractC6731z f33830b;

    /* renamed from: c */
    public final C0554l f33831c;

    public C6990o(AbstractC7000y abstractC7000y, C6989n c6989n, C0554l c0554l) {
        this.f33829a = abstractC7000y;
        this.f33830b = c6989n;
        this.f33831c = c0554l;
    }

    @Override // s1.InterfaceC6728w
    /* renamed from: a */
    public final int mo12101a() {
        return this.f33830b.mo12097k().f3778b;
    }

    @Override // s1.InterfaceC6728w
    /* renamed from: b */
    public final Object mo12102b(int i10) {
        Object objM1638g = this.f33831c.m1638g(i10);
        return objM1638g == null ? this.f33830b.m12887l(i10) : objM1638g;
    }

    @Override // s1.InterfaceC6728w
    /* renamed from: d */
    public final int mo12104d(Object obj) {
        return this.f33831c.m1637f(obj);
    }

    @Override // s1.InterfaceC6728w
    /* renamed from: e */
    public final void mo12105e(int i10, Object obj, C3966o c3966o) {
        c3966o.m8607Y(-1201380429);
        AbstractC6731z.m12877b(obj, i10, this.f33829a.f33891A, AbstractC6740i.m12902d(1142237095, new C6081i(this, i10, 2), c3966o), c3966o, 3072);
        c3966o.m8623p(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6990o)) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f33830b, ((C6990o) obj).f33830b);
    }

    public final int hashCode() {
        return this.f33830b.hashCode();
    }
}
