package jy;

import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.p */
/* loaded from: classes3.dex */
public final class C3879p extends s0 {

    /* renamed from: c */
    public static final C3879p f19940c = new C3879p(C3880q.f19952a);

    @Override // jy.AbstractC3864a
    /* renamed from: d */
    public final int mo8409d(Object obj) {
        double[] dArr = (double[]) obj;
        AbstractC4154l.m8923f(dArr, "<this>");
        return dArr.length;
    }

    @Override // jy.AbstractC3877n, jy.AbstractC3864a
    /* renamed from: f */
    public final void mo8411f(InterfaceC3364a interfaceC3364a, int i10, Object obj) {
        C3878o builder = (C3878o) obj;
        AbstractC4154l.m8923f(builder, "builder");
        double dMo7692z = interfaceC3364a.mo7692z(this.f19962b, i10);
        builder.mo8415b(builder.mo8416d() + 1);
        double[] dArr = builder.f19934a;
        int i11 = builder.f19935b;
        builder.f19935b = i11 + 1;
        dArr[i11] = dMo7692z;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: g */
    public final Object mo8412g(Object obj) {
        double[] dArr = (double[]) obj;
        AbstractC4154l.m8923f(dArr, "<this>");
        C3878o c3878o = new C3878o();
        c3878o.f19934a = dArr;
        c3878o.f19935b = dArr.length;
        c3878o.mo8415b(10);
        return c3878o;
    }

    @Override // jy.s0
    /* renamed from: j */
    public final Object mo8418j() {
        return new double[0];
    }

    @Override // jy.s0
    /* renamed from: k */
    public final void mo8419k(InterfaceC3365b encoder, Object obj, int i10) {
        double[] content = (double[]) obj;
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            double d2 = content[i11];
            C4597u c4597u = (C4597u) encoder;
            r0 descriptor = this.f19962b;
            AbstractC4154l.m8923f(descriptor, "descriptor");
            c4597u.m9440s(descriptor, i11);
            c4597u.mo7714f(d2);
        }
    }
}
