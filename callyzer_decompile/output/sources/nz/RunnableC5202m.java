package nz;

import iz.C3391x;
import iz.InterfaceC3372e;
import iz.d0;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import og.md;
import p020v.a1;
import tz.AbstractC7285d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.m */
/* loaded from: classes3.dex */
public final class RunnableC5202m implements Runnable {

    /* renamed from: a */
    public final InterfaceC3372e f25354a;

    /* renamed from: b */
    public volatile AtomicInteger f25355b = new AtomicInteger(0);

    /* renamed from: c */
    public final /* synthetic */ C5205p f25356c;

    public RunnableC5202m(C5205p c5205p, InterfaceC3372e interfaceC3372e) {
        this.f25356c = c5205p;
        this.f25354a = interfaceC3372e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
        String str = "OkHttp " + ((C3391x) this.f25356c.f25360b.f36754b).m7802g();
        C5205p c5205p = this.f25356c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            c5205p.f25363e.m1556h();
            boolean z6 = false;
            try {
                try {
                    try {
                        this.f25354a.mo2562e(c5205p, c5205p.m10193d());
                        d0Var = c5205p.f25359a;
                    } catch (IOException e2) {
                        e = e2;
                        z6 = true;
                        if (z6) {
                            AbstractC7285d abstractC7285d = AbstractC7285d.f34750a;
                            AbstractC7285d abstractC7285d2 = AbstractC7285d.f34750a;
                            StringBuilder sb2 = new StringBuilder("Callback failure for ");
                            StringBuilder sb3 = new StringBuilder();
                            a1.m14318A(sb3, c5205p.f25373q ? "canceled " : "", "call", " to ");
                            sb3.append(((C3391x) c5205p.f25360b.f36754b).m7802g());
                            sb2.append(sb3.toString());
                            abstractC7285d2.mo13616h(sb2.toString(), 4, e);
                        } else {
                            this.f25354a.mo2561d(c5205p, e);
                        }
                        d0Var = c5205p.f25359a;
                        d0Var.f17834a.m7751e(this);
                    } catch (Throwable th2) {
                        th = th2;
                        z6 = true;
                        c5205p.cancel();
                        if (!z6) {
                            IOException iOException = new IOException("canceled due to " + th);
                            md.m10764a(iOException, th);
                            this.f25354a.mo2561d(c5205p, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    c5205p.f25359a.f17834a.m7751e(this);
                    throw th3;
                }
            } catch (IOException e10) {
                e = e10;
            } catch (Throwable th4) {
                th = th4;
            }
            d0Var.f17834a.m7751e(this);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
