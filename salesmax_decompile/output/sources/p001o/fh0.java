package p001o;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class fh0 {

    /* renamed from: g */
    public static final ThreadLocal f23310g = new ThreadLocal();

    /* renamed from: d */
    public AbstractC13429c f23314d;

    /* renamed from: a */
    public final ktf f23311a = new ktf();

    /* renamed from: b */
    public final ArrayList f23312b = new ArrayList();

    /* renamed from: c */
    public final C13427a f23313c = new C13427a();

    /* renamed from: e */
    public long f23315e = 0;

    /* renamed from: f */
    public boolean f23316f = false;

    /* renamed from: o.fh0$a */
    public class C13427a {
        public C13427a() {
        }

        /* renamed from: a */
        public void m26683a() {
            fh0.this.f23315e = SystemClock.uptimeMillis();
            fh0 fh0Var = fh0.this;
            fh0Var.m26679c(fh0Var.f23315e);
            if (fh0.this.f23312b.size() > 0) {
                fh0.this.m26680e().mo26685a();
            }
        }
    }

    /* renamed from: o.fh0$b */
    public interface InterfaceC13428b {
        /* renamed from: a */
        boolean mo26684a(long j);
    }

    /* renamed from: o.fh0$c */
    public static abstract class AbstractC13429c {

        /* renamed from: a */
        public final C13427a f23318a;

        public AbstractC13429c(C13427a c13427a) {
            this.f23318a = c13427a;
        }

        /* renamed from: a */
        public abstract void mo26685a();
    }

    /* renamed from: o.fh0$d */
    public static class C13430d extends AbstractC13429c {

        /* renamed from: b */
        public final Choreographer f23319b;

        /* renamed from: c */
        public final Choreographer.FrameCallback f23320c;

        /* renamed from: o.fh0$d$a */
        public class a implements Choreographer.FrameCallback {
            public a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                C13430d.this.f23318a.m26683a();
            }
        }

        public C13430d(C13427a c13427a) {
            super(c13427a);
            this.f23319b = Choreographer.getInstance();
            this.f23320c = new a();
        }

        @Override // p001o.fh0.AbstractC13429c
        /* renamed from: a */
        public void mo26685a() {
            this.f23319b.postFrameCallback(this.f23320c);
        }
    }

    /* renamed from: d */
    public static fh0 m26676d() {
        ThreadLocal threadLocal = f23310g;
        if (threadLocal.get() == null) {
            threadLocal.set(new fh0());
        }
        return (fh0) threadLocal.get();
    }

    /* renamed from: a */
    public void m26677a(InterfaceC13428b interfaceC13428b, long j) {
        if (this.f23312b.size() == 0) {
            m26680e().mo26685a();
        }
        if (!this.f23312b.contains(interfaceC13428b)) {
            this.f23312b.add(interfaceC13428b);
        }
        if (j > 0) {
            this.f23311a.put(interfaceC13428b, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* renamed from: b */
    public final void m26678b() {
        if (this.f23316f) {
            for (int size = this.f23312b.size() - 1; size >= 0; size--) {
                if (this.f23312b.get(size) == null) {
                    this.f23312b.remove(size);
                }
            }
            this.f23316f = false;
        }
    }

    /* renamed from: c */
    public void m26679c(long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f23312b.size(); i++) {
            InterfaceC13428b interfaceC13428b = (InterfaceC13428b) this.f23312b.get(i);
            if (interfaceC13428b != null && m26681f(interfaceC13428b, jUptimeMillis)) {
                interfaceC13428b.mo26684a(j);
            }
        }
        m26678b();
    }

    /* renamed from: e */
    public AbstractC13429c m26680e() {
        if (this.f23314d == null) {
            this.f23314d = new C13430d(this.f23313c);
        }
        return this.f23314d;
    }

    /* renamed from: f */
    public final boolean m26681f(InterfaceC13428b interfaceC13428b, long j) {
        Long l = (Long) this.f23311a.get(interfaceC13428b);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f23311a.remove(interfaceC13428b);
        return true;
    }

    /* renamed from: g */
    public void m26682g(InterfaceC13428b interfaceC13428b) {
        this.f23311a.remove(interfaceC13428b);
        int iIndexOf = this.f23312b.indexOf(interfaceC13428b);
        if (iIndexOf >= 0) {
            this.f23312b.set(iIndexOf, null);
            this.f23316f = true;
        }
    }
}
