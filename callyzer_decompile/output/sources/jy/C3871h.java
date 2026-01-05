package jy;

import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.h */
/* loaded from: classes3.dex */
public final class C3871h extends s0 {

    /* renamed from: c */
    public static final C3871h f19901c = new C3871h(C3872i.f19906a);

    @Override // jy.AbstractC3864a
    /* renamed from: d */
    public final int mo8409d(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC4154l.m8923f(bArr, "<this>");
        return bArr.length;
    }

    @Override // jy.AbstractC3877n, jy.AbstractC3864a
    /* renamed from: f */
    public final void mo8411f(InterfaceC3364a interfaceC3364a, int i10, Object obj) {
        C3870g builder = (C3870g) obj;
        AbstractC4154l.m8923f(builder, "builder");
        byte bMo7683l = interfaceC3364a.mo7683l(this.f19962b, i10);
        builder.mo8415b(builder.mo8416d() + 1);
        byte[] bArr = builder.f19896a;
        int i11 = builder.f19897b;
        builder.f19897b = i11 + 1;
        bArr[i11] = bMo7683l;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: g */
    public final Object mo8412g(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC4154l.m8923f(bArr, "<this>");
        C3870g c3870g = new C3870g();
        c3870g.f19896a = bArr;
        c3870g.f19897b = bArr.length;
        c3870g.mo8415b(10);
        return c3870g;
    }

    @Override // jy.s0
    /* renamed from: j */
    public final Object mo8418j() {
        return new byte[0];
    }

    @Override // jy.s0
    /* renamed from: k */
    public final void mo8419k(InterfaceC3365b encoder, Object obj, int i10) {
        byte[] content = (byte[]) obj;
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            byte b10 = content[i11];
            C4597u c4597u = (C4597u) encoder;
            r0 descriptor = this.f19962b;
            AbstractC4154l.m8923f(descriptor, "descriptor");
            c4597u.m9440s(descriptor, i11);
            c4597u.mo7716h(b10);
        }
    }
}
