package p001o;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes6.dex */
public final class g84 implements Executor, Closeable {

    /* renamed from: h */
    public static final C13636a f24708h = new C13636a(null);

    /* renamed from: q */
    public static final /* synthetic */ AtomicLongFieldUpdater f24709q = AtomicLongFieldUpdater.newUpdater(g84.class, "parkedWorkersStack$volatile");

    /* renamed from: s */
    public static final /* synthetic */ AtomicLongFieldUpdater f24710s = AtomicLongFieldUpdater.newUpdater(g84.class, "controlState$volatile");

    /* renamed from: x */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24711x = AtomicIntegerFieldUpdater.newUpdater(g84.class, "_isTerminated$volatile");

    /* renamed from: y */
    public static final lgg f24712y = new lgg("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a */
    public final int f24713a;

    /* renamed from: b */
    public final int f24714b;

    /* renamed from: c */
    public final long f24715c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d */
    public final String f24716d;

    /* renamed from: e */
    public final jt7 f24717e;

    /* renamed from: f */
    public final jt7 f24718f;

    /* renamed from: g */
    public final ine f24719g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: o.g84$a */
    public static final class C13636a {
        public C13636a() {
        }

        public /* synthetic */ C13636a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.g84$b */
    public /* synthetic */ class C13637b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24720a;

        static {
            int[] iArr = new int[EnumC13639d.values().length];
            try {
                iArr[EnumC13639d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13639d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13639d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC13639d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC13639d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f24720a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.g84$d */
    public static final class EnumC13639d {
        private static final /* synthetic */ gi6 $ENTRIES;
        private static final /* synthetic */ EnumC13639d[] $VALUES;
        public static final EnumC13639d CPU_ACQUIRED = new EnumC13639d("CPU_ACQUIRED", 0);
        public static final EnumC13639d BLOCKING = new EnumC13639d("BLOCKING", 1);
        public static final EnumC13639d PARKING = new EnumC13639d("PARKING", 2);
        public static final EnumC13639d DORMANT = new EnumC13639d("DORMANT", 3);
        public static final EnumC13639d TERMINATED = new EnumC13639d("TERMINATED", 4);

        private static final /* synthetic */ EnumC13639d[] $values() {
            return new EnumC13639d[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
        }

        static {
            EnumC13639d[] enumC13639dArr$values = $values();
            $VALUES = enumC13639dArr$values;
            $ENTRIES = hi6.m30609a(enumC13639dArr$values);
        }

        private EnumC13639d(String str, int i) {
        }

        public static gi6 getEntries() {
            return $ENTRIES;
        }

        public static EnumC13639d valueOf(String str) {
            return (EnumC13639d) Enum.valueOf(EnumC13639d.class, str);
        }

        public static EnumC13639d[] values() {
            return (EnumC13639d[]) $VALUES.clone();
        }
    }

    public g84(int i, int i2, long j, String str) {
        this.f24713a = i;
        this.f24714b = i2;
        this.f24715c = j;
        this.f24716d = str;
        if (!(i >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (!(i2 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f24717e = new jt7();
        this.f24718f = new jt7();
        this.f24719g = new ine((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    /* renamed from: Y */
    public static /* synthetic */ boolean m28166Y(g84 g84Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = f24710s.get(g84Var);
        }
        return g84Var.m28181X(j);
    }

    /* renamed from: o */
    public static /* synthetic */ void m28168o(g84 g84Var, Runnable runnable, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        g84Var.m28186k(runnable, z, z2);
    }

    /* renamed from: r */
    public static final /* synthetic */ AtomicLongFieldUpdater m28169r() {
        return f24710s;
    }

    /* renamed from: C */
    public final int m28172C(C13638c c13638c) {
        Object objM28194g = c13638c.m28194g();
        while (objM28194g != f24712y) {
            if (objM28194g == null) {
                return 0;
            }
            C13638c c13638c2 = (C13638c) objM28194g;
            int iM28193f = c13638c2.m28193f();
            if (iM28193f != 0) {
                return iM28193f;
            }
            objM28194g = c13638c2.m28194g();
        }
        return -1;
    }

    /* renamed from: D */
    public final C13638c m28173D() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f24709q;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            C13638c c13638c = (C13638c) this.f24719g.m32502b((int) (2097151 & j));
            if (c13638c == null) {
                return null;
            }
            long j2 = (2097152 + j) & (-2097152);
            int iM28172C = m28172C(c13638c);
            if (iM28172C >= 0 && f24709q.compareAndSet(this, j, iM28172C | j2)) {
                c13638c.m28201o(f24712y);
                return c13638c;
            }
        }
    }

    /* renamed from: H */
    public final boolean m28174H(C13638c c13638c) {
        long j;
        int iM28193f;
        if (c13638c.m28194g() != f24712y) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f24709q;
        do {
            j = atomicLongFieldUpdater.get(this);
            iM28193f = c13638c.m28193f();
            c13638c.m28201o(this.f24719g.m32502b((int) (2097151 & j)));
        } while (!f24709q.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | iM28193f));
        return true;
    }

    /* renamed from: J */
    public final void m28175J(C13638c c13638c, int i, int i2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f24709q;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int iM28172C = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (iM28172C == i) {
                iM28172C = i2 == 0 ? m28172C(c13638c) : i2;
            }
            if (iM28172C >= 0 && f24709q.compareAndSet(this, j, j2 | iM28172C)) {
                return;
            }
        }
    }

    /* renamed from: K */
    public final void m28176K(xjg xjgVar) {
        try {
            xjgVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m28177O(long j) throws InterruptedException {
        int i;
        xjg xjgVarM28192e;
        if (f24711x.compareAndSet(this, 0, 1)) {
            C13638c c13638cM28185h = m28185h();
            synchronized (this.f24719g) {
                i = (int) (m28169r().get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objM32502b = this.f24719g.m32502b(i2);
                    sq8.m48646e(objM32502b);
                    C13638c c13638c = (C13638c) objM32502b;
                    if (c13638c != c13638cM28185h) {
                        while (c13638c.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c13638c);
                            c13638c.join(j);
                        }
                        c13638c.f24722a.m43312j(this.f24718f);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f24718f.m37313b();
            this.f24717e.m37313b();
            while (true) {
                if (c13638cM28185h == null) {
                    xjgVarM28192e = (xjg) this.f24717e.m37315e();
                    if (xjgVarM28192e == null && (xjgVarM28192e = (xjg) this.f24718f.m37315e()) == null) {
                        break;
                    }
                } else {
                    xjgVarM28192e = c13638cM28185h.m28192e(true);
                    if (xjgVarM28192e != null) {
                        continue;
                    }
                }
                m28176K(xjgVarM28192e);
            }
            if (c13638cM28185h != null) {
                c13638cM28185h.m28204r(EnumC13639d.TERMINATED);
            }
            f24709q.set(this, 0L);
            f24710s.set(this, 0L);
        }
    }

    /* renamed from: Q */
    public final void m28178Q(long j, boolean z) {
        if (z || d0() || m28181X(j)) {
            return;
        }
        d0();
    }

    /* renamed from: S */
    public final void m28179S() {
        if (d0() || m28166Y(this, 0L, 1, null)) {
            return;
        }
        d0();
    }

    /* renamed from: T */
    public final xjg m28180T(C13638c c13638c, xjg xjgVar, boolean z) {
        EnumC13639d enumC13639d;
        if (c13638c == null || (enumC13639d = c13638c.f24724c) == EnumC13639d.TERMINATED) {
            return xjgVar;
        }
        if (!xjgVar.f53854b && enumC13639d == EnumC13639d.BLOCKING) {
            return xjgVar;
        }
        c13638c.f24728g = true;
        return c13638c.f24722a.m43307a(xjgVar, z);
    }

    /* renamed from: X */
    public final boolean m28181X(long j) {
        if (bce.m18601d(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.f24713a) {
            int iM28183d = m28183d();
            if (iM28183d == 1 && this.f24713a > 1) {
                m28183d();
            }
            if (iM28183d > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m28182c(xjg xjgVar) {
        return xjgVar.f53854b ? this.f24718f.m37312a(xjgVar) : this.f24717e.m37312a(xjgVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        m28177O(10000L);
    }

    /* renamed from: d */
    public final int m28183d() {
        synchronized (this.f24719g) {
            if (isTerminated()) {
                return -1;
            }
            long j = f24710s.get(this);
            int i = (int) (j & 2097151);
            int iM18601d = bce.m18601d(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (iM18601d >= this.f24713a) {
                return 0;
            }
            if (i >= this.f24714b) {
                return 0;
            }
            int i2 = ((int) (m28169r().get(this) & 2097151)) + 1;
            if (!(i2 > 0 && this.f24719g.m32502b(i2) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            C13638c c13638c = new C13638c(this, i2);
            this.f24719g.m32503c(i2, c13638c);
            if (!(i2 == ((int) (2097151 & f24710s.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int i3 = iM18601d + 1;
            c13638c.start();
            return i3;
        }
    }

    public final boolean d0() {
        C13638c c13638cM28173D;
        do {
            c13638cM28173D = m28173D();
            if (c13638cM28173D == null) {
                return false;
            }
        } while (!C13638c.f24721q.compareAndSet(c13638cM28173D, -1, 0));
        LockSupport.unpark(c13638cM28173D);
        return true;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m28168o(this, runnable, false, false, 6, null);
    }

    /* renamed from: f */
    public final xjg m28184f(Runnable runnable, boolean z) {
        long jMo29826a = d2h.f19051f.mo29826a();
        if (!(runnable instanceof xjg)) {
            return d2h.m22291b(runnable, jMo29826a, z);
        }
        xjg xjgVar = (xjg) runnable;
        xjgVar.f53853a = jMo29826a;
        xjgVar.f53854b = z;
        return xjgVar;
    }

    /* renamed from: h */
    public final C13638c m28185h() {
        Thread threadCurrentThread = Thread.currentThread();
        C13638c c13638c = threadCurrentThread instanceof C13638c ? (C13638c) threadCurrentThread : null;
        if (c13638c == null || !sq8.m48644c(g84.this, this)) {
            return null;
        }
        return c13638c;
    }

    public final boolean isTerminated() {
        return f24711x.get(this) != 0;
    }

    /* renamed from: k */
    public final void m28186k(Runnable runnable, boolean z, boolean z2) {
        v9.m52465a();
        xjg xjgVarM28184f = m28184f(runnable, z);
        boolean z3 = xjgVarM28184f.f53854b;
        long jAddAndGet = z3 ? f24710s.addAndGet(this, 2097152L) : 0L;
        C13638c c13638cM28185h = m28185h();
        xjg xjgVarM28180T = m28180T(c13638cM28185h, xjgVarM28184f, z2);
        if (xjgVarM28180T != null && !m28182c(xjgVarM28180T)) {
            throw new RejectedExecutionException(this.f24716d + " was terminated");
        }
        boolean z4 = z2 && c13638cM28185h != null;
        if (z3) {
            m28178Q(jAddAndGet, z4);
        } else {
            if (z4) {
                return;
            }
            m28179S();
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iM32501a = this.f24719g.m32501a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM32501a; i6++) {
            C13638c c13638c = (C13638c) this.f24719g.m32502b(i6);
            if (c13638c != null) {
                int iM43311i = c13638c.f24722a.m43311i();
                int i7 = C13637b.f24720a[c13638c.f24724c.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM43311i);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM43311i);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iM43311i > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM43311i);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i7 != 5) {
                        throw new szb();
                    }
                    i5++;
                }
            }
        }
        long j = f24710s.get(this);
        return this.f24716d + '@' + o75.m41658b(this) + "[Pool Size {core = " + this.f24713a + ", max = " + this.f24714b + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f24717e.m37314c() + ", global blocking queue size = " + this.f24718f.m37314c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f24713a - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* renamed from: o.g84$c */
    public final class C13638c extends Thread {

        /* renamed from: q */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f24721q = AtomicIntegerFieldUpdater.newUpdater(C13638c.class, "workerCtl$volatile");

        /* renamed from: a */
        public final pbj f24722a;

        /* renamed from: b */
        public final gge f24723b;

        /* renamed from: c */
        public EnumC13639d f24724c;

        /* renamed from: d */
        public long f24725d;

        /* renamed from: e */
        public long f24726e;

        /* renamed from: f */
        public int f24727f;

        /* renamed from: g */
        public boolean f24728g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public C13638c() {
            setDaemon(true);
            setContextClassLoader(g84.this.getClass().getClassLoader());
            this.f24722a = new pbj();
            this.f24723b = new gge();
            this.f24724c = EnumC13639d.DORMANT;
            this.nextParkedWorker = g84.f24712y;
            int iNanoTime = (int) System.nanoTime();
            this.f24727f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        /* renamed from: b */
        public final void m28189b(xjg xjgVar) {
            this.f24725d = 0L;
            if (this.f24724c == EnumC13639d.PARKING) {
                this.f24724c = EnumC13639d.BLOCKING;
            }
            if (!xjgVar.f53854b) {
                g84.this.m28176K(xjgVar);
                return;
            }
            if (m28204r(EnumC13639d.BLOCKING)) {
                g84.this.m28179S();
            }
            g84.this.m28176K(xjgVar);
            g84.m28169r().addAndGet(g84.this, -2097152L);
            if (this.f24724c != EnumC13639d.TERMINATED) {
                this.f24724c = EnumC13639d.DORMANT;
            }
        }

        /* renamed from: c */
        public final xjg m28190c(boolean z) {
            xjg xjgVarM28198l;
            xjg xjgVarM28198l2;
            if (z) {
                boolean z2 = m28196j(g84.this.f24713a * 2) == 0;
                if (z2 && (xjgVarM28198l2 = m28198l()) != null) {
                    return xjgVarM28198l2;
                }
                xjg xjgVarM43313k = this.f24722a.m43313k();
                if (xjgVarM43313k != null) {
                    return xjgVarM43313k;
                }
                if (!z2 && (xjgVarM28198l = m28198l()) != null) {
                    return xjgVarM28198l;
                }
            } else {
                xjg xjgVarM28198l3 = m28198l();
                if (xjgVarM28198l3 != null) {
                    return xjgVarM28198l3;
                }
            }
            return m28205s(3);
        }

        /* renamed from: d */
        public final xjg m28191d() {
            xjg xjgVarM43314l = this.f24722a.m43314l();
            if (xjgVarM43314l != null) {
                return xjgVarM43314l;
            }
            xjg xjgVar = (xjg) g84.this.f24718f.m37315e();
            return xjgVar == null ? m28205s(1) : xjgVar;
        }

        /* renamed from: e */
        public final xjg m28192e(boolean z) {
            return m28202p() ? m28190c(z) : m28191d();
        }

        /* renamed from: f */
        public final int m28193f() {
            return this.indexInArray;
        }

        /* renamed from: g */
        public final Object m28194g() {
            return this.nextParkedWorker;
        }

        /* renamed from: i */
        public final boolean m28195i() {
            return this.nextParkedWorker != g84.f24712y;
        }

        /* renamed from: j */
        public final int m28196j(int i) {
            int i2 = this.f24727f;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f24727f = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i;
        }

        /* renamed from: k */
        public final void m28197k() {
            if (this.f24725d == 0) {
                this.f24725d = System.nanoTime() + g84.this.f24715c;
            }
            LockSupport.parkNanos(g84.this.f24715c);
            if (System.nanoTime() - this.f24725d >= 0) {
                this.f24725d = 0L;
                m28206t();
            }
        }

        /* renamed from: l */
        public final xjg m28198l() {
            if (m28196j(2) == 0) {
                xjg xjgVar = (xjg) g84.this.f24717e.m37315e();
                return xjgVar != null ? xjgVar : (xjg) g84.this.f24718f.m37315e();
            }
            xjg xjgVar2 = (xjg) g84.this.f24718f.m37315e();
            return xjgVar2 != null ? xjgVar2 : (xjg) g84.this.f24717e.m37315e();
        }

        /* renamed from: m */
        public final void m28199m() {
            loop0: while (true) {
                boolean z = false;
                while (!g84.this.isTerminated() && this.f24724c != EnumC13639d.TERMINATED) {
                    xjg xjgVarM28192e = m28192e(this.f24728g);
                    if (xjgVarM28192e != null) {
                        this.f24726e = 0L;
                        m28189b(xjgVarM28192e);
                    } else {
                        this.f24728g = false;
                        if (this.f24726e == 0) {
                            m28203q();
                        } else if (z) {
                            m28204r(EnumC13639d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f24726e);
                            this.f24726e = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
                break loop0;
            }
            m28204r(EnumC13639d.TERMINATED);
        }

        /* renamed from: n */
        public final void m28200n(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(g84.this.f24716d);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: o */
        public final void m28201o(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: p */
        public final boolean m28202p() {
            boolean z;
            if (this.f24724c == EnumC13639d.CPU_ACQUIRED) {
                return true;
            }
            g84 g84Var = g84.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterM28169r = g84.m28169r();
            while (true) {
                long j = atomicLongFieldUpdaterM28169r.get(g84Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    z = false;
                    break;
                }
                if (g84.m28169r().compareAndSet(g84Var, j, j - 4398046511104L)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return false;
            }
            this.f24724c = EnumC13639d.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: q */
        public final void m28203q() {
            if (!m28195i()) {
                g84.this.m28174H(this);
                return;
            }
            f24721q.set(this, -1);
            while (m28195i() && f24721q.get(this) == -1 && !g84.this.isTerminated() && this.f24724c != EnumC13639d.TERMINATED) {
                m28204r(EnumC13639d.PARKING);
                Thread.interrupted();
                m28197k();
            }
        }

        /* renamed from: r */
        public final boolean m28204r(EnumC13639d enumC13639d) {
            EnumC13639d enumC13639d2 = this.f24724c;
            boolean z = enumC13639d2 == EnumC13639d.CPU_ACQUIRED;
            if (z) {
                g84.m28169r().addAndGet(g84.this, 4398046511104L);
            }
            if (enumC13639d2 != enumC13639d) {
                this.f24724c = enumC13639d;
            }
            return z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m28199m();
        }

        /* renamed from: s */
        public final xjg m28205s(int i) {
            int i2 = (int) (g84.m28169r().get(g84.this) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int iM28196j = m28196j(i2);
            g84 g84Var = g84.this;
            long jMin = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                iM28196j++;
                if (iM28196j > i2) {
                    iM28196j = 1;
                }
                C13638c c13638c = (C13638c) g84Var.f24719g.m32502b(iM28196j);
                if (c13638c != null && c13638c != this) {
                    long jM43320r = c13638c.f24722a.m43320r(i, this.f24723b);
                    if (jM43320r == -1) {
                        gge ggeVar = this.f24723b;
                        xjg xjgVar = (xjg) ggeVar.f25106a;
                        ggeVar.f25106a = null;
                        return xjgVar;
                    }
                    if (jM43320r > 0) {
                        jMin = Math.min(jMin, jM43320r);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f24726e = jMin;
            return null;
        }

        /* renamed from: t */
        public final void m28206t() {
            g84 g84Var = g84.this;
            synchronized (g84Var.f24719g) {
                if (g84Var.isTerminated()) {
                    return;
                }
                if (((int) (g84.m28169r().get(g84Var) & 2097151)) <= g84Var.f24713a) {
                    return;
                }
                if (f24721q.compareAndSet(this, -1, 1)) {
                    int i = this.indexInArray;
                    m28200n(0);
                    g84Var.m28175J(this, i, 0);
                    int andDecrement = (int) (g84.m28169r().getAndDecrement(g84Var) & 2097151);
                    if (andDecrement != i) {
                        Object objM32502b = g84Var.f24719g.m32502b(andDecrement);
                        sq8.m48646e(objM32502b);
                        C13638c c13638c = (C13638c) objM32502b;
                        g84Var.f24719g.m32503c(i, c13638c);
                        c13638c.m28200n(i);
                        g84Var.m28175J(c13638c, andDecrement, i);
                    }
                    g84Var.f24719g.m32503c(andDecrement, null);
                    y3i y3iVar = y3i.f54824a;
                    this.f24724c = EnumC13639d.TERMINATED;
                }
            }
        }

        public C13638c(g84 g84Var, int i) {
            this();
            m28200n(i);
        }
    }
}
