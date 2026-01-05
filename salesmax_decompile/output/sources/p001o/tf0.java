package p001o;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class tf0 extends z74 {

    /* renamed from: H */
    public static final C17076c f46973H = new C17076c(null);

    /* renamed from: L */
    public static final int f46974L = 8;

    /* renamed from: M */
    public static final gi9 f46975M = si9.m48360a(C17074a.f46987a);

    /* renamed from: Q */
    public static final ThreadLocal f46976Q = new C17075b();

    /* renamed from: c */
    public final Choreographer f46977c;

    /* renamed from: d */
    public final Handler f46978d;

    /* renamed from: e */
    public final Object f46979e;

    /* renamed from: f */
    public final oo0 f46980f;

    /* renamed from: g */
    public List f46981g;

    /* renamed from: h */
    public List f46982h;

    /* renamed from: q */
    public boolean f46983q;

    /* renamed from: s */
    public boolean f46984s;

    /* renamed from: x */
    public final ChoreographerFrameCallbackC17077d f46985x;

    /* renamed from: y */
    public final plb f46986y;

    /* renamed from: o.tf0$a */
    public static final class C17074a extends kf9 implements uk7 {

        /* renamed from: a */
        public static final C17074a f46987a = new C17074a();

        /* renamed from: o.tf0$a$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f46988a;

            public a(n64 n64Var) {
                super(2, n64Var);
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new a(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                uq8.m51918f();
                if (this.f46988a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                return Choreographer.getInstance();
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        public C17074a() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q74 invoke() {
            id5 id5Var = null;
            Choreographer choreographer = uf0.m51504b() ? Choreographer.getInstance() : (Choreographer) pm1.m43865e(eu5.m25612c(), new a(null));
            sq8.m48648g(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler handlerM37994a = lw7.m37994a(Looper.getMainLooper());
            sq8.m48648g(handlerM37994a, "createAsync(Looper.getMainLooper())");
            tf0 tf0Var = new tf0(choreographer, handlerM37994a, id5Var);
            return tf0Var.plus(tf0Var.H0());
        }
    }

    /* renamed from: o.tf0$b */
    public static final class C17075b extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q74 initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            sq8.m48648g(choreographer, "getInstance()");
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread".toString());
            }
            Handler handlerM37994a = lw7.m37994a(looperMyLooper);
            sq8.m48648g(handlerM37994a, "createAsync(\n           …d\")\n                    )");
            tf0 tf0Var = new tf0(choreographer, handlerM37994a, null);
            return tf0Var.plus(tf0Var.H0());
        }
    }

    /* renamed from: o.tf0$c */
    public static final class C17076c {
        public C17076c() {
        }

        public /* synthetic */ C17076c(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final q74 m49800a() {
            if (uf0.m51504b()) {
                return m49801b();
            }
            q74 q74Var = (q74) tf0.f46976Q.get();
            if (q74Var != null) {
                return q74Var;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        /* renamed from: b */
        public final q74 m49801b() {
            return (q74) tf0.f46975M.getValue();
        }
    }

    /* renamed from: o.tf0$d */
    public static final class ChoreographerFrameCallbackC17077d implements Choreographer.FrameCallback, Runnable {
        public ChoreographerFrameCallbackC17077d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            tf0.this.f46978d.removeCallbacks(this);
            tf0.this.L0();
            tf0.this.K0(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            tf0.this.L0();
            Object obj = tf0.this.f46979e;
            tf0 tf0Var = tf0.this;
            synchronized (obj) {
                if (tf0Var.f46981g.isEmpty()) {
                    tf0Var.G0().removeFrameCallback(this);
                    tf0Var.f46984s = false;
                }
                y3i y3iVar = y3i.f54824a;
            }
        }
    }

    public /* synthetic */ tf0(Choreographer choreographer, Handler handler, id5 id5Var) {
        this(choreographer, handler);
    }

    public final Choreographer G0() {
        return this.f46977c;
    }

    public final plb H0() {
        return this.f46986y;
    }

    public final Runnable I0() {
        Runnable runnable;
        synchronized (this.f46979e) {
            runnable = (Runnable) this.f46980f.m42475O();
        }
        return runnable;
    }

    @Override // p001o.z74
    /* renamed from: K */
    public void mo22314K(q74 q74Var, Runnable runnable) {
        sq8.m48649h(q74Var, "context");
        sq8.m48649h(runnable, "block");
        synchronized (this.f46979e) {
            this.f46980f.m42481o(runnable);
            if (!this.f46983q) {
                this.f46983q = true;
                this.f46978d.post(this.f46985x);
                if (!this.f46984s) {
                    this.f46984s = true;
                    this.f46977c.postFrameCallback(this.f46985x);
                }
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    public final void K0(long j) {
        synchronized (this.f46979e) {
            if (this.f46984s) {
                this.f46984s = false;
                List list = this.f46981g;
                this.f46981g = this.f46982h;
                this.f46982h = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) list.get(i)).doFrame(j);
                }
                list.clear();
            }
        }
    }

    public final void L0() {
        boolean z;
        do {
            Runnable runnableI0 = I0();
            while (runnableI0 != null) {
                runnableI0.run();
                runnableI0 = I0();
            }
            synchronized (this.f46979e) {
                if (this.f46980f.isEmpty()) {
                    z = false;
                    this.f46983q = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    public final void O0(Choreographer.FrameCallback frameCallback) {
        sq8.m48649h(frameCallback, "callback");
        synchronized (this.f46979e) {
            this.f46981g.add(frameCallback);
            if (!this.f46984s) {
                this.f46984s = true;
                this.f46977c.postFrameCallback(this.f46985x);
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    public final void P0(Choreographer.FrameCallback frameCallback) {
        sq8.m48649h(frameCallback, "callback");
        synchronized (this.f46979e) {
            this.f46981g.remove(frameCallback);
        }
    }

    public tf0(Choreographer choreographer, Handler handler) {
        this.f46977c = choreographer;
        this.f46978d = handler;
        this.f46979e = new Object();
        this.f46980f = new oo0();
        this.f46981g = new ArrayList();
        this.f46982h = new ArrayList();
        this.f46985x = new ChoreographerFrameCallbackC17077d();
        this.f46986y = new vf0(choreographer, this);
    }
}
