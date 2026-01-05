package p001o;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class k57 extends s47 implements idg {

    /* renamed from: b */
    public final Callable f31488b;

    public k57(Callable callable) {
        this.f31488b = callable;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        jk5 jk5Var = new jk5(qagVar);
        qagVar.mo18165b(jk5Var);
        try {
            Object objCall = this.f31488b.call();
            Objects.requireNonNull(objCall, "The callable returned a null value");
            jk5Var.m33899c(objCall);
        } catch (Throwable th) {
            zk6.m59526b(th);
            if (jk5Var.m33900d()) {
                fwe.m27599r(th);
            } else {
                qagVar.onError(th);
            }
        }
    }

    @Override // p001o.idg
    public Object get() throws Exception {
        Object objCall = this.f31488b.call();
        Objects.requireNonNull(objCall, "The callable returned a null value");
        return objCall;
    }
}
