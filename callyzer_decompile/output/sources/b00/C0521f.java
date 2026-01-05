package b00;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4154l;
import oj.C5392d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.f */
/* loaded from: classes3.dex */
public class C0521f extends k0 {

    /* renamed from: h */
    public static final ReentrantLock f3614h;

    /* renamed from: i */
    public static final Condition f3615i;

    /* renamed from: j */
    public static final long f3616j;

    /* renamed from: k */
    public static final long f3617k;

    /* renamed from: l */
    public static C0521f f3618l;

    /* renamed from: e */
    public int f3619e;

    /* renamed from: f */
    public C0521f f3620f;

    /* renamed from: g */
    public long f3621g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f3614h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC4154l.m8922e(conditionNewCondition, "newCondition(...)");
        f3615i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f3616j = millis;
        f3617k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: h */
    public final void m1556h() {
        long j6 = this.f3642c;
        boolean z6 = this.f3640a;
        if (j6 != 0 || z6) {
            ReentrantLock reentrantLock = f3614h;
            reentrantLock.lock();
            try {
                if (this.f3619e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f3619e = 1;
                C5392d.m11109h(this, j6, z6);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: i */
    public final boolean m1557i() {
        ReentrantLock reentrantLock = f3614h;
        reentrantLock.lock();
        try {
            int i10 = this.f3619e;
            this.f3619e = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            C0521f c0521f = f3618l;
            while (c0521f != null) {
                C0521f c0521f2 = c0521f.f3620f;
                if (c0521f2 == this) {
                    c0521f.f3620f = this.f3620f;
                    this.f3620f = null;
                    return false;
                }
                c0521f = c0521f2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: j */
    public void mo1558j() {
    }
}
