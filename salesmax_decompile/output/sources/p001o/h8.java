package p001o;

import java.io.Serializable;

/* loaded from: classes6.dex */
public abstract class h8 implements vja, Serializable {
    @Override // p001o.vja
    /* renamed from: a */
    public void mo20728a(String str, Object obj, Object obj2) {
        if (isWarnEnabled()) {
            m29956p(wba.WARN, null, str, obj, obj2);
        }
    }

    @Override // p001o.vja
    /* renamed from: b */
    public void mo20729b(String str, Throwable th) {
        if (isDebugEnabled()) {
            m29959s(wba.DEBUG, null, str, th);
        }
    }

    @Override // p001o.vja
    /* renamed from: d */
    public void mo20731d(String str, Object... objArr) {
        if (isWarnEnabled()) {
            m29957q(wba.WARN, null, str, objArr);
        }
    }

    @Override // p001o.vja
    public void debug(String str) {
        if (isDebugEnabled()) {
            m29959s(wba.DEBUG, null, str, null);
        }
    }

    @Override // p001o.vja
    /* renamed from: e */
    public void mo20732e(String str, Object... objArr) {
        if (isErrorEnabled()) {
            m29957q(wba.ERROR, null, str, objArr);
        }
    }

    @Override // p001o.vja
    public void error(String str) {
        if (isErrorEnabled()) {
            m29959s(wba.ERROR, null, str, null);
        }
    }

    @Override // p001o.vja
    /* renamed from: g */
    public void mo20734g(String str, Object... objArr) {
        if (isDebugEnabled()) {
            m29957q(wba.DEBUG, null, str, objArr);
        }
    }

    @Override // p001o.vja
    public abstract String getName();

    @Override // p001o.vja
    /* renamed from: h */
    public void mo20735h(String str, Throwable th) {
        if (isInfoEnabled()) {
            m29959s(wba.INFO, null, str, th);
        }
    }

    @Override // p001o.vja
    /* renamed from: i */
    public void mo20736i(String str, Throwable th) {
        if (isTraceEnabled()) {
            m29959s(wba.TRACE, null, str, th);
        }
    }

    @Override // p001o.vja
    public void info(String str) {
        if (isInfoEnabled()) {
            m29959s(wba.INFO, null, str, null);
        }
    }

    @Override // p001o.vja
    /* renamed from: j */
    public void mo20737j(String str, Object... objArr) {
        if (isTraceEnabled()) {
            m29957q(wba.TRACE, null, str, objArr);
        }
    }

    @Override // p001o.vja
    /* renamed from: k */
    public void mo20738k(String str, Object obj) {
        if (isWarnEnabled()) {
            m29960t(wba.WARN, null, str, obj);
        }
    }

    @Override // p001o.vja
    /* renamed from: l */
    public void mo20739l(String str) {
        if (isTraceEnabled()) {
            m29959s(wba.TRACE, null, str, null);
        }
    }

    @Override // p001o.vja
    /* renamed from: o */
    public void mo20742o(String str, Object... objArr) {
        if (isInfoEnabled()) {
            m29957q(wba.INFO, null, str, objArr);
        }
    }

    /* renamed from: p */
    public final void m29956p(wba wbaVar, osa osaVar, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            mo29958r(wbaVar, osaVar, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            mo29958r(wbaVar, osaVar, str, new Object[]{obj, obj2}, null);
        }
    }

    /* renamed from: q */
    public final void m29957q(wba wbaVar, osa osaVar, String str, Object[] objArr) {
        Throwable thM36945a = lcb.m36945a(objArr);
        if (thM36945a != null) {
            mo29958r(wbaVar, osaVar, str, lcb.m36946b(objArr), thM36945a);
        } else {
            mo29958r(wbaVar, osaVar, str, objArr, null);
        }
    }

    /* renamed from: r */
    public abstract void mo29958r(wba wbaVar, osa osaVar, String str, Object[] objArr, Throwable th);

    public Object readResolve() {
        return yja.m57897l(getName());
    }

    /* renamed from: s */
    public final void m29959s(wba wbaVar, osa osaVar, String str, Throwable th) {
        mo29958r(wbaVar, osaVar, str, null, th);
    }

    /* renamed from: t */
    public final void m29960t(wba wbaVar, osa osaVar, String str, Object obj) {
        mo29958r(wbaVar, osaVar, str, new Object[]{obj}, null);
    }

    @Override // p001o.vja
    public void warn(String str) {
        if (isWarnEnabled()) {
            m29959s(wba.WARN, null, str, null);
        }
    }

    @Override // p001o.vja
    public void error(String str, Throwable th) {
        if (isErrorEnabled()) {
            m29959s(wba.ERROR, null, str, th);
        }
    }

    @Override // p001o.vja
    public void warn(String str, Throwable th) {
        if (isWarnEnabled()) {
            m29959s(wba.WARN, null, str, th);
        }
    }
}
