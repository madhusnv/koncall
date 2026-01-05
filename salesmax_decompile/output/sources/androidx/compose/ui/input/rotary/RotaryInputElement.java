package androidx.compose.ui.input.rotary;

import p001o.ilb;
import p001o.que;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes2.dex */
final class RotaryInputElement extends ilb {

    /* renamed from: b */
    public final xk7 f6301b;

    /* renamed from: c */
    public final xk7 f6302c;

    public RotaryInputElement(xk7 xk7Var, xk7 xk7Var2) {
        this.f6301b = xk7Var;
        this.f6302c = xk7Var2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return sq8.m48644c(this.f6301b, rotaryInputElement.f6301b) && sq8.m48644c(this.f6302c, rotaryInputElement.f6302c);
    }

    @Override // p001o.ilb
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public que mo4865d() {
        return new que(this.f6301b, this.f6302c);
    }

    @Override // p001o.ilb
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo4866e(que queVar) {
        sq8.m48649h(queVar, "node");
        queVar.a0(this.f6301b);
        queVar.b0(this.f6302c);
    }

    public int hashCode() {
        xk7 xk7Var = this.f6301b;
        int iHashCode = (xk7Var == null ? 0 : xk7Var.hashCode()) * 31;
        xk7 xk7Var2 = this.f6302c;
        return iHashCode + (xk7Var2 != null ? xk7Var2.hashCode() : 0);
    }

    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f6301b + ", onPreRotaryScrollEvent=" + this.f6302c + ')';
    }
}
