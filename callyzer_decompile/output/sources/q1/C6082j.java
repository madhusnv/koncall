package q1;

import b2.C0554l;
import k2.C3966o;
import kotlin.jvm.internal.AbstractC4154l;
import s1.AbstractC6731z;
import s1.InterfaceC6728w;
import s2.AbstractC6740i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.j */
/* loaded from: classes.dex */
public final class C6082j implements InterfaceC6728w {

    /* renamed from: a */
    public final C6097y f29657a;

    /* renamed from: b */
    public final C6080h f29658b;

    /* renamed from: c */
    public final C6075c f29659c;

    /* renamed from: d */
    public final C0554l f29660d;

    public C6082j(C6097y c6097y, C6080h c6080h, C6075c c6075c, C0554l c0554l) {
        this.f29657a = c6097y;
        this.f29658b = c6080h;
        this.f29659c = c6075c;
        this.f29660d = c0554l;
    }

    @Override // s1.InterfaceC6728w
    /* renamed from: a */
    public final int mo12101a() {
        return this.f29658b.mo12097k().f3778b;
    }

    @Override // s1.InterfaceC6728w
    /* renamed from: b */
    public final Object mo12102b(int i10) {
        Object objM1638g = this.f29660d.m1638g(i10);
        return objM1638g == null ? this.f29658b.m12887l(i10) : objM1638g;
    }

    @Override // s1.InterfaceC6728w
    /* renamed from: c */
    public final Object mo12103c(int i10) {
        return this.f29658b.m12886j(i10);
    }

    @Override // s1.InterfaceC6728w
    /* renamed from: d */
    public final int mo12104d(Object obj) {
        return this.f29660d.m1637f(obj);
    }

    @Override // s1.InterfaceC6728w
    /* renamed from: e */
    public final void mo12105e(int i10, Object obj, C3966o c3966o) {
        c3966o.m8607Y(-462424778);
        AbstractC6731z.m12877b(obj, i10, this.f29657a.f29786q, AbstractC6740i.m12902d(-824725566, new C6081i(this, i10, 0), c3966o), c3966o, 3072);
        c3966o.m8623p(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6082j)) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f29658b, ((C6082j) obj).f29658b);
    }

    public final int hashCode() {
        return this.f29658b.hashCode();
    }
}
