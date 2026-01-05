package p001o;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class l57 extends s47 {

    /* renamed from: b */
    public final Future f33285b;

    /* renamed from: c */
    public final long f33286c;

    /* renamed from: d */
    public final TimeUnit f33287d;

    public l57(Future future, long j, TimeUnit timeUnit) {
        this.f33285b = future;
        this.f33286c = j;
        this.f33287d = timeUnit;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        jk5 jk5Var = new jk5(qagVar);
        qagVar.mo18165b(jk5Var);
        try {
            TimeUnit timeUnit = this.f33287d;
            Object obj = timeUnit != null ? this.f33285b.get(this.f33286c, timeUnit) : this.f33285b.get();
            if (obj == null) {
                qagVar.onError(xk6.m56414b("The future returned a null value."));
            } else {
                jk5Var.m33899c(obj);
            }
        } catch (Throwable th) {
            zk6.m59526b(th);
            if (jk5Var.m33900d()) {
                return;
            }
            qagVar.onError(th);
        }
    }
}
