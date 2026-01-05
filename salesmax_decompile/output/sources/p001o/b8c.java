package p001o;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class b8c extends x6c {

    /* renamed from: a */
    public final Future f15674a;

    /* renamed from: b */
    public final long f15675b;

    /* renamed from: c */
    public final TimeUnit f15676c;

    public b8c(Future future, long j, TimeUnit timeUnit) {
        this.f15674a = future;
        this.f15675b = j;
        this.f15676c = timeUnit;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        ik5 ik5Var = new ik5(m9cVar);
        m9cVar.mo16559a(ik5Var);
        if (ik5Var.isDisposed()) {
            return;
        }
        try {
            TimeUnit timeUnit = this.f15676c;
            ik5Var.m32239d(xk6.m56415c(timeUnit != null ? this.f15674a.get(this.f15675b, timeUnit) : this.f15674a.get(), "Future returned a null value."));
        } catch (Throwable th) {
            zk6.m59526b(th);
            if (ik5Var.isDisposed()) {
                return;
            }
            m9cVar.onError(th);
        }
    }
}
