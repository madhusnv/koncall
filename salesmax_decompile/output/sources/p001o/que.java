package p001o;

import p001o.alb;

/* loaded from: classes2.dex */
public final class que extends alb.AbstractC12216c implements pue {

    /* renamed from: L */
    public xk7 f42454L;

    /* renamed from: M */
    public xk7 f42455M;

    public que(xk7 xk7Var, xk7 xk7Var2) {
        this.f42454L = xk7Var;
        this.f42455M = xk7Var2;
    }

    public final void a0(xk7 xk7Var) {
        this.f42454L = xk7Var;
    }

    @Override // p001o.pue
    /* renamed from: b */
    public boolean mo44213b(rue rueVar) {
        sq8.m48649h(rueVar, "event");
        xk7 xk7Var = this.f42454L;
        if (xk7Var != null) {
            return ((Boolean) xk7Var.invoke(rueVar)).booleanValue();
        }
        return false;
    }

    public final void b0(xk7 xk7Var) {
        this.f42455M = xk7Var;
    }

    @Override // p001o.pue
    /* renamed from: n */
    public boolean mo44214n(rue rueVar) {
        sq8.m48649h(rueVar, "event");
        xk7 xk7Var = this.f42455M;
        if (xk7Var != null) {
            return ((Boolean) xk7Var.invoke(rueVar)).booleanValue();
        }
        return false;
    }
}
