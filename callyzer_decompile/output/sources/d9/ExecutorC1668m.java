package d9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC4154l;
import l0.RunnableC4307g;
import qi.RunnableC6224g;
import ug.g1;
import v0.C7622f;
import yg.C8650g;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.m */
/* loaded from: classes.dex */
public final class ExecutorC1668m implements Executor {

    /* renamed from: a */
    public final /* synthetic */ int f8189a;

    /* renamed from: b */
    public final Executor f8190b;

    /* renamed from: c */
    public final Object f8191c;

    /* renamed from: d */
    public Object f8192d;

    /* renamed from: e */
    public final Object f8193e;

    public /* synthetic */ ExecutorC1668m(Executor executor, C7622f c7622f, g1 g1Var, C8650g c8650g) {
        this.f8189a = 2;
        this.f8190b = executor;
        this.f8191c = c7622f;
        this.f8192d = g1Var;
        this.f8193e = c8650g;
    }

    /* renamed from: a */
    public void m5380a() {
        switch (this.f8189a) {
            case 0:
                Runnable runnable = (Runnable) ((ArrayDeque) this.f8191c).poll();
                this.f8192d = runnable;
                if (runnable != null) {
                    this.f8190b.execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.f8193e) {
                    Object objPoll = ((ArrayDeque) this.f8191c).poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.f8192d = runnable2;
                    if (objPoll != null) {
                        this.f8190b.execute(runnable2);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        switch (this.f8189a) {
            case 0:
                synchronized (this.f8193e) {
                    try {
                        ((ArrayDeque) this.f8191c).add(new RunnableC4307g(5, this, command));
                        if (((Runnable) this.f8192d) == null) {
                            m5380a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                AbstractC4154l.m8923f(command, "command");
                synchronized (this.f8193e) {
                    ((ArrayDeque) this.f8191c).offer(new RunnableC6224g(25, command, this));
                    if (((Runnable) this.f8192d) == null) {
                        m5380a();
                    }
                }
                return;
            default:
                try {
                    this.f8190b.execute(command);
                    return;
                } catch (RuntimeException e2) {
                    if (((C8656m) ((C7622f) this.f8191c).f36778a).m15984k()) {
                        ((g1) this.f8192d).m13926q();
                    } else {
                        ((C8650g) this.f8193e).m15968a(e2);
                    }
                    throw e2;
                }
        }
    }

    public ExecutorC1668m(Executor executor, int i10) {
        this.f8189a = i10;
        switch (i10) {
            case 1:
                AbstractC4154l.m8923f(executor, "executor");
                this.f8190b = executor;
                this.f8191c = new ArrayDeque();
                this.f8193e = new Object();
                break;
            default:
                this.f8190b = executor;
                this.f8191c = new ArrayDeque();
                this.f8193e = new Object();
                break;
        }
    }
}
