package p001o;

/* loaded from: classes6.dex */
public enum h66 implements e5e {
    INSTANCE,
    NEVER;

    public static void complete(m9c m9cVar) {
        m9cVar.mo16559a(INSTANCE);
        m9cVar.onComplete();
    }

    public static void error(Throwable th, m9c m9cVar) {
        m9cVar.mo16559a(INSTANCE);
        m9cVar.onError(th);
    }

    @Override // p001o.rtf
    public void clear() {
    }

    @Override // p001o.su5
    public void dispose() {
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // p001o.rtf
    public boolean isEmpty() {
        return true;
    }

    @Override // p001o.rtf
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p001o.rtf
    public Object poll() {
        return null;
    }

    @Override // p001o.f5e
    public int requestFusion(int i) {
        return i & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(q0b q0bVar) {
        q0bVar.mo34822a(INSTANCE);
        q0bVar.onComplete();
    }

    public static void error(Throwable th, ml3 ml3Var) {
        ml3Var.mo16368a(INSTANCE);
        ml3Var.onError(th);
    }

    public static void complete(ml3 ml3Var) {
        ml3Var.mo16368a(INSTANCE);
        ml3Var.onComplete();
    }

    public static void error(Throwable th, luf lufVar) {
        lufVar.mo17881a(INSTANCE);
        lufVar.onError(th);
    }

    public static void error(Throwable th, q0b q0bVar) {
        q0bVar.mo34822a(INSTANCE);
        q0bVar.onError(th);
    }
}
