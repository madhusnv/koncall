package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class j57 extends o7 {

    /* renamed from: c */
    public final rl7 f29798c;

    /* renamed from: d */
    public final boolean f29799d;

    /* renamed from: e */
    public final int f29800e;

    /* renamed from: f */
    public final int f29801f;

    /* renamed from: o.j57$a */
    public static final class C14451a extends AtomicReference implements h67, su5 {

        /* renamed from: a */
        public final long f29802a;

        /* renamed from: b */
        public final C14452b f29803b;

        /* renamed from: c */
        public final int f29804c;

        /* renamed from: d */
        public final int f29805d;

        /* renamed from: e */
        public volatile boolean f29806e;

        /* renamed from: f */
        public volatile rtf f29807f;

        /* renamed from: g */
        public long f29808g;

        /* renamed from: h */
        public int f29809h;

        public C14451a(C14452b c14452b, int i, long j) {
            this.f29802a = j;
            this.f29803b = c14452b;
            this.f29805d = i;
            this.f29804c = i >> 2;
        }

        /* renamed from: a */
        public void m33265a(long j) {
            if (this.f29809h != 1) {
                long j2 = this.f29808g + j;
                if (j2 < this.f29804c) {
                    this.f29808g = j2;
                } else {
                    this.f29808g = 0L;
                    ((rag) get()).request(j2);
                }
            }
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.setOnce(this, ragVar)) {
                if (ragVar instanceof g5e) {
                    g5e g5eVar = (g5e) ragVar;
                    int iRequestFusion = g5eVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f29809h = iRequestFusion;
                        this.f29807f = g5eVar;
                        this.f29806e = true;
                        this.f29803b.m33270h();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f29809h = iRequestFusion;
                        this.f29807f = g5eVar;
                    }
                }
                ragVar.request(this.f29805d);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            wag.cancel(this);
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f29809h != 2) {
                this.f29803b.m33275m(obj, this);
            } else {
                this.f29803b.m33270h();
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return get() == wag.CANCELLED;
        }

        @Override // p001o.qag
        public void onComplete() {
            this.f29806e = true;
            this.f29803b.m33270h();
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            lazySet(wag.CANCELLED);
            this.f29803b.m33273k(this, th);
        }
    }

    /* renamed from: o.j57$b */
    public static final class C14452b extends AtomicInteger implements h67, rag {

        /* renamed from: Y */
        public static final C14451a[] f29810Y = new C14451a[0];

        /* renamed from: Z */
        public static final C14451a[] f29811Z = new C14451a[0];

        /* renamed from: H */
        public long f29812H;

        /* renamed from: L */
        public long f29813L;

        /* renamed from: M */
        public int f29814M;

        /* renamed from: Q */
        public int f29815Q;

        /* renamed from: X */
        public final int f29816X;

        /* renamed from: a */
        public final qag f29817a;

        /* renamed from: b */
        public final rl7 f29818b;

        /* renamed from: c */
        public final boolean f29819c;

        /* renamed from: d */
        public final int f29820d;

        /* renamed from: e */
        public final int f29821e;

        /* renamed from: f */
        public volatile qtf f29822f;

        /* renamed from: g */
        public volatile boolean f29823g;

        /* renamed from: h */
        public final ns0 f29824h = new ns0();

        /* renamed from: q */
        public volatile boolean f29825q;

        /* renamed from: s */
        public final AtomicReference f29826s;

        /* renamed from: x */
        public final AtomicLong f29827x;

        /* renamed from: y */
        public rag f29828y;

        public C14452b(qag qagVar, rl7 rl7Var, boolean z, int i, int i2) {
            AtomicReference atomicReference = new AtomicReference();
            this.f29826s = atomicReference;
            this.f29827x = new AtomicLong();
            this.f29817a = qagVar;
            this.f29818b = rl7Var;
            this.f29819c = z;
            this.f29820d = i;
            this.f29821e = i2;
            this.f29816X = Math.max(1, i >> 1);
            atomicReference.lazySet(f29810Y);
        }

        /* renamed from: a */
        public boolean m33266a(C14451a c14451a) {
            C14451a[] c14451aArr;
            C14451a[] c14451aArr2;
            do {
                c14451aArr = (C14451a[]) this.f29826s.get();
                if (c14451aArr == f29811Z) {
                    c14451a.dispose();
                    return false;
                }
                int length = c14451aArr.length;
                c14451aArr2 = new C14451a[length + 1];
                System.arraycopy(c14451aArr, 0, c14451aArr2, 0, length);
                c14451aArr2[length] = c14451a;
            } while (!ec3.m24748a(this.f29826s, c14451aArr, c14451aArr2));
            return true;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f29828y, ragVar)) {
                this.f29828y = ragVar;
                this.f29817a.mo18165b(this);
                if (this.f29825q) {
                    return;
                }
                int i = this.f29820d;
                if (i == Integer.MAX_VALUE) {
                    ragVar.request(Long.MAX_VALUE);
                } else {
                    ragVar.request(i);
                }
            }
        }

        /* renamed from: c */
        public boolean m33267c() {
            if (this.f29825q) {
                m33268d();
                return true;
            }
            if (this.f29819c || this.f29824h.get() == null) {
                return false;
            }
            m33268d();
            this.f29824h.m41021g(this.f29817a);
            return true;
        }

        @Override // p001o.rag
        public void cancel() {
            qtf qtfVar;
            if (this.f29825q) {
                return;
            }
            this.f29825q = true;
            this.f29828y.cancel();
            m33269g();
            if (getAndIncrement() != 0 || (qtfVar = this.f29822f) == null) {
                return;
            }
            qtfVar.clear();
        }

        /* renamed from: d */
        public void m33268d() {
            qtf qtfVar = this.f29822f;
            if (qtfVar != null) {
                qtfVar.clear();
            }
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f29823g) {
                return;
            }
            try {
                Object objApply = this.f29818b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                g3e g3eVar = (g3e) objApply;
                if (!(g3eVar instanceof idg)) {
                    int i = this.f29821e;
                    long j = this.f29812H;
                    this.f29812H = 1 + j;
                    C14451a c14451a = new C14451a(this, i, j);
                    if (m33266a(c14451a)) {
                        g3eVar.mo28025a(c14451a);
                        return;
                    }
                    return;
                }
                try {
                    Object obj2 = ((idg) g3eVar).get();
                    if (obj2 != null) {
                        m33276o(obj2);
                        return;
                    }
                    if (this.f29820d == Integer.MAX_VALUE || this.f29825q) {
                        return;
                    }
                    int i2 = this.f29815Q + 1;
                    this.f29815Q = i2;
                    int i3 = this.f29816X;
                    if (i2 == i3) {
                        this.f29815Q = 0;
                        this.f29828y.request(i3);
                    }
                } catch (Throwable th) {
                    zk6.m59526b(th);
                    this.f29824h.m41017c(th);
                    m33270h();
                }
            } catch (Throwable th2) {
                zk6.m59526b(th2);
                this.f29828y.cancel();
                onError(th2);
            }
        }

        /* renamed from: g */
        public void m33269g() {
            AtomicReference atomicReference = this.f29826s;
            C14451a[] c14451aArr = f29811Z;
            C14451a[] c14451aArr2 = (C14451a[]) atomicReference.getAndSet(c14451aArr);
            if (c14451aArr2 != c14451aArr) {
                for (C14451a c14451a : c14451aArr2) {
                    c14451a.dispose();
                }
                this.f29824h.m41018d();
            }
        }

        /* renamed from: h */
        public void m33270h() {
            if (getAndIncrement() == 0) {
                m33271i();
            }
        }

        /* renamed from: i */
        public void m33271i() {
            long j;
            long j2;
            long j3;
            boolean z;
            int i;
            int i2;
            long j4;
            long j5;
            qag qagVar = this.f29817a;
            int iAddAndGet = 1;
            while (!m33267c()) {
                qtf qtfVar = this.f29822f;
                long jAddAndGet = this.f29827x.get();
                boolean z2 = jAddAndGet == Long.MAX_VALUE;
                long j6 = 0;
                if (qtfVar != null) {
                    long j7 = 0;
                    j = 0;
                    while (jAddAndGet != 0) {
                        Object objPoll = qtfVar.poll();
                        if (m33267c()) {
                            return;
                        }
                        if (objPoll == null) {
                            break;
                        }
                        qagVar.mo18166e(objPoll);
                        j++;
                        j7++;
                        jAddAndGet--;
                    }
                    if (j7 != 0) {
                        jAddAndGet = z2 ? Long.MAX_VALUE : this.f29827x.addAndGet(-j7);
                    }
                } else {
                    j = 0;
                }
                boolean z3 = this.f29823g;
                qtf qtfVar2 = this.f29822f;
                C14451a[] c14451aArr = (C14451a[]) this.f29826s.get();
                int length = c14451aArr.length;
                if (z3 && ((qtfVar2 == null || qtfVar2.isEmpty()) && length == 0)) {
                    this.f29824h.m41021g(this.f29817a);
                    return;
                }
                int i3 = iAddAndGet;
                if (length != 0) {
                    long j8 = this.f29813L;
                    int i4 = this.f29814M;
                    if (length <= i4 || c14451aArr[i4].f29802a != j8) {
                        if (length <= i4) {
                            i4 = 0;
                        }
                        for (int i5 = 0; i5 < length && c14451aArr[i4].f29802a != j8; i5++) {
                            i4++;
                            if (i4 == length) {
                                i4 = 0;
                            }
                        }
                        this.f29814M = i4;
                        this.f29813L = c14451aArr[i4].f29802a;
                    }
                    int i6 = i4;
                    boolean z4 = false;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            z = z4;
                            break;
                        }
                        if (m33267c()) {
                            return;
                        }
                        C14451a c14451a = c14451aArr[i6];
                        Object obj = null;
                        while (true) {
                            rtf rtfVar = c14451a.f29807f;
                            if (rtfVar == null) {
                                i = length;
                                break;
                            }
                            i = length;
                            Object obj2 = obj;
                            long j9 = j6;
                            while (true) {
                                if (jAddAndGet == j6) {
                                    j4 = j6;
                                    break;
                                }
                                if (m33267c()) {
                                    return;
                                }
                                try {
                                    Object objPoll2 = rtfVar.poll();
                                    if (objPoll2 == null) {
                                        obj2 = objPoll2;
                                        j4 = 0;
                                        break;
                                    } else {
                                        qagVar.mo18166e(objPoll2);
                                        jAddAndGet--;
                                        j9++;
                                        obj2 = objPoll2;
                                        j6 = 0;
                                    }
                                } catch (Throwable th) {
                                    zk6.m59526b(th);
                                    c14451a.dispose();
                                    this.f29824h.m41017c(th);
                                    if (!this.f29819c) {
                                        this.f29828y.cancel();
                                    }
                                    if (m33267c()) {
                                        return;
                                    }
                                    m33274l(c14451a);
                                    i7++;
                                    i2 = i;
                                    z4 = true;
                                }
                            }
                            if (j9 != j4) {
                                jAddAndGet = !z2 ? this.f29827x.addAndGet(-j9) : Long.MAX_VALUE;
                                c14451a.m33265a(j9);
                                j5 = 0;
                            } else {
                                j5 = j4;
                            }
                            if (jAddAndGet == j5 || obj2 == null) {
                                break;
                            }
                            length = i;
                            obj = obj2;
                            j6 = 0;
                        }
                        boolean z5 = c14451a.f29806e;
                        rtf rtfVar2 = c14451a.f29807f;
                        if (z5 && (rtfVar2 == null || rtfVar2.isEmpty())) {
                            m33274l(c14451a);
                            if (m33267c()) {
                                return;
                            }
                            j++;
                            z4 = true;
                        }
                        if (jAddAndGet == 0) {
                            z = z4;
                            break;
                        }
                        i6++;
                        i2 = i;
                        if (i6 == i2) {
                            i6 = 0;
                        }
                        i7++;
                        length = i2;
                        j6 = 0;
                    }
                    this.f29814M = i6;
                    this.f29813L = c14451aArr[i6].f29802a;
                    j3 = j;
                    j2 = 0;
                } else {
                    j2 = 0;
                    j3 = j;
                    z = false;
                }
                if (j3 != j2 && !this.f29825q) {
                    this.f29828y.request(j3);
                }
                if (z) {
                    iAddAndGet = i3;
                } else {
                    iAddAndGet = addAndGet(-i3);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: j */
        public rtf m33272j() {
            qtf c1gVar = this.f29822f;
            if (c1gVar == null) {
                c1gVar = this.f29820d == Integer.MAX_VALUE ? new c1g(this.f29821e) : new b1g(this.f29820d);
                this.f29822f = c1gVar;
            }
            return c1gVar;
        }

        /* renamed from: k */
        public void m33273k(C14451a c14451a, Throwable th) {
            if (this.f29824h.m41017c(th)) {
                c14451a.f29806e = true;
                if (!this.f29819c) {
                    this.f29828y.cancel();
                    for (C14451a c14451a2 : (C14451a[]) this.f29826s.getAndSet(f29811Z)) {
                        c14451a2.dispose();
                    }
                }
                m33270h();
            }
        }

        /* renamed from: l */
        public void m33274l(C14451a c14451a) {
            C14451a[] c14451aArr;
            C14451a[] c14451aArr2;
            do {
                c14451aArr = (C14451a[]) this.f29826s.get();
                int length = c14451aArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (c14451aArr[i] == c14451a) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    c14451aArr2 = f29810Y;
                } else {
                    C14451a[] c14451aArr3 = new C14451a[length - 1];
                    System.arraycopy(c14451aArr, 0, c14451aArr3, 0, i);
                    System.arraycopy(c14451aArr, i + 1, c14451aArr3, i, (length - i) - 1);
                    c14451aArr2 = c14451aArr3;
                }
            } while (!ec3.m24748a(this.f29826s, c14451aArr, c14451aArr2));
        }

        /* renamed from: m */
        public void m33275m(Object obj, C14451a c14451a) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f29827x.get();
                rtf b1gVar = c14451a.f29807f;
                if (j == 0 || !(b1gVar == null || b1gVar.isEmpty())) {
                    if (b1gVar == null) {
                        b1gVar = new b1g(this.f29821e);
                        c14451a.f29807f = b1gVar;
                    }
                    if (!b1gVar.offer(obj)) {
                        onError(new ggb("Inner queue full?!"));
                    }
                } else {
                    this.f29817a.mo18166e(obj);
                    if (j != Long.MAX_VALUE) {
                        this.f29827x.decrementAndGet();
                    }
                    c14451a.m33265a(1L);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                rtf b1gVar2 = c14451a.f29807f;
                if (b1gVar2 == null) {
                    b1gVar2 = new b1g(this.f29821e);
                    c14451a.f29807f = b1gVar2;
                }
                if (!b1gVar2.offer(obj)) {
                    onError(new ggb("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            m33271i();
        }

        /* renamed from: o */
        public void m33276o(Object obj) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f29827x.get();
                rtf rtfVarM33272j = this.f29822f;
                if (j == 0 || !(rtfVarM33272j == null || rtfVarM33272j.isEmpty())) {
                    if (rtfVarM33272j == null) {
                        rtfVarM33272j = m33272j();
                    }
                    if (!rtfVarM33272j.offer(obj)) {
                        onError(new ggb("Scalar queue full?!"));
                    }
                } else {
                    this.f29817a.mo18166e(obj);
                    if (j != Long.MAX_VALUE) {
                        this.f29827x.decrementAndGet();
                    }
                    if (this.f29820d != Integer.MAX_VALUE && !this.f29825q) {
                        int i = this.f29815Q + 1;
                        this.f29815Q = i;
                        int i2 = this.f29816X;
                        if (i == i2) {
                            this.f29815Q = 0;
                            this.f29828y.request(i2);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!m33272j().offer(obj)) {
                onError(new ggb("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            m33271i();
        }

        @Override // p001o.qag
        public void onComplete() {
            if (this.f29823g) {
                return;
            }
            this.f29823g = true;
            m33270h();
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f29823g) {
                fwe.m27599r(th);
                return;
            }
            if (this.f29824h.m41017c(th)) {
                this.f29823g = true;
                if (!this.f29819c) {
                    for (C14451a c14451a : (C14451a[]) this.f29826s.getAndSet(f29811Z)) {
                        c14451a.dispose();
                    }
                }
                m33270h();
            }
        }

        @Override // p001o.rag
        public void request(long j) {
            if (wag.validate(j)) {
                ka1.m35216a(this.f29827x, j);
                m33270h();
            }
        }
    }

    public j57(s47 s47Var, rl7 rl7Var, boolean z, int i, int i2) {
        super(s47Var);
        this.f29798c = rl7Var;
        this.f29799d = z;
        this.f29800e = i;
        this.f29801f = i2;
    }

    public static h67 i0(qag qagVar, rl7 rl7Var, boolean z, int i, int i2) {
        return new C14452b(qagVar, rl7Var, z, i, i2);
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        if (d67.m22360b(this.f37840b, qagVar, this.f29798c)) {
            return;
        }
        this.f37840b.b0(i0(qagVar, this.f29798c, this.f29799d, this.f29800e, this.f29801f));
    }
}
