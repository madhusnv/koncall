package p001o;

import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class a8c extends x6c implements idg {

    /* renamed from: a */
    public final Callable f14295a;

    public a8c(Callable callable) {
        this.f14295a = callable;
    }

    @Override // p001o.idg
    public Object get() {
        return xk6.m56415c(this.f14295a.call(), "The Callable returned a null value.");
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        ik5 ik5Var = new ik5(m9cVar);
        m9cVar.mo16559a(ik5Var);
        if (ik5Var.isDisposed()) {
            return;
        }
        try {
            ik5Var.m32239d(xk6.m56415c(this.f14295a.call(), "Callable returned a null value."));
        } catch (Throwable th) {
            zk6.m59526b(th);
            if (ik5Var.isDisposed()) {
                fwe.m27599r(th);
            } else {
                m9cVar.onError(th);
            }
        }
    }
}
