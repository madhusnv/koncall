package ug;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k1 extends FutureTask implements Comparable {

    /* renamed from: a */
    public final long f35562a;

    /* renamed from: b */
    public final boolean f35563b;

    /* renamed from: c */
    public final String f35564c;

    /* renamed from: d */
    public final /* synthetic */ m1 f35565d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(m1 m1Var, Runnable runnable, boolean z6, String str) {
        super(runnable, null);
        this.f35565d = m1Var;
        long andIncrement = m1.f35608l.getAndIncrement();
        this.f35562a = andIncrement;
        this.f35564c = str;
        this.f35563b = z6;
        if (andIncrement == Long.MAX_VALUE) {
            v0 v0Var = ((n1) m1Var.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14140a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k1 k1Var = (k1) obj;
        boolean z6 = k1Var.f35563b;
        boolean z10 = this.f35563b;
        if (z10 != z6) {
            return !z10 ? 1 : -1;
        }
        long j6 = k1Var.f35562a;
        long j10 = this.f35562a;
        if (j10 < j6) {
            return -1;
        }
        if (j10 > j6) {
            return 1;
        }
        v0 v0Var = ((n1) this.f35565d.f482a).f35669f;
        n1.m14085m(v0Var);
        v0Var.f35863g.m14141b(Long.valueOf(j10), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        v0 v0Var = ((n1) this.f35565d.f482a).f35669f;
        n1.m14085m(v0Var);
        v0Var.f35862f.m14141b(th2, this.f35564c);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(m1 m1Var, Callable callable, boolean z6) {
        super(callable);
        this.f35565d = m1Var;
        long andIncrement = m1.f35608l.getAndIncrement();
        this.f35562a = andIncrement;
        this.f35564c = "Task exception on worker thread";
        this.f35563b = z6;
        if (andIncrement == Long.MAX_VALUE) {
            v0 v0Var = ((n1) m1Var.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14140a("Tasks index overflow");
        }
    }
}
