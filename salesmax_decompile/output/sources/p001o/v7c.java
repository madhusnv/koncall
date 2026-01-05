package p001o;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class v7c extends a9 {

    /* renamed from: b */
    public final rl7 f49956b;

    /* renamed from: c */
    public final boolean f49957c;

    /* renamed from: d */
    public final int f49958d;

    /* renamed from: e */
    public final int f49959e;

    /* renamed from: o.v7c$a */
    public static final class C17523a extends AtomicReference implements m9c {

        /* renamed from: a */
        public final long f49960a;

        /* renamed from: b */
        public final C17524b f49961b;

        /* renamed from: c */
        public volatile boolean f49962c;

        /* renamed from: d */
        public volatile rtf f49963d;

        /* renamed from: e */
        public int f49964e;

        public C17523a(C17524b c17524b, long j) {
            this.f49960a = j;
            this.f49961b = c17524b;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.setOnce(this, su5Var) && (su5Var instanceof e5e)) {
                e5e e5eVar = (e5e) su5Var;
                int iRequestFusion = e5eVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f49964e = iRequestFusion;
                    this.f49963d = e5eVar;
                    this.f49962c = true;
                    this.f49961b.m52414h();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f49964e = iRequestFusion;
                    this.f49963d = e5eVar;
                }
            }
        }

        /* renamed from: b */
        public void m52410b() {
            zu5.dispose(this);
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f49964e == 0) {
                this.f49961b.m52419p(obj, this);
            } else {
                this.f49961b.m52414h();
            }
        }

        @Override // p001o.m9c
        public void onComplete() {
            this.f49962c = true;
            this.f49961b.m52414h();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f49961b.f49977h.m41017c(th)) {
                C17524b c17524b = this.f49961b;
                if (!c17524b.f49972c) {
                    c17524b.m52413f();
                }
                this.f49962c = true;
                this.f49961b.m52414h();
            }
        }
    }

    /* renamed from: o.v7c$b */
    public static final class C17524b extends AtomicInteger implements su5, m9c {

        /* renamed from: Q */
        public static final C17523a[] f49965Q = new C17523a[0];

        /* renamed from: X */
        public static final C17523a[] f49966X = new C17523a[0];

        /* renamed from: H */
        public int f49967H;

        /* renamed from: L */
        public Queue f49968L;

        /* renamed from: M */
        public int f49969M;

        /* renamed from: a */
        public final m9c f49970a;

        /* renamed from: b */
        public final rl7 f49971b;

        /* renamed from: c */
        public final boolean f49972c;

        /* renamed from: d */
        public final int f49973d;

        /* renamed from: e */
        public final int f49974e;

        /* renamed from: f */
        public volatile qtf f49975f;

        /* renamed from: g */
        public volatile boolean f49976g;

        /* renamed from: h */
        public final ns0 f49977h = new ns0();

        /* renamed from: q */
        public volatile boolean f49978q;

        /* renamed from: s */
        public final AtomicReference f49979s;

        /* renamed from: x */
        public su5 f49980x;

        /* renamed from: y */
        public long f49981y;

        public C17524b(m9c m9cVar, rl7 rl7Var, boolean z, int i, int i2) {
            this.f49970a = m9cVar;
            this.f49971b = rl7Var;
            this.f49972c = z;
            this.f49973d = i;
            this.f49974e = i2;
            if (i != Integer.MAX_VALUE) {
                this.f49968L = new ArrayDeque(i);
            }
            this.f49979s = new AtomicReference(f49965Q);
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f49980x, su5Var)) {
                this.f49980x = su5Var;
                this.f49970a.mo16559a(this);
            }
        }

        /* renamed from: b */
        public boolean m52411b(C17523a c17523a) {
            C17523a[] c17523aArr;
            C17523a[] c17523aArr2;
            do {
                c17523aArr = (C17523a[]) this.f49979s.get();
                if (c17523aArr == f49966X) {
                    c17523a.m52410b();
                    return false;
                }
                int length = c17523aArr.length;
                c17523aArr2 = new C17523a[length + 1];
                System.arraycopy(c17523aArr, 0, c17523aArr2, 0, length);
                c17523aArr2[length] = c17523a;
            } while (!ec3.m24748a(this.f49979s, c17523aArr, c17523aArr2));
            return true;
        }

        /* renamed from: d */
        public boolean m52412d() {
            if (this.f49978q) {
                return true;
            }
            Throwable th = (Throwable) this.f49977h.get();
            if (this.f49972c || th == null) {
                return false;
            }
            m52413f();
            this.f49977h.m41020f(this.f49970a);
            return true;
        }

        @Override // p001o.su5
        public void dispose() {
            this.f49978q = true;
            if (m52413f()) {
                this.f49977h.m41018d();
            }
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f49976g) {
                return;
            }
            try {
                Object objApply = this.f49971b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                x8c x8cVar = (x8c) objApply;
                if (this.f49973d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i = this.f49969M;
                        if (i == this.f49973d) {
                            this.f49968L.offer(x8cVar);
                            return;
                        }
                        this.f49969M = i + 1;
                    }
                }
                m52417l(x8cVar);
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f49980x.dispose();
                onError(th);
            }
        }

        /* renamed from: f */
        public boolean m52413f() {
            this.f49980x.dispose();
            AtomicReference atomicReference = this.f49979s;
            C17523a[] c17523aArr = f49966X;
            C17523a[] c17523aArr2 = (C17523a[]) atomicReference.getAndSet(c17523aArr);
            if (c17523aArr2 == c17523aArr) {
                return false;
            }
            for (C17523a c17523a : c17523aArr2) {
                c17523a.m52410b();
            }
            return true;
        }

        /* renamed from: h */
        public void m52414h() {
            if (getAndIncrement() == 0) {
                m52415i();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x00c5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00c4 A[PHI: r4
          0x00c4: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:57:0x00aa, B:66:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m52415i() {
            int size;
            Object objPoll;
            boolean z;
            m9c m9cVar = this.f49970a;
            int iAddAndGet = 1;
            while (!m52412d()) {
                qtf qtfVar = this.f49975f;
                int i = 0;
                if (qtfVar != null) {
                    while (!m52412d()) {
                        Object objPoll2 = qtfVar.poll();
                        if (objPoll2 != null) {
                            m9cVar.mo16560e(objPoll2);
                            i++;
                        }
                    }
                    return;
                }
                if (i == 0) {
                    boolean z2 = this.f49976g;
                    qtf qtfVar2 = this.f49975f;
                    C17523a[] c17523aArr = (C17523a[]) this.f49979s.get();
                    int length = c17523aArr.length;
                    if (this.f49973d != Integer.MAX_VALUE) {
                        synchronized (this) {
                            size = this.f49968L.size();
                        }
                    } else {
                        size = 0;
                    }
                    if (z2 && ((qtfVar2 == null || qtfVar2.isEmpty()) && length == 0 && size == 0)) {
                        this.f49977h.m41020f(this.f49970a);
                        return;
                    }
                    if (length != 0) {
                        int iMin = Math.min(length - 1, this.f49967H);
                        for (int i2 = 0; i2 < length; i2++) {
                            if (m52412d()) {
                                return;
                            }
                            C17523a c17523a = c17523aArr[iMin];
                            rtf rtfVar = c17523a.f49963d;
                            if (rtfVar != null) {
                                do {
                                    try {
                                        objPoll = rtfVar.poll();
                                    } catch (Throwable th) {
                                        zk6.m59526b(th);
                                        c17523a.m52410b();
                                        this.f49977h.m41017c(th);
                                        if (m52412d()) {
                                            return;
                                        }
                                        m52416k(c17523a);
                                        i++;
                                        iMin++;
                                        if (iMin == length) {
                                        }
                                    }
                                    if (objPoll == null) {
                                        z = c17523a.f49962c;
                                        rtf rtfVar2 = c17523a.f49963d;
                                        if (z && (rtfVar2 == null || rtfVar2.isEmpty())) {
                                            m52416k(c17523a);
                                            i++;
                                        }
                                        iMin++;
                                        if (iMin != length) {
                                            iMin = 0;
                                        }
                                    } else {
                                        m9cVar.mo16560e(objPoll);
                                    }
                                } while (!m52412d());
                                return;
                            }
                            z = c17523a.f49962c;
                            rtf rtfVar22 = c17523a.f49963d;
                            if (z) {
                                m52416k(c17523a);
                                i++;
                            }
                            iMin++;
                            if (iMin != length) {
                            }
                        }
                        this.f49967H = iMin;
                    }
                    if (i == 0) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (this.f49973d != Integer.MAX_VALUE) {
                        m52418o(i);
                    }
                } else if (this.f49973d != Integer.MAX_VALUE) {
                    m52418o(i);
                }
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f49978q;
        }

        /* renamed from: k */
        public void m52416k(C17523a c17523a) {
            C17523a[] c17523aArr;
            C17523a[] c17523aArr2;
            do {
                c17523aArr = (C17523a[]) this.f49979s.get();
                int length = c17523aArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c17523aArr[i] == c17523a) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c17523aArr2 = f49965Q;
                } else {
                    C17523a[] c17523aArr3 = new C17523a[length - 1];
                    System.arraycopy(c17523aArr, 0, c17523aArr3, 0, i);
                    System.arraycopy(c17523aArr, i + 1, c17523aArr3, i, (length - i) - 1);
                    c17523aArr2 = c17523aArr3;
                }
            } while (!ec3.m24748a(this.f49979s, c17523aArr, c17523aArr2));
        }

        /* renamed from: l */
        public void m52417l(x8c x8cVar) {
            boolean z;
            while (x8cVar instanceof idg) {
                if (!m52420q((idg) x8cVar) || this.f49973d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    x8cVar = (x8c) this.f49968L.poll();
                    if (x8cVar == null) {
                        z = true;
                        this.f49969M--;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    m52414h();
                    return;
                }
            }
            long j = this.f49981y;
            this.f49981y = 1 + j;
            C17523a c17523a = new C17523a(this, j);
            if (m52411b(c17523a)) {
                x8cVar.mo55724b(c17523a);
            }
        }

        /* renamed from: o */
        public void m52418o(int i) {
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    return;
                }
                synchronized (this) {
                    x8c x8cVar = (x8c) this.f49968L.poll();
                    if (x8cVar == null) {
                        this.f49969M--;
                    } else {
                        m52417l(x8cVar);
                    }
                }
                i = i2;
            }
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f49976g) {
                return;
            }
            this.f49976g = true;
            m52414h();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f49976g) {
                fwe.m27599r(th);
            } else if (this.f49977h.m41017c(th)) {
                this.f49976g = true;
                m52414h();
            }
        }

        /* renamed from: p */
        public void m52419p(Object obj, C17523a c17523a) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f49970a.mo16560e(obj);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                rtf c1gVar = c17523a.f49963d;
                if (c1gVar == null) {
                    c1gVar = new c1g(this.f49974e);
                    c17523a.f49963d = c1gVar;
                }
                c1gVar.offer(obj);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m52415i();
        }

        /* renamed from: q */
        public boolean m52420q(idg idgVar) {
            try {
                Object obj = idgVar.get();
                if (obj == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f49970a.mo16560e(obj);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    qtf c1gVar = this.f49975f;
                    if (c1gVar == null) {
                        c1gVar = this.f49973d == Integer.MAX_VALUE ? new c1g(this.f49974e) : new b1g(this.f49973d);
                        this.f49975f = c1gVar;
                    }
                    c1gVar.offer(obj);
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                m52415i();
                return true;
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f49977h.m41017c(th);
                m52414h();
                return true;
            }
        }
    }

    public v7c(x8c x8cVar, rl7 rl7Var, boolean z, int i, int i2) {
        super(x8cVar);
        this.f49956b = rl7Var;
        this.f49957c = z;
        this.f49958d = i;
        this.f49959e = i2;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        if (t8c.m49563b(this.f14302a, m9cVar, this.f49956b)) {
            return;
        }
        this.f14302a.mo55724b(new C17524b(m9cVar, this.f49956b, this.f49957c, this.f49958d, this.f49959e));
    }
}
