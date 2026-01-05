package u8;

import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AbstractC4154l;
import pg.n6;
import r1.C6431p;
import t8.AbstractC7076v;
import t8.C7077w;
import t8.EnumC7067m;
import tx.C7251k;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a */
    public static final /* synthetic */ int f34991a = 0;

    static {
        AbstractC4154l.m8922e(C7077w.m13372b("WorkerWrapper"), "tagWithPrefix(\"WorkerWrapper\")");
    }

    /* renamed from: a */
    public static final Object m13767a(InterfaceFutureC8957d interfaceFutureC8957d, AbstractC7076v abstractC7076v, AbstractC8199i abstractC8199i) {
        Object obj;
        try {
            boolean z6 = false;
            if (!interfaceFutureC8957d.isDone()) {
                C7251k c7251k = new C7251k(1, n6.m11797c(abstractC8199i));
                c7251k.m13540p();
                interfaceFutureC8957d.mo9026a(new RunnableC7362j(interfaceFutureC8957d, c7251k, 0), EnumC7067m.INSTANCE);
                c7251k.m13542t(new C6431p(12, abstractC7076v, interfaceFutureC8957d));
                Object objM13539o = c7251k.m13539o();
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                return objM13539o;
            }
            while (true) {
                try {
                    obj = interfaceFutureC8957d.get();
                    break;
                } catch (InterruptedException unused) {
                    z6 = true;
                } catch (Throwable th2) {
                    if (z6) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z6) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            AbstractC4154l.m8920c(cause);
            throw cause;
        }
    }
}
