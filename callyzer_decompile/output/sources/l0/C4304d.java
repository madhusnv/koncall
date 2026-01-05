package l0;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import pg.i7;
import x4.C8299i;
import zh.InterfaceFutureC8957d;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l0.d */
/* loaded from: classes.dex */
public class C4304d implements InterfaceFutureC8957d {

    /* renamed from: a */
    public final InterfaceFutureC8957d f21726a;

    /* renamed from: b */
    public C8299i f21727b;

    public C4304d(InterfaceFutureC8957d interfaceFutureC8957d) {
        interfaceFutureC8957d.getClass();
        this.f21726a = interfaceFutureC8957d;
    }

    /* renamed from: b */
    public static C4304d m9025b(InterfaceFutureC8957d interfaceFutureC8957d) {
        return interfaceFutureC8957d instanceof C4304d ? (C4304d) interfaceFutureC8957d : new C4304d(interfaceFutureC8957d);
    }

    @Override // zh.InterfaceFutureC8957d
    /* renamed from: a */
    public final void mo9026a(Runnable runnable, Executor executor) {
        this.f21726a.mo9026a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        return this.f21726a.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f21726a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f21726a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f21726a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j6, TimeUnit timeUnit) {
        return this.f21726a.get(j6, timeUnit);
    }

    public C4304d() {
        this.f21726a = i7.m11697b(new C8989c(28, this));
    }
}
