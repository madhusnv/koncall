package p001o;

/* loaded from: classes6.dex */
public final class pbc extends RuntimeException {
    public pbc(String str, Throwable th) {
        super(str, th == null ? new NullPointerException() : th);
    }

    public pbc(Throwable th) {
        this("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th, th);
    }
}
