package p001o;

/* loaded from: classes6.dex */
public interface vja {
    /* renamed from: a */
    void mo20728a(String str, Object obj, Object obj2);

    /* renamed from: b */
    void mo20729b(String str, Throwable th);

    /* renamed from: c */
    default eka mo20730c(wba wbaVar) {
        return new xe5(this, wbaVar);
    }

    /* renamed from: d */
    void mo20731d(String str, Object... objArr);

    void debug(String str);

    /* renamed from: e */
    void mo20732e(String str, Object... objArr);

    void error(String str);

    void error(String str, Throwable th);

    /* renamed from: f */
    default boolean mo20733f(wba wbaVar) {
        int i = wbaVar.toInt();
        if (i == 0) {
            return isTraceEnabled();
        }
        if (i == 10) {
            return isDebugEnabled();
        }
        if (i == 20) {
            return isInfoEnabled();
        }
        if (i == 30) {
            return isWarnEnabled();
        }
        if (i == 40) {
            return isErrorEnabled();
        }
        throw new IllegalArgumentException("Level [" + wbaVar + "] not recognized.");
    }

    /* renamed from: g */
    void mo20734g(String str, Object... objArr);

    String getName();

    /* renamed from: h */
    void mo20735h(String str, Throwable th);

    /* renamed from: i */
    void mo20736i(String str, Throwable th);

    void info(String str);

    boolean isDebugEnabled();

    boolean isErrorEnabled();

    boolean isInfoEnabled();

    boolean isTraceEnabled();

    boolean isWarnEnabled();

    /* renamed from: j */
    void mo20737j(String str, Object... objArr);

    /* renamed from: k */
    void mo20738k(String str, Object obj);

    /* renamed from: l */
    void mo20739l(String str);

    /* renamed from: m */
    default eka mo20740m(wba wbaVar) {
        return mo20733f(wbaVar) ? mo20730c(wbaVar) : erb.m25520e();
    }

    /* renamed from: o */
    void mo20742o(String str, Object... objArr);

    void warn(String str);

    void warn(String str, Throwable th);
}
