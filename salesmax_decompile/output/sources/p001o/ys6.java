package p001o;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import p001o.fve;

/* loaded from: classes6.dex */
public final class ys6 implements fl6 {

    /* renamed from: a */
    public final fve f55867a;

    /* renamed from: b */
    public final uog f55868b;

    /* renamed from: c */
    public final long f55869c;

    /* renamed from: d */
    public long f55870d;

    /* renamed from: e */
    public final CopyOnWriteArrayList f55871e;

    /* renamed from: f */
    public final BlockingQueue f55872f;

    /* renamed from: o.ys6$a */
    public static final class C18474a extends wjg {

        /* renamed from: e */
        public final /* synthetic */ fve.InterfaceC13582b f55873e;

        /* renamed from: f */
        public final /* synthetic */ ys6 f55874f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18474a(String str, fve.InterfaceC13582b interfaceC13582b, ys6 ys6Var) {
            super(str, false, 2, null);
            this.f55873e = interfaceC13582b;
            this.f55874f = ys6Var;
        }

        @Override // p001o.wjg
        /* renamed from: f */
        public long mo16932f() throws InterruptedException {
            fve.C13581a c13581a;
            try {
                c13581a = this.f55873e.mo25601f();
            } catch (Throwable th) {
                c13581a = new fve.C13581a(this.f55873e, null, th, 2, null);
            }
            if (!this.f55874f.f55871e.contains(this.f55873e)) {
                return -1L;
            }
            this.f55874f.f55872f.put(c13581a);
            return -1L;
        }
    }

    public ys6(fve fveVar, uog uogVar) {
        sq8.m48649h(fveVar, "routePlanner");
        sq8.m48649h(uogVar, "taskRunner");
        this.f55867a = fveVar;
        this.f55868b = uogVar;
        this.f55869c = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f55870d = Long.MIN_VALUE;
        this.f55871e = new CopyOnWriteArrayList();
        this.f55872f = uogVar.m51854f().mo51861a(new LinkedBlockingDeque());
    }

    @Override // p001o.fl6
    /* renamed from: a */
    public zce mo27015a() throws IOException {
        fve.C13581a c13581aM58169g;
        long j;
        IOException iOException = null;
        while (true) {
            try {
                if (!(!this.f55871e.isEmpty()) && !fve.m27567e(mo27016b(), null, 1, null)) {
                    m58168f();
                    sq8.m48646e(iOException);
                    throw iOException;
                }
                if (mo27016b().isCanceled()) {
                    throw new IOException("Canceled");
                }
                long jNanoTime = this.f55868b.m51854f().nanoTime();
                long j2 = this.f55870d - jNanoTime;
                if (this.f55871e.isEmpty() || j2 <= 0) {
                    c13581aM58169g = m58169g();
                    j = this.f55869c;
                    this.f55870d = jNanoTime + j;
                } else {
                    j = j2;
                    c13581aM58169g = null;
                }
                if (c13581aM58169g != null || (c13581aM58169g = m58167e(j, TimeUnit.NANOSECONDS)) != null) {
                    if (c13581aM58169g.m27573f()) {
                        m58168f();
                        if (!c13581aM58169g.m27571d().isReady()) {
                            c13581aM58169g = c13581aM58169g.m27571d().mo25599d();
                        }
                        if (c13581aM58169g.m27573f()) {
                            return c13581aM58169g.m27571d().mo25596a();
                        }
                    }
                    Throwable thM27572e = c13581aM58169g.m27572e();
                    if (thM27572e != null) {
                        if (!(thM27572e instanceof IOException)) {
                            throw thM27572e;
                        }
                        if (iOException == null) {
                            iOException = (IOException) thM27572e;
                        } else {
                            cl6.m21376a(iOException, thM27572e);
                        }
                    }
                    fve.InterfaceC13582b interfaceC13582bM27570c = c13581aM58169g.m27570c();
                    if (interfaceC13582bM27570c != null) {
                        mo27016b().mo24817b().m42480j(interfaceC13582bM27570c);
                    }
                }
            } finally {
                m58168f();
            }
        }
    }

    @Override // p001o.fl6
    /* renamed from: b */
    public fve mo27016b() {
        return this.f55867a;
    }

    /* renamed from: e */
    public final fve.C13581a m58167e(long j, TimeUnit timeUnit) {
        fve.C13581a c13581a;
        if (this.f55871e.isEmpty() || (c13581a = (fve.C13581a) this.f55872f.poll(j, timeUnit)) == null) {
            return null;
        }
        this.f55871e.remove(c13581a.m27571d());
        return c13581a;
    }

    /* renamed from: f */
    public final void m58168f() {
        Iterator it = this.f55871e.iterator();
        while (it.hasNext()) {
            fve.InterfaceC13582b interfaceC13582b = (fve.InterfaceC13582b) it.next();
            interfaceC13582b.cancel();
            fve.InterfaceC13582b interfaceC13582bMo25600e = interfaceC13582b.mo25600e();
            if (interfaceC13582bMo25600e != null) {
                mo27016b().mo24817b().m42481o(interfaceC13582bMo25600e);
            }
        }
        this.f55871e.clear();
    }

    /* renamed from: g */
    public final fve.C13581a m58169g() {
        fve.InterfaceC13582b ts6Var;
        if (fve.m27567e(mo27016b(), null, 1, null)) {
            try {
                ts6Var = mo27016b().mo24819d();
            } catch (Throwable th) {
                ts6Var = new ts6(th);
            }
            if (ts6Var.isReady()) {
                return new fve.C13581a(ts6Var, null, null, 6, null);
            }
            if (ts6Var instanceof ts6) {
                return ((ts6) ts6Var).m50432c();
            }
            this.f55871e.add(ts6Var);
            tog.m50261m(this.f55868b.m51859k(), new C18474a(jgj.f30422f + " connect " + mo27016b().getAddress().m22357l().m53884p(), ts6Var, this), 0L, 2, null);
        }
        return null;
    }
}
