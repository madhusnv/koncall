package p001o;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes6.dex */
public final class c1g implements qtf {

    /* renamed from: q */
    public static final int f17130q = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: s */
    public static final Object f17131s = new Object();

    /* renamed from: b */
    public int f17133b;

    /* renamed from: c */
    public long f17134c;

    /* renamed from: d */
    public final int f17135d;

    /* renamed from: e */
    public AtomicReferenceArray f17136e;

    /* renamed from: f */
    public final int f17137f;

    /* renamed from: g */
    public AtomicReferenceArray f17138g;

    /* renamed from: a */
    public final AtomicLong f17132a = new AtomicLong();

    /* renamed from: h */
    public final AtomicLong f17139h = new AtomicLong();

    public c1g(int i) {
        int iM43590a = pfd.m43590a(Math.max(8, i));
        int i2 = iM43590a - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iM43590a + 1);
        this.f17136e = atomicReferenceArray;
        this.f17135d = i2;
        m20077a(iM43590a);
        this.f17138g = atomicReferenceArray;
        this.f17137f = i2;
        this.f17134c = i2 - 1;
        m20087o(0L);
    }

    /* renamed from: b */
    public static int m20073b(int i) {
        return i;
    }

    /* renamed from: c */
    public static int m20074c(long j, int i) {
        return m20073b(((int) j) & i);
    }

    /* renamed from: g */
    public static Object m20075g(AtomicReferenceArray atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: m */
    public static void m20076m(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    public final void m20077a(int i) {
        this.f17133b = Math.min(i / 4, f17130q);
    }

    @Override // p001o.rtf
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: d */
    public final long m20078d() {
        return this.f17139h.get();
    }

    /* renamed from: e */
    public final long m20079e() {
        return this.f17132a.get();
    }

    /* renamed from: f */
    public final long m20080f() {
        return this.f17139h.get();
    }

    /* renamed from: h */
    public final AtomicReferenceArray m20081h(AtomicReferenceArray atomicReferenceArray, int i) {
        int iM20073b = m20073b(i);
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) m20075g(atomicReferenceArray, iM20073b);
        m20076m(atomicReferenceArray, iM20073b, null);
        return atomicReferenceArray2;
    }

    /* renamed from: i */
    public final long m20082i() {
        return this.f17132a.get();
    }

    @Override // p001o.rtf
    public boolean isEmpty() {
        return m20082i() == m20080f();
    }

    /* renamed from: j */
    public final Object m20083j(AtomicReferenceArray atomicReferenceArray, long j, int i) {
        this.f17138g = atomicReferenceArray;
        int iM20074c = m20074c(j, i);
        Object objM20075g = m20075g(atomicReferenceArray, iM20074c);
        if (objM20075g != null) {
            m20076m(atomicReferenceArray, iM20074c, null);
            m20085l(j + 1);
        }
        return objM20075g;
    }

    /* renamed from: k */
    public final void m20084k(AtomicReferenceArray atomicReferenceArray, long j, int i, Object obj, long j2) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f17136e = atomicReferenceArray2;
        this.f17134c = (j2 + j) - 1;
        m20076m(atomicReferenceArray2, i, obj);
        m20086n(atomicReferenceArray, atomicReferenceArray2);
        m20076m(atomicReferenceArray, i, f17131s);
        m20087o(j + 1);
    }

    /* renamed from: l */
    public final void m20085l(long j) {
        this.f17139h.lazySet(j);
    }

    /* renamed from: n */
    public final void m20086n(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        m20076m(atomicReferenceArray, m20073b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* renamed from: o */
    public final void m20087o(long j) {
        this.f17132a.lazySet(j);
    }

    @Override // p001o.rtf
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f17136e;
        long jM20079e = m20079e();
        int i = this.f17135d;
        int iM20074c = m20074c(jM20079e, i);
        if (jM20079e < this.f17134c) {
            return m20088p(atomicReferenceArray, obj, jM20079e, iM20074c);
        }
        long j = this.f17133b + jM20079e;
        if (m20075g(atomicReferenceArray, m20074c(j, i)) == null) {
            this.f17134c = j - 1;
            return m20088p(atomicReferenceArray, obj, jM20079e, iM20074c);
        }
        if (m20075g(atomicReferenceArray, m20074c(1 + jM20079e, i)) == null) {
            return m20088p(atomicReferenceArray, obj, jM20079e, iM20074c);
        }
        m20084k(atomicReferenceArray, jM20079e, iM20074c, obj, i);
        return true;
    }

    /* renamed from: p */
    public final boolean m20088p(AtomicReferenceArray atomicReferenceArray, Object obj, long j, int i) {
        m20076m(atomicReferenceArray, i, obj);
        m20087o(j + 1);
        return true;
    }

    @Override // p001o.qtf, p001o.rtf
    public Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f17138g;
        long jM20078d = m20078d();
        int i = this.f17137f;
        int iM20074c = m20074c(jM20078d, i);
        Object objM20075g = m20075g(atomicReferenceArray, iM20074c);
        boolean z = objM20075g == f17131s;
        if (objM20075g == null || z) {
            if (z) {
                return m20083j(m20081h(atomicReferenceArray, i + 1), jM20078d, i);
            }
            return null;
        }
        m20076m(atomicReferenceArray, iM20074c, null);
        m20085l(jM20078d + 1);
        return objM20075g;
    }
}
