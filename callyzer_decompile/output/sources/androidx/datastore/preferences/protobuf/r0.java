package androidx.datastore.preferences.protobuf;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 implements a1 {

    /* renamed from: a */
    public final AbstractC0306a f2410a;

    /* renamed from: b */
    public final g1 f2411b;

    /* renamed from: c */
    public final C0321p f2412c;

    public r0(g1 g1Var, C0321p c0321p, AbstractC0306a abstractC0306a) {
        this.f2411b = g1Var;
        c0321p.getClass();
        this.f2412c = c0321p;
        this.f2410a = abstractC0306a;
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: a */
    public final void mo810a(Object obj) {
        ((i1) this.f2411b).getClass();
        h1 h1Var = ((AbstractC0335z) obj).unknownFields;
        if (h1Var.f2343e) {
            h1Var.f2343e = false;
        }
        this.f2412c.getClass();
        AbstractC1452a.m4578y(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: b */
    public final boolean mo811b(Object obj) {
        this.f2412c.getClass();
        AbstractC1452a.m4578y(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: c */
    public final AbstractC0335z mo812c() {
        AbstractC0306a abstractC0306a = this.f2410a;
        if (abstractC0306a instanceof AbstractC0335z) {
            return ((AbstractC0335z) abstractC0306a).m1083i();
        }
        AbstractC0335z abstractC0335z = (AbstractC0335z) abstractC0306a;
        abstractC0335z.getClass();
        return ((AbstractC0332w) abstractC0335z.mo1080c(EnumC0334y.NEW_BUILDER)).m1071b();
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: d */
    public final void mo813d(Object obj, Object obj2) {
        b1.m836k(this.f2411b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: e */
    public final void mo814e(Object obj, i0 i0Var) {
        this.f2412c.getClass();
        AbstractC1452a.m4578y(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: f */
    public final int mo815f(AbstractC0335z abstractC0335z) {
        ((i1) this.f2411b).getClass();
        h1 h1Var = abstractC0335z.unknownFields;
        int i10 = h1Var.f2342d;
        if (i10 != -1) {
            return i10;
        }
        int iM965j = 0;
        for (int i11 = 0; i11 < h1Var.f2339a; i11++) {
            int i12 = h1Var.f2340b[i11] >>> 3;
            iM965j += C0318m.m965j(3, (C0312g) h1Var.f2341c[i11]) + C0318m.m968m(i12) + C0318m.m967l(2) + (C0318m.m967l(1) * 2);
        }
        h1Var.f2342d = iM965j;
        return iM965j;
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: g */
    public final int mo816g(AbstractC0335z abstractC0335z) {
        ((i1) this.f2411b).getClass();
        return abstractC0335z.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: h */
    public final boolean mo817h(AbstractC0335z abstractC0335z, AbstractC0335z abstractC0335z2) {
        i1 i1Var = (i1) this.f2411b;
        i1Var.getClass();
        h1 h1Var = abstractC0335z.unknownFields;
        i1Var.getClass();
        return h1Var.equals(abstractC0335z2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.a1
    /* renamed from: i */
    public final void mo818i(Object obj, C0317l c0317l, C0320o c0320o) {
        this.f2411b.mo871a(obj);
        this.f2412c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
