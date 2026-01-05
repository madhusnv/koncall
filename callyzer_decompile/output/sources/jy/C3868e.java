package jy;

import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.e */
/* loaded from: classes3.dex */
public final class C3868e extends s0 {

    /* renamed from: c */
    public static final C3868e f19886c = new C3868e(C3869f.f19891a);

    @Override // jy.AbstractC3864a
    /* renamed from: d */
    public final int mo8409d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC4154l.m8923f(zArr, "<this>");
        return zArr.length;
    }

    @Override // jy.AbstractC3877n, jy.AbstractC3864a
    /* renamed from: f */
    public final void mo8411f(InterfaceC3364a interfaceC3364a, int i10, Object obj) {
        C3867d builder = (C3867d) obj;
        AbstractC4154l.m8923f(builder, "builder");
        boolean zMo7682h = interfaceC3364a.mo7682h(this.f19962b, i10);
        builder.mo8415b(builder.mo8416d() + 1);
        boolean[] zArr = builder.f19880a;
        int i11 = builder.f19881b;
        builder.f19881b = i11 + 1;
        zArr[i11] = zMo7682h;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: g */
    public final Object mo8412g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC4154l.m8923f(zArr, "<this>");
        C3867d c3867d = new C3867d();
        c3867d.f19880a = zArr;
        c3867d.f19881b = zArr.length;
        c3867d.mo8415b(10);
        return c3867d;
    }

    @Override // jy.s0
    /* renamed from: j */
    public final Object mo8418j() {
        return new boolean[0];
    }

    @Override // jy.s0
    /* renamed from: k */
    public final void mo8419k(InterfaceC3365b encoder, Object obj, int i10) {
        boolean[] content = (boolean[]) obj;
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            boolean z6 = content[i11];
            C4597u c4597u = (C4597u) encoder;
            r0 descriptor = this.f19962b;
            AbstractC4154l.m8923f(descriptor, "descriptor");
            c4597u.m9440s(descriptor, i11);
            c4597u.mo7717j(z6);
        }
    }
}
