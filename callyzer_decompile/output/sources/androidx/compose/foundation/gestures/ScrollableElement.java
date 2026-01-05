package androidx.compose.foundation.gestures;

import com.sun.mail.util.AbstractC1452a;
import k1.p1;
import k1.q1;
import k1.x0;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class ScrollableElement extends a1 {

    /* renamed from: a */
    public final q1 f1932a;

    /* renamed from: b */
    public final x0 f1933b;

    /* renamed from: c */
    public final boolean f1934c;

    /* renamed from: d */
    public final boolean f1935d;

    /* renamed from: e */
    public final InterfaceC4630l f1936e;

    public ScrollableElement(q1 q1Var, x0 x0Var, boolean z6, boolean z10, InterfaceC4630l interfaceC4630l) {
        this.f1932a = q1Var;
        this.f1933b = x0Var;
        this.f1934c = z6;
        this.f1935d = z10;
        this.f1936e = interfaceC4630l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return AbstractC4154l.m8918a(this.f1932a, scrollableElement.f1932a) && this.f1933b == scrollableElement.f1933b && this.f1934c == scrollableElement.f1934c && this.f1935d == scrollableElement.f1935d && AbstractC4154l.m8918a(this.f1936e, scrollableElement.f1936e);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new p1(null, null, null, this.f1933b, this.f1932a, this.f1936e, this.f1934c, this.f1935d);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(AbstractC1452a.m4558e((this.f1933b.hashCode() + (this.f1932a.hashCode() * 31)) * 961, 31, this.f1934c), 961, this.f1935d);
        InterfaceC4630l interfaceC4630l = this.f1936e;
        return (iM4558e + (interfaceC4630l != null ? interfaceC4630l.hashCode() : 0)) * 31;
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((p1) abstractC7878q).X0(null, null, null, this.f1933b, this.f1932a, this.f1936e, this.f1934c, this.f1935d);
    }
}
