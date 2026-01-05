package p001o;

/* loaded from: classes3.dex */
public final class w18 extends xa3 {

    /* renamed from: b */
    public final Throwable f51288b;

    public w18(Throwable th) {
        super("HttpClientEngine already closed");
        this.f51288b = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f51288b;
    }

    public /* synthetic */ w18(Throwable th, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : th);
    }
}
