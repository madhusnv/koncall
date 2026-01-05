package androidx.compose.foundation.text.input.internal;

import b2.y0;
import b3.C0592x;
import com.sun.mail.util.AbstractC1452a;
import g4.n0;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4366k;
import l4.C4381z;
import l4.InterfaceC4374s;
import l4.i0;
import v3.AbstractC7634f;
import v3.a1;
import w2.AbstractC7878q;
import x1.v0;
import z1.C8844d;
import z1.C8846f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifier extends a1 {

    /* renamed from: a */
    public final i0 f2031a;

    /* renamed from: b */
    public final C4381z f2032b;

    /* renamed from: c */
    public final v0 f2033c;

    /* renamed from: d */
    public final boolean f2034d;

    /* renamed from: e */
    public final boolean f2035e;

    /* renamed from: f */
    public final InterfaceC4374s f2036f;

    /* renamed from: g */
    public final y0 f2037g;

    /* renamed from: h */
    public final C4366k f2038h;

    /* renamed from: j */
    public final C0592x f2039j;

    public CoreTextFieldSemanticsModifier(i0 i0Var, C4381z c4381z, v0 v0Var, boolean z6, boolean z10, InterfaceC4374s interfaceC4374s, y0 y0Var, C4366k c4366k, C0592x c0592x) {
        this.f2031a = i0Var;
        this.f2032b = c4381z;
        this.f2033c = v0Var;
        this.f2034d = z6;
        this.f2035e = z10;
        this.f2036f = interfaceC4374s;
        this.f2037g = y0Var;
        this.f2038h = c4366k;
        this.f2039j = c0592x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return this.f2031a.equals(coreTextFieldSemanticsModifier.f2031a) && AbstractC4154l.m8918a(this.f2032b, coreTextFieldSemanticsModifier.f2032b) && this.f2033c.equals(coreTextFieldSemanticsModifier.f2033c) && this.f2034d == coreTextFieldSemanticsModifier.f2034d && this.f2035e == coreTextFieldSemanticsModifier.f2035e && AbstractC4154l.m8918a(this.f2036f, coreTextFieldSemanticsModifier.f2036f) && this.f2037g.equals(coreTextFieldSemanticsModifier.f2037g) && AbstractC4154l.m8918a(this.f2038h, coreTextFieldSemanticsModifier.f2038h) && AbstractC4154l.m8918a(this.f2039j, coreTextFieldSemanticsModifier.f2039j);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C8846f c8846f = new C8846f();
        c8846f.f42571s = this.f2031a;
        c8846f.f42572t = this.f2032b;
        c8846f.f42573v = this.f2033c;
        c8846f.f42574w = this.f2034d;
        c8846f.f42575x = this.f2035e;
        c8846f.f42576y = this.f2036f;
        y0 y0Var = this.f2037g;
        c8846f.f42577z = y0Var;
        c8846f.f42569B = this.f2038h;
        c8846f.f42570C = this.f2039j;
        y0Var.f3872g = new C8844d(c8846f, 0);
        return c8846f;
    }

    public final int hashCode() {
        return this.f2039j.hashCode() + ((this.f2038h.hashCode() + ((this.f2037g.hashCode() + ((this.f2036f.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4558e(AbstractC1452a.m4558e((this.f2033c.hashCode() + ((this.f2032b.hashCode() + (this.f2031a.hashCode() * 31)) * 31)) * 31, 31, this.f2034d), 31, this.f2035e), 31, false)) * 31)) * 31)) * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C8846f c8846f = (C8846f) abstractC7878q;
        boolean z6 = c8846f.f42575x;
        boolean z10 = false;
        boolean z11 = z6 && !c8846f.f42574w;
        C4366k c4366k = c8846f.f42569B;
        y0 y0Var = c8846f.f42577z;
        boolean z12 = this.f2034d;
        boolean z13 = this.f2035e;
        if (z13 && !z12) {
            z10 = true;
        }
        c8846f.f42571s = this.f2031a;
        C4381z c4381z = this.f2032b;
        c8846f.f42572t = c4381z;
        c8846f.f42573v = this.f2033c;
        c8846f.f42574w = z12;
        c8846f.f42575x = z13;
        c8846f.f42576y = this.f2036f;
        y0 y0Var2 = this.f2037g;
        c8846f.f42577z = y0Var2;
        C4366k c4366k2 = this.f2038h;
        c8846f.f42569B = c4366k2;
        c8846f.f42570C = this.f2039j;
        if (z13 != z6 || z10 != z11 || !AbstractC4154l.m8918a(c4366k2, c4366k) || !n0.m6455b(c4381z.f21946b)) {
            AbstractC7634f.m14554o(c8846f);
        }
        if (y0Var2.equals(y0Var)) {
            return;
        }
        y0Var2.f3872g = new C8844d(c8846f, 7);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f2031a + ", value=" + this.f2032b + ", state=" + this.f2033c + ", readOnly=" + this.f2034d + ", enabled=" + this.f2035e + ", isPassword=false, offsetMapping=" + this.f2036f + ", manager=" + this.f2037g + ", imeOptions=" + this.f2038h + ", focusRequester=" + this.f2039j + ')';
    }
}
