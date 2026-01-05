package jy;

import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.w */
/* loaded from: classes3.dex */
public final class C3886w extends s0 {

    /* renamed from: c */
    public static final C3886w f19977c = new C3886w(C3887x.f19978a);

    @Override // jy.AbstractC3864a
    /* renamed from: d */
    public final int mo8409d(Object obj) {
        float[] fArr = (float[]) obj;
        AbstractC4154l.m8923f(fArr, "<this>");
        return fArr.length;
    }

    @Override // jy.AbstractC3877n, jy.AbstractC3864a
    /* renamed from: f */
    public final void mo8411f(InterfaceC3364a interfaceC3364a, int i10, Object obj) {
        C3885v builder = (C3885v) obj;
        AbstractC4154l.m8923f(builder, "builder");
        float fMo7688t = interfaceC3364a.mo7688t(this.f19962b, i10);
        builder.mo8415b(builder.mo8416d() + 1);
        float[] fArr = builder.f19972a;
        int i11 = builder.f19973b;
        builder.f19973b = i11 + 1;
        fArr[i11] = fMo7688t;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: g */
    public final Object mo8412g(Object obj) {
        float[] fArr = (float[]) obj;
        AbstractC4154l.m8923f(fArr, "<this>");
        C3885v c3885v = new C3885v();
        c3885v.f19972a = fArr;
        c3885v.f19973b = fArr.length;
        c3885v.mo8415b(10);
        return c3885v;
    }

    @Override // jy.s0
    /* renamed from: j */
    public final Object mo8418j() {
        return new float[0];
    }

    @Override // jy.s0
    /* renamed from: k */
    public final void mo8419k(InterfaceC3365b encoder, Object obj, int i10) {
        float[] content = (float[]) obj;
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            float f6 = content[i11];
            C4597u c4597u = (C4597u) encoder;
            r0 descriptor = this.f19962b;
            AbstractC4154l.m8923f(descriptor, "descriptor");
            c4597u.m9440s(descriptor, i11);
            c4597u.mo7718k(f6);
        }
    }
}
