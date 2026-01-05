package k2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import s2.C6734c;
import s2.C6738g;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k2.m */
/* loaded from: classes.dex */
public final class C3964m extends AbstractC3969r {

    /* renamed from: a */
    public final int f20422a;

    /* renamed from: b */
    public final boolean f20423b;

    /* renamed from: c */
    public final boolean f20424c;

    /* renamed from: d */
    public HashSet f20425d;

    /* renamed from: e */
    public final LinkedHashSet f20426e = new LinkedHashSet();

    /* renamed from: f */
    public final e1 f20427f = new e1(C6738g.f32179d, s0.f20545d);

    /* renamed from: g */
    public final /* synthetic */ C3966o f20428g;

    public C3964m(C3966o c3966o, int i10, boolean z6, boolean z10, s0 s0Var) {
        this.f20428g = c3966o;
        this.f20422a = i10;
        this.f20423b = z6;
        this.f20424c = z10;
    }

    @Override // k2.AbstractC3969r
    /* renamed from: a */
    public final void mo8556a(C3972u c3972u, C6734c c6734c) {
        this.f20428g.f20465b.mo8556a(c3972u, c6734c);
    }

    @Override // k2.AbstractC3969r
    /* renamed from: b */
    public final void mo8557b() {
        C3966o c3966o = this.f20428g;
        c3966o.f20489z--;
    }

    @Override // k2.AbstractC3969r
    /* renamed from: c */
    public final boolean mo8558c() {
        return this.f20428g.f20465b.mo8558c();
    }

    @Override // k2.AbstractC3969r
    /* renamed from: d */
    public final boolean mo8559d() {
        return this.f20423b;
    }

    @Override // k2.AbstractC3969r
    /* renamed from: e */
    public final boolean mo8560e() {
        return this.f20424c;
    }

    @Override // k2.AbstractC3969r
    /* renamed from: f */
    public final i1 mo8561f() {
        return (i1) this.f20427f.getValue();
    }

    @Override // k2.AbstractC3969r
    /* renamed from: g */
    public final int mo8562g() {
        return this.f20422a;
    }

    @Override // k2.AbstractC3969r
    /* renamed from: h */
    public final InterfaceC7564h mo8563h() {
        return this.f20428g.f20465b.mo8563h();
    }

    @Override // k2.AbstractC3969r
    /* renamed from: i */
    public final void mo8564i(C3972u c3972u) {
        C3966o c3966o = this.f20428g;
        c3966o.f20465b.mo8564i(c3966o.f20470g);
        c3966o.f20465b.mo8564i(c3972u);
    }

    @Override // k2.AbstractC3969r
    /* renamed from: j */
    public final u0 mo8565j(v0 v0Var) {
        return this.f20428g.f20465b.mo8565j(v0Var);
    }

    @Override // k2.AbstractC3969r
    /* renamed from: k */
    public final void mo8566k(Set set) {
        HashSet hashSet = this.f20425d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f20425d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // k2.AbstractC3969r
    /* renamed from: l */
    public final void mo8567l(C3966o c3966o) {
        this.f20426e.add(c3966o);
    }

    @Override // k2.AbstractC3969r
    /* renamed from: m */
    public final void mo8568m(C3972u c3972u) {
        this.f20428g.f20465b.mo8568m(c3972u);
    }

    @Override // k2.AbstractC3969r
    /* renamed from: n */
    public final void mo8569n() {
        this.f20428g.f20489z++;
    }

    @Override // k2.AbstractC3969r
    /* renamed from: o */
    public final void mo8570o(InterfaceC3962k interfaceC3962k) {
        HashSet hashSet = this.f20425d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                AbstractC4154l.m8921d(interfaceC3962k, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(((C3966o) interfaceC3962k).f20466c);
            }
        }
        LinkedHashSet linkedHashSet = this.f20426e;
        kotlin.jvm.internal.d0.m8904a(linkedHashSet);
        linkedHashSet.remove(interfaceC3962k);
    }

    @Override // k2.AbstractC3969r
    /* renamed from: p */
    public final void mo8571p(C3972u c3972u) {
        this.f20428g.f20465b.mo8571p(c3972u);
    }

    /* renamed from: q */
    public final void m8572q() {
        LinkedHashSet<C3966o> linkedHashSet = this.f20426e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f20425d;
        if (hashSet != null) {
            for (C3966o c3966o : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c3966o.f20466c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
