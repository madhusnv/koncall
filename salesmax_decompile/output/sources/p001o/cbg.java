package p001o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* loaded from: classes6.dex */
public class cbg implements vja {

    /* renamed from: a */
    public final String f17759a;

    /* renamed from: b */
    public volatile vja f17760b;

    /* renamed from: c */
    public Boolean f17761c;

    /* renamed from: d */
    public Method f17762d;

    /* renamed from: e */
    public lk6 f17763e;

    /* renamed from: f */
    public final Queue f17764f;

    /* renamed from: g */
    public final boolean f17765g;

    public cbg(String str, Queue queue, boolean z) {
        this.f17759a = str;
        this.f17764f = queue;
        this.f17765g = z;
    }

    @Override // p001o.vja
    /* renamed from: a */
    public void mo20728a(String str, Object obj, Object obj2) {
        m20741n().mo20728a(str, obj, obj2);
    }

    @Override // p001o.vja
    /* renamed from: b */
    public void mo20729b(String str, Throwable th) {
        m20741n().mo20729b(str, th);
    }

    @Override // p001o.vja
    /* renamed from: c */
    public eka mo20730c(wba wbaVar) {
        return m20741n().mo20730c(wbaVar);
    }

    @Override // p001o.vja
    /* renamed from: d */
    public void mo20731d(String str, Object... objArr) {
        m20741n().mo20731d(str, objArr);
    }

    @Override // p001o.vja
    public void debug(String str) {
        m20741n().debug(str);
    }

    @Override // p001o.vja
    /* renamed from: e */
    public void mo20732e(String str, Object... objArr) {
        m20741n().mo20732e(str, objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f17759a.equals(((cbg) obj).f17759a);
    }

    @Override // p001o.vja
    public void error(String str) {
        m20741n().error(str);
    }

    @Override // p001o.vja
    /* renamed from: f */
    public boolean mo20733f(wba wbaVar) {
        return m20741n().mo20733f(wbaVar);
    }

    @Override // p001o.vja
    /* renamed from: g */
    public void mo20734g(String str, Object... objArr) {
        m20741n().mo20734g(str, objArr);
    }

    @Override // p001o.vja
    public String getName() {
        return this.f17759a;
    }

    @Override // p001o.vja
    /* renamed from: h */
    public void mo20735h(String str, Throwable th) {
        m20741n().mo20735h(str, th);
    }

    public int hashCode() {
        return this.f17759a.hashCode();
    }

    @Override // p001o.vja
    /* renamed from: i */
    public void mo20736i(String str, Throwable th) {
        m20741n().mo20736i(str, th);
    }

    @Override // p001o.vja
    public void info(String str) {
        m20741n().info(str);
    }

    @Override // p001o.vja
    public boolean isDebugEnabled() {
        return m20741n().isDebugEnabled();
    }

    @Override // p001o.vja
    public boolean isErrorEnabled() {
        return m20741n().isErrorEnabled();
    }

    @Override // p001o.vja
    public boolean isInfoEnabled() {
        return m20741n().isInfoEnabled();
    }

    @Override // p001o.vja
    public boolean isTraceEnabled() {
        return m20741n().isTraceEnabled();
    }

    @Override // p001o.vja
    public boolean isWarnEnabled() {
        return m20741n().isWarnEnabled();
    }

    @Override // p001o.vja
    /* renamed from: j */
    public void mo20737j(String str, Object... objArr) {
        m20741n().mo20737j(str, objArr);
    }

    @Override // p001o.vja
    /* renamed from: k */
    public void mo20738k(String str, Object obj) {
        m20741n().mo20738k(str, obj);
    }

    @Override // p001o.vja
    /* renamed from: l */
    public void mo20739l(String str) {
        m20741n().mo20739l(str);
    }

    @Override // p001o.vja
    /* renamed from: m */
    public eka mo20740m(wba wbaVar) {
        return m20741n().mo20740m(wbaVar);
    }

    /* renamed from: n */
    public vja m20741n() {
        return this.f17760b != null ? this.f17760b : this.f17765g ? crb.f18527a : m20743p();
    }

    @Override // p001o.vja
    /* renamed from: o */
    public void mo20742o(String str, Object... objArr) {
        m20741n().mo20742o(str, objArr);
    }

    /* renamed from: p */
    public final vja m20743p() {
        if (this.f17763e == null) {
            this.f17763e = new lk6(this, this.f17764f);
        }
        return this.f17763e;
    }

    /* renamed from: q */
    public boolean m20744q() {
        Boolean bool = this.f17761c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f17762d = this.f17760b.getClass().getMethod("log", dka.class);
            this.f17761c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f17761c = Boolean.FALSE;
        }
        return this.f17761c.booleanValue();
    }

    /* renamed from: r */
    public boolean m20745r() {
        return this.f17760b instanceof crb;
    }

    /* renamed from: s */
    public boolean m20746s() {
        return this.f17760b == null;
    }

    /* renamed from: t */
    public void m20747t(dka dkaVar) {
        if (m20744q()) {
            try {
                this.f17762d.invoke(this.f17760b, dkaVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: u */
    public void m20748u(vja vjaVar) {
        this.f17760b = vjaVar;
    }

    @Override // p001o.vja
    public void warn(String str) {
        m20741n().warn(str);
    }

    @Override // p001o.vja
    public void error(String str, Throwable th) {
        m20741n().error(str, th);
    }

    @Override // p001o.vja
    public void warn(String str, Throwable th) {
        m20741n().warn(str, th);
    }
}
