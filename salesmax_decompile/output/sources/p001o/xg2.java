package p001o;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes6.dex */
public final class xg2 extends ibf {

    /* renamed from: e */
    public final dm1 f53720e;

    /* renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f53721f;

    public xg2(long j, xg2 xg2Var, dm1 dm1Var, int i) {
        super(j, xg2Var, i);
        this.f53720e = dm1Var;
        this.f53721f = new AtomicReferenceArray(em1.f21834b * 2);
    }

    /* renamed from: z */
    private final /* synthetic */ AtomicReferenceArray m56231z() {
        return this.f53721f;
    }

    /* renamed from: A */
    public final Object m56232A(int i) {
        return m56231z().get(i * 2);
    }

    /* renamed from: B */
    public final Object m56233B(int i) {
        return m56231z().get((i * 2) + 1);
    }

    /* renamed from: C */
    public final void m56234C(int i, boolean z) {
        if (z) {
            m56242y().l1((this.f28439c * em1.f21834b) + i);
        }
        m31890t();
    }

    /* renamed from: D */
    public final Object m56235D(int i) {
        Object objM56232A = m56232A(i);
        m56240w(i);
        return objM56232A;
    }

    /* renamed from: E */
    public final void m56236E(int i, Object obj) {
        m56231z().set(i * 2, obj);
    }

    /* renamed from: F */
    public final void m56237F(int i, Object obj) {
        m56231z().set((i * 2) + 1, obj);
    }

    /* renamed from: G */
    public final void m56238G(int i, Object obj) {
        m56236E(i, obj);
    }

    @Override // p001o.ibf
    /* renamed from: r */
    public int mo24826r() {
        return em1.f21834b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        m56240w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r4 = m56242y().f20212b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        p001o.lcc.m36947a(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // p001o.ibf
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo24827s(int i, Throwable th, q74 q74Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        xk7 xk7Var;
        int i2 = em1.f21834b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object objM56232A = m56232A(i);
        while (true) {
            Object objM56233B = m56233B(i);
            if ((objM56233B instanceof x3j) || (objM56233B instanceof y3j)) {
                if (m56239v(i, objM56233B, z ? em1.f21842j : em1.f21843k)) {
                    m56240w(i);
                    m56234C(i, !z);
                    if (!z || (xk7Var = m56242y().f20212b) == null) {
                        return;
                    }
                    lcc.m36947a(xk7Var, objM56232A, q74Var);
                    return;
                }
            } else {
                if (objM56233B == em1.f21842j || objM56233B == em1.f21843k) {
                    break;
                }
                if (objM56233B != em1.f21839g && objM56233B != em1.f21838f) {
                    if (objM56233B == em1.f21841i || objM56233B == em1.f21836d || objM56233B == em1.m25280z()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objM56233B).toString());
                }
            }
        }
    }

    /* renamed from: v */
    public final boolean m56239v(int i, Object obj, Object obj2) {
        return wg2.m54356a(m56231z(), (i * 2) + 1, obj, obj2);
    }

    /* renamed from: w */
    public final void m56240w(int i) {
        m56236E(i, null);
    }

    /* renamed from: x */
    public final Object m56241x(int i, Object obj) {
        return m56231z().getAndSet((i * 2) + 1, obj);
    }

    /* renamed from: y */
    public final dm1 m56242y() {
        dm1 dm1Var = this.f53720e;
        sq8.m48646e(dm1Var);
        return dm1Var;
    }
}
