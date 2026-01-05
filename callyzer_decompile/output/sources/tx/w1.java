package tx;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class w1 {

    /* renamed from: a */
    public static final ThreadLocal f34694a = new ThreadLocal();

    /* renamed from: a */
    public static w0 m13577a() {
        ThreadLocal threadLocal = f34694a;
        w0 w0Var = (w0) threadLocal.get();
        if (w0Var != null) {
            return w0Var;
        }
        C7247g c7247g = new C7247g(Thread.currentThread());
        threadLocal.set(c7247g);
        return c7247g;
    }
}
