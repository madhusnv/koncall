package p001o;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class ko3 implements su5, tu5 {

    /* renamed from: a */
    public ldc f32492a;

    /* renamed from: b */
    public volatile boolean f32493b;

    @Override // p001o.tu5
    /* renamed from: a */
    public boolean mo30304a(su5 su5Var) {
        Objects.requireNonNull(su5Var, "disposable is null");
        if (!this.f32493b) {
            synchronized (this) {
                if (!this.f32493b) {
                    ldc ldcVar = this.f32492a;
                    if (ldcVar == null) {
                        ldcVar = new ldc();
                        this.f32492a = ldcVar;
                    }
                    ldcVar.m36981a(su5Var);
                    return true;
                }
            }
        }
        su5Var.dispose();
        return false;
    }

    @Override // p001o.tu5
    /* renamed from: b */
    public boolean mo30305b(su5 su5Var) {
        Objects.requireNonNull(su5Var, "disposable is null");
        if (this.f32493b) {
            return false;
        }
        synchronized (this) {
            if (this.f32493b) {
                return false;
            }
            ldc ldcVar = this.f32492a;
            if (ldcVar != null && ldcVar.m36984e(su5Var)) {
                return true;
            }
            return false;
        }
    }

    @Override // p001o.tu5
    /* renamed from: d */
    public boolean mo30306d(su5 su5Var) {
        if (!mo30305b(su5Var)) {
            return false;
        }
        su5Var.dispose();
        return true;
    }

    @Override // p001o.su5
    public void dispose() {
        if (this.f32493b) {
            return;
        }
        synchronized (this) {
            if (this.f32493b) {
                return;
            }
            this.f32493b = true;
            ldc ldcVar = this.f32492a;
            this.f32492a = null;
            m35970f(ldcVar);
        }
    }

    /* renamed from: e */
    public void m35969e() {
        if (this.f32493b) {
            return;
        }
        synchronized (this) {
            if (this.f32493b) {
                return;
            }
            ldc ldcVar = this.f32492a;
            this.f32492a = null;
            m35970f(ldcVar);
        }
    }

    /* renamed from: f */
    public void m35970f(ldc ldcVar) {
        if (ldcVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : ldcVar.m36982b()) {
            if (obj instanceof su5) {
                try {
                    ((su5) obj).dispose();
                } catch (Throwable th) {
                    zk6.m59526b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new mo3(arrayList);
            }
            throw xk6.m56420h((Throwable) arrayList.get(0));
        }
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        return this.f32493b;
    }
}
