package u8;

import java.util.concurrent.ExecutionException;
import kotlin.KotlinNullPointerException;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import tx.C7251k;
import x4.AbstractC8298h;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u8.j */
/* loaded from: classes.dex */
public final class RunnableC7362j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35022a;

    /* renamed from: b */
    public final InterfaceFutureC8957d f35023b;

    /* renamed from: c */
    public final C7251k f35024c;

    public /* synthetic */ RunnableC7362j(InterfaceFutureC8957d interfaceFutureC8957d, C7251k c7251k, int i10) {
        this.f35022a = i10;
        this.f35023b = interfaceFutureC8957d;
        this.f35024c = c7251k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35022a) {
            case 0:
                InterfaceFutureC8957d interfaceFutureC8957d = this.f35023b;
                boolean zIsCancelled = interfaceFutureC8957d.isCancelled();
                C7251k c7251k = this.f35024c;
                if (zIsCancelled) {
                    c7251k.cancel(null);
                    return;
                }
                boolean z6 = false;
                while (true) {
                    try {
                        try {
                            Object obj = interfaceFutureC8957d.get();
                            if (z6) {
                                Thread.currentThread().interrupt();
                            }
                            c7251k.resumeWith(obj);
                            return;
                        } catch (ExecutionException e2) {
                            Throwable cause = e2.getCause();
                            AbstractC4154l.m8920c(cause);
                            c7251k.resumeWith(od.m10796a(cause));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        z6 = true;
                    } catch (Throwable th2) {
                        if (z6) {
                            Thread.currentThread().interrupt();
                        }
                        throw th2;
                    }
                }
            default:
                InterfaceFutureC8957d interfaceFutureC8957d2 = this.f35023b;
                boolean zIsCancelled2 = interfaceFutureC8957d2.isCancelled();
                C7251k c7251k2 = this.f35024c;
                if (zIsCancelled2) {
                    c7251k2.cancel(null);
                    return;
                }
                try {
                    c7251k2.resumeWith(AbstractC8298h.m15500g(interfaceFutureC8957d2));
                    return;
                } catch (ExecutionException e10) {
                    Throwable cause2 = e10.getCause();
                    if (cause2 != null) {
                        c7251k2.resumeWith(od.m10796a(cause2));
                        return;
                    } else {
                        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
                        AbstractC4154l.m8927j(kotlinNullPointerException, AbstractC4154l.class.getName());
                        throw kotlinNullPointerException;
                    }
                }
        }
    }
}
