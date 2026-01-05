package androidx.compose.ui.input.key;

import p001o.ilb;
import p001o.sq8;
import p001o.vc9;
import p001o.xk7;

/* loaded from: classes2.dex */
final class KeyInputElement extends ilb {

    /* renamed from: b */
    public final xk7 f6299b;

    /* renamed from: c */
    public final xk7 f6300c;

    public KeyInputElement(xk7 xk7Var, xk7 xk7Var2) {
        this.f6299b = xk7Var;
        this.f6300c = xk7Var2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return sq8.m48644c(this.f6299b, keyInputElement.f6299b) && sq8.m48644c(this.f6300c, keyInputElement.f6300c);
    }

    @Override // p001o.ilb
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public vc9 mo4865d() {
        return new vc9(this.f6299b, this.f6300c);
    }

    @Override // p001o.ilb
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo4866e(vc9 vc9Var) {
        sq8.m48649h(vc9Var, "node");
        vc9Var.a0(this.f6299b);
        vc9Var.b0(this.f6300c);
    }

    public int hashCode() {
        xk7 xk7Var = this.f6299b;
        int iHashCode = (xk7Var == null ? 0 : xk7Var.hashCode()) * 31;
        xk7 xk7Var2 = this.f6300c;
        return iHashCode + (xk7Var2 != null ? xk7Var2.hashCode() : 0);
    }

    public String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f6299b + ", onPreKeyEvent=" + this.f6300c + ')';
    }
}
