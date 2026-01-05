package jy;

import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;
import qw.C6371u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class f1 extends s0 {

    /* renamed from: c */
    public static final f1 f19895c = new f1(g1.f19899a);

    @Override // jy.AbstractC3864a
    /* renamed from: d */
    public final int mo8409d(Object obj) {
        int[] collectionSize = ((C6371u) obj).f30771a;
        AbstractC4154l.m8923f(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // jy.AbstractC3877n, jy.AbstractC3864a
    /* renamed from: f */
    public final void mo8411f(InterfaceC3364a interfaceC3364a, int i10, Object obj) {
        e1 builder = (e1) obj;
        AbstractC4154l.m8923f(builder, "builder");
        int iMo7704k = interfaceC3364a.mo7686r(this.f19962b, i10).mo7704k();
        builder.mo8415b(builder.mo8416d() + 1);
        int[] iArr = builder.f19889a;
        int i11 = builder.f19890b;
        builder.f19890b = i11 + 1;
        iArr[i11] = iMo7704k;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: g */
    public final Object mo8412g(Object obj) {
        int[] toBuilder = ((C6371u) obj).f30771a;
        AbstractC4154l.m8923f(toBuilder, "$this$toBuilder");
        e1 e1Var = new e1();
        e1Var.f19889a = toBuilder;
        e1Var.f19890b = toBuilder.length;
        e1Var.mo8415b(10);
        return e1Var;
    }

    @Override // jy.s0
    /* renamed from: j */
    public final Object mo8418j() {
        return new C6371u(new int[0]);
    }

    @Override // jy.s0
    /* renamed from: k */
    public final void mo8419k(InterfaceC3365b encoder, Object obj, int i10) {
        int[] iArr = ((C6371u) obj).f30771a;
        AbstractC4154l.m8923f(encoder, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            ((C4597u) encoder).m9441t(this.f19962b, i11).mo7722p(iArr[i11]);
        }
    }
}
