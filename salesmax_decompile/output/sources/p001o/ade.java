package p001o;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p001o.yce;

/* loaded from: classes6.dex */
public final class ade {

    /* renamed from: j */
    public static final C12148b f14539j = new C12148b(null);

    /* renamed from: k */
    public static AtomicReferenceFieldUpdater f14540k = AtomicReferenceFieldUpdater.newUpdater(ade.class, Map.class, "f");

    /* renamed from: a */
    public final uog f14541a;

    /* renamed from: b */
    public final int f14542b;

    /* renamed from: c */
    public final bt3 f14543c;

    /* renamed from: d */
    public final ql7 f14544d;

    /* renamed from: e */
    public final long f14545e;

    /* renamed from: f */
    public volatile Map f14546f;

    /* renamed from: g */
    public final tog f14547g;

    /* renamed from: h */
    public final C12149c f14548h;

    /* renamed from: i */
    public final ConcurrentLinkedQueue f14549i;

    /* renamed from: o.ade$a */
    public static final class C12147a {
    }

    /* renamed from: o.ade$b */
    public static final class C12148b {
        public C12148b() {
        }

        public /* synthetic */ C12148b(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.ade$c */
    public static final class C12149c extends wjg {
        public C12149c(String str) {
            super(str, false, 2, null);
        }

        @Override // p001o.wjg
        /* renamed from: f */
        public long mo16932f() {
            return ade.this.m16920b(System.nanoTime());
        }
    }

    public ade(uog uogVar, int i, long j, TimeUnit timeUnit, bt3 bt3Var, ql7 ql7Var) {
        sq8.m48649h(uogVar, "taskRunner");
        sq8.m48649h(timeUnit, "timeUnit");
        sq8.m48649h(bt3Var, "connectionListener");
        sq8.m48649h(ql7Var, "exchangeFinderFactory");
        this.f14541a = uogVar;
        this.f14542b = i;
        this.f14543c = bt3Var;
        this.f14544d = ql7Var;
        this.f14545e = timeUnit.toNanos(j);
        this.f14546f = isa.m32681h();
        this.f14547g = uogVar.m51859k();
        this.f14548h = new C12149c(jgj.f30422f + " ConnectionPool connection closer");
        this.f14549i = new ConcurrentLinkedQueue();
        if (j > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[Catch: all -> 0x0067, TryCatch #1 {, blocks: (B:9:0x0024, B:12:0x002b, B:15:0x0033), top: B:42:0x0024 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zce m16919a(boolean z, d60 d60Var, gt3 gt3Var, List list, boolean z2) throws IOException {
        boolean z3;
        boolean z4;
        Socket socketMo25551t;
        sq8.m48649h(d60Var, "address");
        sq8.m48649h(gt3Var, "connectionUser");
        Iterator it = this.f14549i.iterator();
        while (it.hasNext()) {
            zce zceVar = (zce) it.next();
            sq8.m48646e(zceVar);
            synchronized (zceVar) {
                if (z2) {
                    if (zceVar.m59204r()) {
                        if (zceVar.m59202p(d60Var, list)) {
                            gt3Var.mo25532a(zceVar);
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
            }
            if (z3) {
                if (zceVar.m59203q(z)) {
                    return zceVar;
                }
                synchronized (zceVar) {
                    z4 = zceVar.m59198l() ? false : true;
                    zceVar.m59211y(true);
                    socketMo25551t = gt3Var.mo25551t();
                }
                if (socketMo25551t != null) {
                    jgj.m33813g(socketMo25551t);
                    this.f14543c.m19707f(zceVar);
                } else if (z4) {
                    this.f14543c.m19708h(zceVar);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final long m16920b(long j) throws IOException {
        Map map = this.f14546f;
        Iterator it = map.values().iterator();
        zce zceVar = null;
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
        Iterator it2 = this.f14549i.iterator();
        while (it2.hasNext()) {
            tq.m50332a(map.get(((zce) it2.next()).getRoute().m19864a()));
        }
        long j2 = (j - this.f14545e) + 1;
        Iterator it3 = this.f14549i.iterator();
        int i = 0;
        zce zceVar2 = null;
        zce zceVar3 = null;
        long j3 = Long.MAX_VALUE;
        int i2 = 0;
        while (it3.hasNext()) {
            zce zceVar4 = (zce) it3.next();
            sq8.m48646e(zceVar4);
            synchronized (zceVar4) {
                if (m16927i(zceVar4, j) > 0) {
                    i2++;
                } else {
                    long jM59197k = zceVar4.m59197k();
                    if (jM59197k < j2) {
                        zceVar2 = zceVar4;
                        j2 = jM59197k;
                    }
                    if (m16926h(map, zceVar4)) {
                        i++;
                        if (jM59197k < j3) {
                            zceVar3 = zceVar4;
                            j3 = jM59197k;
                        }
                    }
                }
                y3i y3iVar = y3i.f54824a;
            }
        }
        if (zceVar2 != null) {
            zceVar = zceVar2;
        } else if (i > this.f14542b) {
            j2 = j3;
            zceVar = zceVar3;
        } else {
            j2 = -1;
        }
        if (zceVar == null) {
            if (zceVar3 != null) {
                return (j3 + this.f14545e) - j;
            }
            if (i2 > 0) {
                return this.f14545e;
            }
            return -1L;
        }
        synchronized (zceVar) {
            if (!zceVar.m59195i().isEmpty()) {
                return 0L;
            }
            if (zceVar.m59197k() != j2) {
                return 0L;
            }
            zceVar.m59211y(true);
            this.f14549i.remove(zceVar);
            tq.m50332a(map.get(zceVar.getRoute().m19864a()));
            jgj.m33813g(zceVar.mo56684d());
            this.f14543c.m19707f(zceVar);
            if (this.f14549i.isEmpty()) {
                this.f14547g.m50262a();
            }
            return 0L;
        }
    }

    /* renamed from: c */
    public final boolean m16921c(zce zceVar) {
        sq8.m48649h(zceVar, "connection");
        if (jgj.f30421e && !Thread.holdsLock(zceVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + zceVar);
        }
        if (!zceVar.m59198l() && this.f14542b != 0) {
            m16929k();
            return false;
        }
        zceVar.m59211y(true);
        this.f14549i.remove(zceVar);
        if (this.f14549i.isEmpty()) {
            this.f14547g.m50262a();
        }
        m16930l(zceVar.getRoute().m19864a());
        return true;
    }

    /* renamed from: d */
    public final int m16922d() {
        return this.f14549i.size();
    }

    /* renamed from: e */
    public final void m16923e() throws IOException {
        Iterator it = this.f14549i.iterator();
        sq8.m48648g(it, "iterator(...)");
        while (true) {
            Socket socketMo56684d = null;
            if (!it.hasNext()) {
                break;
            }
            zce zceVar = (zce) it.next();
            sq8.m48646e(zceVar);
            synchronized (zceVar) {
                if (zceVar.m59195i().isEmpty()) {
                    it.remove();
                    zceVar.m59211y(true);
                    socketMo56684d = zceVar.mo56684d();
                }
            }
            if (socketMo56684d != null) {
                jgj.m33813g(socketMo56684d);
                this.f14543c.m19707f(zceVar);
            }
        }
        if (this.f14549i.isEmpty()) {
            this.f14547g.m50262a();
        }
        Iterator it2 = this.f14546f.values().iterator();
        while (it2.hasNext()) {
            tq.m50332a(it2.next());
            m16931m(null);
        }
    }

    /* renamed from: f */
    public final bt3 m16924f() {
        return this.f14543c;
    }

    /* renamed from: g */
    public final int m16925g() {
        boolean zIsEmpty;
        ConcurrentLinkedQueue<zce> concurrentLinkedQueue = this.f14549i;
        int i = 0;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            for (zce zceVar : concurrentLinkedQueue) {
                sq8.m48646e(zceVar);
                synchronized (zceVar) {
                    zIsEmpty = zceVar.m59195i().isEmpty();
                }
                if (zIsEmpty && (i = i + 1) < 0) {
                    ch3.m21255t();
                }
            }
        }
        return i;
    }

    /* renamed from: h */
    public final boolean m16926h(Map map, zce zceVar) {
        tq.m50332a(map.get(zceVar.getRoute().m19864a()));
        return true;
    }

    /* renamed from: i */
    public final int m16927i(zce zceVar, long j) {
        if (jgj.f30421e && !Thread.holdsLock(zceVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + zceVar);
        }
        List listM59195i = zceVar.m59195i();
        int i = 0;
        while (i < listM59195i.size()) {
            Reference reference = (Reference) listM59195i.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                sq8.m48647f(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                e9d.f21191a.m24582g().mo24574l("A connection to " + zceVar.m59208v().m19864a().m22357l() + " was leaked. Did you forget to close a response body?", ((yce.C18378b) reference).m57606a());
                listM59195i.remove(i);
                if (listM59195i.isEmpty()) {
                    zceVar.m59210x(j - this.f14545e);
                    return 0;
                }
            }
        }
        return listM59195i.size();
    }

    /* renamed from: j */
    public final void m16928j(zce zceVar) {
        sq8.m48649h(zceVar, "connection");
        if (!jgj.f30421e || Thread.holdsLock(zceVar)) {
            this.f14549i.add(zceVar);
            m16929k();
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + zceVar);
    }

    /* renamed from: k */
    public final void m16929k() {
        tog.m50261m(this.f14547g, this.f14548h, 0L, 2, null);
    }

    /* renamed from: l */
    public final void m16930l(d60 d60Var) {
        sq8.m48649h(d60Var, "address");
        tq.m50332a(this.f14546f.get(d60Var));
    }

    /* renamed from: m */
    public final void m16931m(C12147a c12147a) {
        throw null;
    }
}
