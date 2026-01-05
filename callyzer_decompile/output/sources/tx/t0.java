package tx;

import l7.C4417q;
import yx.C8828v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class t0 implements Runnable, Comparable, o0 {
    private volatile Object _heap;

    /* renamed from: a */
    public long f34678a;

    /* renamed from: b */
    public int f34679b = -1;

    public t0(long j6) {
        this.f34678a = j6;
    }

    /* renamed from: b */
    public final int m13575b(long j6, u0 u0Var, v0 v0Var) {
        synchronized (this) {
            if (this._heap == c0.f34606b) {
                return 2;
            }
            synchronized (u0Var) {
                try {
                    t0[] t0VarArr = u0Var.f42526a;
                    t0 t0Var = t0VarArr != null ? t0VarArr[0] : null;
                    if (v0.f34687j.get(v0Var) == 1) {
                        return 1;
                    }
                    if (t0Var == null) {
                        u0Var.f34683c = j6;
                    } else {
                        long j10 = t0Var.f34678a;
                        if (j10 - j6 < 0) {
                            j6 = j10;
                        }
                        if (j6 - u0Var.f34683c > 0) {
                            u0Var.f34683c = j6;
                        }
                    }
                    long j11 = this.f34678a;
                    long j12 = u0Var.f34683c;
                    if (j11 - j12 < 0) {
                        this.f34678a = j12;
                    }
                    u0Var.m16279a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: c */
    public final void m13576c(u0 u0Var) {
        if (this._heap == c0.f34606b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = u0Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j6 = this.f34678a - ((t0) obj).f34678a;
        if (j6 > 0) {
            return 1;
        }
        return j6 < 0 ? -1 : 0;
    }

    @Override // tx.o0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C4417q c4417q = c0.f34606b;
                if (obj == c4417q) {
                    return;
                }
                u0 u0Var = obj instanceof u0 ? (u0) obj : null;
                if (u0Var != null) {
                    synchronized (u0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C8828v ? (C8828v) obj2 : null) != null) {
                            u0Var.m16280b(this.f34679b);
                        }
                    }
                }
                this._heap = c4417q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f34678a + ']';
    }
}
