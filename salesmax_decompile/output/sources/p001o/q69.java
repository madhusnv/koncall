package p001o;

import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public final class q69 extends CancellationException {

    /* renamed from: a */
    public final transient p69 f41373a;

    public q69(String str, Throwable th, p69 p69Var) {
        super(str);
        this.f41373a = p69Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q69) {
                q69 q69Var = (q69) obj;
                if (!sq8.m48644c(q69Var.getMessage(), getMessage()) || !sq8.m48644c(q69Var.f41373a, this.f41373a) || !sq8.m48644c(q69Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        sq8.m48646e(message);
        int iHashCode = ((message.hashCode() * 31) + this.f41373a.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f41373a;
    }
}
