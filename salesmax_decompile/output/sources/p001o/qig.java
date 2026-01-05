package p001o;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class qig {

    /* renamed from: a */
    public static final int f42043a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m45521a() {
        return f42043a;
    }

    /* renamed from: b */
    public static final String m45522b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
