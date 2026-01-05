package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class ns0 extends AtomicReference {
    /* renamed from: a */
    public Throwable m41015a() {
        return xk6.m56417e(this);
    }

    /* renamed from: b */
    public boolean m41016b(Throwable th) {
        return xk6.m56413a(this, th);
    }

    /* renamed from: c */
    public boolean m41017c(Throwable th) {
        if (m41016b(th)) {
            return true;
        }
        fwe.m27599r(th);
        return false;
    }

    /* renamed from: d */
    public void m41018d() {
        Throwable thM41015a = m41015a();
        if (thM41015a == null || thM41015a == xk6.f53863a) {
            return;
        }
        fwe.m27599r(thM41015a);
    }

    /* renamed from: e */
    public void m41019e(ml3 ml3Var) {
        Throwable thM41015a = m41015a();
        if (thM41015a == null) {
            ml3Var.onComplete();
        } else if (thM41015a != xk6.f53863a) {
            ml3Var.onError(thM41015a);
        }
    }

    /* renamed from: f */
    public void m41020f(m9c m9cVar) {
        Throwable thM41015a = m41015a();
        if (thM41015a == null) {
            m9cVar.onComplete();
        } else if (thM41015a != xk6.f53863a) {
            m9cVar.onError(thM41015a);
        }
    }

    /* renamed from: g */
    public void m41021g(qag qagVar) {
        Throwable thM41015a = m41015a();
        if (thM41015a == null) {
            qagVar.onComplete();
        } else if (thM41015a != xk6.f53863a) {
            qagVar.onError(thM41015a);
        }
    }
}
