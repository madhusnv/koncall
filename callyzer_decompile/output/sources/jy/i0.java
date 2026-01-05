package jy;

import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class i0 extends s0 {

    /* renamed from: c */
    public static final i0 f19908c = new i0(j0.f19910a);

    @Override // jy.AbstractC3864a
    /* renamed from: d */
    public final int mo8409d(Object obj) {
        long[] jArr = (long[]) obj;
        AbstractC4154l.m8923f(jArr, "<this>");
        return jArr.length;
    }

    @Override // jy.AbstractC3877n, jy.AbstractC3864a
    /* renamed from: f */
    public final void mo8411f(InterfaceC3364a interfaceC3364a, int i10, Object obj) {
        h0 builder = (h0) obj;
        AbstractC4154l.m8923f(builder, "builder");
        long jMo7691y = interfaceC3364a.mo7691y(this.f19962b, i10);
        builder.mo8415b(builder.mo8416d() + 1);
        long[] jArr = builder.f19902a;
        int i11 = builder.f19903b;
        builder.f19903b = i11 + 1;
        jArr[i11] = jMo7691y;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: g */
    public final Object mo8412g(Object obj) {
        long[] jArr = (long[]) obj;
        AbstractC4154l.m8923f(jArr, "<this>");
        h0 h0Var = new h0();
        h0Var.f19902a = jArr;
        h0Var.f19903b = jArr.length;
        h0Var.mo8415b(10);
        return h0Var;
    }

    @Override // jy.s0
    /* renamed from: j */
    public final Object mo8418j() {
        return new long[0];
    }

    @Override // jy.s0
    /* renamed from: k */
    public final void mo8419k(InterfaceC3365b encoder, Object obj, int i10) {
        long[] content = (long[]) obj;
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            ((C4597u) encoder).m9442u(this.f19962b, i11, content[i11]);
        }
    }
}
