package yg;

import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yg.m */
/* loaded from: classes.dex */
public final class C8656m {

    /* renamed from: a */
    public final Object f41949a = new Object();

    /* renamed from: b */
    public final j4 f41950b = new j4((byte) 0, 8);

    /* renamed from: c */
    public boolean f41951c;

    /* renamed from: d */
    public volatile boolean f41952d;

    /* renamed from: e */
    public Object f41953e;

    /* renamed from: f */
    public Exception f41954f;

    /* renamed from: a */
    public final void m15974a(Executor executor, InterfaceC8645b interfaceC8645b) {
        this.f41950b.m3399s(new C8654k(executor, interfaceC8645b));
        m15992s();
    }

    /* renamed from: b */
    public final void m15975b(Executor executor, InterfaceC8646c interfaceC8646c) {
        this.f41950b.m3399s(new C8654k(executor, interfaceC8646c));
        m15992s();
    }

    /* renamed from: c */
    public final void m15976c(InterfaceC8646c interfaceC8646c) {
        this.f41950b.m3399s(new C8654k(AbstractC8651h.f41931a, interfaceC8646c));
        m15992s();
    }

    /* renamed from: d */
    public final void m15977d(Executor executor, InterfaceC8647d interfaceC8647d) {
        this.f41950b.m3399s(new C8654k(executor, interfaceC8647d));
        m15992s();
    }

    /* renamed from: e */
    public final void m15978e(InterfaceC8647d interfaceC8647d) {
        m15977d(AbstractC8651h.f41931a, interfaceC8647d);
    }

    /* renamed from: f */
    public final void m15979f(Executor executor, InterfaceC8648e interfaceC8648e) {
        this.f41950b.m3399s(new C8654k(executor, interfaceC8648e));
        m15992s();
    }

    /* renamed from: g */
    public final C8656m m15980g(Executor executor, InterfaceC8644a interfaceC8644a) {
        C8656m c8656m = new C8656m();
        this.f41950b.m3399s(new C8653j(executor, interfaceC8644a, c8656m, 0));
        m15992s();
        return c8656m;
    }

    /* renamed from: h */
    public final C8656m m15981h(Executor executor, InterfaceC8644a interfaceC8644a) {
        C8656m c8656m = new C8656m();
        this.f41950b.m3399s(new C8653j(executor, interfaceC8644a, c8656m, 1));
        m15992s();
        return c8656m;
    }

    /* renamed from: i */
    public final Exception m15982i() {
        Exception exc;
        synchronized (this.f41949a) {
            exc = this.f41954f;
        }
        return exc;
    }

    /* renamed from: j */
    public final Object m15983j() {
        Object obj;
        synchronized (this.f41949a) {
            try {
                AbstractC6840z.m13038i("Task is not yet complete", this.f41951c);
                if (this.f41952d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f41954f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.f41953e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    /* renamed from: k */
    public final boolean m15984k() {
        boolean z6;
        synchronized (this.f41949a) {
            z6 = this.f41951c;
        }
        return z6;
    }

    /* renamed from: l */
    public final boolean m15985l() {
        boolean z6;
        synchronized (this.f41949a) {
            try {
                z6 = false;
                if (this.f41951c && !this.f41952d && this.f41954f == null) {
                    z6 = true;
                }
            } finally {
            }
        }
        return z6;
    }

    /* renamed from: m */
    public final C8656m m15986m(Executor executor, InterfaceC8649f interfaceC8649f) {
        C8656m c8656m = new C8656m();
        this.f41950b.m3399s(new C8654k(executor, interfaceC8649f, c8656m));
        m15992s();
        return c8656m;
    }

    /* renamed from: n */
    public final void m15987n(Exception exc) {
        AbstractC6840z.m13037h(exc, "Exception must not be null");
        synchronized (this.f41949a) {
            m15991r();
            this.f41951c = true;
            this.f41954f = exc;
        }
        this.f41950b.m3401u(this);
    }

    /* renamed from: o */
    public final void m15988o(Object obj) {
        synchronized (this.f41949a) {
            m15991r();
            this.f41951c = true;
            this.f41953e = obj;
        }
        this.f41950b.m3401u(this);
    }

    /* renamed from: p */
    public final void m15989p() {
        synchronized (this.f41949a) {
            try {
                if (this.f41951c) {
                    return;
                }
                this.f41951c = true;
                this.f41952d = true;
                this.f41950b.m3401u(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: q */
    public final boolean m15990q(Object obj) {
        synchronized (this.f41949a) {
            try {
                if (this.f41951c) {
                    return false;
                }
                this.f41951c = true;
                this.f41953e = obj;
                this.f41950b.m3401u(this);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    public final void m15991r() {
        if (this.f41951c) {
            int i10 = DuplicateTaskCompletionException.f6716a;
            if (!m15984k()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excM15982i = m15982i();
        }
    }

    /* renamed from: s */
    public final void m15992s() {
        synchronized (this.f41949a) {
            try {
                if (this.f41951c) {
                    this.f41950b.m3401u(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
