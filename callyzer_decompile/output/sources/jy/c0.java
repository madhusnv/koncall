package jy;

import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c0 extends s0 {

    /* renamed from: c */
    public static final c0 f19878c = new c0(d0.f19882a);

    @Override // jy.AbstractC3864a
    /* renamed from: d */
    public final int mo8409d(Object obj) {
        int[] iArr = (int[]) obj;
        AbstractC4154l.m8923f(iArr, "<this>");
        return iArr.length;
    }

    @Override // jy.AbstractC3877n, jy.AbstractC3864a
    /* renamed from: f */
    public final void mo8411f(InterfaceC3364a interfaceC3364a, int i10, Object obj) {
        b0 builder = (b0) obj;
        AbstractC4154l.m8923f(builder, "builder");
        int iMo7684m = interfaceC3364a.mo7684m(this.f19962b, i10);
        builder.mo8415b(builder.mo8416d() + 1);
        int[] iArr = builder.f19872a;
        int i11 = builder.f19873b;
        builder.f19873b = i11 + 1;
        iArr[i11] = iMo7684m;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: g */
    public final Object mo8412g(Object obj) {
        int[] iArr = (int[]) obj;
        AbstractC4154l.m8923f(iArr, "<this>");
        b0 b0Var = new b0();
        b0Var.f19872a = iArr;
        b0Var.f19873b = iArr.length;
        b0Var.mo8415b(10);
        return b0Var;
    }

    @Override // jy.s0
    /* renamed from: j */
    public final Object mo8418j() {
        return new int[0];
    }

    @Override // jy.s0
    /* renamed from: k */
    public final void mo8419k(InterfaceC3365b encoder, Object obj, int i10) {
        int[] content = (int[]) obj;
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = content[i11];
            C4597u c4597u = (C4597u) encoder;
            r0 descriptor = this.f19962b;
            AbstractC4154l.m8923f(descriptor, "descriptor");
            c4597u.m9440s(descriptor, i11);
            c4597u.mo7722p(i12);
        }
    }
}
