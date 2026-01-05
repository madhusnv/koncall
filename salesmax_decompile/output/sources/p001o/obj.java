package p001o;

import com.facebook.C10773c;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class obj {

    /* renamed from: g */
    public static final C15756a f38093g = new C15756a(null);

    /* renamed from: a */
    public final int f38094a;

    /* renamed from: b */
    public final Executor f38095b;

    /* renamed from: c */
    public final ReentrantLock f38096c;

    /* renamed from: d */
    public C15758c f38097d;

    /* renamed from: e */
    public C15758c f38098e;

    /* renamed from: f */
    public int f38099f;

    /* renamed from: o.obj$a */
    public static final class C15756a {
        public C15756a() {
        }

        public /* synthetic */ C15756a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final void m41943b(boolean z) {
            if (!z) {
                throw new ur6("Validation failed");
            }
        }
    }

    /* renamed from: o.obj$b */
    public interface InterfaceC15757b {
        /* renamed from: a */
        void mo41944a();

        boolean cancel();
    }

    /* renamed from: o.obj$c */
    public final class C15758c implements InterfaceC15757b {

        /* renamed from: a */
        public final Runnable f38100a;

        /* renamed from: b */
        public C15758c f38101b;

        /* renamed from: c */
        public C15758c f38102c;

        /* renamed from: d */
        public boolean f38103d;

        /* renamed from: e */
        public final /* synthetic */ obj f38104e;

        public C15758c(obj objVar, Runnable runnable) {
            sq8.m48649h(runnable, "callback");
            this.f38104e = objVar;
            this.f38100a = runnable;
        }

        @Override // p001o.obj.InterfaceC15757b
        /* renamed from: a */
        public void mo41944a() {
            ReentrantLock reentrantLock = this.f38104e.f38096c;
            obj objVar = this.f38104e;
            reentrantLock.lock();
            try {
                if (!m41947d()) {
                    objVar.f38097d = m41948e(objVar.f38097d);
                    objVar.f38097d = m41945b(objVar.f38097d, true);
                }
                y3i y3iVar = y3i.f54824a;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: b */
        public final C15758c m41945b(C15758c c15758c, boolean z) {
            C15756a c15756a = obj.f38093g;
            c15756a.m41943b(this.f38101b == null);
            c15756a.m41943b(this.f38102c == null);
            if (c15758c == null) {
                this.f38102c = this;
                this.f38101b = this;
                c15758c = this;
            } else {
                this.f38101b = c15758c;
                C15758c c15758c2 = c15758c.f38102c;
                this.f38102c = c15758c2;
                if (c15758c2 != null) {
                    c15758c2.f38101b = this;
                }
                C15758c c15758c3 = this.f38101b;
                if (c15758c3 != null) {
                    c15758c3.f38102c = c15758c2 != null ? c15758c2.f38101b : null;
                }
            }
            return z ? this : c15758c;
        }

        /* renamed from: c */
        public final Runnable m41946c() {
            return this.f38100a;
        }

        @Override // p001o.obj.InterfaceC15757b
        public boolean cancel() {
            ReentrantLock reentrantLock = this.f38104e.f38096c;
            obj objVar = this.f38104e;
            reentrantLock.lock();
            try {
                if (m41947d()) {
                    y3i y3iVar = y3i.f54824a;
                    reentrantLock.unlock();
                    return false;
                }
                objVar.f38097d = m41948e(objVar.f38097d);
                reentrantLock.unlock();
                return true;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* renamed from: d */
        public boolean m41947d() {
            return this.f38103d;
        }

        /* renamed from: e */
        public final C15758c m41948e(C15758c c15758c) {
            C15756a c15756a = obj.f38093g;
            c15756a.m41943b(this.f38101b != null);
            c15756a.m41943b(this.f38102c != null);
            if (c15758c == this && (c15758c = this.f38101b) == this) {
                c15758c = null;
            }
            C15758c c15758c2 = this.f38101b;
            if (c15758c2 != null) {
                c15758c2.f38102c = this.f38102c;
            }
            C15758c c15758c3 = this.f38102c;
            if (c15758c3 != null) {
                c15758c3.f38101b = c15758c2;
            }
            this.f38102c = null;
            this.f38101b = null;
            return c15758c;
        }

        /* renamed from: f */
        public void m41949f(boolean z) {
            this.f38103d = z;
        }
    }

    public obj(int i, Executor executor) {
        sq8.m48649h(executor, "executor");
        this.f38094a = i;
        this.f38095b = executor;
        this.f38096c = new ReentrantLock();
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC15757b m41936f(obj objVar, Runnable runnable, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return objVar.m41938e(runnable, z);
    }

    /* renamed from: h */
    public static final void m41937h(C15758c c15758c, obj objVar) {
        sq8.m48649h(c15758c, "$node");
        sq8.m48649h(objVar, "this$0");
        try {
            c15758c.m41946c().run();
        } finally {
            objVar.m41940i(c15758c);
        }
    }

    /* renamed from: e */
    public final InterfaceC15757b m41938e(Runnable runnable, boolean z) {
        sq8.m48649h(runnable, "callback");
        C15758c c15758c = new C15758c(this, runnable);
        ReentrantLock reentrantLock = this.f38096c;
        reentrantLock.lock();
        try {
            this.f38097d = c15758c.m41945b(this.f38097d, z);
            y3i y3iVar = y3i.f54824a;
            reentrantLock.unlock();
            m41941j();
            return c15758c;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: g */
    public final void m41939g(final C15758c c15758c) {
        this.f38095b.execute(new Runnable() { // from class: o.nbj
            @Override // java.lang.Runnable
            public final void run() {
                obj.m41937h(c15758c, this);
            }
        });
    }

    /* renamed from: i */
    public final void m41940i(C15758c c15758c) {
        C15758c c15758c2;
        this.f38096c.lock();
        if (c15758c != null) {
            this.f38098e = c15758c.m41948e(this.f38098e);
            this.f38099f--;
        }
        if (this.f38099f < this.f38094a) {
            c15758c2 = this.f38097d;
            if (c15758c2 != null) {
                this.f38097d = c15758c2.m41948e(c15758c2);
                this.f38098e = c15758c2.m41945b(this.f38098e, false);
                this.f38099f++;
                c15758c2.m41949f(true);
            }
        } else {
            c15758c2 = null;
        }
        this.f38096c.unlock();
        if (c15758c2 != null) {
            m41939g(c15758c2);
        }
    }

    /* renamed from: j */
    public final void m41941j() {
        m41940i(null);
    }

    public /* synthetic */ obj(int i, Executor executor, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? 8 : i, (i2 & 2) != 0 ? C10773c.m13028u() : executor);
    }
}
