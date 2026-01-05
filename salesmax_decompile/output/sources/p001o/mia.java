package p001o;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public final class mia {

    /* renamed from: e */
    public static final C15332a f35511e = new C15332a(null);

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f35512f = AtomicReferenceFieldUpdater.newUpdater(mia.class, Object.class, "_next$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f35513g = AtomicLongFieldUpdater.newUpdater(mia.class, "_state$volatile");

    /* renamed from: h */
    public static final lgg f35514h = new lgg("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a */
    public final int f35515a;

    /* renamed from: b */
    public final boolean f35516b;

    /* renamed from: c */
    public final int f35517c;

    /* renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f35518d;

    /* renamed from: o.mia$a */
    public static final class C15332a {
        public C15332a() {
        }

        public /* synthetic */ C15332a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final int m39130a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m39131b(long j, int i) {
            return m39133d(j, 1073741823L) | (i << 0);
        }

        /* renamed from: c */
        public final long m39132c(long j, int i) {
            return m39133d(j, 1152921503533105152L) | (i << 30);
        }

        /* renamed from: d */
        public final long m39133d(long j, long j2) {
            return j & (~j2);
        }
    }

    /* renamed from: o.mia$b */
    public static final class C15333b {

        /* renamed from: a */
        public final int f35519a;

        public C15333b(int i) {
            this.f35519a = i;
        }
    }

    public mia(int i, boolean z) {
        this.f35515a = i;
        this.f35516b = z;
        int i2 = i - 1;
        this.f35517c = i2;
        this.f35518d = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i & i2) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: f */
    private final /* synthetic */ AtomicReferenceArray m39116f() {
        return this.f35518d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m39119a(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35513g;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return f35511e.m39130a(j);
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f35517c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.f35516b && m39116f().get(i2 & i3) != null) {
                int i4 = this.f35515a;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    break;
                }
            } else if (f35513g.compareAndSet(this, j, f35511e.m39132c(j, (i2 + 1) & 1073741823))) {
                m39116f().set(i2 & i3, obj);
                mia miaVarM39123e = this;
                while ((f35513g.get(miaVarM39123e) & 1152921504606846976L) != 0 && (miaVarM39123e = miaVarM39123e.m39127l().m39123e(i2, obj)) != null) {
                }
                return 0;
            }
        }
    }

    /* renamed from: b */
    public final mia m39120b(long j) {
        mia miaVar = new mia(this.f35515a * 2, this.f35516b);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f35517c;
            if ((i & i3) == (i3 & i2)) {
                f35513g.set(miaVar, f35511e.m39133d(j, 1152921504606846976L));
                return miaVar;
            }
            Object c15333b = m39116f().get(this.f35517c & i);
            if (c15333b == null) {
                c15333b = new C15333b(i);
            }
            miaVar.m39116f().set(miaVar.f35517c & i, c15333b);
            i++;
        }
    }

    /* renamed from: c */
    public final mia m39121c(long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35512f;
        while (true) {
            mia miaVar = (mia) atomicReferenceFieldUpdater.get(this);
            if (miaVar != null) {
                return miaVar;
            }
            j9.m33417a(f35512f, this, null, m39120b(j));
        }
    }

    /* renamed from: d */
    public final boolean m39122d() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35513g;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: e */
    public final mia m39123e(int i, Object obj) {
        Object obj2 = m39116f().get(this.f35517c & i);
        if (!(obj2 instanceof C15333b) || ((C15333b) obj2).f35519a != i) {
            return null;
        }
        m39116f().set(i & this.f35517c, obj);
        return this;
    }

    /* renamed from: g */
    public final int m39124g() {
        long j = f35513g.get(this);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    /* renamed from: j */
    public final boolean m39125j() {
        long j = f35513g.get(this);
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: k */
    public final long m39126k() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35513g;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: l */
    public final mia m39127l() {
        return m39121c(m39126k());
    }

    /* renamed from: m */
    public final Object m39128m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35513g;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j) != 0) {
                return f35514h;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = this.f35517c;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == (i2 & i)) {
                return null;
            }
            Object obj = m39116f().get(this.f35517c & i);
            if (obj == null) {
                if (this.f35516b) {
                    return null;
                }
            } else {
                if (obj instanceof C15333b) {
                    return null;
                }
                int i3 = (i + 1) & 1073741823;
                if (f35513g.compareAndSet(this, j, f35511e.m39131b(j, i3))) {
                    m39116f().set(this.f35517c & i, null);
                    return obj;
                }
                if (this.f35516b) {
                    mia miaVarM39129n = this;
                    do {
                        miaVarM39129n = miaVarM39129n.m39129n(i, i3);
                    } while (miaVarM39129n != null);
                    return obj;
                }
            }
        }
    }

    /* renamed from: n */
    public final mia m39129n(int i, int i2) {
        long j;
        int i3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35513g;
        do {
            j = atomicLongFieldUpdater.get(this);
            i3 = (int) ((1073741823 & j) >> 0);
            if ((1152921504606846976L & j) != 0) {
                return m39127l();
            }
        } while (!f35513g.compareAndSet(this, j, f35511e.m39131b(j, i2)));
        m39116f().set(this.f35517c & i3, null);
        return null;
    }
}
