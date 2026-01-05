package p001o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p001o.q74;

/* loaded from: classes3.dex */
public abstract class v18 implements sb3 {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f49756c = AtomicIntegerFieldUpdater.newUpdater(v18.class, "b");

    /* renamed from: a */
    public final q74 f49757a;

    /* renamed from: b */
    public volatile /* synthetic */ int f49758b;

    public v18(String str) {
        sq8.m48649h(str, "engineName");
        this.f49757a = gdg.m28505b(null, 1, null).plus(new f84("http-client-engine-" + str + "-context"));
        this.f49758b = 0;
    }

    /* renamed from: c */
    public static final y3i m52228c(v18 v18Var, Throwable th) {
        v18Var.shutdown();
        return y3i.f54824a;
    }

    @Override // p001o.h84
    /* renamed from: D */
    public q74 mo6529D() {
        return this.f49757a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (f49756c.compareAndSet(this, 0, 1)) {
            q74.InterfaceC16311b interfaceC16311b = mo6529D().get(p69.f39399t);
            kl3 kl3Var = interfaceC16311b instanceof kl3 ? (kl3) interfaceC16311b : null;
            if (kl3Var == null) {
                return;
            }
            kl3Var.mo35824c();
            kl3Var.j0(new xk7() { // from class: o.u18
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return v18.m52228c(this.f48176a, (Throwable) obj);
                }
            });
        }
    }

    public void shutdown() {
    }
}
