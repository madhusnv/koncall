package androidx.compose.foundation;

import com.sun.mail.util.AbstractC1452a;
import d4.C1580h;
import ex.InterfaceC2137a;
import i1.C3142u;
import i1.u0;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class ClickableElement extends a1 {

    /* renamed from: a */
    public final InterfaceC4630l f1890a;

    /* renamed from: b */
    public final u0 f1891b;

    /* renamed from: c */
    public final boolean f1892c;

    /* renamed from: d */
    public final String f1893d;

    /* renamed from: e */
    public final C1580h f1894e;

    /* renamed from: f */
    public final InterfaceC2137a f1895f;

    public ClickableElement(InterfaceC4630l interfaceC4630l, u0 u0Var, boolean z6, String str, C1580h c1580h, InterfaceC2137a interfaceC2137a) {
        this.f1890a = interfaceC4630l;
        this.f1891b = u0Var;
        this.f1892c = z6;
        this.f1893d = str;
        this.f1894e = c1580h;
        this.f1895f = interfaceC2137a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return AbstractC4154l.m8918a(this.f1890a, clickableElement.f1890a) && AbstractC4154l.m8918a(this.f1891b, clickableElement.f1891b) && this.f1892c == clickableElement.f1892c && AbstractC4154l.m8918a(this.f1893d, clickableElement.f1893d) && AbstractC4154l.m8918a(this.f1894e, clickableElement.f1894e) && this.f1895f == clickableElement.f1895f;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new C3142u(this.f1890a, this.f1891b, this.f1892c, this.f1893d, this.f1894e, this.f1895f);
    }

    public final int hashCode() {
        InterfaceC4630l interfaceC4630l = this.f1890a;
        int iHashCode = (interfaceC4630l != null ? interfaceC4630l.hashCode() : 0) * 31;
        u0 u0Var = this.f1891b;
        int iM4558e = AbstractC1452a.m4558e((iHashCode + (u0Var != null ? u0Var.hashCode() : 0)) * 31, 31, this.f1892c);
        String str = this.f1893d;
        int iHashCode2 = (iM4558e + (str != null ? str.hashCode() : 0)) * 31;
        C1580h c1580h = this.f1894e;
        return this.f1895f.hashCode() + ((iHashCode2 + (c1580h != null ? Integer.hashCode(c1580h.f7837a) : 0)) * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((C3142u) abstractC7878q).V0(this.f1890a, this.f1891b, this.f1892c, this.f1893d, this.f1894e, this.f1895f);
    }
}
