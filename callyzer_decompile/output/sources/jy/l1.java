package jy;

import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;
import qw.C6376z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class l1 extends s0 {

    /* renamed from: c */
    public static final l1 f19922c = new l1(m1.f19927a);

    @Override // jy.AbstractC3864a
    /* renamed from: d */
    public final int mo8409d(Object obj) {
        short[] collectionSize = ((C6376z) obj).f30776a;
        AbstractC4154l.m8923f(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // jy.AbstractC3877n, jy.AbstractC3864a
    /* renamed from: f */
    public final void mo8411f(InterfaceC3364a interfaceC3364a, int i10, Object obj) {
        k1 builder = (k1) obj;
        AbstractC4154l.m8923f(builder, "builder");
        short sMo7696A = interfaceC3364a.mo7686r(this.f19962b, i10).mo7696A();
        builder.mo8415b(builder.mo8416d() + 1);
        short[] sArr = builder.f19917a;
        int i11 = builder.f19918b;
        builder.f19918b = i11 + 1;
        sArr[i11] = sMo7696A;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: g */
    public final Object mo8412g(Object obj) {
        short[] toBuilder = ((C6376z) obj).f30776a;
        AbstractC4154l.m8923f(toBuilder, "$this$toBuilder");
        k1 k1Var = new k1();
        k1Var.f19917a = toBuilder;
        k1Var.f19918b = toBuilder.length;
        k1Var.mo8415b(10);
        return k1Var;
    }

    @Override // jy.s0
    /* renamed from: j */
    public final Object mo8418j() {
        return new C6376z(new short[0]);
    }

    @Override // jy.s0
    /* renamed from: k */
    public final void mo8419k(InterfaceC3365b encoder, Object obj, int i10) {
        short[] sArr = ((C6376z) obj).f30776a;
        AbstractC4154l.m8923f(encoder, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            ((C4597u) encoder).m9441t(this.f19962b, i11).mo7715g(sArr[i11]);
        }
    }
}
