package jy;

import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;
import qw.C6369s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c1 extends s0 {

    /* renamed from: c */
    public static final c1 f19879c = new c1(d1.f19884a);

    @Override // jy.AbstractC3864a
    /* renamed from: d */
    public final int mo8409d(Object obj) {
        byte[] collectionSize = ((C6369s) obj).f30769a;
        AbstractC4154l.m8923f(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // jy.AbstractC3877n, jy.AbstractC3864a
    /* renamed from: f */
    public final void mo8411f(InterfaceC3364a interfaceC3364a, int i10, Object obj) {
        b1 builder = (b1) obj;
        AbstractC4154l.m8923f(builder, "builder");
        byte bMo7709x = interfaceC3364a.mo7686r(this.f19962b, i10).mo7709x();
        builder.mo8415b(builder.mo8416d() + 1);
        byte[] bArr = builder.f19874a;
        int i11 = builder.f19875b;
        builder.f19875b = i11 + 1;
        bArr[i11] = bMo7709x;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: g */
    public final Object mo8412g(Object obj) {
        byte[] toBuilder = ((C6369s) obj).f30769a;
        AbstractC4154l.m8923f(toBuilder, "$this$toBuilder");
        b1 b1Var = new b1();
        b1Var.f19874a = toBuilder;
        b1Var.f19875b = toBuilder.length;
        b1Var.mo8415b(10);
        return b1Var;
    }

    @Override // jy.s0
    /* renamed from: j */
    public final Object mo8418j() {
        return new C6369s(new byte[0]);
    }

    @Override // jy.s0
    /* renamed from: k */
    public final void mo8419k(InterfaceC3365b encoder, Object obj, int i10) {
        byte[] bArr = ((C6369s) obj).f30769a;
        AbstractC4154l.m8923f(encoder, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            ((C4597u) encoder).m9441t(this.f19962b, i11).mo7716h(bArr[i11]);
        }
    }
}
