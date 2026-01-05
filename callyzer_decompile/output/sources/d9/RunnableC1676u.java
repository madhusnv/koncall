package d9;

import c9.C0915j;
import java.util.Objects;
import t8.C7077w;
import w8.C7955f;
import w8.RunnableC7954e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.u */
/* loaded from: classes.dex */
public final class RunnableC1676u implements Runnable {

    /* renamed from: a */
    public final C1677v f8208a;

    /* renamed from: b */
    public final C0915j f8209b;

    public RunnableC1676u(C1677v c1677v, C0915j c0915j) {
        this.f8208a = c1677v;
        this.f8209b = c0915j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8208a.f8213d) {
            try {
                if (((RunnableC1676u) this.f8208a.f8211b.remove(this.f8209b)) != null) {
                    InterfaceC1675t interfaceC1675t = (InterfaceC1675t) this.f8208a.f8212c.remove(this.f8209b);
                    if (interfaceC1675t != null) {
                        C0915j c0915j = this.f8209b;
                        C7955f c7955f = (C7955f) interfaceC1675t;
                        C7077w c7077wM13371a = C7077w.m13371a();
                        Objects.toString(c0915j);
                        c7077wM13371a.getClass();
                        c7955f.f38257h.execute(new RunnableC7954e(c7955f, 0));
                    }
                } else {
                    C7077w c7077wM13371a2 = C7077w.m13371a();
                    Objects.toString(this.f8209b);
                    c7077wM13371a2.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
