package p001o;

import android.util.Log;
import android.util.Size;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import p001o.g32;

/* loaded from: classes2.dex */
public abstract class yj5 {

    /* renamed from: k */
    public static final Size f55577k = new Size(0, 0);

    /* renamed from: l */
    public static final boolean f55578l = wja.m54632f("DeferrableSurface");

    /* renamed from: m */
    public static final AtomicInteger f55579m = new AtomicInteger(0);

    /* renamed from: n */
    public static final AtomicInteger f55580n = new AtomicInteger(0);

    /* renamed from: a */
    public final Object f55581a;

    /* renamed from: b */
    public int f55582b;

    /* renamed from: c */
    public boolean f55583c;

    /* renamed from: d */
    public g32.C13614a f55584d;

    /* renamed from: e */
    public final zfa f55585e;

    /* renamed from: f */
    public g32.C13614a f55586f;

    /* renamed from: g */
    public final zfa f55587g;

    /* renamed from: h */
    public final Size f55588h;

    /* renamed from: i */
    public final int f55589i;

    /* renamed from: j */
    public Class f55590j;

    /* renamed from: o.yj5$a */
    public static final class C18418a extends Exception {

        /* renamed from: a */
        public yj5 f55591a;

        public C18418a(String str, yj5 yj5Var) {
            super(str);
            this.f55591a = yj5Var;
        }

        /* renamed from: a */
        public yj5 m57878a() {
            return this.f55591a;
        }
    }

    /* renamed from: o.yj5$b */
    public static final class C18419b extends Exception {
        public C18419b(String str) {
            super(str);
        }
    }

    public yj5() {
        this(f55577k, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m57864n(g32.C13614a c13614a) {
        synchronized (this.f55581a) {
            this.f55584d = c13614a;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m57865o(g32.C13614a c13614a) {
        synchronized (this.f55581a) {
            this.f55586f = c13614a;
        }
        return "DeferrableSurface-close(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m57866p(String str) throws ExecutionException, InterruptedException {
        try {
            this.f55585e.get();
            m57876q("Surface terminated", f55580n.decrementAndGet(), f55579m.get());
        } catch (Exception e) {
            wja.m54629c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f55581a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.f55583c), Integer.valueOf(this.f55582b)), e);
            }
        }
    }

    /* renamed from: d */
    public void mo30396d() {
        g32.C13614a c13614a;
        synchronized (this.f55581a) {
            if (this.f55583c) {
                c13614a = null;
            } else {
                this.f55583c = true;
                this.f55586f.m28005c(null);
                if (this.f55582b == 0) {
                    c13614a = this.f55584d;
                    this.f55584d = null;
                } else {
                    c13614a = null;
                }
                if (wja.m54632f("DeferrableSurface")) {
                    wja.m54627a("DeferrableSurface", "surface closed,  useCount=" + this.f55582b + " closed=true " + this);
                }
            }
        }
        if (c13614a != null) {
            c13614a.m28005c(null);
        }
    }

    /* renamed from: e */
    public void m57867e() {
        g32.C13614a c13614a;
        synchronized (this.f55581a) {
            int i = this.f55582b;
            if (i == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            int i2 = i - 1;
            this.f55582b = i2;
            if (i2 == 0 && this.f55583c) {
                c13614a = this.f55584d;
                this.f55584d = null;
            } else {
                c13614a = null;
            }
            if (wja.m54632f("DeferrableSurface")) {
                wja.m54627a("DeferrableSurface", "use count-1,  useCount=" + this.f55582b + " closed=" + this.f55583c + " " + this);
                if (this.f55582b == 0) {
                    m57876q("Surface no longer in use", f55580n.get(), f55579m.decrementAndGet());
                }
            }
        }
        if (c13614a != null) {
            c13614a.m28005c(null);
        }
    }

    /* renamed from: f */
    public zfa m57868f() {
        return bn7.m19407B(this.f55587g);
    }

    /* renamed from: g */
    public Class m57869g() {
        return this.f55590j;
    }

    /* renamed from: h */
    public Size m57870h() {
        return this.f55588h;
    }

    /* renamed from: i */
    public int m57871i() {
        return this.f55589i;
    }

    /* renamed from: j */
    public final zfa m57872j() {
        synchronized (this.f55581a) {
            if (this.f55583c) {
                return bn7.m19428n(new C18418a("DeferrableSurface already closed.", this));
            }
            return mo18935r();
        }
    }

    /* renamed from: k */
    public zfa m57873k() {
        return bn7.m19407B(this.f55585e);
    }

    /* renamed from: l */
    public void m57874l() {
        synchronized (this.f55581a) {
            int i = this.f55582b;
            if (i == 0 && this.f55583c) {
                throw new C18418a("Cannot begin use on a closed surface.", this);
            }
            this.f55582b = i + 1;
            if (wja.m54632f("DeferrableSurface")) {
                if (this.f55582b == 1) {
                    m57876q("New surface in use", f55580n.get(), f55579m.incrementAndGet());
                }
                wja.m54627a("DeferrableSurface", "use count+1, useCount=" + this.f55582b + " " + this);
            }
        }
    }

    /* renamed from: m */
    public boolean m57875m() {
        boolean z;
        synchronized (this.f55581a) {
            z = this.f55583c;
        }
        return z;
    }

    /* renamed from: q */
    public final void m57876q(String str, int i, int i2) {
        if (!f55578l && wja.m54632f("DeferrableSurface")) {
            wja.m54627a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        wja.m54627a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    /* renamed from: r */
    public abstract zfa mo18935r();

    /* renamed from: s */
    public void m57877s(Class cls) {
        this.f55590j = cls;
    }

    public yj5(Size size, int i) {
        this.f55581a = new Object();
        this.f55582b = 0;
        this.f55583c = false;
        this.f55588h = size;
        this.f55589i = i;
        zfa zfaVarM28002a = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.vj5
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f50435a.m57864n(c13614a);
            }
        });
        this.f55585e = zfaVarM28002a;
        this.f55587g = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.wj5
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return this.f52225a.m57865o(c13614a);
            }
        });
        if (wja.m54632f("DeferrableSurface")) {
            m57876q("Surface created", f55580n.incrementAndGet(), f55579m.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            zfaVarM28002a.addListener(new Runnable() { // from class: o.xj5
                @Override // java.lang.Runnable
                public final void run() throws ExecutionException, InterruptedException {
                    this.f53846a.m57866p(stackTraceString);
                }
            }, gb2.m28293a());
        }
    }
}
