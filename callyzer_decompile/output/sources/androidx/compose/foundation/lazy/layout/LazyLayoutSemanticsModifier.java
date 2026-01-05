package androidx.compose.foundation.lazy.layout;

import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2137a;
import k1.x0;
import kotlin.jvm.internal.AbstractC4154l;
import s1.o0;
import s1.r0;
import v3.AbstractC7634f;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends a1 {

    /* renamed from: a */
    public final InterfaceC2137a f1983a;

    /* renamed from: b */
    public final o0 f1984b;

    /* renamed from: c */
    public final x0 f1985c;

    /* renamed from: d */
    public final boolean f1986d;

    public LazyLayoutSemanticsModifier(InterfaceC2137a interfaceC2137a, o0 o0Var, x0 x0Var, boolean z6) {
        this.f1983a = interfaceC2137a;
        this.f1984b = o0Var;
        this.f1985c = x0Var;
        this.f1986d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f1983a == lazyLayoutSemanticsModifier.f1983a && AbstractC4154l.m8918a(this.f1984b, lazyLayoutSemanticsModifier.f1984b) && this.f1985c == lazyLayoutSemanticsModifier.f1985c && this.f1986d == lazyLayoutSemanticsModifier.f1986d;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new r0(this.f1983a, this.f1984b, this.f1985c, this.f1986d);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC1452a.m4558e((this.f1985c.hashCode() + ((this.f1984b.hashCode() + (this.f1983a.hashCode() * 31)) * 31)) * 31, 31, this.f1986d);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        r0 r0Var = (r0) abstractC7878q;
        r0Var.f32123q = this.f1983a;
        r0Var.f32124r = this.f1984b;
        x0 x0Var = r0Var.f32125s;
        x0 x0Var2 = this.f1985c;
        if (x0Var != x0Var2) {
            r0Var.f32125s = x0Var2;
            AbstractC7634f.m14554o(r0Var);
        }
        boolean z6 = r0Var.f32126t;
        boolean z10 = this.f1986d;
        if (z6 == z10) {
            return;
        }
        r0Var.f32126t = z10;
        r0Var.L0();
        AbstractC7634f.m14554o(r0Var);
    }
}
