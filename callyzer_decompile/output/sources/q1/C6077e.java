package q1;

import og.tc;
import pg.da;
import rw.AbstractC6663m;
import s1.InterfaceC6720o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q1.e */
/* loaded from: classes.dex */
public final class C6077e implements InterfaceC6720o {

    /* renamed from: a */
    public final C6097y f29646a;

    public C6077e(C6097y c6097y) {
        this.f29646a = c6097y;
    }

    @Override // s1.InterfaceC6720o
    /* renamed from: a */
    public final int mo12089a() {
        return this.f29646a.m12134h().f29729n;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // s1.InterfaceC6720o
    /* renamed from: b */
    public final int mo12090b() {
        return Math.min(mo12089a() - 1, ((C6091s) AbstractC6663m.m12750N(this.f29646a.m12134h().f29726k)).f29733a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // s1.InterfaceC6720o
    /* renamed from: c */
    public final int mo12091c() {
        C6097y c6097y = this.f29646a;
        if (c6097y.m12134h().f29726k.isEmpty()) {
            return 0;
        }
        int iM11593c = da.m11593c(c6097y.m12134h()) / tc.m10932a(c6097y.m12134h());
        if (iM11593c < 1) {
            return 1;
        }
        return iM11593c;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // s1.InterfaceC6720o
    /* renamed from: d */
    public final boolean mo12092d() {
        return !this.f29646a.m12134h().f29726k.isEmpty();
    }

    @Override // s1.InterfaceC6720o
    /* renamed from: e */
    public final int mo12093e() {
        return Math.max(0, this.f29646a.f29773d.f29752b.m8526f());
    }
}
