package p001o;

/* loaded from: classes6.dex */
public enum u66 implements g5e {
    INSTANCE;

    public static void complete(qag qagVar) {
        qagVar.mo18165b(INSTANCE);
        qagVar.onComplete();
    }

    public static void error(Throwable th, qag qagVar) {
        qagVar.mo18165b(INSTANCE);
        qagVar.onError(th);
    }

    @Override // p001o.rag
    public void cancel() {
    }

    @Override // p001o.rtf
    public void clear() {
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

    @Override // p001o.rag
    public void request(long j) {
        wag.validate(j);
    }

    @Override // p001o.f5e
    public int requestFusion(int i) {
        return i & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
