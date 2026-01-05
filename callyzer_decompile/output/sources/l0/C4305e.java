package l0;

import a1.RunnableC0024w;
import k0.ExecutorC3891a;
import pg.t8;
import x4.C8299i;
import x4.InterfaceC8300j;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l0.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C4305e implements InterfaceC8300j {

    /* renamed from: a */
    public final /* synthetic */ int f21728a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceFutureC8957d f21729b;

    public /* synthetic */ C4305e(InterfaceFutureC8957d interfaceFutureC8957d, int i10) {
        this.f21728a = i10;
        this.f21729b = interfaceFutureC8957d;
    }

    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public final Object mo15I(C8299i c8299i) {
        switch (this.f21728a) {
            case 0:
                ExecutorC3891a executorC3891aM11872a = t8.m11872a();
                InterfaceFutureC8957d interfaceFutureC8957d = this.f21729b;
                AbstractC4308h.m9036f(false, interfaceFutureC8957d, c8299i, executorC3891aM11872a);
                return "nonCancellationPropagating[" + interfaceFutureC8957d + "]";
            default:
                RunnableC0024w runnableC0024w = new RunnableC0024w(21, c8299i);
                ExecutorC3891a executorC3891aM11872a2 = t8.m11872a();
                InterfaceFutureC8957d interfaceFutureC8957d2 = this.f21729b;
                interfaceFutureC8957d2.mo9026a(runnableC0024w, executorC3891aM11872a2);
                return "transformVoidFuture [" + interfaceFutureC8957d2 + "]";
        }
    }
}
