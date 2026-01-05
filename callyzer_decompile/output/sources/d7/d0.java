package d7;

import android.os.Looper;
import java.util.Map;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p014p.C5785a;
import p015q.C6056c;
import p015q.C6057d;
import p015q.C6059f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: k */
    public static final Object f8082k = new Object();

    /* renamed from: a */
    public final Object f8083a;

    /* renamed from: b */
    public final C6059f f8084b;

    /* renamed from: c */
    public int f8085c;

    /* renamed from: d */
    public boolean f8086d;

    /* renamed from: e */
    public volatile Object f8087e;

    /* renamed from: f */
    public volatile Object f8088f;

    /* renamed from: g */
    public int f8089g;

    /* renamed from: h */
    public boolean f8090h;

    /* renamed from: i */
    public boolean f8091i;

    /* renamed from: j */
    public final RunnableC1654z f8092j;

    public d0(Object obj) {
        this.f8083a = new Object();
        this.f8084b = new C6059f();
        this.f8085c = 0;
        this.f8088f = f8082k;
        this.f8092j = new RunnableC1654z(this);
        this.f8087e = obj;
        this.f8089g = 0;
    }

    /* renamed from: a */
    public static void m5311a(String str) {
        C5785a.m11334g().f28364a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC5601a.m11238i("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: b */
    public final void m5312b(c0 c0Var) {
        if (c0Var.f8076b) {
            if (!c0Var.mo5302d()) {
                c0Var.m5308a(false);
                return;
            }
            int i10 = c0Var.f8077c;
            int i11 = this.f8089g;
            if (i10 >= i11) {
                return;
            }
            c0Var.f8077c = i11;
            c0Var.f8075a.onChanged(this.f8087e);
        }
    }

    /* renamed from: c */
    public final void m5313c(c0 c0Var) {
        if (this.f8090h) {
            this.f8091i = true;
            return;
        }
        this.f8090h = true;
        do {
            this.f8091i = false;
            if (c0Var != null) {
                m5312b(c0Var);
                c0Var = null;
            } else {
                C6059f c6059f = this.f8084b;
                c6059f.getClass();
                C6057d c6057d = new C6057d(c6059f);
                c6059f.f29558c.put(c6057d, Boolean.FALSE);
                while (c6057d.hasNext()) {
                    m5312b((c0) ((Map.Entry) c6057d.next()).getValue());
                    if (this.f8091i) {
                        break;
                    }
                }
            }
        } while (this.f8091i);
        this.f8090h = false;
    }

    /* renamed from: d */
    public Object mo5314d() {
        Object obj = this.f8087e;
        if (obj != f8082k) {
            return obj;
        }
        return null;
    }

    /* renamed from: e */
    public final void m5315e(InterfaceC1649u interfaceC1649u, h0 h0Var) {
        Object obj;
        m5311a("observe");
        if (interfaceC1649u.getLifecycle().mo5344b() == EnumC1645q.DESTROYED) {
            return;
        }
        b0 b0Var = new b0(this, interfaceC1649u, h0Var);
        C6059f c6059f = this.f8084b;
        C6056c c6056cMo12061a = c6059f.mo12061a(h0Var);
        if (c6056cMo12061a != null) {
            obj = c6056cMo12061a.f29550b;
        } else {
            C6056c c6056c = new C6056c(h0Var, b0Var);
            c6059f.f29559d++;
            C6056c c6056c2 = c6059f.f29557b;
            if (c6056c2 == null) {
                c6059f.f29556a = c6056c;
                c6059f.f29557b = c6056c;
            } else {
                c6056c2.f29551c = c6056c;
                c6056c.f29552d = c6056c2;
                c6059f.f29557b = c6056c;
            }
            obj = null;
        }
        c0 c0Var = (c0) obj;
        if (c0Var != null && !c0Var.mo5306c(interfaceC1649u)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c0Var != null) {
            return;
        }
        interfaceC1649u.getLifecycle().mo5343a(b0Var);
    }

    /* renamed from: f */
    public final void m5316f(h0 h0Var) {
        Object obj;
        m5311a("observeForever");
        a0 a0Var = new a0(this, h0Var);
        C6059f c6059f = this.f8084b;
        C6056c c6056cMo12061a = c6059f.mo12061a(h0Var);
        if (c6056cMo12061a != null) {
            obj = c6056cMo12061a.f29550b;
        } else {
            C6056c c6056c = new C6056c(h0Var, a0Var);
            c6059f.f29559d++;
            C6056c c6056c2 = c6059f.f29557b;
            if (c6056c2 == null) {
                c6059f.f29556a = c6056c;
                c6059f.f29557b = c6056c;
            } else {
                c6056c2.f29551c = c6056c;
                c6056c.f29552d = c6056c2;
                c6059f.f29557b = c6056c;
            }
            obj = null;
        }
        c0 c0Var = (c0) obj;
        if (c0Var instanceof b0) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (c0Var != null) {
            return;
        }
        a0Var.m5308a(true);
    }

    /* renamed from: i */
    public void m5319i(Object obj) {
        boolean z6;
        synchronized (this.f8083a) {
            z6 = this.f8088f == f8082k;
            this.f8088f = obj;
        }
        if (z6) {
            C5785a.m11334g().m11335h(this.f8092j);
        }
    }

    /* renamed from: j */
    public void mo5320j(h0 h0Var) {
        m5311a("removeObserver");
        c0 c0Var = (c0) this.f8084b.mo12062b(h0Var);
        if (c0Var == null) {
            return;
        }
        c0Var.mo5305b();
        c0Var.m5308a(false);
    }

    /* renamed from: k */
    public void m5321k(Object obj) {
        m5311a("setValue");
        this.f8089g++;
        this.f8087e = obj;
        m5313c(null);
    }

    public d0() {
        this.f8083a = new Object();
        this.f8084b = new C6059f();
        this.f8085c = 0;
        Object obj = f8082k;
        this.f8088f = obj;
        this.f8092j = new RunnableC1654z(this);
        this.f8087e = obj;
        this.f8089g = -1;
    }

    /* renamed from: g */
    public void mo5317g() {
    }

    /* renamed from: h */
    public void mo5318h() {
    }
}
