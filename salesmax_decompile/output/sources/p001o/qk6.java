package p001o;

/* loaded from: classes5.dex */
public final class qk6 implements ls6 {

    /* renamed from: o.qk6$a */
    public static final class C16418a {

        /* renamed from: a */
        public static final qk6 f42093a = new qk6();
    }

    /* renamed from: a */
    public static qk6 m45578a() {
        return C16418a.f42093a;
    }

    /* renamed from: b */
    public static String m45579b() {
        return (String) cgd.m21197c(pk6.m43799a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m45579b();
    }
}
