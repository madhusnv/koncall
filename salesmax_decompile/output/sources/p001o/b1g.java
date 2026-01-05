package p001o;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes6.dex */
public final class b1g extends AtomicReferenceArray implements qtf {

    /* renamed from: f */
    public static final Integer f15453f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: a */
    public final int f15454a;

    /* renamed from: b */
    public final AtomicLong f15455b;

    /* renamed from: c */
    public long f15456c;

    /* renamed from: d */
    public final AtomicLong f15457d;

    /* renamed from: e */
    public final int f15458e;

    public b1g(int i) {
        super(pfd.m43590a(i));
        this.f15454a = length() - 1;
        this.f15455b = new AtomicLong();
        this.f15457d = new AtomicLong();
        this.f15458e = Math.min(i / 4, f15453f.intValue());
    }

    /* renamed from: a */
    public int m18092a(long j) {
        return ((int) j) & this.f15454a;
    }

    /* renamed from: b */
    public int m18093b(long j, int i) {
        return ((int) j) & i;
    }

    /* renamed from: c */
    public Object m18094c(int i) {
        return get(i);
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
    public void m18095d(long j) {
        this.f15457d.lazySet(j);
    }

    /* renamed from: e */
    public void m18096e(int i, Object obj) {
        lazySet(i, obj);
    }

    /* renamed from: f */
    public void m18097f(long j) {
        this.f15455b.lazySet(j);
    }

    @Override // p001o.rtf
    public boolean isEmpty() {
        return this.f15455b.get() == this.f15457d.get();
    }

    @Override // p001o.rtf
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i = this.f15454a;
        long j = this.f15455b.get();
        int iM18093b = m18093b(j, i);
        if (j >= this.f15456c) {
            long j2 = this.f15458e + j;
            if (m18094c(m18093b(j2, i)) == null) {
                this.f15456c = j2;
            } else if (m18094c(iM18093b) != null) {
                return false;
            }
        }
        m18096e(iM18093b, obj);
        m18097f(j + 1);
        return true;
    }

    @Override // p001o.qtf, p001o.rtf
    public Object poll() {
        long j = this.f15457d.get();
        int iM18092a = m18092a(j);
        Object objM18094c = m18094c(iM18092a);
        if (objM18094c == null) {
            return null;
        }
        m18095d(j + 1);
        m18096e(iM18092a, null);
        return objM18094c;
    }
}
