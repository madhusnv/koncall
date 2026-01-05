package r1;

import b2.C0554l;
import k2.C3966o;
import kotlin.jvm.internal.AbstractC4154l;
import q1.C6081i;
import s1.AbstractC6731z;
import s1.InterfaceC6728w;
import s2.AbstractC6740i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r1.l */
/* loaded from: classes.dex */
public final class C6427l implements InterfaceC6728w {

    /* renamed from: a */
    public final C6440y f30987a;

    /* renamed from: b */
    public final C6426k f30988b;

    /* renamed from: c */
    public final C0554l f30989c;

    public C6427l(C6440y c6440y, C6426k c6426k, C0554l c0554l) {
        this.f30987a = c6440y;
        this.f30988b = c6426k;
        this.f30989c = c0554l;
    }

    @Override // s1.InterfaceC6728w
    /* renamed from: a */
    public final int mo12101a() {
        return this.f30988b.mo12097k().f3778b;
    }

    @Override // s1.InterfaceC6728w
    /* renamed from: b */
    public final Object mo12102b(int i10) {
        Object objM1638g = this.f30989c.m1638g(i10);
        return objM1638g == null ? this.f30988b.m12887l(i10) : objM1638g;
    }

    @Override // s1.InterfaceC6728w
    /* renamed from: c */
    public final Object mo12103c(int i10) {
        return this.f30988b.m12886j(i10);
    }

    @Override // s1.InterfaceC6728w
    /* renamed from: d */
    public final int mo12104d(Object obj) {
        return this.f30989c.m1637f(obj);
    }

    @Override // s1.InterfaceC6728w
    /* renamed from: e */
    public final void mo12105e(int i10, Object obj, C3966o c3966o) {
        c3966o.m8607Y(1493551140);
        AbstractC6731z.m12877b(obj, i10, this.f30987a.f31090q, AbstractC6740i.m12902d(726189336, new C6081i(this, i10, 1), c3966o), c3966o, 3072);
        c3966o.m8623p(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6427l)) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f30988b, ((C6427l) obj).f30988b);
    }

    public final int hashCode() {
        return this.f30988b.hashCode();
    }
}
