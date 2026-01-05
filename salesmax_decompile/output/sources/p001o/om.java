package p001o;

/* loaded from: classes6.dex */
public final class om extends hge {
    public om(jm jmVar) {
        super(jmVar);
    }

    @Override // p001o.hge
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo30424a(jm jmVar) {
        try {
            jmVar.run();
        } catch (Throwable th) {
            throw xk6.m56420h(th);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "ActionDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
