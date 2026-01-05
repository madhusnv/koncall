package p001o;

/* loaded from: classes6.dex */
public final class pr5 extends RuntimeException {

    /* renamed from: a */
    public final transient q74 f40439a;

    public pr5(q74 q74Var) {
        this.f40439a = q74Var;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f40439a.toString();
    }
}
