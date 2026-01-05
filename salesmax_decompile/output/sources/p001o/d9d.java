package p001o;

/* loaded from: classes3.dex */
public abstract class d9d {
    /* renamed from: a */
    public static void m22625a(Throwable th) {
        dgd.m23062o(th);
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
