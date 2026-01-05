package p001o;

/* loaded from: classes6.dex */
public abstract class l16 {

    /* renamed from: a */
    public static final boolean f32984a = false;

    /* renamed from: b */
    public static final ThreadLocal[] f32985b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal();
        }
        f32985b = threadLocalArr;
    }

    /* renamed from: a */
    public static final boolean m36444a() {
        return f32984a;
    }
}
