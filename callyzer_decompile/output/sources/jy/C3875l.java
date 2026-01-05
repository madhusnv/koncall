package jy;

import iy.InterfaceC3364a;
import iy.InterfaceC3365b;
import kotlin.jvm.internal.AbstractC4154l;
import ly.C4597u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.l */
/* loaded from: classes3.dex */
public final class C3875l extends s0 {

    /* renamed from: c */
    public static final C3875l f19919c = new C3875l(C3876m.f19923a);

    @Override // jy.AbstractC3864a
    /* renamed from: d */
    public final int mo8409d(Object obj) {
        char[] cArr = (char[]) obj;
        AbstractC4154l.m8923f(cArr, "<this>");
        return cArr.length;
    }

    @Override // jy.AbstractC3877n, jy.AbstractC3864a
    /* renamed from: f */
    public final void mo8411f(InterfaceC3364a interfaceC3364a, int i10, Object obj) {
        C3874k builder = (C3874k) obj;
        AbstractC4154l.m8923f(builder, "builder");
        char cMo7678C = interfaceC3364a.mo7678C(this.f19962b, i10);
        builder.mo8415b(builder.mo8416d() + 1);
        char[] cArr = builder.f19914a;
        int i11 = builder.f19915b;
        builder.f19915b = i11 + 1;
        cArr[i11] = cMo7678C;
    }

    @Override // jy.AbstractC3864a
    /* renamed from: g */
    public final Object mo8412g(Object obj) {
        char[] cArr = (char[]) obj;
        AbstractC4154l.m8923f(cArr, "<this>");
        C3874k c3874k = new C3874k();
        c3874k.f19914a = cArr;
        c3874k.f19915b = cArr.length;
        c3874k.mo8415b(10);
        return c3874k;
    }

    @Override // jy.s0
    /* renamed from: j */
    public final Object mo8418j() {
        return new char[0];
    }

    @Override // jy.s0
    /* renamed from: k */
    public final void mo8419k(InterfaceC3365b encoder, Object obj, int i10) {
        char[] content = (char[]) obj;
        AbstractC4154l.m8923f(encoder, "encoder");
        AbstractC4154l.m8923f(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            char c2 = content[i11];
            C4597u c4597u = (C4597u) encoder;
            r0 descriptor = this.f19962b;
            AbstractC4154l.m8923f(descriptor, "descriptor");
            c4597u.m9440s(descriptor, i11);
            c4597u.mo7719l(c2);
        }
    }
}
