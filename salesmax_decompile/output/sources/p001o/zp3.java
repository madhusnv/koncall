package p001o;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p001o.c5f;

/* loaded from: classes6.dex */
public final class zp3 extends c5f {

    /* renamed from: d */
    public static final C18688b f57466d;

    /* renamed from: e */
    public static final vwe f57467e;

    /* renamed from: f */
    public static final int f57468f = m59669g(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx3.computation-threads", 0).intValue());

    /* renamed from: g */
    public static final C18689c f57469g;

    /* renamed from: b */
    public final ThreadFactory f57470b;

    /* renamed from: c */
    public final AtomicReference f57471c;

    /* renamed from: o.zp3$a */
    public static final class C18687a extends c5f.AbstractC12571c {

        /* renamed from: a */
        public final hea f57472a;

        /* renamed from: b */
        public final ko3 f57473b;

        /* renamed from: c */
        public final hea f57474c;

        /* renamed from: d */
        public final C18689c f57475d;

        /* renamed from: e */
        public volatile boolean f57476e;

        public C18687a(C18689c c18689c) {
            this.f57475d = c18689c;
            hea heaVar = new hea();
            this.f57472a = heaVar;
            ko3 ko3Var = new ko3();
            this.f57473b = ko3Var;
            hea heaVar2 = new hea();
            this.f57474c = heaVar2;
            heaVar2.mo30304a(heaVar);
            heaVar2.mo30304a(ko3Var);
        }

        @Override // p001o.c5f.AbstractC12571c
        /* renamed from: b */
        public su5 mo20307b(Runnable runnable) {
            return this.f57476e ? h66.INSTANCE : this.f57475d.m50782f(runnable, 0L, TimeUnit.MILLISECONDS, this.f57472a);
        }

        @Override // p001o.c5f.AbstractC12571c
        /* renamed from: d */
        public su5 mo20308d(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f57476e ? h66.INSTANCE : this.f57475d.m50782f(runnable, j, timeUnit, this.f57473b);
        }

        @Override // p001o.su5
        public void dispose() {
            if (this.f57476e) {
                return;
            }
            this.f57476e = true;
            this.f57474c.dispose();
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f57476e;
        }
    }

    /* renamed from: o.zp3$b */
    public static final class C18688b {

        /* renamed from: a */
        public final int f57477a;

        /* renamed from: b */
        public final C18689c[] f57478b;

        /* renamed from: c */
        public long f57479c;

        public C18688b(int i, ThreadFactory threadFactory) {
            this.f57477a = i;
            this.f57478b = new C18689c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f57478b[i2] = new C18689c(threadFactory);
            }
        }

        /* renamed from: a */
        public C18689c m59671a() {
            int i = this.f57477a;
            if (i == 0) {
                return zp3.f57469g;
            }
            C18689c[] c18689cArr = this.f57478b;
            long j = this.f57479c;
            this.f57479c = 1 + j;
            return c18689cArr[(int) (j % i)];
        }

        /* renamed from: b */
        public void m59672b() {
            for (C18689c c18689c : this.f57478b) {
                c18689c.dispose();
            }
        }
    }

    /* renamed from: o.zp3$c */
    public static final class C18689c extends tyb {
        public C18689c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C18689c c18689c = new C18689c(new vwe("RxComputationShutdown"));
        f57469g = c18689c;
        c18689c.dispose();
        vwe vweVar = new vwe("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        f57467e = vweVar;
        C18688b c18688b = new C18688b(0, vweVar);
        f57466d = c18688b;
        c18688b.m59672b();
    }

    public zp3() {
        this(f57467e);
    }

    /* renamed from: g */
    public static int m59669g(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    @Override // p001o.c5f
    /* renamed from: b */
    public c5f.AbstractC12571c mo20301b() {
        return new C18687a(((C18688b) this.f57471c.get()).m59671a());
    }

    @Override // p001o.c5f
    /* renamed from: d */
    public su5 mo20303d(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((C18688b) this.f57471c.get()).m59671a().m50783h(runnable, j, timeUnit);
    }

    @Override // p001o.c5f
    /* renamed from: e */
    public su5 mo20304e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((C18688b) this.f57471c.get()).m59671a().m50784i(runnable, j, j2, timeUnit);
    }

    @Override // p001o.c5f
    /* renamed from: f */
    public void mo20305f() {
        AtomicReference atomicReference = this.f57471c;
        C18688b c18688b = f57466d;
        C18688b c18688b2 = (C18688b) atomicReference.getAndSet(c18688b);
        if (c18688b2 != c18688b) {
            c18688b2.m59672b();
        }
    }

    /* renamed from: h */
    public void m59670h() {
        C18688b c18688b = new C18688b(f57468f, this.f57470b);
        if (ec3.m24748a(this.f57471c, f57466d, c18688b)) {
            return;
        }
        c18688b.m59672b();
    }

    public zp3(ThreadFactory threadFactory) {
        this.f57470b = threadFactory;
        this.f57471c = new AtomicReference(f57466d);
        m59670h();
    }
}
