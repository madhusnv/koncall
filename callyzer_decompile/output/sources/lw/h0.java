package lw;

import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import mw.InterfaceC4900h;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h0 implements InterfaceC4900h {

    /* renamed from: a */
    public final g0 f22591a;

    /* renamed from: b */
    public final float f22592b;

    /* renamed from: c */
    public final InterfaceC4900h f22593c;

    public h0(g0 pieSliceData, float f6, InterfaceC4900h hoverableElementAreaScope) {
        AbstractC4154l.m8923f(pieSliceData, "pieSliceData");
        AbstractC4154l.m8923f(hoverableElementAreaScope, "hoverableElementAreaScope");
        this.f22591a = pieSliceData;
        this.f22592b = f6;
        this.f22593c = hoverableElementAreaScope;
    }

    @Override // mw.InterfaceC4900h
    /* renamed from: a */
    public final InterfaceC7879r mo9399a(InterfaceC7879r interfaceC7879r, InterfaceC2141e element) {
        AbstractC4154l.m8923f(interfaceC7879r, "<this>");
        AbstractC4154l.m8923f(element, "element");
        return this.f22593c.mo9399a(interfaceC7879r, element);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return AbstractC4154l.m8918a(this.f22591a, h0Var.f22591a) && Float.compare(this.f22592b, h0Var.f22592b) == 0 && Float.compare(0.95f, 0.95f) == 0 && AbstractC4154l.m8918a(this.f22593c, h0Var.f22593c);
    }

    public final int hashCode() {
        return this.f22593c.hashCode() + AbstractC1452a.m4555b(0.95f, AbstractC1452a.m4555b(this.f22592b, this.f22591a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "PieSliceScopeImpl(pieSliceData=" + this.f22591a + ", innerRadius=" + this.f22592b + ", outerRadius=0.95, hoverableElementAreaScope=" + this.f22593c + ")";
    }
}
