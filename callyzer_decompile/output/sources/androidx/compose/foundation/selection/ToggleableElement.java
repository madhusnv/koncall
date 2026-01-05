package androidx.compose.foundation.selection;

import com.sun.mail.util.AbstractC1452a;
import d4.C1580h;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import v1.C7625c;
import v3.AbstractC7634f;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class ToggleableElement extends a1 {

    /* renamed from: a */
    public final boolean f2008a;

    /* renamed from: b */
    public final InterfaceC4630l f2009b;

    /* renamed from: c */
    public final boolean f2010c;

    /* renamed from: d */
    public final C1580h f2011d;

    /* renamed from: e */
    public final InterfaceC2139c f2012e;

    public ToggleableElement(boolean z6, InterfaceC4630l interfaceC4630l, boolean z10, C1580h c1580h, InterfaceC2139c interfaceC2139c) {
        this.f2008a = z6;
        this.f2009b = interfaceC4630l;
        this.f2010c = z10;
        this.f2011d = c1580h;
        this.f2012e = interfaceC2139c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f2008a == toggleableElement.f2008a && AbstractC4154l.m8918a(this.f2009b, toggleableElement.f2009b) && this.f2010c == toggleableElement.f2010c && this.f2011d.equals(toggleableElement.f2011d) && this.f2012e == toggleableElement.f2012e;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new C7625c(this.f2008a, this.f2009b, this.f2010c, this.f2011d, this.f2012e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f2008a) * 31;
        InterfaceC4630l interfaceC4630l = this.f2009b;
        return this.f2012e.hashCode() + AbstractC1452a.m4556c(this.f2011d.f7837a, AbstractC1452a.m4558e((iHashCode + (interfaceC4630l != null ? interfaceC4630l.hashCode() : 0)) * 961, 31, this.f2010c), 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C7625c c7625c = (C7625c) abstractC7878q;
        boolean z6 = c7625c.f36781M;
        boolean z10 = this.f2008a;
        if (z6 != z10) {
            c7625c.f36781M = z10;
            AbstractC7634f.m14554o(c7625c);
        }
        c7625c.f36782N = this.f2012e;
        c7625c.V0(this.f2009b, null, this.f2010c, null, this.f2011d, c7625c.f36783O);
    }
}
