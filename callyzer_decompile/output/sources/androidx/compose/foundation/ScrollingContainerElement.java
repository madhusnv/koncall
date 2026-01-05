package androidx.compose.foundation;

import com.sun.mail.util.AbstractC1452a;
import i1.C3128g;
import k1.InterfaceC3928c;
import k1.k0;
import k1.q1;
import k1.x0;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class ScrollingContainerElement extends a1 {

    /* renamed from: a */
    public final q1 f1907a;

    /* renamed from: b */
    public final x0 f1908b;

    /* renamed from: c */
    public final boolean f1909c;

    /* renamed from: d */
    public final k0 f1910d;

    /* renamed from: e */
    public final InterfaceC4630l f1911e;

    /* renamed from: f */
    public final InterfaceC3928c f1912f;

    /* renamed from: g */
    public final boolean f1913g;

    /* renamed from: h */
    public final C3128g f1914h;

    public ScrollingContainerElement(C3128g c3128g, InterfaceC3928c interfaceC3928c, k0 k0Var, x0 x0Var, q1 q1Var, InterfaceC4630l interfaceC4630l, boolean z6, boolean z10) {
        this.f1907a = q1Var;
        this.f1908b = x0Var;
        this.f1909c = z6;
        this.f1910d = k0Var;
        this.f1911e = interfaceC4630l;
        this.f1912f = interfaceC3928c;
        this.f1913g = z10;
        this.f1914h = c3128g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return AbstractC4154l.m8918a(this.f1907a, scrollingContainerElement.f1907a) && this.f1908b == scrollingContainerElement.f1908b && this.f1909c == scrollingContainerElement.f1909c && AbstractC4154l.m8918a(this.f1910d, scrollingContainerElement.f1910d) && AbstractC4154l.m8918a(this.f1911e, scrollingContainerElement.f1911e) && AbstractC4154l.m8918a(this.f1912f, scrollingContainerElement.f1912f) && this.f1913g == scrollingContainerElement.f1913g && AbstractC4154l.m8918a(this.f1914h, scrollingContainerElement.f1914h);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        i1.q1 q1Var = new i1.q1();
        q1Var.f16969s = this.f1907a;
        q1Var.f16970t = this.f1908b;
        q1Var.f16971v = this.f1909c;
        q1Var.f16972w = this.f1910d;
        q1Var.f16973x = this.f1911e;
        q1Var.f16974y = this.f1912f;
        q1Var.f16975z = this.f1913g;
        q1Var.f16963B = this.f1914h;
        return q1Var;
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4558e((this.f1908b.hashCode() + (this.f1907a.hashCode() * 31)) * 31, 31, this.f1909c), 31, false);
        k0 k0Var = this.f1910d;
        int iHashCode = (iM4558e + (k0Var != null ? k0Var.hashCode() : 0)) * 31;
        InterfaceC4630l interfaceC4630l = this.f1911e;
        int iHashCode2 = (iHashCode + (interfaceC4630l != null ? interfaceC4630l.hashCode() : 0)) * 31;
        InterfaceC3928c interfaceC3928c = this.f1912f;
        int iM4558e2 = AbstractC1452a.m4558e((iHashCode2 + (interfaceC3928c != null ? interfaceC3928c.hashCode() : 0)) * 31, 31, this.f1913g);
        C3128g c3128g = this.f1914h;
        return iM4558e2 + (c3128g != null ? c3128g.hashCode() : 0);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        InterfaceC4630l interfaceC4630l = this.f1911e;
        ((i1.q1) abstractC7878q).Q0(this.f1914h, this.f1912f, this.f1910d, this.f1908b, this.f1907a, interfaceC4630l, this.f1913g, this.f1909c);
    }
}
