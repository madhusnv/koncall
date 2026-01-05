package androidx.compose.foundation.selection;

import com.sun.mail.util.AbstractC1452a;
import d4.C1580h;
import ex.InterfaceC2137a;
import i1.u0;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import v1.C7624b;
import v3.AbstractC7634f;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class SelectableElement extends a1 {

    /* renamed from: a */
    public final boolean f2002a;

    /* renamed from: b */
    public final InterfaceC4630l f2003b;

    /* renamed from: c */
    public final u0 f2004c;

    /* renamed from: d */
    public final boolean f2005d;

    /* renamed from: e */
    public final C1580h f2006e;

    /* renamed from: f */
    public final InterfaceC2137a f2007f;

    public SelectableElement(boolean z6, InterfaceC4630l interfaceC4630l, u0 u0Var, boolean z10, C1580h c1580h, InterfaceC2137a interfaceC2137a) {
        this.f2002a = z6;
        this.f2003b = interfaceC4630l;
        this.f2004c = u0Var;
        this.f2005d = z10;
        this.f2006e = c1580h;
        this.f2007f = interfaceC2137a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f2002a == selectableElement.f2002a && AbstractC4154l.m8918a(this.f2003b, selectableElement.f2003b) && AbstractC4154l.m8918a(this.f2004c, selectableElement.f2004c) && this.f2005d == selectableElement.f2005d && AbstractC4154l.m8918a(this.f2006e, selectableElement.f2006e) && this.f2007f == selectableElement.f2007f;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C7624b c7624b = new C7624b(this.f2003b, this.f2004c, this.f2005d, null, this.f2006e, this.f2007f);
        c7624b.f36780M = this.f2002a;
        return c7624b;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f2002a) * 31;
        InterfaceC4630l interfaceC4630l = this.f2003b;
        int iHashCode2 = (iHashCode + (interfaceC4630l != null ? interfaceC4630l.hashCode() : 0)) * 31;
        u0 u0Var = this.f2004c;
        int iM4558e = AbstractC1452a.m4558e((iHashCode2 + (u0Var != null ? u0Var.hashCode() : 0)) * 31, 31, this.f2005d);
        C1580h c1580h = this.f2006e;
        return this.f2007f.hashCode() + ((iM4558e + (c1580h != null ? Integer.hashCode(c1580h.f7837a) : 0)) * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C7624b c7624b = (C7624b) abstractC7878q;
        boolean z6 = c7624b.f36780M;
        boolean z10 = this.f2002a;
        if (z6 != z10) {
            c7624b.f36780M = z10;
            AbstractC7634f.m14554o(c7624b);
        }
        c7624b.V0(this.f2003b, this.f2004c, this.f2005d, null, this.f2006e, this.f2007f);
    }
}
