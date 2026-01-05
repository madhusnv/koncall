package p001o;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class guf extends wtf {

    /* renamed from: a */
    public final Callable f25811a;

    public guf(Callable callable) {
        this.f25811a = callable;
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        su5 su5VarM48918c = su5.m48918c();
        lufVar.mo17881a(su5VarM48918c);
        if (su5VarM48918c.isDisposed()) {
            return;
        }
        try {
            Object objCall = this.f25811a.call();
            Objects.requireNonNull(objCall, "The callable returned a null value");
            if (su5VarM48918c.isDisposed()) {
                return;
            }
            lufVar.onSuccess(objCall);
        } catch (Throwable th) {
            zk6.m59526b(th);
            if (su5VarM48918c.isDisposed()) {
                fwe.m27599r(th);
            } else {
                lufVar.onError(th);
            }
        }
    }
}
