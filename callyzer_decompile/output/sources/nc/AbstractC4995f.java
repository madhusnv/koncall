package nc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import mq.C4833a;
import pg.x5;
import tx.C7263w;
import tx.C7265y;
import tx.InterfaceC7258r;
import tx.c0;
import tx.f1;
import tx.k1;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nc.f */
/* loaded from: classes.dex */
public abstract class AbstractC4995f implements InterfaceC4991b {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24738c = AtomicIntegerFieldUpdater.newUpdater(AbstractC4995f.class, "b");

    /* renamed from: a */
    public final InterfaceC7564h f24739a = x5.m11928d(c0.m13481d(), new C7265y("http-client-engine-OkHttp-context"));

    /* renamed from: b */
    public volatile /* synthetic */ int f24740b = 0;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (f24738c.compareAndSet(this, 0, 1)) {
            InterfaceC7564h interfaceC7564hO0 = this.f24739a.o0(C7263w.f34689b);
            InterfaceC7564h interfaceC7564h = interfaceC7564hO0 instanceof InterfaceC7258r ? (InterfaceC7258r) interfaceC7564hO0 : null;
            if (interfaceC7564h == null) {
                return;
            }
            ((f1) interfaceC7564h).i0();
            ((k1) interfaceC7564h).v0(new C4833a(4, this));
        }
    }

    @Override // tx.InterfaceC7266z
    /* renamed from: w */
    public final InterfaceC7564h mo1865w() {
        return this.f24739a;
    }

    /* renamed from: h */
    public void mo9904h() {
    }
}
