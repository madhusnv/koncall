package p001o;

import android.view.KeyEvent;
import p001o.alb;

/* loaded from: classes2.dex */
public final class vc9 extends alb.AbstractC12216c implements uc9 {

    /* renamed from: L */
    public xk7 f50110L;

    /* renamed from: M */
    public xk7 f50111M;

    public vc9(xk7 xk7Var, xk7 xk7Var2) {
        this.f50110L = xk7Var;
        this.f50111M = xk7Var2;
    }

    public final void a0(xk7 xk7Var) {
        this.f50110L = xk7Var;
    }

    public final void b0(xk7 xk7Var) {
        this.f50111M = xk7Var;
    }

    @Override // p001o.uc9
    /* renamed from: m */
    public boolean mo51361m(KeyEvent keyEvent) {
        sq8.m48649h(keyEvent, "event");
        xk7 xk7Var = this.f50111M;
        if (xk7Var != null) {
            return ((Boolean) xk7Var.invoke(oc9.m41964a(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p001o.uc9
    /* renamed from: q */
    public boolean mo51362q(KeyEvent keyEvent) {
        sq8.m48649h(keyEvent, "event");
        xk7 xk7Var = this.f50110L;
        if (xk7Var != null) {
            return ((Boolean) xk7Var.invoke(oc9.m41964a(keyEvent))).booleanValue();
        }
        return false;
    }
}
