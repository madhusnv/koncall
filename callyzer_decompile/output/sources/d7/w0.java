package d7;

import i7.C3181d;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a */
    public final C3181d f8155a = new C3181d();

    /* renamed from: a */
    public final void m5359a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        C3181d c3181d = this.f8155a;
        if (c3181d != null) {
            if (c3181d.f17105d) {
                C3181d.m7539a(autoCloseable);
                return;
            }
            synchronized (c3181d.f17102a) {
                autoCloseable2 = (AutoCloseable) c3181d.f17103b.put(str, autoCloseable);
            }
            C3181d.m7539a(autoCloseable2);
        }
    }

    /* renamed from: b */
    public final void m5360b() {
        C3181d c3181d = this.f8155a;
        if (c3181d != null && !c3181d.f17105d) {
            c3181d.f17105d = true;
            synchronized (c3181d.f17102a) {
                try {
                    Iterator it = c3181d.f17103b.values().iterator();
                    while (it.hasNext()) {
                        C3181d.m7539a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c3181d.f17104c.iterator();
                    while (it2.hasNext()) {
                        C3181d.m7539a((AutoCloseable) it2.next());
                    }
                    c3181d.f17104c.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        mo1209d();
    }

    /* renamed from: c */
    public final AutoCloseable m5361c(String str) {
        AutoCloseable autoCloseable;
        C3181d c3181d = this.f8155a;
        if (c3181d == null) {
            return null;
        }
        synchronized (c3181d.f17102a) {
            autoCloseable = (AutoCloseable) c3181d.f17103b.get(str);
        }
        return autoCloseable;
    }

    /* renamed from: d */
    public void mo1209d() {
    }
}
