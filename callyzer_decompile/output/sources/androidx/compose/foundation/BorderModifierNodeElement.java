package androidx.compose.foundation;

import a3.C0044c;
import d3.l0;
import d3.n0;
import i1.C3137p;
import kotlin.jvm.internal.AbstractC4154l;
import s4.C6750f;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends a1 {

    /* renamed from: a */
    public final float f1887a;

    /* renamed from: b */
    public final n0 f1888b;

    /* renamed from: c */
    public final l0 f1889c;

    public BorderModifierNodeElement(float f6, n0 n0Var, l0 l0Var) {
        this.f1887a = f6;
        this.f1888b = n0Var;
        this.f1889c = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return C6750f.m12935a(this.f1887a, borderModifierNodeElement.f1887a) && this.f1888b.equals(borderModifierNodeElement.f1888b) && AbstractC4154l.m8918a(this.f1889c, borderModifierNodeElement.f1889c);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new C3137p(this.f1887a, this.f1888b, this.f1889c);
    }

    public final int hashCode() {
        return this.f1889c.hashCode() + ((this.f1888b.hashCode() + (Float.hashCode(this.f1887a) * 31)) * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C3137p c3137p = (C3137p) abstractC7878q;
        float f6 = c3137p.f16948t;
        C0044c c0044c = c3137p.f16951x;
        float f10 = this.f1887a;
        if (!C6750f.m12935a(f6, f10)) {
            c3137p.f16948t = f10;
            c0044c.L0();
        }
        n0 n0Var = c3137p.f16949v;
        n0 n0Var2 = this.f1888b;
        if (!AbstractC4154l.m8918a(n0Var, n0Var2)) {
            c3137p.f16949v = n0Var2;
            c0044c.L0();
        }
        l0 l0Var = c3137p.f16950w;
        l0 l0Var2 = this.f1889c;
        if (AbstractC4154l.m8918a(l0Var, l0Var2)) {
            return;
        }
        c3137p.f16950w = l0Var2;
        c0044c.L0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) C6750f.m12936b(this.f1887a)) + ", brush=" + this.f1888b + ", shape=" + this.f1889c + ')';
    }
}
