package androidx.compose.foundation.gestures;

import c9.C0908c;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2142f;
import k1.C3929d;
import k1.g0;
import k1.j0;
import k1.x0;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DraggableElement extends a1 {

    /* renamed from: a */
    public final C0908c f1926a;

    /* renamed from: b */
    public final x0 f1927b;

    /* renamed from: c */
    public final boolean f1928c;

    /* renamed from: d */
    public final boolean f1929d;

    /* renamed from: e */
    public final InterfaceC2142f f1930e;

    /* renamed from: f */
    public final InterfaceC2142f f1931f;

    public DraggableElement(C0908c c0908c, x0 x0Var, boolean z6, boolean z10, g0 g0Var, InterfaceC2142f interfaceC2142f) {
        this.f1926a = c0908c;
        this.f1927b = x0Var;
        this.f1928c = z6;
        this.f1929d = z10;
        this.f1930e = g0Var;
        this.f1931f = interfaceC2142f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return AbstractC4154l.m8918a(this.f1926a, draggableElement.f1926a) && this.f1927b == draggableElement.f1927b && this.f1928c == draggableElement.f1928c && this.f1929d == draggableElement.f1929d && AbstractC4154l.m8918a(this.f1930e, draggableElement.f1930e) && AbstractC4154l.m8918a(this.f1931f, draggableElement.f1931f);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C3929d c3929d = C3929d.f20048d;
        boolean z6 = this.f1928c;
        x0 x0Var = this.f1927b;
        j0 j0Var = new j0(c3929d, z6, null, x0Var);
        j0Var.f20140C = this.f1926a;
        j0Var.f20141D = x0Var;
        j0Var.f20142E = this.f1929d;
        j0Var.f20143F = this.f1930e;
        j0Var.f20144G = this.f1931f;
        return j0Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f1931f.hashCode() + ((this.f1930e.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4558e((this.f1927b.hashCode() + (this.f1926a.hashCode() * 31)) * 31, 961, this.f1928c), 31, this.f1929d)) * 31)) * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        boolean z6;
        boolean z10;
        j0 j0Var = (j0) abstractC7878q;
        C3929d c3929d = C3929d.f20048d;
        C0908c c0908c = j0Var.f20140C;
        C0908c c0908c2 = this.f1926a;
        if (AbstractC4154l.m8918a(c0908c, c0908c2)) {
            z6 = false;
        } else {
            j0Var.f20140C = c0908c2;
            z6 = true;
        }
        x0 x0Var = j0Var.f20141D;
        x0 x0Var2 = this.f1927b;
        if (x0Var != x0Var2) {
            j0Var.f20141D = x0Var2;
            z10 = true;
        } else {
            z10 = z6;
        }
        j0Var.f20143F = this.f1930e;
        j0Var.f20144G = this.f1931f;
        j0Var.f20142E = this.f1929d;
        j0Var.W0(c3929d, this.f1928c, null, x0Var2, z10);
    }
}
