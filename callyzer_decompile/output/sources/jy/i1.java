package jy;

import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;
import qw.C6373w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class i1 extends s0 {

    /* renamed from: c */
    public static final i1 f19909c = new i1(j1.f19912a);

    @Override // jy.AbstractC3864a
    /* renamed from: d */
    public final int mo8409d(Object obj) {
        long[] collectionSize = ((C6373w) obj).f30773a;
        AbstractC4154l.m8923f(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // jy.AbstractC3877n, jy.AbstractC3864a
    /* renamed from: f */
    public final void mo8411f(InterfaceC3364a interfaceC3364a, int i10, Object obj) {
        h1 builder = (h1) obj;
        AbstractC4154l.m8923f(builder, "builder");
        long jMo7706p = interfaceC3364a.mo7686r(this.f19962b, i10).mo7706p();
        builder.mo8415b(builder.mo8416d() + 1);
        long[] jArr = builder.f19904a;
        int i11 = builder.f19905b;
        builder.f19905b = i11 + 1;
        jArr[i11] = jMo7706p;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: g */
    public final Object mo8412g(Object obj) {
        long[] toBuilder = ((C6373w) obj).f30773a;
        AbstractC4154l.m8923f(toBuilder, "$this$toBuilder");
        h1 h1Var = new h1();
        h1Var.f19904a = toBuilder;
        h1Var.f19905b = toBuilder.length;
        h1Var.mo8415b(10);
        return h1Var;
    }

    @Override // jy.s0
    /* renamed from: j */
    public final Object mo8418j() {
        return new C6373w(new long[0]);
    }

    @Override // jy.s0
    /* renamed from: k */
    public final void mo8419k(InterfaceC3365b encoder, Object obj, int i10) {
        long[] jArr = ((C6373w) obj).f30773a;
        AbstractC4154l.m8923f(encoder, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            ((C4597u) encoder).m9441t(this.f19962b, i11).mo7723q(jArr[i11]);
        }
    }
}
