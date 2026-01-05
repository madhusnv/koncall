package mz;

import ex.InterfaceC2137a;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import nz.C5206q;
import nz.C5207r;
import qz.C6391i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mz.b */
/* loaded from: classes3.dex */
public final class C4918b extends AbstractC4917a {

    /* renamed from: e */
    public final /* synthetic */ int f24463e;

    /* renamed from: f */
    public final /* synthetic */ Object f24464f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4918b(int i10, InterfaceC2137a interfaceC2137a, String str) {
        super(str);
        this.f24463e = i10;
        this.f24464f = interfaceC2137a;
    }

    @Override // mz.AbstractC4917a
    /* renamed from: a */
    public final long mo9814a() {
        C5206q c5206q;
        long j6;
        switch (this.f24463e) {
            case 0:
                ((InterfaceC2137a) this.f24464f).invoke();
                return -1L;
            case 1:
                return ((Number) ((C6391i) this.f24464f).invoke()).longValue();
            default:
                C5207r c5207r = (C5207r) this.f24464f;
                long jNanoTime = System.nanoTime();
                Map map = c5207r.f25399d;
                Iterator it = map.values().iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                Iterator it2 = c5207r.f25402g.iterator();
                AbstractC4154l.m8922e(it2, "iterator(...)");
                while (it2.hasNext()) {
                    if (map.get(((C5206q) it2.next()).f25378d.f17969a) != null) {
                        throw new ClassCastException();
                    }
                }
                long j10 = (jNanoTime - c5207r.f25398c) + 1;
                Iterator it3 = c5207r.f25402g.iterator();
                AbstractC4154l.m8922e(it3, "iterator(...)");
                int i10 = 0;
                long j11 = Long.MAX_VALUE;
                C5206q c5206q2 = null;
                C5206q c5206q3 = null;
                int i11 = 0;
                while (it3.hasNext()) {
                    C5206q c5206q4 = (C5206q) it3.next();
                    AbstractC4154l.m8920c(c5206q4);
                    synchronized (c5206q4) {
                        if (c5207r.m10203a(c5206q4, jNanoTime) > 0) {
                            i11++;
                            j6 = jNanoTime;
                        } else {
                            int i12 = i11;
                            long j12 = c5206q4.f25395u;
                            if (j12 < j10) {
                                j10 = j12;
                                c5206q2 = c5206q4;
                            }
                            j6 = jNanoTime;
                            if (map.get(c5206q4.f25378d.f17969a) != null) {
                                throw new ClassCastException();
                            }
                            i10++;
                            if (j12 < j11) {
                                j11 = j12;
                                c5206q3 = c5206q4;
                            }
                            i11 = i12;
                        }
                    }
                    jNanoTime = j6;
                }
                long j13 = jNanoTime;
                int i13 = i11;
                if (c5206q2 != null) {
                    c5206q = c5206q2;
                } else if (i10 > c5207r.f25396a) {
                    j10 = j11;
                    c5206q = c5206q3;
                } else {
                    j10 = -1;
                    c5206q = null;
                }
                if (c5206q == null) {
                    if (c5206q3 != null) {
                        return (j11 + c5207r.f25398c) - j13;
                    }
                    if (i13 > 0) {
                        return c5207r.f25398c;
                    }
                    return -1L;
                }
                synchronized (c5206q) {
                    if (c5206q.f25394t.isEmpty() && c5206q.f25395u == j10) {
                        c5206q.f25388n = true;
                        c5207r.f25402g.remove(c5206q);
                        if (map.get(c5206q.f25378d.f17969a) != null) {
                            throw new ClassCastException();
                        }
                        AbstractC4299e.m9014c(c5206q.f25380f);
                        if (c5207r.f25402g.isEmpty()) {
                            c5207r.f25400e.m9816a();
                        }
                    }
                }
                return 0L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4918b(C5207r c5207r, String str) {
        super(str);
        this.f24463e = 2;
        this.f24464f = c5207r;
    }
}
