package l0;

import bk.RunnableC0683n;
import fh.RunnableC2286a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k0.ExecutorC3891a;
import pg.i7;
import pg.t8;
import x4.C8299i;
import x4.C8302l;
import zh.InterfaceFutureC8957d;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l0.k */
/* loaded from: classes.dex */
public final class C4311k implements InterfaceFutureC8957d {

    /* renamed from: a */
    public ArrayList f21739a;

    /* renamed from: b */
    public ArrayList f21740b;

    /* renamed from: c */
    public final boolean f21741c;

    /* renamed from: d */
    public final AtomicInteger f21742d;

    /* renamed from: e */
    public final C8302l f21743e = i7.m11697b(new C8989c(29, this));

    /* renamed from: f */
    public C8299i f21744f;

    public C4311k(ArrayList arrayList, boolean z6, ExecutorC3891a executorC3891a) {
        this.f21739a = arrayList;
        this.f21740b = new ArrayList(arrayList.size());
        this.f21741c = z6;
        this.f21742d = new AtomicInteger(arrayList.size());
        mo9026a(new RunnableC0683n(5, this), t8.m11872a());
        if (this.f21739a.isEmpty()) {
            this.f21744f.m15507b(new ArrayList(this.f21740b));
            return;
        }
        for (int i10 = 0; i10 < this.f21739a.size(); i10++) {
            this.f21740b.add(null);
        }
        ArrayList arrayList2 = this.f21739a;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            InterfaceFutureC8957d interfaceFutureC8957d = (InterfaceFutureC8957d) arrayList2.get(i11);
            interfaceFutureC8957d.mo9026a(new RunnableC2286a(this, i11, interfaceFutureC8957d), executorC3891a);
        }
    }

    @Override // zh.InterfaceFutureC8957d
    /* renamed from: a */
    public final void mo9026a(Runnable runnable, Executor executor) {
        this.f21743e.f39850b.mo9026a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        ArrayList arrayList = this.f21739a;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((InterfaceFutureC8957d) obj).cancel(z6);
            }
        }
        return this.f21743e.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return (List) this.f21743e.f39850b.get(j6, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f21743e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f21743e.f39850b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        ArrayList arrayList = this.f21739a;
        if (arrayList != null && !isDone()) {
            int size = arrayList.size();
            int i10 = 0;
            loop0: while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                InterfaceFutureC8957d interfaceFutureC8957d = (InterfaceFutureC8957d) obj;
                while (!interfaceFutureC8957d.isDone()) {
                    try {
                        interfaceFutureC8957d.get();
                    } catch (Error e2) {
                        throw e2;
                    } catch (InterruptedException e10) {
                        throw e10;
                    } catch (Throwable unused) {
                        if (this.f21741c) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) this.f21743e.f39850b.get();
    }
}
