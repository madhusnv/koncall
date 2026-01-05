package p001o;

import java.util.concurrent.locks.LockSupport;
import p001o.fk6;

/* loaded from: classes6.dex */
public abstract class gk6 extends ek6 {
    public abstract Thread L0();

    public void O0(long j, fk6.AbstractRunnableC13473c abstractRunnableC13473c) {
        wd5.f51804q.x1(j, abstractRunnableC13473c);
    }

    public final void P0() {
        Thread threadL0 = L0();
        if (Thread.currentThread() != threadL0) {
            v9.m52465a();
            LockSupport.unpark(threadL0);
        }
    }
}
