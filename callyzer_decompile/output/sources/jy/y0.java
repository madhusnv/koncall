package jy;

import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class y0 extends s0 {

    /* renamed from: c */
    public static final y0 f19982c = new y0(z0.f19984a);

    @Override // jy.AbstractC3864a
    /* renamed from: d */
    public final int mo8409d(Object obj) {
        short[] sArr = (short[]) obj;
        AbstractC4154l.m8923f(sArr, "<this>");
        return sArr.length;
    }

    @Override // jy.AbstractC3877n, jy.AbstractC3864a
    /* renamed from: f */
    public final void mo8411f(InterfaceC3364a interfaceC3364a, int i10, Object obj) {
        x0 builder = (x0) obj;
        AbstractC4154l.m8923f(builder, "builder");
        short sMo7690w = interfaceC3364a.mo7690w(this.f19962b, i10);
        builder.mo8415b(builder.mo8416d() + 1);
        short[] sArr = builder.f19980a;
        int i11 = builder.f19981b;
        builder.f19981b = i11 + 1;
        sArr[i11] = sMo7690w;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: g */
    public final Object mo8412g(Object obj) {
        short[] sArr = (short[]) obj;
        AbstractC4154l.m8923f(sArr, "<this>");
        x0 x0Var = new x0();
        x0Var.f19980a = sArr;
        x0Var.f19981b = sArr.length;
        x0Var.mo8415b(10);
        return x0Var;
    }

    @Override // jy.s0
    /* renamed from: j */
    public final Object mo8418j() {
        return new short[0];
    }

    @Override // jy.s0
    /* renamed from: k */
    public final void mo8419k(InterfaceC3365b encoder, Object obj, int i10) {
        short[] content = (short[]) obj;
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            short s5 = content[i11];
            C4597u c4597u = (C4597u) encoder;
            r0 descriptor = this.f19962b;
            AbstractC4154l.m8923f(descriptor, "descriptor");
            c4597u.m9440s(descriptor, i11);
            c4597u.mo7715g(s5);
        }
    }
}
