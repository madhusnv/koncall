package p001o;

/* loaded from: classes6.dex */
public abstract class pce extends Exception {

    /* renamed from: a */
    public static final boolean f39813a;

    /* renamed from: b */
    public static final StackTraceElement[] f39814b;

    static {
        f39813a = System.getProperty("surefire.test.class.path") != null;
        f39814b = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
