package androidx.compose.foundation.selection;

import com.sun.mail.util.AbstractC1452a;
import d4.C1580h;
import ex.InterfaceC2137a;
import f4.EnumC2203a;
import i1.u0;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import v1.C7626d;
import v3.AbstractC7634f;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class TriStateToggleableElement extends a1 {

    /* renamed from: a */
    public final EnumC2203a f2013a;

    /* renamed from: b */
    public final InterfaceC4630l f2014b;

    /* renamed from: c */
    public final u0 f2015c;

    /* renamed from: d */
    public final boolean f2016d;

    /* renamed from: e */
    public final C1580h f2017e;

    /* renamed from: f */
    public final InterfaceC2137a f2018f;

    public TriStateToggleableElement(EnumC2203a enumC2203a, InterfaceC4630l interfaceC4630l, u0 u0Var, boolean z6, C1580h c1580h, InterfaceC2137a interfaceC2137a) {
        this.f2013a = enumC2203a;
        this.f2014b = interfaceC4630l;
        this.f2015c = u0Var;
        this.f2016d = z6;
        this.f2017e = c1580h;
        this.f2018f = interfaceC2137a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.f2013a == triStateToggleableElement.f2013a && AbstractC4154l.m8918a(this.f2014b, triStateToggleableElement.f2014b) && AbstractC4154l.m8918a(this.f2015c, triStateToggleableElement.f2015c) && this.f2016d == triStateToggleableElement.f2016d && this.f2017e.equals(triStateToggleableElement.f2017e) && this.f2018f == triStateToggleableElement.f2018f;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C7626d c7626d = new C7626d(this.f2014b, this.f2015c, this.f2016d, null, this.f2017e, this.f2018f);
        c7626d.f36784M = this.f2013a;
        return c7626d;
    }

    public final int hashCode() {
        int iHashCode = this.f2013a.hashCode() * 31;
        InterfaceC4630l interfaceC4630l = this.f2014b;
        int iHashCode2 = (iHashCode + (interfaceC4630l != null ? interfaceC4630l.hashCode() : 0)) * 31;
        u0 u0Var = this.f2015c;
        return this.f2018f.hashCode() + AbstractC1452a.m4556c(this.f2017e.f7837a, AbstractC1452a.m4558e((iHashCode2 + (u0Var != null ? u0Var.hashCode() : 0)) * 31, 31, this.f2016d), 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C7626d c7626d = (C7626d) abstractC7878q;
        EnumC2203a enumC2203a = c7626d.f36784M;
        EnumC2203a enumC2203a2 = this.f2013a;
        if (enumC2203a != enumC2203a2) {
            c7626d.f36784M = enumC2203a2;
            AbstractC7634f.m14554o(c7626d);
        }
        c7626d.V0(this.f2014b, this.f2015c, this.f2016d, null, this.f2017e, this.f2018f);
    }
}
